@file:JvmName("CursorUtils")

// @see androidx.core:core-ktx:version   androidx.core.database.Cursor
// Cursor expand
package androidx.kotlin.expand.database

import android.database.Cursor
import android.os.Bundle


import androidx.kotlin.expand.os.orEmptyExpand

val Cursor?.extrasExpand: Bundle
    get() = this?.extras.orEmptyExpand()

val Cursor?.columnNamesExpand: Array<String>
    get() = this?.columnNames ?: emptyArray()

inline fun <T> Cursor?.getValueOrDefault(name: String, valueNull: () -> T, a: (c: Cursor) -> T): T =
    if (this?.isNull(getColumnIndex(name)) == false) a.invoke(this) else valueNull.invoke()

inline fun <T> Cursor?.getValueOrDefault(index: Int, valueNull: () -> T, a: (c: Cursor) -> T): T =
    if (this?.isNull(index) == false) a.invoke(this) else valueNull.invoke()

@JvmName("move")
fun Cursor?.moveExpand(offset: Int): Boolean =
    this?.move(offset) ?: false

@JvmName("moveToPosition")
fun Cursor?.moveToPositionExpand(position: Int): Boolean =
    this?.moveToPosition(position) ?: false

@JvmName("getColumnName")
fun Cursor?.getColumnNameExpand(columnName: String): String =
    getColumnNameOrDefault(columnName)

@JvmName("getBlob")
fun Cursor?.getBlobExpand(columnName: String): ByteArray =
    getBlobOrDefault(columnName)

@JvmName("getString")
fun Cursor?.getStringExpand(columnName: String): String =
    getStringOrDefault(columnName)

@JvmName("getShort")
fun Cursor?.getShortExpand(columnName: String): Short =
    getShortOrDefault(columnName)

@JvmName("getInt")
fun Cursor?.getIntExpand(columnName: String): Int =
    getIntOrDefault(columnName)

@JvmName("getLong")
fun Cursor?.getLongExpand(columnName: String): Long =
    getLongOrDefault(columnName)

@JvmName("getFloat")
fun Cursor?.getFloatExpand(columnName: String): Float =
    getFloatOrDefault(columnName)

@JvmName("getDouble")
fun Cursor?.getDoubleExpand(columnName: String): Double =
    getDoubleOrDefault(columnName)

@JvmName("getType")
fun Cursor?.getTypeExpand(columnName: String): Int =
    getTypeOrDefault(columnName)

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

fun Cursor?.getColumnNameOrDefault(columnName: String, defaultValue: String = ""): String =
    getColumnNameOrDefault(columnName) { defaultValue }

fun Cursor?.getBlobOrDefault(name: String, defaultValue: ByteArray = byteArrayOf()): ByteArray =
    getBlobOrDefault(name) { defaultValue }

fun Cursor?.getStringOrDefault(columnName: String, defaultValue: String = ""): String =
    getStringOrDefault(columnName) { defaultValue }

fun Cursor?.getShortOrDefault(columnName: String, defaultValue: Short = 0.toShort()): Short =
    getShortOrDefault(columnName) { defaultValue }

fun Cursor?.getIntOrDefault(columnName: String, defaultValue: Int = 0): Int =
    getIntOrDefault(columnName) { defaultValue }

fun Cursor?.getLongOrDefault(columnName: String, defaultValue: Long = 0.toLong()): Long =
    getLongOrDefault(columnName) { defaultValue }

fun Cursor?.getFloatOrDefault(columnName: String, defaultValue: Float = 0.toFloat()): Float =
    getFloatOrDefault(columnName) { defaultValue }

fun Cursor?.getDoubleOrDefault(columnName: String, defaultValue: Double = 0.toDouble()): Double =
    getDoubleOrDefault(columnName) { defaultValue }

fun Cursor?.getTypeOrDefault(columnName: String, defaultValue: Int = 0): Int =
    getTypeOrDefault(columnName) { defaultValue }

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

//action
fun Cursor?.getColumnNameOrDefault(columnName: String, action: () -> String): String =
    getValueOrDefault(columnName, action) { it.getColumnName(it.getColumnIndex(columnName)) }

fun Cursor?.getBlobOrDefault(columnName: String, action: () -> ByteArray): ByteArray =
    getValueOrDefault(columnName, action) { it.getBlob(it.getColumnIndex(columnName)) }

fun Cursor?.getStringOrDefault(columnName: String, action: () -> String): String =
    getValueOrDefault(columnName, action) { it.getString(it.getColumnIndex(columnName)) }

fun Cursor?.getShortOrDefault(columnName: String, action: () -> Short): Short =
    getValueOrDefault(columnName, action) { it.getShort(it.getColumnIndex(columnName)) }

fun Cursor?.getIntOrDefault(columnName: String, action: () -> Int): Int =
    getValueOrDefault(columnName, action) { it.getInt(it.getColumnIndex(columnName)) }

fun Cursor?.getLongOrDefault(columnName: String, action: () -> Long): Long =
    getValueOrDefault(columnName, action) { it.getLong(it.getColumnIndex(columnName)) }

fun Cursor?.getFloatOrDefault(columnName: String, action: () -> Float): Float =
    getValueOrDefault(columnName, action) { it.getFloat(it.getColumnIndex(columnName)) }

fun Cursor?.getDoubleOrDefault(columnName: String, action: () -> Double): Double =
    getValueOrDefault(columnName, action) { it.getDouble(it.getColumnIndex(columnName)) }

fun Cursor?.getTypeOrDefault(columnName: String, action: () -> Int): Int =
    getValueOrDefault(columnName, action) { it.getType(it.getColumnIndex(columnName)) }

//action
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