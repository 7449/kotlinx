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
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import androidx.kotlin.expand.graphics.drawable.minimumWidthAndHeightDrawableExpand
import androidx.kotlin.expand.version.hasQExpand
import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.util.concurrent.Executor

@Version([VersionLog(Version.BANANA)])
val Context.dataDirCompat: File?
    get() = ContextCompat.getDataDir(this)

@Version([VersionLog(Version.BANANA)])
val Context.obbDirsCompat: Array<File>
    get() = ContextCompat.getObbDirs(this)

@Version([VersionLog(Version.BANANA)])
val Context.externalCacheDirsCompat: Array<File>
    get() = ContextCompat.getExternalCacheDirs(this)

@Version([VersionLog(Version.BANANA)])
val Context.noBackupFilesDirCompat: File?
    get() = ContextCompat.getNoBackupFilesDir(this)

@Version([VersionLog(Version.BANANA)])
val Context.codeCacheDirCompat: File
    get() = ContextCompat.getCodeCacheDir(this)

@Version([VersionLog(Version.BANANA)])
val Context.isDeviceProtectedStorageCompat: Boolean
    get() = ContextCompat.isDeviceProtectedStorage(this)

@Version([VersionLog(Version.BANANA)])
val Context.mainExecutorCompat: Executor
    get() = ContextCompat.getMainExecutor(this)

@Version([VersionLog(Version.BANANA)])
val Context.isLandscapeExpand: Boolean
    get() = resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE

@Version([VersionLog(Version.BANANA)])
val Context.userIconExpand: Drawable
    get() = getAppIconExpand(packageName)

@Version([VersionLog(Version.BANANA)])
val Context.isCameraExpand: Boolean
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    get() = packageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY)

@Version([VersionLog(Version.BANANA), VersionLog(Version.CHERRY)])
val Context.statusBarHeightExpand: Int
    get() {
        return runCatching {
            val resourceId: Int = resources.getIdentifier("status_bar_height", "dimen", "android")
            resources.getDimensionPixelSize(resourceId)
        }.getOrNull() ?: 0
    }

@JvmName("getAppIcon")
@Version([VersionLog(Version.BANANA)])
fun Context.getAppIconExpand(packageName: String): Drawable =
    packageManager.getApplicationInfo(packageName, 0).loadIcon(packageManager)

@JvmName("toast")
@Version([VersionLog(Version.BANANA)])
fun Context.toastExpand(any: Any): Unit =
    Toast.makeText(this, any.toString(), Toast.LENGTH_SHORT).show()

@JvmName("getExternalFilesDirs")
@Version([VersionLog(Version.BANANA)])
fun Context.externalFilesDirsExpand(type: String?): Array<File> =
    ContextCompat.getExternalFilesDirs(this, type)

@JvmName("getDrawable")
@Version([VersionLog(Version.BANANA)])
fun Context.drawableExpand(@DrawableRes id: Int): Drawable? =
    ContextCompat.getDrawable(this, id)

@JvmName("getColorStateList")
@Version([VersionLog(Version.BANANA)])
fun Context.colorStateListExpand(@ColorRes id: Int): ColorStateList? =
    ContextCompat.getColorStateList(this, id)

@JvmName("getColor")
@Version([VersionLog(Version.BANANA)])
fun Context.colorExpand(@ColorRes id: Int): Int =
    ContextCompat.getColor(this, id)

@JvmName("checkPermission")
@Version([VersionLog(Version.BANANA)])
fun Context.checkPermissionExpand(permission: String): Int =
    ContextCompat.checkSelfPermission(this, permission)

@JvmName("getBoolean")
@Version([VersionLog(Version.BANANA)])
fun Context.booleanExpand(@BoolRes id: Int): Boolean =
    this.resources.getBoolean(id)

@JvmName("getInt")
@Version([VersionLog(Version.BANANA)])
fun Context.intExpand(@IntegerRes id: Int): Int =
    this.resources.getInteger(id)

@JvmName("getFloat")
@RequiresApi(Build.VERSION_CODES.Q)
@Version([VersionLog(Version.BANANA)])
fun Context.floatExpand(@DimenRes id: Int): Float =
    this.resources.getFloat(id)

@JvmName("getText")
@Version([VersionLog(Version.BANANA)])
fun Context.textExpand(@StringRes id: Int): CharSequence =
    this.resources.getText(id)

@JvmName("getString")
@Version([VersionLog(Version.BANANA)])
fun Context.stringExpand(@StringRes id: Int): String =
    this.resources.getString(id)

@JvmName("getString")
@Version([VersionLog(Version.BANANA)])
fun Context.stringExpand(@StringRes id: Int, vararg formatArgs: Any): String =
    this.resources.getString(id, formatArgs)

@JvmName("getTextArray")
@Version([VersionLog(Version.BANANA)])
fun Context.textArrayExpand(@ArrayRes id: Int): Array<CharSequence> =
    this.resources.getTextArray(id)

@JvmName("getStringArray")
@Version([VersionLog(Version.BANANA)])
fun Context.stringArrayExpand(@ArrayRes id: Int): Array<String> =
    this.resources.getStringArray(id)

@JvmName("getIntArray")
@Version([VersionLog(Version.BANANA)])
fun Context.intArrayExpand(@ArrayRes id: Int): IntArray =
    this.resources.getIntArray(id)

