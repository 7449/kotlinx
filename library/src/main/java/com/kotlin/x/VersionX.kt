@file:Suppress("NOTHING_TO_INLINE")

package com.kotlin.x

import android.os.Build

inline fun Int.minVersion() = Build.VERSION.SDK_INT >= this

inline fun Int.maxVersion() = Build.VERSION.SDK_INT <= this

inline fun Int.currentVersion() = Build.VERSION.SDK_INT == this

