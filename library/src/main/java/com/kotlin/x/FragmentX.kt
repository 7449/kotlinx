@file:JvmName("FragmentUtils")

package com.kotlin.x

import android.content.ContentValues
import android.content.Intent
import android.content.res.ColorStateList
import android.content.res.Configuration
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.widget.Toast
import androidx.annotation.*
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.util.concurrent.Executor

fun Fragment.startActivity(clz: Class<*>, code: Int, bundle: Bundle) {
    startActivityForResult(Intent(requireActivity(), clz).putExtras(bundle), code)
}

fun Fragment.openCamera(fileUri: Uri, video: Boolean): CameraStatus =
    if (!permissionCamera() || !permissionStorage()) CameraStatus.PERMISSION else openCamera(
        this,
        fileUri,
        video
    )

fun Fragment.runOnUiThread(action: () -> Unit): Unit =
    requireActivity().runOnUiThread { action.invoke() }

fun Fragment.toast(any: Any): Unit? =
    activity?.let { Toast.makeText(it, any.toString(), Toast.LENGTH_SHORT).show() }

val Fragment.dataDir: File?
    get() = ContextCompat.getDataDir(requireContext())

val Fragment.obbDirs: Array<File>
    get() = ContextCompat.getObbDirs(requireContext())

val Fragment.externalCacheDirs: Array<File>
    get() = ContextCompat.getExternalCacheDirs(requireContext())

val Fragment.noBackupFilesDir: File?
    get() = ContextCompat.getNoBackupFilesDir(requireContext())

val Fragment.codeCacheDir: File
    get() = ContextCompat.getCodeCacheDir(requireContext())

val Fragment.isDeviceProtectedStorage: Boolean
    get() = ContextCompat.isDeviceProtectedStorage(requireContext())

val Fragment.mainExecutor: Executor
    get() = ContextCompat.getMainExecutor(requireContext())

fun Fragment.externalFilesDirs(type: String?): Array<File> =
    ContextCompat.getExternalFilesDirs(requireContext(), type)

fun Fragment.drawable(@DrawableRes id: Int): Drawable? =
    ContextCompat.getDrawable(requireContext(), id)

fun Fragment.colorStateList(@ColorRes id: Int): ColorStateList? =
    ContextCompat.getColorStateList(requireContext(), id)

fun Fragment.color(@ColorRes id: Int): Int =
    ContextCompat.getColor(requireContext(), id)

fun Fragment.checkPermission(permission: String): Int =
    ContextCompat.checkSelfPermission(requireContext(), permission)

fun Fragment.boolean(@BoolRes id: Int): Boolean =
    this.resources.getBoolean(id)

fun Fragment.int(@IntegerRes id: Int): Int =
    this.resources.getInteger(id)

@RequiresApi(Build.VERSION_CODES.Q)
fun Fragment.float(@DimenRes id: Int): Float =
    this.resources.getFloat(id)

fun Fragment.text(@StringRes id: Int): CharSequence =
    this.resources.getText(id)

fun Fragment.string(@StringRes id: Int): String =
    this.resources.getString(id)

fun Fragment.string(@StringRes id: Int, vararg formatArgs: Any): String =
    this.resources.getString(id, formatArgs)

fun Fragment.textArray(@ArrayRes id: Int): Array<CharSequence> =
    this.resources.getTextArray(id)

fun Fragment.stringArray(@ArrayRes id: Int): Array<String> =
    this.resources.getStringArray(id)

fun Fragment.intArray(@ArrayRes id: Int): IntArray =
    this.resources.getIntArray(id)

fun Fragment.dimension(@DimenRes id: Int): Float =
    this.resources.getDimension(id)

fun Fragment.dimensionPixelOffset(@DimenRes id: Int): Int =
    this.resources.getDimensionPixelOffset(id)

fun Fragment.dimensionPixelSize(@DimenRes id: Int): Int =
    this.resources.getDimensionPixelSize(id)

fun Fragment.quantityText(@PluralsRes id: Int, quantity: Int): CharSequence =
    this.resources.getQuantityText(id, quantity)

fun Fragment.quantityString(
    @PluralsRes id: Int,
    quantity: Int,
    vararg formatArgs: Any
): CharSequence = this.resources.getQuantityString(id, quantity, formatArgs)

fun Fragment.quantityString(@PluralsRes id: Int, quantity: Int): String =
    this.resources.getQuantityString(id, quantity)

@RequiresApi(Build.VERSION_CODES.O)
fun Fragment.font(@FontRes id: Int): Typeface =
    this.resources.getFont(id)

fun Fragment.insertImageUri(contentValues: ContentValues): Uri =
    if (Environment.getExternalStorageState() == Environment.MEDIA_MOUNTED) {
        requireContext().contentResolver.insert(
            MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
            contentValues
        ) ?: throw KotlinNullPointerException()
    } else {
        requireContext().contentResolver.insert(
            MediaStore.Images.Media.INTERNAL_CONTENT_URI,
            contentValues
        ) ?: throw KotlinNullPointerException()
    }

fun Fragment.appIntent(packageName: String): Intent? =
    requireContext().packageManager.getLaunchIntentForPackage(packageName)

val Fragment.isLandscape: Boolean
    get() = resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE

fun Fragment.minimumDrawable(@DrawableRes id: Int, @ColorInt color: Int): Drawable? =
    drawable(id)?.minimumWidthAndHeightDrawable(color)

fun Fragment.moveToNextToId(uri: Uri): Boolean =
    requireContext().contentResolver.moveToNextToId(uri)

fun Fragment.moveToNext(uri: Uri, name: String): Boolean =
    requireContext().contentResolver.moveToNext(uri, name)

fun Fragment.findIdByUri(uri: Uri): Long =
    requireContext().contentResolver.queryId(uri)

fun Fragment.findPathByUri(uri: Uri): String? =
    requireContext().contentResolver.queryData(uri)

fun Fragment.getJson(fileName: String): String {
    val stringBuilder = StringBuilder()
    BufferedReader(InputStreamReader(requireContext().assets.open(fileName))).use { it ->
        it.lineSequence().forEach { stringBuilder.append(it) }
    }
    return stringBuilder.toString()
}