@file:JvmName("PermissionUtils")

package androidx.kotlin.expand.os.permission

import android.Manifest
import android.app.Activity
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

enum class PermissionCode(val code: Int) {
    WRITE(360),
    READ(361),
}

//判断权限,如果有返回true,没有返回false并直接请求
@JvmName("checkPermission")
fun Activity.permissionExpand(permissions: String, code: Int): Boolean {
    if (ContextCompat.checkSelfPermission(this, permissions) != PackageManager.PERMISSION_GRANTED) {
        ActivityCompat.requestPermissions(this, arrayOf(permissions), code)
        return false
    }
    return true
}

//判断权限,如果有返回true,没有返回false并直接请求
@JvmName("checkPermission")
fun Fragment.permissionExpand(permissions: String, code: Int): Boolean {
    if (ContextCompat.checkSelfPermission(
            requireActivity(),
            permissions
        ) != PackageManager.PERMISSION_GRANTED
    ) {
        requestPermissions(arrayOf(permissions), code)
        return false
    }
    return true
}

//Activity判断存储权限
@JvmName("permissionStorage")
fun Activity.permissionStorageExpand(): Boolean =
    permissionExpand(Manifest.permission.WRITE_EXTERNAL_STORAGE, PermissionCode.WRITE.code)

//Activity判断拍照权限
@JvmName("permissionCamera")
fun Activity.permissionCameraExpand(): Boolean =
    permissionExpand(Manifest.permission.CAMERA, PermissionCode.READ.code)

//Fragment判断存储权限
@JvmName("permissionStorage")
fun Fragment.permissionStorageExpand(): Boolean =
    permissionExpand(Manifest.permission.WRITE_EXTERNAL_STORAGE, PermissionCode.WRITE.code)

//Fragment判断拍照权限
@JvmName("permissionCamera")
fun Fragment.permissionCameraExpand(): Boolean =
    permissionExpand(Manifest.permission.CAMERA, PermissionCode.READ.code)
