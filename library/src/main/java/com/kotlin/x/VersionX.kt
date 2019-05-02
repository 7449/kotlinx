@file:Suppress("NOTHING_TO_INLINE")

package com.kotlin.x

import android.os.Build


inline fun Any.minVersion(version: Int) = Build.VERSION.SDK_INT >= version

inline fun Any.maxVersion(version: Int) = Build.VERSION.SDK_INT <= version

inline fun Any.currentVersion(version: Int) = Build.VERSION.SDK_INT == version

