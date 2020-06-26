@file:JvmName("TryUtils")

package androidx.kotlin.expand.os

import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog

@JvmName("tryCatch")
@Version([VersionLog(Version.PEACHES)])
fun <T> tryCatchExpand(action: Action<T>, defaultValue: T): T =
    tryCatchOrDefault(action) { defaultValue }

@JvmName("tryCatch")
@Version([VersionLog(Version.PEACHES)])
fun <T> tryCatchOrDefault(action: Action<T>, error: Action<T>): T =
    try {
        action.invoke()
    } catch (e: Exception) {
        error.invoke()
    }
