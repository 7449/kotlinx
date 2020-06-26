@file:JvmName("FragmentUtils")

package androidx.kotlin.expand.app

import android.content.ContentValues
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Build
import androidx.annotation.*
import androidx.fragment.app.Fragment
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import androidx.kotlin.expand.content.*
import androidx.kotlin.expand.graphics.drawable.minimumWidthAndHeightDrawableExpand
import java.io.File
import java.util.concurrent.Executor

@JvmName("runOnUiThread")
@Version([VersionLog(Version.BANANA)])
fun Fragment.runOnUiThreadExpand(action: () -> Unit): Unit =
    requireActivity().runOnUiThread { action.invoke() }

@JvmName("toast")
@Version([VersionLog(Version.BANANA)])
fun Fragment.toastExpand(any: Any): Unit? =
    activity?.toastExpand(any.toString())

@Version([VersionLog(Version.BANANA)])
val Fragment.dataDirCompat: File?
    get() = requireContext().dataDirCompat

@Version([VersionLog(Version.BANANA)])
val Fragment.obbDirsCompat: Array<File>
    get() = requireContext().obbDirsCompat

@Version([VersionLog(Version.BANANA)])
val Fragment.externalCacheDirsCompat: Array<File>
    get() = requireContext().externalCacheDirsCompat

@Version([VersionLog(Version.BANANA)])
val Fragment.noBackupFilesDirCompat: File?
    get() = requireContext().noBackupFilesDirCompat

@Version([VersionLog(Version.BANANA)])
val Fragment.codeCacheDirCompat: File
    get() = requireContext().codeCacheDirCompat

@Version([VersionLog(Version.BANANA)])
val Fragment.isDeviceProtectedStorageCompat: Boolean
    get() = requireContext().isDeviceProtectedStorageCompat

@Version([VersionLog(Version.BANANA)])
val Fragment.mainExecutorCompat: Executor
    get() = requireContext().mainExecutorCompat

@Version([VersionLog(Version.BANANA)])
val Fragment.isLandscapeExpand: Boolean
    get() = requireContext().isLandscapeExpand

@JvmName("getExternalFilesDirs")
@Version([VersionLog(Version.BANANA)])
fun Fragment.externalFilesDirsExpand(type: String?): Array<File> =
    requireContext().externalFilesDirsExpand(type)

@JvmName("getDrawable")
@Version([VersionLog(Version.BANANA)])
fun Fragment.drawableExpand(@DrawableRes id: Int): Drawable? =
    requireContext().drawableExpand(id)

@JvmName("getColorStateList")
@Version([VersionLog(Version.BANANA)])
fun Fragment.colorStateListExpand(@ColorRes id: Int): ColorStateList? =
    requireContext().colorStateListExpand(id)

@JvmName("getColor")
@Version([VersionLog(Version.BANANA)])
fun Fragment.colorExpand(@ColorRes id: Int): Int =
    requireContext().colorExpand(id)

@JvmName("getCheckPermission")
@Version([VersionLog(Version.BANANA)])
fun Fragment.checkPermissionExpand(permission: String): Int =
    requireContext().checkPermissionExpand(permission)

@JvmName("getBoolean")
@Version([VersionLog(Version.BANANA)])
fun Fragment.booleanExpand(@BoolRes id: Int): Boolean =
    requireContext().booleanExpand(id)

@JvmName("getInt")
@Version([VersionLog(Version.BANANA)])
fun Fragment.intExpand(@IntegerRes id: Int): Int =
    requireContext().intExpand(id)

@JvmName("getFloat")
@RequiresApi(Build.VERSION_CODES.Q)
@Version([VersionLog(Version.BANANA)])
fun Fragment.floatExpand(@DimenRes id: Int): Float =
    requireContext().floatExpand(id)

@JvmName("getText")
@Version([VersionLog(Version.BANANA)])
fun Fragment.textExpand(@StringRes id: Int): CharSequence =
    requireContext().textExpand(id)

@JvmName("getString")
@Version([VersionLog(Version.BANANA)])
fun Fragment.stringExpand(@StringRes id: Int): String =
    requireContext().stringExpand(id)

@JvmName("getString")
@Version([VersionLog(Version.BANANA)])
fun Fragment.stringExpand(@StringRes id: Int, vararg formatArgs: Any): String =
    requireContext().stringExpand(id, formatArgs)

