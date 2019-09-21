package com.kotlin.x

import android.os.Build

fun Int.minVersion() = Build.VERSION.SDK_INT >= this

fun Int.maxVersion() = Build.VERSION.SDK_INT <= this

fun Int.currentVersion() = Build.VERSION.SDK_INT == this

