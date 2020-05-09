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

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val Context.isApkDebuggableExpand: Boolean
    get() = isApkDebugAbleExpand(packageName)

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val Context.versionNameExpand: String
    get() = appVersionNameExpand(packageName)

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val Context.versionCodeIntExpand: Int
    get() = appVersionCodeIntExpand(packageName)

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val Context.versionCodeLongExpand: Long
    @RequiresApi(Build.VERSION_CODES.P)
    get() = appVersionCodeLongExpand(packageName)

@JvmName("appVersionName")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
fun Context.appVersionNameExpand(packageName: String): String {
    try {
        val packageInfo: PackageInfo = packageManager.getPackageInfo(packageName, 0)
        return packageInfo.versionName
    } catch (e: PackageManager.NameNotFoundException) {
        e.printStackTrace()
    }
    return ""
}

@JvmName("appVersionCodeInt")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
fun Context.appVersionCodeIntExpand(packageName: String): Int {
    try {
        val packageInfo: PackageInfo = packageManager.getPackageInfo(packageName, 0)
        return packageInfo.versionCode
    } catch (e: PackageManager.NameNotFoundException) {
        e.printStackTrace()
    }
    return -1
}

@JvmName("appName")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
fun Context.appNameExpand(packageName: String): String {
    try {
        val info: ApplicationInfo = packageManager.getApplicationInfo(packageName, 0)
        return info.loadLabel(packageManager).toString()
    } catch (e: PackageManager.NameNotFoundException) {
        e.printStackTrace()
    }
    return ""
}

@JvmName("isApkDebugAble")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
fun Context.isApkDebugAbleExpand(packageName: String): Boolean {
    try {
        val info: ApplicationInfo = packageManager.getPackageInfo(
            packageName,
            PackageManager.GET_ACTIVITIES
        ).applicationInfo
        return info.flags and ApplicationInfo.FLAG_DEBUGGABLE != 0
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return false
}

@JvmName("appVersionCodeLong")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
@RequiresApi(Build.VERSION_CODES.P)
fun Context.appVersionCodeLongExpand(packageName: String): Long {
    try {
        val packageInfo: PackageInfo = packageManager.getPackageInfo(packageName, 0)
        return packageInfo.longVersionCode
    } catch (e: PackageManager.NameNotFoundException) {
        e.printStackTrace()
    }
    return -1
}

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val Context.installedPackageInfoExpand: List<PackageInfo>
    get() = packageManager.getInstalledPackages(0)

@JvmName("isInstalled")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
fun Context.isInstalledExpand(packageName: String): Boolean =
    installedPackageInfoExpand.find { packageName.equals(it.packageName, true) } != null

@JvmName("isSystemApp")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
fun Context.isSystemAppExpand(packageName: String): Boolean {
    try {
        val app: ApplicationInfo = packageManager.getApplicationInfo(packageName, 0)
        return app.flags and ApplicationInfo.FLAG_SYSTEM > 0
    } catch (e: PackageManager.NameNotFoundException) {
        e.printStackTrace()
    }
    return false
}

@JvmName("uninstallApp")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
fun Context.uninstallAppExpand(packageName: String, action: () -> Unit) {
    try {
        startActivity(Intent(
            Intent.ACTION_DELETE, Uri.parse(
                StringBuilder(32).append("package:").append(packageName).toString()
            )
        ).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })
    } catch (e: Exception) {
        action.invoke()
    }
}