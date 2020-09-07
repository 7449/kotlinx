@file:JvmName("NumericalUtils")

package androidx.kotlin.expand.util

import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import java.math.BigDecimal
import java.math.BigInteger

@JvmName("toByte")
@Version(VersionLog(Version.NONE))
fun String.toByteExpand(defaultValue: Byte): Byte =
    toByteOrDefault { defaultValue }

@JvmName("toShort")
@Version(VersionLog(Version.NONE))
fun String.toShortExpand(defaultValue: Short): Short =
    toShortOrDefault { defaultValue }

@JvmName("toInt")
@Version(VersionLog(Version.NONE))
fun String.toIntExpand(defaultValue: Int): Int =
    toIntOrDefault { defaultValue }

@JvmName("toLong")
@Version(VersionLog(Version.NONE))
fun String.toLongExpand(defaultValue: Long): Long =
    toLongOrDefault { defaultValue }

@JvmName("toFloat")
@Version(VersionLog(Version.NONE))
fun String.toFloatExpand(defaultValue: Float): Float =
    toFloatOrDefault { defaultValue }

@JvmName("toDouble")
@Version(VersionLog(Version.NONE))
fun String.toDoubleExpand(defaultValue: Double): Double =
    toDoubleOrDefault { defaultValue }

@JvmName("toBigInteger")
@Version(VersionLog(Version.NONE))
fun String.toBigIntegerExpand(defaultValue: BigInteger): BigInteger =
    toBigIntegerOrDefault { defaultValue }

@JvmName("toBigDecimal")
@Version(VersionLog(Version.NONE))
fun String.toBigDecimalExpand(defaultValue: BigDecimal): BigDecimal =
    toBigDecimalOrDefault { defaultValue }

@JvmName("toByte")
@Version(VersionLog(Version.NONE))
fun String.toByteOrDefault(action: () -> Byte): Byte =
    toByteOrNull() ?: action.invoke()

@JvmName("toShort")
@Version(VersionLog(Version.NONE))
fun String.toShortOrDefault(action: () -> Short): Short =
    toShortOrNull() ?: action.invoke()

@JvmName("toInt")
@Version(VersionLog(Version.NONE))
fun String.toIntOrDefault(action: () -> Int): Int =
    toIntOrNull() ?: action.invoke()

@JvmName("toLong")
@Version(VersionLog(Version.NONE))
fun String.toLongOrDefault(action: () -> Long): Long =
    toLongOrNull() ?: action.invoke()

@JvmName("toFloat")
@Version(VersionLog(Version.NONE))
fun String.toFloatOrDefault(action: () -> Float): Float =
    toFloatOrNull() ?: action.invoke()

@JvmName("toDouble")
@Version(VersionLog(Version.NONE))
fun String.toDoubleOrDefault(action: () -> Double): Double =
    toDoubleOrNull() ?: action.invoke()

@JvmName("toBigInteger")
@Version(VersionLog(Version.NONE))
fun String.toBigIntegerOrDefault(action: () -> BigInteger): BigInteger =
    toBigIntegerOrNull() ?: action.invoke()

@JvmName("toBigDecimal")
@Version(VersionLog(Version.NONE))
fun String.toBigDecimalOrDefault(action: () -> BigDecimal): BigDecimal =
    toBigDecimalOrNull() ?: action.invoke()
