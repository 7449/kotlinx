@file:Suppress("NOTHING_TO_INLINE")

package com.kotlin.x

import com.socks.library.KLog

var showLog = true

var LOG_TAG = "KotlinX"

inline fun Any.LogV() {
    if (showLog) KLog.v(LOG_TAG, this.toString())
}

inline fun Any.LogD() {
    if (showLog) KLog.d(LOG_TAG, this.toString())
}

inline fun Any.LogI() {
    if (showLog) KLog.i(LOG_TAG, this.toString())
}

inline fun Any.LogW() {
    if (showLog) KLog.w(LOG_TAG, this.toString())
}

inline fun Any.LogE() {
    if (showLog) KLog.e(LOG_TAG, this.toString())
}