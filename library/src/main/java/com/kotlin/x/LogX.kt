@file:Suppress("NOTHING_TO_INLINE")

package com.kotlin.x

import com.socks.library.KLog

const val DEFAULT_LOG_TAG = "KotlinX"

inline fun Any.LogV() = LogV(this.toString())

inline fun Any.LogV(any: Any) = LogV(DEFAULT_LOG_TAG, any)

inline fun Any.LogV(tag: String, any: Any) = KLog.v(tag, any.toString())

inline fun Any.LogD() = LogD(this.toString())

inline fun Any.LogD(any: Any) = LogD(DEFAULT_LOG_TAG, any)

inline fun Any.LogD(tag: String, any: Any) = KLog.d(tag, any.toString())

inline fun Any.LogI() = LogI(this.toString())

inline fun Any.LogI(any: Any) = LogI(DEFAULT_LOG_TAG, any)

inline fun Any.LogI(tag: String, any: Any) = KLog.i(tag, any.toString())

inline fun Any.LogW() = LogW(this.toString())

inline fun Any.LogW(any: Any) = LogW(DEFAULT_LOG_TAG, any)

inline fun Any.LogW(tag: String, any: Any) = KLog.w(tag, any.toString())

inline fun Any.LogE() = LogE(this.toString())

inline fun Any.LogE(any: Any) = LogE(DEFAULT_LOG_TAG, any)

inline fun Any.LogE(tag: String, any: Any) = KLog.e(tag, any.toString())