@file:JvmName("PermissionUtils")

package androidx.kotlin.expand.os.permission

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog

enum class PermissionCode(val code: Int) {
    WRITE(360),
    READ(361),
}

@JvmName("checkSelf")
@Version(
    version = [Version.PINEAPPLE],
    log = [
        VersionLog(Version.PINEAPPLE, "init submit")
    ]
)
fun Context.checkSelfPermissionExpand(name: String) =
    ContextCompat.checkSelfPermission(this, name) == PackageManager.PERMISSION_GRANTED

@JvmName("checkCamera")
@Version(
    version = [Version.PINEAPPLE],
    log = [
        VersionLog(Version.PINEAPPLE, "init submit")
    ]
)
fun Context.checkCameraPermissionExpand() =
    checkSelfPermissionExpand(Manifest.permission.CAMERA)

@JvmName("checkWrite")
@Version(
    version = [Version.PINEAPPLE],
    log = [
        VersionLog(Version.PINEAPPLE, "init submit")
    ]
)
fun Context.checkWritePermissionExpand() =
    checkSelfPermissionExpand(Manifest.permission.WRITE_EXTERNAL_STORAGE)

@JvmName("checkCamera")
@Version(
    version = [Version.PINEAPPLE],
    log = [
        VersionLog(Version.PINEAPPLE, "init submit")
    ]
)
fun Fragment.checkCameraPermissionExpand() =
    requireContext().checkSelfPermissionExpand(Manifest.permission.CAMERA)

@JvmName("checkWrite")
@Version(
    version = [Version.PINEAPPLE],
    log = [
        VersionLog(Version.PINEAPPLE, "init submit")
    ]
)
fun Fragment.checkWritePermissionExpand() =
    requireContext().checkSelfPermissionExpand(Manifest.permission.WRITE_EXTERNAL_STORAGE)


@Deprecated("@see ActivityResultContracts.RequestPermission()", ReplaceWith(""))
@JvmName("checkPermission")
@Version(
    version = [Version.BANANA, Version.PINEAPPLE],
    log = [
        VersionLog(Version.BANANA, "init submit"),
        VersionLog(Version.PINEAPPLE, "deprecated")
    ]
)
fun Activity.permissionExpand(permissions: String, code: Int): Boolean {
    if (ContextCompat.checkSelfPermission(this, permissions) != PackageManager.PERMISSION_GRANTED) {
        ActivityCompat.requestPermissions(this, arrayOf(permissions), code)
        return false
    }
    return true
}

@Deprecated("@see ActivityResultContracts.RequestPermission()", ReplaceWith(""))
@JvmName("checkPermission")
@Version(
    version = [Version.BANANA, Version.PINEAPPLE],
    log = [
        VersionLog(Version.BANANA, "init submit"),
        VersionLog(Version.PINEAPPLE, "deprecated")
    ]
)
fun Fragment.permissionExpand(permissions: String, code: Int): Boolean {
    if (ContextCompat.checkSelfPermission(
            requireActivity(), permissions
        ) != PackageManager.PERMISSION_GRANTED
    ) {
        requestPermissions(arrayOf(permissions), code)
        return false
    }
    return true
}

@Deprecated("@see ActivityResultContracts.RequestPermission()", ReplaceWith(""))
@JvmName("permissionStorage")
@Version(
    version = [Version.BANANA, Version.PINEAPPLE],
    log = [
        VersionLog(Version.BANANA, "init submit"),
        VersionLog(Version.PINEAPPLE, "deprecated")
    ]
)
fun Activity.permissionStorageExpand(): Boolean =
    permissionExpand(Manifest.permission.WRITE_EXTERNAL_STORAGE, PermissionCode.WRITE.code)

@Deprecated("@see ActivityResultContracts.RequestPermission()", ReplaceWith(""))
@JvmName("permissionCamera")
@Version(
    version = [Version.BANANA, Version.PINEAPPLE],
    log = [
        VersionLog(Version.BANANA, "init submit"),
        VersionLog(Version.PINEAPPLE, "deprecated")
    ]
)
fun Activity.permissionCameraExpand(): Boolean =
    permissionExpand(Manifest.permission.CAMERA, PermissionCode.READ.code)

@Deprecated("@see ActivityResultContracts.RequestPermission()", ReplaceWith(""))
@JvmName("permissionStorage")
@Version(
    version = [Version.BANANA, Version.PINEAPPLE],
    log = [
        VersionLog(Version.BANANA, "init submit"),
        VersionLog(Version.PINEAPPLE, "deprecated")
    ]
)
fun Fragment.permissionStorageExpand(): Boolean =
    permissionExpand(Manifest.permission.WRITE_EXTERNAL_STORAGE, PermissionCode.WRITE.code)

@Deprecated("@see ActivityResultContracts.RequestPermission()", ReplaceWith(""))
@JvmName("permissionCamera")
@Version(
    version = [Version.BANANA, Version.PINEAPPLE],
    log = [
        VersionLog(Version.BANANA, "init submit"),
        VersionLog(Version.PINEAPPLE, "deprecated")
    ]
)
fun Fragment.permissionCameraExpand(): Boolean =
    permissionExpand(Manifest.permission.CAMERA, PermissionCode.READ.code)
