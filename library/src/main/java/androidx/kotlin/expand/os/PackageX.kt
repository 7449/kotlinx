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
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog

@Version([VersionLog(Version.PEACHES)])
val Context.isApkDebuggableExpand: Boolean
    get() = isApkDebugAbleExpand(packageName)

@Version([VersionLog(Version.PEACHES)])
val Context.versionNameExpand: String
    get() = appVersionNameExpand(packageName)

@Version([VersionLog(Version.PEACHES)])
val Context.versionCodeIntExpand: Int
    get() = appVersionCodeIntExpand(packageName)

@Version([VersionLog(Version.PEACHES)])
val Context.versionCodeLongExpand: Long
    @RequiresApi(Build.VERSION_CODES.P)
    get() = appVersionCodeLongExpand(packageName)

@JvmName("appVersionName")
@Version([VersionLog(Version.PEACHES), VersionLog(Version.CHERRY)])
fun Context.appVersionNameExpand(packageName: String): String {
    return tryCatchExpand({
        packageManager.getPackageInfo(packageName, 0).versionName
    }, "")
}

@JvmName("appVersionCodeInt")
@Version([VersionLog(Version.PEACHES), VersionLog(Version.CHERRY)])
fun Context.appVersionCodeIntExpand(packageName: String): Int {
    return tryCatchExpand({
        packageManager.getPackageInfo(packageName, 0).versionCode
    }, -1)
}

@JvmName("appName")
@Version([VersionLog(Version.PEACHES), VersionLog(Version.CHERRY)])
fun Context.appNameExpand(packageName: String): String {
    return tryCatchExpand({
        packageManager.getApplicationInfo(packageName, 0).loadLabel(packageManager).toString()
    }, "")
}

@JvmName("isApkDebugAble")
@Version([VersionLog(Version.PEACHES), VersionLog(Version.CHERRY)])
fun Context.isApkDebugAbleExpand(packageName: String): Boolean {
    return tryCatchExpand({
        packageManager.getPackageInfo(
            packageName,
            PackageManager.GET_ACTIVITIES
        ).applicationInfo.flags and ApplicationInfo.FLAG_DEBUGGABLE != 0
    }, false)
}

@JvmName("appVersionCodeLong")
@Version([VersionLog(Version.PEACHES), VersionLog(Version.CHERRY)])
@RequiresApi(Build.VERSION_CODES.P)
fun Context.appVersionCodeLongExpand(packageName: String): Long {
    return tryCatchExpand({
        packageManager.getPackageInfo(packageName, 0).longVersionCode
    }, -1)
}

@Version([VersionLog(Version.PEACHES)])
val Context.installedPackageInfoExpand: List<PackageInfo>
    get() = packageManager.getInstalledPackages(0)

@JvmName("isInstalled")
@Version([VersionLog(Version.PEACHES)])
fun Context.isInstalledExpand(packageName: String): Boolean =
    installedPackageInfoExpand.find { packageName.equals(it.packageName, true) } != null

@JvmName("isSystemApp")
@Version([VersionLog(Version.PEACHES), VersionLog(Version.CHERRY)])
fun Context.isSystemAppExpand(packageName: String): Boolean {
    return tryCatchExpand({
        packageManager.getApplicationInfo(packageName, 0).flags and ApplicationInfo.FLAG_SYSTEM > 0
    }, false)
}

@JvmName("uninstallApp")
@Version([VersionLog(Version.PEACHES), VersionLog(Version.CHERRY)])
fun Context.uninstallAppExpand(packageName: String, action: () -> Unit) {
    tryCatchOrDefault({
        startActivity(Intent(
            Intent.ACTION_DELETE, Uri.parse(
                StringBuilder(32).append("package:").append(packageName).toString()
            )
        ).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })
    }, action)
}