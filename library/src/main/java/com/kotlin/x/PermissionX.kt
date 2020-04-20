package com.kotlin.x

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
fun Activity.permission(permissions: String, code: Int): Boolean {
    if (ContextCompat.checkSelfPermission(this, permissions) != PackageManager.PERMISSION_GRANTED) {
        ActivityCompat.requestPermissions(this, arrayOf(permissions), code)
        return false
    }
    return true
}

//判断权限,如果有返回true,没有返回false并直接请求
fun Fragment.permission(permissions: String, code: Int): Boolean {
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
fun Activity.permissionStorage() =
    permission(Manifest.permission.WRITE_EXTERNAL_STORAGE, PermissionCode.WRITE.code)

//Activity判断拍照权限
fun Activity.permissionCamera() = permission(Manifest.permission.CAMERA, PermissionCode.READ.code)

//Fragment判断存储权限
fun Fragment.permissionStorage() =
    permission(Manifest.permission.WRITE_EXTERNAL_STORAGE, PermissionCode.WRITE.code)

//Fragment判断拍照权限
fun Fragment.permissionCamera() = permission(Manifest.permission.CAMERA, PermissionCode.READ.code)
