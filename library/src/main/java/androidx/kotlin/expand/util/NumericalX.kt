@file:JvmName("NumericalUtils")

package androidx.kotlin.expand.util

import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import androidx.kotlin.expand.os.tryCatchExpand
import java.math.BigDecimal
import java.math.BigInteger

@JvmName("toBoolean")
@Version(
    version = [Version.CHERRY],
    log = [
        VersionLog(Version.CHERRY, "added in version 0.0.6")
    ]
)
fun String.toBooleanExpand(defaultValue: Boolean): Boolean =
    toBooleanOrDefault { defaultValue }

@JvmName("toByte")
@Version(
    version = [Version.CHERRY],
    log = [
        VersionLog(Version.CHERRY, "added in version 0.0.6")
    ]
)
fun String.toByteExpand(defaultValue: Byte): Byte =
    toByteOrDefault { defaultValue }

@JvmName("toShort")
@Version(
    version = [Version.CHERRY],
    log = [
        VersionLog(Version.CHERRY, "added in version 0.0.6")
    ]
)
fun String.toShortExpand(defaultValue: Short): Short =
    toShortOrDefault { defaultValue }

@JvmName("toInt")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
fun String.toIntExpand(defaultValue: Int): Int =
    toIntOrDefault { defaultValue }

@JvmName("toLong")
@Version(
    version = [Version.CHERRY],
    log = [
        VersionLog(Version.CHERRY, "added in version 0.0.6")
    ]
)
fun String.toLongExpand(defaultValue: Long): Long =
    toLongOrDefault { defaultValue }

@JvmName("toFloat")
@Version(
    version = [Version.CHERRY],
    log = [
        VersionLog(Version.CHERRY, "added in version 0.0.6")
    ]
)
fun String.toFloatExpand(defaultValue: Float): Float =
    toFloatOrDefault { defaultValue }

@JvmName("toDouble")
@Version(
    version = [Version.CHERRY],
    log = [
        VersionLog(Version.CHERRY, "added in version 0.0.6")
    ]
)
fun String.toDoubleExpand(defaultValue: Double): Double =
    toDoubleOrDefault { defaultValue }

@JvmName("toBigInteger")
@Version(
    version = [Version.CHERRY],
    log = [
        VersionLog(Version.CHERRY, "added in version 0.0.6")
    ]
)
fun String.toBigIntegerExpand(defaultValue: BigInteger): BigInteger =
    toBigIntegerOrDefault { defaultValue }

@JvmName("toBigDecimal")
@Version(
    version = [Version.CHERRY],
    log = [
        VersionLog(Version.CHERRY, "added in version 0.0.6")
    ]
)
fun String.toBigDecimalExpand(defaultValue: BigDecimal): BigDecimal =
    toBigDecimalOrDefault { defaultValue }

@JvmName("toBoolean")
@Version(
    version = [Version.CHERRY],
    log = [
        VersionLog(Version.CHERRY, "added in version 0.0.6")
    ]
)
fun String.toBooleanOrDefault(action: () -> Boolean): Boolean =
    tryCatchExpand({ toBoolean() }, action.invoke())

@JvmName("toByte")
@Version(
    version = [Version.CHERRY],
    log = [
        VersionLog(Version.CHERRY, "added in version 0.0.6")
    ]
)
fun String.toByteOrDefault(action: () -> Byte): Byte =
    tryCatchExpand({ toByte() }, action.invoke())

@JvmName("toShort")
@Version(
    version = [Version.CHERRY],
    log = [
        VersionLog(Version.CHERRY, "added in version 0.0.6")
    ]
)
fun String.toShortOrDefault(action: () -> Short): Short =
    tryCatchExpand({ toShort() }, action.invoke())

@JvmName("toInt")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
fun String.toIntOrDefault(action: () -> Int): Int =
    tryCatchExpand({ toInt() }, action.invoke())

@JvmName("toLong")
@Version(
    version = [Version.CHERRY],
    log = [
        VersionLog(Version.CHERRY, "added in version 0.0.6")
    ]
)
fun String.toLongOrDefault(action: () -> Long): Long =
    tryCatchExpand({ toLong() }, action.invoke())

@JvmName("toFloat")
@Version(
    version = [Version.CHERRY],
    log = [
        VersionLog(Version.CHERRY, "added in version 0.0.6")
    ]
)
fun String.toFloatOrDefault(action: () -> Float): Float =
    tryCatchExpand({ toFloat() }, action.invoke())

@JvmName("toDouble")
@Version(
    version = [Version.CHERRY],
    log = [
        VersionLog(Version.CHERRY, "added in version 0.0.6")
    ]
)
fun String.toDoubleOrDefault(action: () -> Double): Double =
    tryCatchExpand({ toDouble() }, action.invoke())

@JvmName("toBigInteger")
@Version(
    version = [Version.CHERRY],
    log = [
        VersionLog(Version.CHERRY, "added in version 0.0.6")
    ]
)
fun String.toBigIntegerOrDefault(action: () -> BigInteger): BigInteger =
    tryCatchExpand({ toBigInteger() }, action.invoke())

@JvmName("toBigDecimal")
@Version(
    version = [Version.CHERRY],
    log = [
        VersionLog(Version.CHERRY, "added in version 0.0.6")
    ]
)
fun String.toBigDecimalOrDefault(action: () -> BigDecimal): BigDecimal =
    tryCatchExpand({ toBigDecimal() }, action.invoke())