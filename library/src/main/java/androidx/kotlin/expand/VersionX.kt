@file:JvmName("VersionUtils")

package androidx.kotlin.expand

import android.os.Build

@JvmName("isMinVersion")
fun Int.minVersionExpand(): Boolean =
    Build.VERSION.SDK_INT >= this

@JvmName("isMaxVersion")
fun Int.maxVersionExpand(): Boolean =
    Build.VERSION.SDK_INT <= this

@JvmName("getCurrentVersion")
fun Int.currentVersionExpand(): Boolean =
    Build.VERSION.SDK_INT == this

@JvmName("isLollipop")
fun hasLExpand(): Boolean =
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP

@JvmName("isM")
fun hasMExpand(): Boolean =
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.M

@JvmName("isN")
fun hasNExpand(): Boolean =
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.N

@JvmName("isQ")
fun hasQExpand(): Boolean =
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q