@JvmName("getDimension")
@Version([VersionLog(Version.BANANA)])
fun Context.dimensionExpand(@DimenRes id: Int): Float =
    this.resources.getDimension(id)

@JvmName("getDimensionPixelOffset")
@Version([VersionLog(Version.BANANA)])
fun Context.dimensionPixelOffsetExpand(@DimenRes id: Int): Int =
    this.resources.getDimensionPixelOffset(id)

@JvmName("getDimensionPixelSize")
@Version([VersionLog(Version.BANANA)])
fun Context.dimensionPixelSizeExpand(@DimenRes id: Int): Int =
    this.resources.getDimensionPixelSize(id)

@JvmName("getQuantityText")
@Version([VersionLog(Version.BANANA)])
fun Context.quantityTextExpand(@PluralsRes id: Int, quantity: Int): CharSequence =
    this.resources.getQuantityText(id, quantity)

@JvmName("getQuantityString")
@Version([VersionLog(Version.BANANA)])
fun Context.quantityStringExpand(
    @PluralsRes id: Int,
    quantity: Int,
    vararg formatArgs: Any
): CharSequence = this.resources.getQuantityString(id, quantity, formatArgs)

@JvmName("getQuantityString")
@Version([VersionLog(Version.BANANA)])
fun Context.quantityStringExpand(@PluralsRes id: Int, quantity: Int): String =
    this.resources.getQuantityString(id, quantity)

@JvmName("getFont")
@RequiresApi(Build.VERSION_CODES.O)
@Version([VersionLog(Version.BANANA)])
fun Context.fontExpand(@FontRes id: Int): Typeface =
    this.resources.getFont(id)

@JvmName("getAppIntent")
@Version([VersionLog(Version.BANANA)])
fun Context.appIntentExpand(packageName: String): Intent? =
    packageManager.getLaunchIntentForPackage(packageName)

@JvmName("getMinimumDrawable")
@Version([VersionLog(Version.BANANA)])
fun Context.minimumDrawableExpand(@DrawableRes id: Int, @ColorInt color: Int): Drawable? =
    drawableExpand(id)?.minimumWidthAndHeightDrawableExpand(color)

@JvmName("moveToNextToId")
@Version([VersionLog(Version.BANANA)])
fun Context.moveToNextToIdExpand(uri: Uri): Boolean =
    contentResolver.moveToNextToIdExpand(uri)

@JvmName("moveToNext")
@Version([VersionLog(Version.BANANA)])
fun Context.moveToNextExpand(uri: Uri, name: String): Boolean =
    contentResolver.moveToNextExpand(uri, name)

@JvmName("findIdByUri")
@Version([VersionLog(Version.BANANA)])
fun Context.findIdByUriExpand(uri: Uri): Long =
    contentResolver.queryIdExpand(uri)

@JvmName("findPathByUri")
@Version([VersionLog(Version.BANANA)])
fun Context.findPathByUriExpand(uri: Uri): String? =
    contentResolver.queryDataExpand(uri)

@JvmName("getJson")
@Version([VersionLog(Version.BANANA)])
fun Context.getJsonExpand(fileName: String): String {
    val stringBuilder = StringBuilder()
    BufferedReader(InputStreamReader(assets.open(fileName))).use { it ->
        it.lineSequence().forEach { stringBuilder.append(it) }
    }
    return stringBuilder.toString()
}

@JvmName("shareTextPlain")
@Version([VersionLog(Version.BANANA)])
fun Context.shareTextPlainExpand(title: String, message: String?) {
    val textIntent = Intent(Intent.ACTION_SEND)
    textIntent.type = "text/plain"
    textIntent.putExtra(Intent.EXTRA_TEXT, message)
    startActivity(Intent.createChooser(textIntent, title))
}

@JvmName("insertImageUri")
@Version([VersionLog(Version.BANANA), VersionLog(Version.WATERMELON)])
fun Context.insertImageUriExpand(contentValues: ContentValues): Uri? =
    if (Environment.getExternalStorageState() == Environment.MEDIA_MOUNTED) {
        contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues)
    } else {
        null
    }

@JvmName("insertImageUri")
@Version([VersionLog(Version.BANANA), VersionLog(Version.WATERMELON)])
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
@Version([VersionLog(Version.WATERMELON)])
fun Context.insertVideoUriExpand(contentValues: ContentValues): Uri? =
    if (Environment.getExternalStorageState() == Environment.MEDIA_MOUNTED) {
        contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues)
    } else {
        null
    }

@JvmName("insertVideoUri")
@Version([VersionLog(Version.WATERMELON)])
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
@Version([VersionLog(Version.BANANA)])
fun Context.openVideoExpand(uri: Uri, error: () -> Unit) {
    runCatching {
        val video = Intent(Intent.ACTION_VIEW)
        video.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        video.setDataAndType(uri, "video/*")
        startActivity(video)
    }.onFailure { error.invoke() }
}

@JvmName("openAppStore")
@Version([VersionLog(Version.BANANA), VersionLog(Version.CHERRY)])
fun Context.openAppStoreExpand(packageName: String, error: () -> Unit) {
    runCatching {
        val market = Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=$packageName"))
        market.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(market)
    }.onFailure { error.invoke() }
}