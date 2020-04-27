@file:JvmName("VersionUtils")

package com.kotlin.x

import android.os.Build

fun Int.minVersion(): Boolean =
    Build.VERSION.SDK_INT >= this

fun Int.maxVersion(): Boolean =
    Build.VERSION.SDK_INT <= this

fun Int.currentVersion(): Boolean =
    Build.VERSION.SDK_INT == this

fun hasL(): Boolean =
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP

fun hasM(): Boolean =
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.M

fun hasN(): Boolean =
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.N

fun hasQ(): Boolean =
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q