@JvmName("getTextArray")
@Version([VersionLog(Version.BANANA)])
fun Fragment.textArrayExpand(@ArrayRes id: Int): Array<CharSequence> =
    requireContext().textArrayExpand(id)

@JvmName("getStringArray")
@Version([VersionLog(Version.BANANA)])
fun Fragment.stringArrayExpand(@ArrayRes id: Int): Array<String> =
    requireContext().stringArrayExpand(id)

@JvmName("getIntArray")
@Version([VersionLog(Version.BANANA)])
fun Fragment.intArrayExpand(@ArrayRes id: Int): IntArray =
    requireContext().intArrayExpand(id)

@JvmName("getDimension")
@Version([VersionLog(Version.BANANA)])
fun Fragment.dimensionExpand(@DimenRes id: Int): Float =
    requireContext().dimensionExpand(id)

@JvmName("getDimensionPixelOffset")
@Version([VersionLog(Version.BANANA)])
fun Fragment.dimensionPixelOffsetExpand(@DimenRes id: Int): Int =
    requireContext().dimensionPixelOffsetExpand(id)

@JvmName("getDimensionPixelSize")
@Version([VersionLog(Version.BANANA)])
fun Fragment.dimensionPixelSizeExpand(@DimenRes id: Int): Int =
    requireContext().dimensionPixelSizeExpand(id)

@JvmName("getQuantityText")
@Version([VersionLog(Version.BANANA)])
fun Fragment.quantityTextExpand(@PluralsRes id: Int, quantity: Int): CharSequence =
    requireContext().quantityTextExpand(id, quantity)

@JvmName("getQuantityString")
@Version([VersionLog(Version.BANANA)])
fun Fragment.quantityStringExpand(
    @PluralsRes id: Int,
    quantity: Int,
    vararg formatArgs: Any
): CharSequence = requireContext().quantityStringExpand(id, quantity, formatArgs)

@JvmName("getQuantityString")
@Version([VersionLog(Version.BANANA)])
fun Fragment.quantityStringExpand(@PluralsRes id: Int, quantity: Int): String =
    requireContext().quantityStringExpand(id, quantity)

@JvmName("getFont")
@RequiresApi(Build.VERSION_CODES.O)
@Version([VersionLog(Version.BANANA)])
fun Fragment.fontExpand(@FontRes id: Int): Typeface =
    requireContext().fontExpand(id)

@JvmName("insertImageUri")
@Version([VersionLog(Version.BANANA)])
fun Fragment.insertImageUriExpand(contentValues: ContentValues): Uri? =
    requireContext().insertImageUriExpand(contentValues)

@JvmName("insertVideoUri")
@Version([VersionLog(Version.WATERMELON)])
fun Fragment.insertVideoUriExpand(contentValues: ContentValues): Uri? =
    requireContext().insertVideoUriExpand(contentValues)

@JvmName("appIntent")
@Version([VersionLog(Version.BANANA)])
fun Fragment.appIntentExpand(packageName: String): Intent? =
    requireContext().packageManager.getLaunchIntentForPackage(packageName)

@JvmName("getMinimumDrawable")
@Version([VersionLog(Version.BANANA)])
fun Fragment.minimumDrawableExpand(@DrawableRes id: Int, @ColorInt color: Int): Drawable? =
    drawableExpand(id)?.minimumWidthAndHeightDrawableExpand(color)

@JvmName("moveToNextToId")
@Version([VersionLog(Version.BANANA)])
fun Fragment.moveToNextToIdExpand(uri: Uri): Boolean =
    requireContext().moveToNextToIdExpand(uri)

@JvmName("moveToNext")
@Version([VersionLog(Version.BANANA)])
fun Fragment.moveToNextExpand(uri: Uri, name: String): Boolean =
    requireContext().moveToNextExpand(uri, name)

@JvmName("findIdByUri")
@Version([VersionLog(Version.BANANA)])
fun Fragment.findIdByUriExpand(uri: Uri): Long =
    requireContext().findIdByUriExpand(uri)

@JvmName("findPathByUri")
@Version([VersionLog(Version.BANANA)])
fun Fragment.findPathByUriExpand(uri: Uri): String? =
    requireContext().findPathByUriExpand(uri)

@JvmName("getJson")
@Version([VersionLog(Version.BANANA)])
fun Fragment.getJsonExpand(fileName: String): String =
    requireContext().getJsonExpand(fileName)