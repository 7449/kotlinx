@file:JvmName("PackageUtils")

package androidx.kotlin.expand.os

import android.content.Context
import android.content.Intent
import android.content.pm.ApplicationInfo
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import androidx.annotation.RequiresApi

val Context.isApkDebuggableExpand: Boolean
    get() = isApkDebugAbleExpand(packageName)

val Context.versionNameExpand: String
    get() = appVersionNameExpand(packageName)

@Deprecated(
    "Use getLongVersionCode() instead, which includes both this and the additional",
    replaceWith = ReplaceWith("versionCodeLongExpand")
)
val Context.versionCodeIntExpand: Int
    get() = appVersionCodeIntExpand(packageName)

val Context.versionCodeLongExpand: Long
    @RequiresApi(Build.VERSION_CODES.P)
    get() = appVersionCodeLongExpand(packageName)

@JvmName("appVersionName")
fun Context.appVersionNameExpand(packageName: String): String {
    return runCatching {
        packageManager.getPackageInfo(
            packageName,
            0
        ).versionName
    }.getOrElse { "" }
}

@Deprecated(
    "Use getLongVersionCode() instead, which includes both this and the additional",
    replaceWith = ReplaceWith("appVersionCodeLongExpand(packageName)")
)
@JvmName("appVersionCodeInt")
fun Context.appVersionCodeIntExpand(packageName: String): Int {
    return runCatching {
        packageManager.getPackageInfo(
            packageName,
            0
        ).versionCode
    }.getOrElse { -1 }
}

@JvmName("appName")
fun Context.appNameExpand(packageName: String): String {
    return runCatching {
        packageManager.getApplicationInfo(packageName, 0).loadLabel(packageManager).toString()
    }.getOrElse { "" }
}

@JvmName("isApkDebugAble")
fun Context.isApkDebugAbleExpand(packageName: String): Boolean {
    return runCatching {
        packageManager.getPackageInfo(
            packageName,
            PackageManager.GET_ACTIVITIES
        ).applicationInfo.flags and ApplicationInfo.FLAG_DEBUGGABLE != 0
    }.getOrElse { false }
}

@JvmName("appVersionCodeLong")
@RequiresApi(Build.VERSION_CODES.P)
fun Context.appVersionCodeLongExpand(packageName: String): Long {
    return runCatching {
        packageManager.getPackageInfo(
            packageName,
            0
        ).longVersionCode
    }.getOrElse { -1 }
}

val Context.installedPackageInfoExpand: List<PackageInfo>
    get() = packageManager.getInstalledPackages(0)

@JvmName("isInstalled")
fun Context.isInstalledExpand(packageName: String): Boolean =
    installedPackageInfoExpand.find { packageName.equals(it.packageName, true) } != null

@JvmName("isSystemApp")
fun Context.isSystemAppExpand(packageName: String): Boolean {
    return runCatching {
        packageManager.getApplicationInfo(
            packageName,
            0
        ).flags and ApplicationInfo.FLAG_SYSTEM > 0
    }.getOrElse { false }
}

@JvmName("uninstallApp")
fun Context.uninstallAppExpand(packageName: String, action: () -> Unit) {
    runCatching {
        startActivity(Intent(
            Intent.ACTION_DELETE, Uri.parse(
                StringBuilder(32).append("package:").append(packageName).toString()
            )
        ).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })
    }.onFailure { action.invoke() }
}