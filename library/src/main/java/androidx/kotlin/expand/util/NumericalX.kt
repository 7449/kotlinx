@file:JvmName("NumericalUtils")

package androidx.kotlin.expand.util

import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import androidx.kotlin.expand.os.tryCatchExpand

@JvmName("toInt")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
fun String.toIntExpand(defaultValue: Int = -1): Int =
    toIntOrDefault { defaultValue }

@JvmName("toInt")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
fun String.toIntOrDefault(action: () -> Int): Int =
    tryCatchExpand({ toInt() }, action.invoke())