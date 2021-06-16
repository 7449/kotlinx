@file:JvmName("NumericalUtils")

package androidx.kotlin.expand.util

import java.math.BigDecimal
import java.math.BigInteger

@JvmName("toByte")
fun String.toByteExpand(defaultValue: Byte): Byte =
    toByteOrDefault { defaultValue }

@JvmName("toShort")
fun String.toShortExpand(defaultValue: Short): Short =
    toShortOrDefault { defaultValue }

@JvmName("toInt")
fun String.toIntExpand(defaultValue: Int): Int =
    toIntOrDefault { defaultValue }

@JvmName("toLong")
fun String.toLongExpand(defaultValue: Long): Long =
    toLongOrDefault { defaultValue }

@JvmName("toFloat")
fun String.toFloatExpand(defaultValue: Float): Float =
    toFloatOrDefault { defaultValue }

@JvmName("toDouble")
fun String.toDoubleExpand(defaultValue: Double): Double =
    toDoubleOrDefault { defaultValue }

@JvmName("toBigInteger")
fun String.toBigIntegerExpand(defaultValue: BigInteger): BigInteger =
    toBigIntegerOrDefault { defaultValue }

@JvmName("toBigDecimal")
fun String.toBigDecimalExpand(defaultValue: BigDecimal): BigDecimal =
    toBigDecimalOrDefault { defaultValue }

@JvmName("toByte")
fun String.toByteOrDefault(action: () -> Byte): Byte =
    toByteOrNull() ?: action.invoke()

@JvmName("toShort")
fun String.toShortOrDefault(action: () -> Short): Short =
    toShortOrNull() ?: action.invoke()

@JvmName("toInt")
fun String.toIntOrDefault(action: () -> Int): Int =
    toIntOrNull() ?: action.invoke()

@JvmName("toLong")
fun String.toLongOrDefault(action: () -> Long): Long =
    toLongOrNull() ?: action.invoke()

@JvmName("toFloat")
fun String.toFloatOrDefault(action: () -> Float): Float =
    toFloatOrNull() ?: action.invoke()

@JvmName("toDouble")
fun String.toDoubleOrDefault(action: () -> Double): Double =
    toDoubleOrNull() ?: action.invoke()

@JvmName("toBigInteger")
fun String.toBigIntegerOrDefault(action: () -> BigInteger): BigInteger =
    toBigIntegerOrNull() ?: action.invoke()

@JvmName("toBigDecimal")
fun String.toBigDecimalOrDefault(action: () -> BigDecimal): BigDecimal =
    toBigDecimalOrNull() ?: action.invoke()