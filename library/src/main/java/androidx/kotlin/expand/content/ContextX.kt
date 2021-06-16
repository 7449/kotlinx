@file:JvmName("ContextUtils")

package androidx.kotlin.expand.content

import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
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


import androidx.kotlin.expand.graphics.drawable.minimumWidthAndHeightDrawableExpand
import androidx.kotlin.expand.version.hasQExpand
import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.util.concurrent.Executor

val Context.dataDirCompat: File?
    get() = ContextCompat.getDataDir(this)

val Context.obbDirsCompat: Array<File>
    get() = ContextCompat.getObbDirs(this)

val Context.externalCacheDirsCompat: Array<File>
    get() = ContextCompat.getExternalCacheDirs(this)

val Context.noBackupFilesDirCompat: File?
    get() = ContextCompat.getNoBackupFilesDir(this)

val Context.codeCacheDirCompat: File
    get() = ContextCompat.getCodeCacheDir(this)

val Context.isDeviceProtectedStorageCompat: Boolean
    get() = ContextCompat.isDeviceProtectedStorage(this)

val Context.mainExecutorCompat: Executor
    get() = ContextCompat.getMainExecutor(this)

val Context.isLandscapeExpand: Boolean
    get() = resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE

val Context.userIconExpand: Drawable
    get() = getAppIconExpand(packageName)

val Context.isCameraExpand: Boolean
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    get() = packageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY)

val Context.statusBarHeightExpand: Int
    get() {
        return runCatching {
            val resourceId: Int = resources.getIdentifier("status_bar_height", "dimen", "android")
            resources.getDimensionPixelSize(resourceId)
        }.getOrNull() ?: 0
    }

@JvmName("getAppIcon")
fun Context.getAppIconExpand(packageName: String): Drawable =
    packageManager.getApplicationInfo(packageName, 0).loadIcon(packageManager)

@JvmName("toast")
fun Context.toastExpand(any: Any): Unit =
    Toast.makeText(this, any.toString(), Toast.LENGTH_SHORT).show()

@JvmName("getExternalFilesDirs")
fun Context.externalFilesDirsExpand(type: String?): Array<File> =
    ContextCompat.getExternalFilesDirs(this, type)

@JvmName("getDrawable")
fun Context.drawableExpand(@DrawableRes id: Int): Drawable? =
    ContextCompat.getDrawable(this, id)

@JvmName("getColorStateList")
fun Context.colorStateListExpand(@ColorRes id: Int): ColorStateList? =
    ContextCompat.getColorStateList(this, id)

@JvmName("getColor")
fun Context.colorExpand(@ColorRes id: Int): Int =
    ContextCompat.getColor(this, id)

@JvmName("checkPermission")
fun Context.checkPermissionExpand(permission: String): Int =
    ContextCompat.checkSelfPermission(this, permission)

@JvmName("getBoolean")
fun Context.booleanExpand(@BoolRes id: Int): Boolean =
    this.resources.getBoolean(id)

@JvmName("getInt")
fun Context.intExpand(@IntegerRes id: Int): Int =
    this.resources.getInteger(id)

@JvmName("getFloat")
@RequiresApi(Build.VERSION_CODES.Q)
fun Context.floatExpand(@DimenRes id: Int): Float =
    this.resources.getFloat(id)

@JvmName("getText")
fun Context.textExpand(@StringRes id: Int): CharSequence =
    this.resources.getText(id)

@JvmName("getString")
fun Context.stringExpand(@StringRes id: Int): String =
    this.resources.getString(id)

@JvmName("getString")
fun Context.stringExpand(@StringRes id: Int, vararg formatArgs: Any): String =
    this.resources.getString(id, *formatArgs)

@JvmName("getTextArray")
fun Context.textArrayExpand(@ArrayRes id: Int): Array<CharSequence> =
    this.resources.getTextArray(id)

@JvmName("getStringArray")
fun Context.stringArrayExpand(@ArrayRes id: Int): Array<String> =
    this.resources.getStringArray(id)

@JvmName("getIntArray")
fun Context.intArrayExpand(@ArrayRes id: Int): IntArray =
    this.resources.getIntArray(id)

@JvmName("getDimension")
fun Context.dimensionExpand(@DimenRes id: Int): Float =
    this.resources.getDimension(id)

@JvmName("getDimensionPixelOffset")
fun Context.dimensionPixelOffsetExpand(@DimenRes id: Int): Int =
    this.resources.getDimensionPixelOffset(id)

@JvmName("getDimensionPixelSize")
fun Context.dimensionPixelSizeExpand(@DimenRes id: Int): Int =
    this.resources.getDimensionPixelSize(id)

