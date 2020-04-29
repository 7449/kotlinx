@file:JvmName("PermissionUtils")

package androidx.kotlin.expand.os.permission

import android.Manifest
import android.app.Activity
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

//判断权限,如果有返回true,没有返回false并直接请求
@JvmName("checkPermission")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity.permissionExpand(permissions: String, code: Int): Boolean {
    if (ContextCompat.checkSelfPermission(this, permissions) != PackageManager.PERMISSION_GRANTED) {
        ActivityCompat.requestPermissions(this, arrayOf(permissions), code)
        return false
    }
    return true
}

//判断权限,如果有返回true,没有返回false并直接请求
@JvmName("checkPermission")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
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

//Activity判断存储权限
@JvmName("permissionStorage")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity.permissionStorageExpand(): Boolean =
    permissionExpand(Manifest.permission.WRITE_EXTERNAL_STORAGE, PermissionCode.WRITE.code)

//Activity判断拍照权限
@JvmName("permissionCamera")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity.permissionCameraExpand(): Boolean =
    permissionExpand(Manifest.permission.CAMERA, PermissionCode.READ.code)

//Fragment判断存储权限
@JvmName("permissionStorage")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Fragment.permissionStorageExpand(): Boolean =
    permissionExpand(Manifest.permission.WRITE_EXTERNAL_STORAGE, PermissionCode.WRITE.code)

//Fragment判断拍照权限
@JvmName("permissionCamera")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Fragment.permissionCameraExpand(): Boolean =
    permissionExpand(Manifest.permission.CAMERA, PermissionCode.READ.code)
