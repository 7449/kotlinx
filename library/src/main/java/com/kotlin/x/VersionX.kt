@file:JvmName("VersionUtils")

package com.kotlin.x

import android.os.Build

fun Int.minVersionExpand(): Boolean =
    Build.VERSION.SDK_INT >= this

fun Int.maxVersionExpand(): Boolean =
    Build.VERSION.SDK_INT <= this

fun Int.currentVersionExpand(): Boolean =
    Build.VERSION.SDK_INT == this

fun hasLExpand(): Boolean =
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP

fun hasMExpand(): Boolean =
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.M

fun hasNExpand(): Boolean =
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.N

fun hasQExpand(): Boolean =
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q
