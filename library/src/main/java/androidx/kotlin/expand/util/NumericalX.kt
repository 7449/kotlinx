@file:JvmName("NumericalUtils")

package androidx.kotlin.expand.util

import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import androidx.kotlin.expand.os.tryCatchExpand
import java.math.BigDecimal
import java.math.BigInteger

@JvmName("toBoolean")
@Version([VersionLog(Version.CHERRY)])
fun String.toBooleanExpand(defaultValue: Boolean): Boolean =
    toBooleanOrDefault { defaultValue }

@JvmName("toByte")
@Version([VersionLog(Version.CHERRY)])
fun String.toByteExpand(defaultValue: Byte): Byte =
    toByteOrDefault { defaultValue }

@JvmName("toShort")
@Version([VersionLog(Version.CHERRY)])
fun String.toShortExpand(defaultValue: Short): Short =
    toShortOrDefault { defaultValue }

@JvmName("toInt")
@Version([VersionLog(Version.PEACHES)])
fun String.toIntExpand(defaultValue: Int): Int =
    toIntOrDefault { defaultValue }

@JvmName("toLong")
@Version([VersionLog(Version.CHERRY)])
fun String.toLongExpand(defaultValue: Long): Long =
    toLongOrDefault { defaultValue }

@JvmName("toFloat")
@Version([VersionLog(Version.CHERRY)])
fun String.toFloatExpand(defaultValue: Float): Float =
    toFloatOrDefault { defaultValue }

@JvmName("toDouble")
@Version([VersionLog(Version.CHERRY)])
fun String.toDoubleExpand(defaultValue: Double): Double =
    toDoubleOrDefault { defaultValue }

@JvmName("toBigInteger")
@Version([VersionLog(Version.CHERRY)])
fun String.toBigIntegerExpand(defaultValue: BigInteger): BigInteger =
    toBigIntegerOrDefault { defaultValue }

@JvmName("toBigDecimal")
@Version([VersionLog(Version.CHERRY)])
fun String.toBigDecimalExpand(defaultValue: BigDecimal): BigDecimal =
    toBigDecimalOrDefault { defaultValue }

@JvmName("toBoolean")
@Version([VersionLog(Version.CHERRY)])
fun String.toBooleanOrDefault(action: () -> Boolean): Boolean =
    tryCatchExpand({ toBoolean() }, action.invoke())

@JvmName("toByte")
@Version([VersionLog(Version.CHERRY)])
fun String.toByteOrDefault(action: () -> Byte): Byte =
    tryCatchExpand({ toByte() }, action.invoke())

@JvmName("toShort")
@Version([VersionLog(Version.CHERRY)])
fun String.toShortOrDefault(action: () -> Short): Short =
    tryCatchExpand({ toShort() }, action.invoke())

@JvmName("toInt")
@Version([VersionLog(Version.PEACHES)])
fun String.toIntOrDefault(action: () -> Int): Int =
    tryCatchExpand({ toInt() }, action.invoke())

@JvmName("toLong")
@Version([VersionLog(Version.CHERRY)])
fun String.toLongOrDefault(action: () -> Long): Long =
    tryCatchExpand({ toLong() }, action.invoke())

@JvmName("toFloat")
@Version([VersionLog(Version.CHERRY)])
fun String.toFloatOrDefault(action: () -> Float): Float =
    tryCatchExpand({ toFloat() }, action.invoke())

@JvmName("toDouble")
@Version([VersionLog(Version.CHERRY)])
fun String.toDoubleOrDefault(action: () -> Double): Double =
    tryCatchExpand({ toDouble() }, action.invoke())

@JvmName("toBigInteger")
@Version([VersionLog(Version.CHERRY)])
fun String.toBigIntegerOrDefault(action: () -> BigInteger): BigInteger =
    tryCatchExpand({ toBigInteger() }, action.invoke())

@JvmName("toBigDecimal")
@Version([VersionLog(Version.CHERRY)])
fun String.toBigDecimalOrDefault(action: () -> BigDecimal): BigDecimal =
    tryCatchExpand({ toBigDecimal() }, action.invoke())