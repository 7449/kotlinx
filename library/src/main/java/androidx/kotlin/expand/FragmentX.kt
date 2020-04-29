@file:JvmName("FragmentUtils")

package androidx.kotlin.expand

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

@JvmName("startActivity")
fun Fragment.startActivityExpand(clz: Class<*>, code: Int, bundle: Bundle) {
    startActivityForResult(Intent(requireActivity(), clz).putExtras(bundle), code)
}

@JvmName("openCamera")
fun Fragment.openCameraExpand(fileUri: Uri, video: Boolean): CameraStatus =
    if (!permissionCameraExpand() || !permissionStorageExpand()) CameraStatus.PERMISSION else openCameraExpand(
        this,
        fileUri,
        video
    )

@JvmName("runOnUiThread")
fun Fragment.runOnUiThreadExpand(action: () -> Unit): Unit =
    requireActivity().runOnUiThread { action.invoke() }

@JvmName("toast")
fun Fragment.toastExpand(any: Any): Unit? =
    activity?.toastExpand(any.toString())

val Fragment.dataDirCompat: File?
    get() = requireContext().dataDirCompat

val Fragment.obbDirsCompat: Array<File>
    get() = requireContext().obbDirsCompat

val Fragment.externalCacheDirsCompat: Array<File>
    get() = requireContext().externalCacheDirsCompat

val Fragment.noBackupFilesDirCompat: File?
    get() = requireContext().noBackupFilesDirCompat

val Fragment.codeCacheDirCompat: File
    get() = requireContext().codeCacheDirCompat

val Fragment.isDeviceProtectedStorageCompat: Boolean
    get() = requireContext().isDeviceProtectedStorageCompat

val Fragment.mainExecutorCompat: Executor
    get() = requireContext().mainExecutorCompat

val Fragment.isLandscapeExpand: Boolean
    get() = requireContext().isLandscapeExpand

@JvmName("getExternalFilesDirs")
fun Fragment.externalFilesDirsExpand(type: String?): Array<File> =
    requireContext().externalFilesDirsExpand(type)

@JvmName("getDrawable")
fun Fragment.drawableExpand(@DrawableRes id: Int): Drawable? =
    requireContext().drawableExpand(id)

@JvmName("getColorStateList")
fun Fragment.colorStateListExpand(@ColorRes id: Int): ColorStateList? =
    requireContext().colorStateListExpand(id)

@JvmName("getColor")
fun Fragment.colorExpand(@ColorRes id: Int): Int =
    requireContext().colorExpand(id)

@JvmName("getCheckPermission")
fun Fragment.checkPermissionExpand(permission: String): Int =
    requireContext().checkPermissionExpand(permission)

@JvmName("getBoolean")
fun Fragment.booleanExpand(@BoolRes id: Int): Boolean =
    requireContext().booleanExpand(id)

@JvmName("getInt")
fun Fragment.intExpand(@IntegerRes id: Int): Int =
    requireContext().intExpand(id)

@JvmName("getFloat")
@RequiresApi(Build.VERSION_CODES.Q)
fun Fragment.floatExpand(@DimenRes id: Int): Float =
    requireContext().floatExpand(id)

@JvmName("getText")
fun Fragment.textExpand(@StringRes id: Int): CharSequence =
    requireContext().textExpand(id)

@JvmName("getString")
fun Fragment.stringExpand(@StringRes id: Int): String =
    requireContext().stringExpand(id)

@JvmName("getString")
fun Fragment.stringExpand(@StringRes id: Int, vararg formatArgs: Any): String =
    requireContext().stringExpand(id, formatArgs)

@JvmName("getTextArray")
fun Fragment.textArrayExpand(@ArrayRes id: Int): Array<CharSequence> =
    requireContext().textArrayExpand(id)

@JvmName("getStringArray")
fun Fragment.stringArrayExpand(@ArrayRes id: Int): Array<String> =
    requireContext().stringArrayExpand(id)

@JvmName("getIntArray")
fun Fragment.intArrayExpand(@ArrayRes id: Int): IntArray =
    requireContext().intArrayExpand(id)

@JvmName("getDimension")
fun Fragment.dimensionExpand(@DimenRes id: Int): Float =
    requireContext().dimensionExpand(id)

@JvmName("getDimensionPixelOffset")
fun Fragment.dimensionPixelOffsetExpand(@DimenRes id: Int): Int =
    requireContext().dimensionPixelOffsetExpand(id)

@JvmName("getDimensionPixelSize")
fun Fragment.dimensionPixelSizeExpand(@DimenRes id: Int): Int =
    requireContext().dimensionPixelSizeExpand(id)

@JvmName("getQuantityText")
fun Fragment.quantityTextExpand(@PluralsRes id: Int, quantity: Int): CharSequence =
    requireContext().quantityTextExpand(id, quantity)

@JvmName("getQuantityString")
fun Fragment.quantityStringExpand(
    @PluralsRes id: Int,
    quantity: Int,
    vararg formatArgs: Any
): CharSequence = requireContext().quantityStringExpand(id, quantity, formatArgs)

@JvmName("getQuantityString")
fun Fragment.quantityStringExpand(@PluralsRes id: Int, quantity: Int): String =
    requireContext().quantityStringExpand(id, quantity)

@JvmName("getFont")
@RequiresApi(Build.VERSION_CODES.O)
fun Fragment.fontExpand(@FontRes id: Int): Typeface =
    requireContext().fontExpand(id)

@JvmName("insertImageUri")
fun Fragment.insertImageUriExpand(contentValues: ContentValues): Uri =
    requireContext().insertImageUriExpand(contentValues)

@JvmName("appIntent")
fun Fragment.appIntentExpand(packageName: String): Intent? =
    requireContext().packageManager.getLaunchIntentForPackage(packageName)

@JvmName("getMinimumDrawable")
fun Fragment.minimumDrawableExpand(@DrawableRes id: Int, @ColorInt color: Int): Drawable? =
    drawableExpand(id)?.minimumWidthAndHeightDrawableExpand(color)

@JvmName("moveToNextToId")
fun Fragment.moveToNextToIdExpand(uri: Uri): Boolean =
    requireContext().moveToNextToIdExpand(uri)

@JvmName("moveToNext")
fun Fragment.moveToNextExpand(uri: Uri, name: String): Boolean =
    requireContext().moveToNextExpand(uri, name)

@JvmName("findIdByUri")
fun Fragment.findIdByUriExpand(uri: Uri): Long =
    requireContext().findIdByUriExpand(uri)

@JvmName("findPathByUri")
fun Fragment.findPathByUriExpand(uri: Uri): String? =
    requireContext().findPathByUriExpand(uri)

@JvmName("getJson")
fun Fragment.getJsonExpand(fileName: String): String =
    requireContext().getJsonExpand(fileName)