@JvmName("getQuantityText")
fun Context.quantityTextExpand(@PluralsRes id: Int, quantity: Int): CharSequence =
    this.resources.getQuantityText(id, quantity)

@JvmName("getQuantityString")
fun Context.quantityStringExpand(
    @PluralsRes id: Int,
    quantity: Int,
    vararg formatArgs: Any
): CharSequence = this.resources.getQuantityString(id, quantity, *formatArgs)

@JvmName("getQuantityString")
fun Context.quantityStringExpand(@PluralsRes id: Int, quantity: Int): String =
    this.resources.getQuantityString(id, quantity)

@JvmName("getFont")
@RequiresApi(Build.VERSION_CODES.O)
fun Context.fontExpand(@FontRes id: Int): Typeface =
    this.resources.getFont(id)

@JvmName("getAppIntent")
fun Context.appIntentExpand(packageName: String): Intent? =
    packageManager.getLaunchIntentForPackage(packageName)

@JvmName("getMinimumDrawable")
fun Context.minimumDrawableExpand(@DrawableRes id: Int, @ColorInt color: Int): Drawable? =
    drawableExpand(id)?.minimumWidthAndHeightDrawableExpand(color)

@JvmName("moveToNextToId")
fun Context.moveToNextToIdExpand(uri: Uri): Boolean =
    contentResolver.moveToNextToIdExpand(uri)

@JvmName("moveToNext")
fun Context.moveToNextExpand(uri: Uri, name: String): Boolean =
    contentResolver.moveToNextExpand(uri, name)

@JvmName("findIdByUri")
fun Context.findIdByUriExpand(uri: Uri): Long =
    contentResolver.queryIdExpand(uri)

@JvmName("findPathByUri")
fun Context.findPathByUriExpand(uri: Uri): String? =
    contentResolver.queryDataExpand(uri)

@JvmName("getJson")
fun Context.getJsonExpand(fileName: String): String {
    val stringBuilder = StringBuilder()
    BufferedReader(InputStreamReader(assets.open(fileName))).use { it ->
        it.lineSequence().forEach { stringBuilder.append(it) }
    }
    return stringBuilder.toString()
}

@JvmName("shareTextPlain")
fun Context.shareTextPlainExpand(title: String, message: String?) {
    val textIntent = Intent(Intent.ACTION_SEND)
    textIntent.type = "text/plain"
    textIntent.putExtra(Intent.EXTRA_TEXT, message)
    startActivity(Intent.createChooser(textIntent, title))
}

@JvmName("insertImageUri")
fun Context.insertImageUriExpand(contentValues: ContentValues): Uri? =
    if (Environment.getExternalStorageState() == Environment.MEDIA_MOUNTED) {
        contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues)
    } else {
        null
    }

@JvmName("insertImageUri")
fun Context.insertImageUriExpand(
    file: File,
    relativePath: String = Environment.DIRECTORY_DCIM
): Uri? = insertImageUriExpand(ContentValues().apply {
    if (hasQExpand()) {
        put(MediaStore.MediaColumns.DISPLAY_NAME, file.name)
        put(MediaStore.MediaColumns.RELATIVE_PATH, relativePath)
    } else {
        put(MediaStore.MediaColumns.DATA, file.path)
    }
})

@JvmName("insertVideoUri")
fun Context.insertVideoUriExpand(contentValues: ContentValues): Uri? =
    if (Environment.getExternalStorageState() == Environment.MEDIA_MOUNTED) {
        contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues)
    } else {
        null
    }

@JvmName("insertVideoUri")
fun Context.insertVideoUriExpand(
    file: File,
    relativePath: String = Environment.DIRECTORY_DCIM
): Uri? = insertVideoUriExpand(ContentValues().apply {
    if (hasQExpand()) {
        put(MediaStore.MediaColumns.DISPLAY_NAME, file.name)
        put(MediaStore.MediaColumns.RELATIVE_PATH, relativePath)
    } else {
        put(MediaStore.MediaColumns.DATA, file.path)
    }
})

@JvmName("openVideo")
fun Context.openVideoExpand(uri: Uri, error: () -> Unit) {
    runCatching {
        val video = Intent(Intent.ACTION_VIEW)
        video.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        video.setDataAndType(uri, "video/*")
        startActivity(video)
    }.onFailure { error.invoke() }
}

@JvmName("openAppStore")
fun Context.openAppStoreExpand(packageName: String, error: () -> Unit) {
    runCatching {
        val market = Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=$packageName"))
        market.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(market)
    }.onFailure { error.invoke() }
}