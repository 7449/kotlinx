@file:JvmName("PermissionUtils")

package androidx.kotlin.expand.os.permission

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

@JvmName("checkSelf")
fun Context.checkSelfPermissionExpand(name: String) =
    ContextCompat.checkSelfPermission(this, name) == PackageManager.PERMISSION_GRANTED

@JvmName("checkCamera")
fun Context.checkCameraPermissionExpand() =
    checkSelfPermissionExpand(Manifest.permission.CAMERA)

@JvmName("checkWrite")
fun Context.checkWritePermissionExpand() =
    checkSelfPermissionExpand(Manifest.permission.WRITE_EXTERNAL_STORAGE)

@JvmName("checkCamera")
fun Fragment.checkCameraPermissionExpand() =
    requireContext().checkSelfPermissionExpand(Manifest.permission.CAMERA)

@JvmName("checkWrite")
fun Fragment.checkWritePermissionExpand() =
    requireContext().checkSelfPermissionExpand(Manifest.permission.WRITE_EXTERNAL_STORAGE)