@file:JvmName("CursorUtils")

// @see androidx.core:core-ktx:version   androidx.core.database.Cursor
// Cursor expand
package androidx.kotlin.expand

import android.database.Cursor
import android.os.Bundle

val Cursor?.extrasExpand: Bundle
    get() = this?.extras.orEmptyExpand()

val Cursor?.columnNamesExpand: Array<String>
    get() = this?.columnNames ?: emptyArray()

@JvmName("getColumnName")
fun Cursor?.getColumnNameExpand(columnIndex: Int): String =
    getColumnNameOrDefault(columnIndex)

@JvmName("getBlob")
fun Cursor?.getBlobExpand(columnIndex: Int): ByteArray =
    getBlobOrDefault(columnIndex)

@JvmName("getString")
fun Cursor?.getStringExpand(columnIndex: Int): String =
    getStringOrDefault(columnIndex)

@JvmName("getShort")
fun Cursor?.getShortExpand(columnIndex: Int): Short =
    getShortOrDefault(columnIndex)

@JvmName("getInt")
fun Cursor?.getIntExpand(columnIndex: Int): Int =
    getIntOrDefault(columnIndex)

@JvmName("getLong")
fun Cursor?.getLongExpand(columnIndex: Int): Long =
    getLongOrDefault(columnIndex)

@JvmName("getFloat")
fun Cursor?.getFloatExpand(columnIndex: Int): Float =
    getFloatOrDefault(columnIndex)

@JvmName("getDouble")
fun Cursor?.getDoubleExpand(columnIndex: Int): Double =
    getDoubleOrDefault(columnIndex)

@JvmName("getType")
fun Cursor?.getTypeExpand(columnIndex: Int): Int =
    getTypeOrDefault(columnIndex)

fun Cursor?.getColumnNameOrDefault(columnIndex: Int, defaultValue: String = ""): String =
    getColumnNameOrDefault(columnIndex) { defaultValue }

fun Cursor?.getBlobOrDefault(columnIndex: Int, defaultValue: ByteArray = byteArrayOf()): ByteArray =
    getBlobOrDefault(columnIndex) { defaultValue }

fun Cursor?.getStringOrDefault(columnIndex: Int, defaultValue: String = ""): String =
    getStringOrDefault(columnIndex) { defaultValue }

fun Cursor?.getShortOrDefault(columnIndex: Int, defaultValue: Short = 0.toShort()): Short =
    getShortOrDefault(columnIndex) { defaultValue }

fun Cursor?.getIntOrDefault(columnIndex: Int, defaultValue: Int = 0): Int =
    getIntOrDefault(columnIndex) { defaultValue }

fun Cursor?.getLongOrDefault(columnIndex: Int, defaultValue: Long = 0.toLong()): Long =
    getLongOrDefault(columnIndex) { defaultValue }

fun Cursor?.getFloatOrDefault(columnIndex: Int, defaultValue: Float = 0.toFloat()): Float =
    getFloatOrDefault(columnIndex) { defaultValue }

fun Cursor?.getDoubleOrDefault(columnIndex: Int, defaultValue: Double = 0.toDouble()): Double =
    getDoubleOrDefault(columnIndex) { defaultValue }

fun Cursor?.getTypeOrDefault(columnIndex: Int, defaultValue: Int = 0): Int =
    getTypeOrDefault(columnIndex) { defaultValue }

fun Cursor?.getColumnNameOrDefault(columnIndex: Int, action: () -> String): String =
    if (this == null || isNull(columnIndex)) action.invoke() else getColumnName(columnIndex)

fun Cursor?.getBlobOrDefault(columnIndex: Int, action: () -> ByteArray): ByteArray =
    if (this == null || isNull(columnIndex)) action.invoke() else getBlob(columnIndex)

fun Cursor?.getStringOrDefault(columnIndex: Int, action: () -> String): String =
    if (this == null || isNull(columnIndex)) action.invoke() else getString(columnIndex)

fun Cursor?.getShortOrDefault(columnIndex: Int, action: () -> Short): Short =
    if (this == null || isNull(columnIndex)) action.invoke() else getShort(columnIndex)

fun Cursor?.getIntOrDefault(columnIndex: Int, action: () -> Int): Int =
    if (this == null || isNull(columnIndex)) action.invoke() else getInt(columnIndex)

fun Cursor?.getLongOrDefault(columnIndex: Int, action: () -> Long): Long =
    if (this == null || isNull(columnIndex)) action.invoke() else getLong(columnIndex)

fun Cursor?.getFloatOrDefault(columnIndex: Int, action: () -> Float): Float =
    if (this == null || isNull(columnIndex)) action.invoke() else getFloat(columnIndex)

fun Cursor?.getDoubleOrDefault(columnIndex: Int, action: () -> Double): Double =
    if (this == null || isNull(columnIndex)) action.invoke() else getDouble(columnIndex)

fun Cursor?.getTypeOrDefault(columnIndex: Int, action: () -> Int): Int =
    if (this == null || isNull(columnIndex)) action.invoke() else getType(columnIndex)