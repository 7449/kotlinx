@file:JvmName("VersionUtils")

package androidx.kotlin.expand.version

import android.os.Build

@JvmName("isMinVersion")
fun Int.minVersionExpand(): Boolean = Build.VERSION.SDK_INT >= this

@JvmName("isMaxVersion")
fun Int.maxVersionExpand(): Boolean = Build.VERSION.SDK_INT <= this

@JvmName("isK")
fun hasKExpand(): Boolean = Build.VERSION.SDK_INT >= 19

@JvmName("isL")
fun hasLExpand(): Boolean = Build.VERSION.SDK_INT >= 21

@JvmName("isL_Mr1")
fun hasLMr1Expand(): Boolean = Build.VERSION.SDK_INT >= 22

@JvmName("isM")
fun hasMExpand(): Boolean = Build.VERSION.SDK_INT >= 23

@JvmName("isN")
fun hasNExpand(): Boolean = Build.VERSION.SDK_INT >= 24

@JvmName("isN_Mr1")
fun hasNMr1Expand(): Boolean = Build.VERSION.SDK_INT >= 25

@JvmName("isO")
fun hasOExpand(): Boolean = Build.VERSION.SDK_INT >= 26

@JvmName("isO_Mr1")
fun hasOMr1Expand(): Boolean = Build.VERSION.SDK_INT >= 27

@JvmName("isP")
fun hasPExpand(): Boolean = Build.VERSION.SDK_INT >= 28

@JvmName("isQ")
fun hasQExpand(): Boolean = Build.VERSION.SDK_INT >= 29

@JvmName("isR")
fun hasRExpand(): Boolean = Build.VERSION.SDK_INT >= 30