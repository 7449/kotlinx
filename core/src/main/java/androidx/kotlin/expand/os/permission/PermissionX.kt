@file:JvmName("PermissionUtils")

package androidx.kotlin.expand.os.permission

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog

@JvmName("checkSelf")
@Version(VersionLog(Version.NONE))
fun Context.checkSelfPermissionExpand(name: String) =
    ContextCompat.checkSelfPermission(this, name) == PackageManager.PERMISSION_GRANTED

@JvmName("checkCamera")
@Version(VersionLog(Version.NONE))
fun Context.checkCameraPermissionExpand() =
    checkSelfPermissionExpand(Manifest.permission.CAMERA)

@JvmName("checkWrite")
@Version(VersionLog(Version.NONE))
fun Context.checkWritePermissionExpand() =
    checkSelfPermissionExpand(Manifest.permission.WRITE_EXTERNAL_STORAGE)

@JvmName("checkCamera")
@Version(VersionLog(Version.NONE))
fun Fragment.checkCameraPermissionExpand() =
    requireContext().checkSelfPermissionExpand(Manifest.permission.CAMERA)

@JvmName("checkWrite")
@Version(VersionLog(Version.NONE))
fun Fragment.checkWritePermissionExpand() =
    requireContext().checkSelfPermissionExpand(Manifest.permission.WRITE_EXTERNAL_STORAGE)