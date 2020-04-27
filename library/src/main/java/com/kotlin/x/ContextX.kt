@file:JvmName("ContextUtils")

package com.kotlin.x

import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import android.content.res.Configuration
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.MediaStore
import android.widget.Toast
import androidx.annotation.*
import androidx.core.content.ContextCompat
import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.util.concurrent.Executor

val Context.dataDir: File?
    get() = ContextCompat.getDataDir(this)

val Context.obbDirs: Array<File>
    get() = ContextCompat.getObbDirs(this)

val Context.externalCacheDirs: Array<File>
    get() = ContextCompat.getExternalCacheDirs(this)

val Context.noBackupFilesDir: File?
    get() = ContextCompat.getNoBackupFilesDir(this)

val Context.codeCacheDir: File
    get() = ContextCompat.getCodeCacheDir(this)

val Context.isDeviceProtectedStorage: Boolean
    get() = ContextCompat.isDeviceProtectedStorage(this)

val Context.mainExecutor: Executor
    get() = ContextCompat.getMainExecutor(this)

fun Context.toast(any: Any): Unit =
    Toast.makeText(this, any.toString(), Toast.LENGTH_SHORT).show()

fun Context.externalFilesDirs(type: String?): Array<File> =
    ContextCompat.getExternalFilesDirs(this, type)

fun Context.drawable(@DrawableRes id: Int): Drawable? =
    ContextCompat.getDrawable(this, id)

fun Context.colorStateList(@ColorRes id: Int): ColorStateList? =
    ContextCompat.getColorStateList(this, id)

fun Context.color(@ColorRes id: Int): Int =
    ContextCompat.getColor(this, id)

fun Context.checkPermission(permission: String): Int =
    ContextCompat.checkSelfPermission(this, permission)

fun Context.boolean(@BoolRes id: Int): Boolean =
    this.resources.getBoolean(id)

fun Context.int(@IntegerRes id: Int): Int =
    this.resources.getInteger(id)

@RequiresApi(Build.VERSION_CODES.Q)
fun Context.float(@DimenRes id: Int): Float =
    this.resources.getFloat(id)

fun Context.text(@StringRes id: Int): CharSequence =
    this.resources.getText(id)

fun Context.string(@StringRes id: Int): String =
    this.resources.getString(id)

fun Context.string(@StringRes id: Int, vararg formatArgs: Any): String =
    this.resources.getString(id, formatArgs)

fun Context.textArray(@ArrayRes id: Int): Array<CharSequence> =
    this.resources.getTextArray(id)

fun Context.stringArray(@ArrayRes id: Int): Array<String> =
    this.resources.getStringArray(id)

fun Context.intArray(@ArrayRes id: Int): IntArray =
    this.resources.getIntArray(id)

fun Context.dimension(@DimenRes id: Int): Float =
    this.resources.getDimension(id)

fun Context.dimensionPixelOffset(@DimenRes id: Int): Int =
    this.resources.getDimensionPixelOffset(id)

fun Context.dimensionPixelSize(@DimenRes id: Int): Int =
    this.resources.getDimensionPixelSize(id)

fun Context.quantityText(@PluralsRes id: Int, quantity: Int): CharSequence =
    this.resources.getQuantityText(id, quantity)

fun Context.quantityString(
    @PluralsRes id: Int,
    quantity: Int,
    vararg formatArgs: Any
): CharSequence = this.resources.getQuantityString(id, quantity, formatArgs)

fun Context.quantityString(@PluralsRes id: Int, quantity: Int): String =
    this.resources.getQuantityString(id, quantity)

@RequiresApi(Build.VERSION_CODES.O)
fun Context.font(@FontRes id: Int): Typeface =
    this.resources.getFont(id)

fun Context.insertImageUri(contentValues: ContentValues): Uri =
    if (Environment.getExternalStorageState() == Environment.MEDIA_MOUNTED) {
        contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues)
            ?: throw KotlinNullPointerException()
    } else {
        contentResolver.insert(MediaStore.Images.Media.INTERNAL_CONTENT_URI, contentValues)
            ?: throw KotlinNullPointerException()
    }

fun Context.appIntent(packageName: String): Intent? =
    packageManager.getLaunchIntentForPackage(packageName)

val Context.isLandscape: Boolean
    get() = resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE

fun Context.minimumDrawable(@DrawableRes id: Int, @ColorInt color: Int): Drawable? =
    drawable(id)?.minimumWidthAndHeightDrawable(color)

fun Context.moveToNextToId(uri: Uri): Boolean =
    contentResolver.moveToNextToId(uri)

fun Context.moveToNext(uri: Uri, name: String): Boolean =
    contentResolver.moveToNext(uri, name)

fun Context.findIdByUri(uri: Uri): Long =
    contentResolver.queryId(uri)

fun Context.findPathByUri(uri: Uri): String? =
    contentResolver.queryData(uri)

fun Context.getJson(fileName: String): String {
    val stringBuilder = StringBuilder()
    BufferedReader(InputStreamReader(assets.open(fileName))).use { it ->
        it.lineSequence().forEach { stringBuilder.append(it) }
    }
    return stringBuilder.toString()
}

fun Context.shareTextPlain(title: String, message: String?) {
    val textIntent = Intent(Intent.ACTION_SEND)
    textIntent.type = "text/plain"
    textIntent.putExtra(Intent.EXTRA_TEXT, message)
    startActivity(Intent.createChooser(textIntent, title))
}

fun Context.findUriByFile(file: File, relativePath: String = Environment.DIRECTORY_DCIM): Uri =
    insertImageUri(ContentValues().apply {
        if (hasQ()) {
            put(MediaStore.MediaColumns.DISPLAY_NAME, file.name)
            put(MediaStore.MediaColumns.RELATIVE_PATH, relativePath)
        } else {
            put(MediaStore.MediaColumns.DATA, file.path)
        }
    })

fun Context.openVideo(uri: Uri, error: () -> Unit): Unit = try {
    val video = Intent(Intent.ACTION_VIEW)
    video.flags = Intent.FLAG_ACTIVITY_NEW_TASK
    video.setDataAndType(uri, "video/*")
    startActivity(video)
} catch (e: Exception) {
    error.invoke()
}

fun Context.openAppStore(error: () -> Unit): Unit = try {
    val market = Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=$packageName"))
    market.flags = Intent.FLAG_ACTIVITY_NEW_TASK
    startActivity(market)
} catch (ignored: Exception) {
    error.invoke()
}
