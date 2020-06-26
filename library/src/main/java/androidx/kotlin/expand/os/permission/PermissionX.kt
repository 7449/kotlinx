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
@Version([VersionLog(Version.PINEAPPLE)])
fun Context.checkSelfPermissionExpand(name: String) =
    ContextCompat.checkSelfPermission(this, name) == PackageManager.PERMISSION_GRANTED

@JvmName("checkCamera")
@Version([VersionLog(Version.PINEAPPLE)])
fun Context.checkCameraPermissionExpand() =
    checkSelfPermissionExpand(Manifest.permission.CAMERA)

@JvmName("checkWrite")
@Version([VersionLog(Version.PINEAPPLE)])
fun Context.checkWritePermissionExpand() =
    checkSelfPermissionExpand(Manifest.permission.WRITE_EXTERNAL_STORAGE)

@JvmName("checkCamera")
@Version([VersionLog(Version.PINEAPPLE)])
fun Fragment.checkCameraPermissionExpand() =
    requireContext().checkSelfPermissionExpand(Manifest.permission.CAMERA)

@JvmName("checkWrite")
@Version([VersionLog(Version.PINEAPPLE)])
fun Fragment.checkWritePermissionExpand() =
    requireContext().checkSelfPermissionExpand(Manifest.permission.WRITE_EXTERNAL_STORAGE)