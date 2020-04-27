@file:JvmName("FragmentUtils")

package com.kotlin.x

import android.content.ContentValues
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.annotation.*
import androidx.fragment.app.Fragment
import java.io.File
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
    activity?.toast(any.toString())

val Fragment.dataDir: File?
    get() = requireContext().dataDirCompat

val Fragment.obbDirs: Array<File>
    get() = requireContext().obbDirsCompat

val Fragment.externalCacheDirs: Array<File>
    get() = requireContext().externalCacheDirsCompat

val Fragment.noBackupFilesDir: File?
    get() = requireContext().noBackupFilesDirCompat

val Fragment.codeCacheDir: File
    get() = requireContext().codeCacheDirCompat

val Fragment.isDeviceProtectedStorage: Boolean
    get() = requireContext().isDeviceProtectedStorageCompat

val Fragment.mainExecutor: Executor
    get() = requireContext().mainExecutorCompat

fun Fragment.externalFilesDirs(type: String?): Array<File> =
    requireContext().externalFilesDirs(type)

fun Fragment.drawable(@DrawableRes id: Int): Drawable? =
    requireContext().drawable(id)

fun Fragment.colorStateList(@ColorRes id: Int): ColorStateList? =
    requireContext().colorStateList(id)

fun Fragment.color(@ColorRes id: Int): Int =
    requireContext().color(id)

fun Fragment.checkPermission(permission: String): Int =
    requireContext().checkPermission(permission)

fun Fragment.boolean(@BoolRes id: Int): Boolean =
    requireContext().boolean(id)

fun Fragment.int(@IntegerRes id: Int): Int =
    requireContext().int(id)

@RequiresApi(Build.VERSION_CODES.Q)
fun Fragment.float(@DimenRes id: Int): Float =
    requireContext().float(id)

fun Fragment.text(@StringRes id: Int): CharSequence =
    requireContext().text(id)

fun Fragment.string(@StringRes id: Int): String =
    requireContext().string(id)

fun Fragment.string(@StringRes id: Int, vararg formatArgs: Any): String =
    requireContext().string(id, formatArgs)

fun Fragment.textArray(@ArrayRes id: Int): Array<CharSequence> =
    requireContext().textArray(id)

fun Fragment.stringArray(@ArrayRes id: Int): Array<String> =
    requireContext().stringArray(id)

fun Fragment.intArray(@ArrayRes id: Int): IntArray =
    requireContext().intArray(id)

fun Fragment.dimension(@DimenRes id: Int): Float =
    requireContext().dimension(id)

fun Fragment.dimensionPixelOffset(@DimenRes id: Int): Int =
    requireContext().dimensionPixelOffset(id)

fun Fragment.dimensionPixelSize(@DimenRes id: Int): Int =
    requireContext().dimensionPixelSize(id)

fun Fragment.quantityText(@PluralsRes id: Int, quantity: Int): CharSequence =
    requireContext().quantityText(id, quantity)

fun Fragment.quantityString(
    @PluralsRes id: Int,
    quantity: Int,
    vararg formatArgs: Any
): CharSequence = requireContext().quantityString(id, quantity, formatArgs)

fun Fragment.quantityString(@PluralsRes id: Int, quantity: Int): String =
    requireContext().quantityString(id, quantity)

@RequiresApi(Build.VERSION_CODES.O)
fun Fragment.font(@FontRes id: Int): Typeface =
    requireContext().font(id)

fun Fragment.insertImageUri(contentValues: ContentValues): Uri =
    requireContext().insertImageUri(contentValues)

fun Fragment.appIntent(packageName: String): Intent? =
    requireContext().packageManager.getLaunchIntentForPackage(packageName)

val Fragment.isLandscape: Boolean
    get() = requireContext().isLandscape

fun Fragment.minimumDrawable(@DrawableRes id: Int, @ColorInt color: Int): Drawable? =
    drawable(id)?.minimumWidthAndHeightDrawable(color)

fun Fragment.moveToNextToId(uri: Uri): Boolean =
    requireContext().moveToNextToId(uri)

fun Fragment.moveToNext(uri: Uri, name: String): Boolean =
    requireContext().moveToNext(uri, name)

fun Fragment.findIdByUri(uri: Uri): Long =
    requireContext().findIdByUri(uri)

fun Fragment.findPathByUri(uri: Uri): String? =
    requireContext().findPathByUri(uri)

fun Fragment.getJson(fileName: String): String =
    requireContext().getJson(fileName)