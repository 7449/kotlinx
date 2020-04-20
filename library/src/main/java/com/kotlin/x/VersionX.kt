package com.kotlin.x

import android.os.Build

fun Int.minVersion() = Build.VERSION.SDK_INT >= this

fun Int.maxVersion() = Build.VERSION.SDK_INT <= this

fun Int.currentVersion() = Build.VERSION.SDK_INT == this

//Android版本是否为L
fun hasL() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP

//Android版本是否为M
fun hasM() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.M

//Android版本是否为N
fun hasN() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.N

//Android版本是否为Q
fun hasQ() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q
