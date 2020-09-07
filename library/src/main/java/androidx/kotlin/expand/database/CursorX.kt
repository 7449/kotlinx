@file:JvmName("CursorUtils")

// @see androidx.core:core-ktx:version   androidx.core.database.Cursor
// Cursor expand
package androidx.kotlin.expand.database

import android.database.Cursor
import android.os.Bundle
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import androidx.kotlin.expand.os.orEmptyExpand

@Version(VersionLog(Version.NONE))
val Cursor?.extrasExpand: Bundle
    get() = this?.extras.orEmptyExpand()

@Version(VersionLog(Version.NONE))
val Cursor?.columnNamesExpand: Array<String>
    get() = this?.columnNames ?: emptyArray()

@Version(VersionLog(Version.NONE))
inline fun <T> Cursor?.getValueOrDefault(name: String, valueNull: () -> T, a: (c: Cursor) -> T): T =
    if (this?.isNull(getColumnIndex(name)) == false) a.invoke(this) else valueNull.invoke()

@Version(VersionLog(Version.NONE))
inline fun <T> Cursor?.getValueOrDefault(index: Int, valueNull: () -> T, a: (c: Cursor) -> T): T =
    if (this?.isNull(index) == false) a.invoke(this) else valueNull.invoke()

@JvmName("move")
@Version(VersionLog(Version.NONE))
fun Cursor?.moveExpand(offset: Int): Boolean =
    this?.move(offset) ?: false

@JvmName("moveToPosition")
@Version(VersionLog(Version.NONE))
fun Cursor?.moveToPositionExpand(position: Int): Boolean =
    this?.moveToPosition(position) ?: false

@JvmName("getColumnName")
@Version(VersionLog(Version.NONE))
fun Cursor?.getColumnNameExpand(columnName: String): String =
    getColumnNameOrDefault(columnName)

@JvmName("getBlob")
@Version(VersionLog(Version.NONE))
fun Cursor?.getBlobExpand(columnName: String): ByteArray =
    getBlobOrDefault(columnName)

@JvmName("getString")
@Version(VersionLog(Version.NONE))
fun Cursor?.getStringExpand(columnName: String): String =
    getStringOrDefault(columnName)

@JvmName("getShort")
@Version(VersionLog(Version.NONE))
fun Cursor?.getShortExpand(columnName: String): Short =
    getShortOrDefault(columnName)

@JvmName("getInt")
@Version(VersionLog(Version.NONE))
fun Cursor?.getIntExpand(columnName: String): Int =
    getIntOrDefault(columnName)

@JvmName("getLong")
@Version(VersionLog(Version.NONE))
fun Cursor?.getLongExpand(columnName: String): Long =
    getLongOrDefault(columnName)

@JvmName("getFloat")
@Version(VersionLog(Version.NONE))
fun Cursor?.getFloatExpand(columnName: String): Float =
    getFloatOrDefault(columnName)

@JvmName("getDouble")
@Version(VersionLog(Version.NONE))
fun Cursor?.getDoubleExpand(columnName: String): Double =
    getDoubleOrDefault(columnName)

@JvmName("getType")
@Version(VersionLog(Version.NONE))
fun Cursor?.getTypeExpand(columnName: String): Int =
    getTypeOrDefault(columnName)

@JvmName("getColumnName")
@Version(VersionLog(Version.NONE))
fun Cursor?.getColumnNameExpand(columnIndex: Int): String =
    getColumnNameOrDefault(columnIndex)

@JvmName("getBlob")
@Version(VersionLog(Version.NONE))
fun Cursor?.getBlobExpand(columnIndex: Int): ByteArray =
    getBlobOrDefault(columnIndex)

@JvmName("getString")
@Version(VersionLog(Version.NONE))
fun Cursor?.getStringExpand(columnIndex: Int): String =
    getStringOrDefault(columnIndex)

@JvmName("getShort")
@Version(VersionLog(Version.NONE))
fun Cursor?.getShortExpand(columnIndex: Int): Short =
    getShortOrDefault(columnIndex)

@JvmName("getInt")
@Version(VersionLog(Version.NONE))
fun Cursor?.getIntExpand(columnIndex: Int): Int =
    getIntOrDefault(columnIndex)

@JvmName("getLong")
@Version(VersionLog(Version.NONE))
fun Cursor?.getLongExpand(columnIndex: Int): Long =
    getLongOrDefault(columnIndex)

@JvmName("getFloat")
@Version(VersionLog(Version.NONE))
fun Cursor?.getFloatExpand(columnIndex: Int): Float =
    getFloatOrDefault(columnIndex)

@JvmName("getDouble")
@Version(VersionLog(Version.NONE))
fun Cursor?.getDoubleExpand(columnIndex: Int): Double =
    getDoubleOrDefault(columnIndex)

@JvmName("getType")
@Version(VersionLog(Version.NONE))
fun Cursor?.getTypeExpand(columnIndex: Int): Int =
    getTypeOrDefault(columnIndex)

@Version(VersionLog(Version.NONE))
fun Cursor?.getColumnNameOrDefault(columnName: String, defaultValue: String = ""): String =
    getColumnNameOrDefault(columnName) { defaultValue }

@Version(VersionLog(Version.NONE))
fun Cursor?.getBlobOrDefault(name: String, defaultValue: ByteArray = byteArrayOf()): ByteArray =
    getBlobOrDefault(name) { defaultValue }

@Version(VersionLog(Version.NONE))
fun Cursor?.getStringOrDefault(columnName: String, defaultValue: String = ""): String =
    getStringOrDefault(columnName) { defaultValue }

@Version(VersionLog(Version.NONE))
fun Cursor?.getShortOrDefault(columnName: String, defaultValue: Short = 0.toShort()): Short =
    getShortOrDefault(columnName) { defaultValue }

@Version(VersionLog(Version.NONE))
fun Cursor?.getIntOrDefault(columnName: String, defaultValue: Int = 0): Int =
    getIntOrDefault(columnName) { defaultValue }

@Version(VersionLog(Version.NONE))
fun Cursor?.getLongOrDefault(columnName: String, defaultValue: Long = 0.toLong()): Long =
    getLongOrDefault(columnName) { defaultValue }

@Version(VersionLog(Version.NONE))
fun Cursor?.getFloatOrDefault(columnName: String, defaultValue: Float = 0.toFloat()): Float =
    getFloatOrDefault(columnName) { defaultValue }

@Version(VersionLog(Version.NONE))
fun Cursor?.getDoubleOrDefault(columnName: String, defaultValue: Double = 0.toDouble()): Double =
    getDoubleOrDefault(columnName) { defaultValue }

@Version(VersionLog(Version.NONE))
fun Cursor?.getTypeOrDefault(columnName: String, defaultValue: Int = 0): Int =
    getTypeOrDefault(columnName) { defaultValue }

@Version(VersionLog(Version.NONE))
fun Cursor?.getColumnNameOrDefault(columnIndex: Int, defaultValue: String = ""): String =
    getColumnNameOrDefault(columnIndex) { defaultValue }

@Version(VersionLog(Version.NONE))
fun Cursor?.getBlobOrDefault(columnIndex: Int, defaultValue: ByteArray = byteArrayOf()): ByteArray =
    getBlobOrDefault(columnIndex) { defaultValue }

@Version(VersionLog(Version.NONE))
fun Cursor?.getStringOrDefault(columnIndex: Int, defaultValue: String = ""): String =
    getStringOrDefault(columnIndex) { defaultValue }

@Version(VersionLog(Version.NONE))
fun Cursor?.getShortOrDefault(columnIndex: Int, defaultValue: Short = 0.toShort()): Short =
    getShortOrDefault(columnIndex) { defaultValue }

@Version(VersionLog(Version.NONE))
fun Cursor?.getIntOrDefault(columnIndex: Int, defaultValue: Int = 0): Int =
    getIntOrDefault(columnIndex) { defaultValue }

@Version(VersionLog(Version.NONE))
fun Cursor?.getLongOrDefault(columnIndex: Int, defaultValue: Long = 0.toLong()): Long =
    getLongOrDefault(columnIndex) { defaultValue }

@Version(VersionLog(Version.NONE))
fun Cursor?.getFloatOrDefault(columnIndex: Int, defaultValue: Float = 0.toFloat()): Float =
    getFloatOrDefault(columnIndex) { defaultValue }

@Version(VersionLog(Version.NONE))
fun Cursor?.getDoubleOrDefault(columnIndex: Int, defaultValue: Double = 0.toDouble()): Double =
    getDoubleOrDefault(columnIndex) { defaultValue }

@Version(VersionLog(Version.NONE))
fun Cursor?.getTypeOrDefault(columnIndex: Int, defaultValue: Int = 0): Int =
    getTypeOrDefault(columnIndex) { defaultValue }

//action
@Version(VersionLog(Version.NONE))
fun Cursor?.getColumnNameOrDefault(columnName: String, action: () -> String): String =
    getValueOrDefault(columnName, action) { it.getColumnName(it.getColumnIndex(columnName)) }

@Version(VersionLog(Version.NONE))
fun Cursor?.getBlobOrDefault(columnName: String, action: () -> ByteArray): ByteArray =
    getValueOrDefault(columnName, action) { it.getBlob(it.getColumnIndex(columnName)) }

@Version(VersionLog(Version.NONE))
fun Cursor?.getStringOrDefault(columnName: String, action: () -> String): String =
    getValueOrDefault(columnName, action) { it.getString(it.getColumnIndex(columnName)) }

@Version(VersionLog(Version.NONE))
fun Cursor?.getShortOrDefault(columnName: String, action: () -> Short): Short =
    getValueOrDefault(columnName, action) { it.getShort(it.getColumnIndex(columnName)) }

@Version(VersionLog(Version.NONE))
fun Cursor?.getIntOrDefault(columnName: String, action: () -> Int): Int =
    getValueOrDefault(columnName, action) { it.getInt(it.getColumnIndex(columnName)) }

@Version(VersionLog(Version.NONE))
fun Cursor?.getLongOrDefault(columnName: String, action: () -> Long): Long =
    getValueOrDefault(columnName, action) { it.getLong(it.getColumnIndex(columnName)) }

@Version(VersionLog(Version.NONE))
fun Cursor?.getFloatOrDefault(columnName: String, action: () -> Float): Float =
    getValueOrDefault(columnName, action) { it.getFloat(it.getColumnIndex(columnName)) }

@Version(VersionLog(Version.NONE))
fun Cursor?.getDoubleOrDefault(columnName: String, action: () -> Double): Double =
    getValueOrDefault(columnName, action) { it.getDouble(it.getColumnIndex(columnName)) }

@Version(VersionLog(Version.NONE))
fun Cursor?.getTypeOrDefault(columnName: String, action: () -> Int): Int =
    getValueOrDefault(columnName, action) { it.getType(it.getColumnIndex(columnName)) }

//action
@Version(VersionLog(Version.NONE))
fun Cursor?.getColumnNameOrDefault(columnIndex: Int, action: () -> String): String =
    if (this == null || isNull(columnIndex)) action.invoke() else getColumnName(columnIndex)

@Version(VersionLog(Version.NONE))
fun Cursor?.getBlobOrDefault(columnIndex: Int, action: () -> ByteArray): ByteArray =
    if (this == null || isNull(columnIndex)) action.invoke() else getBlob(columnIndex)

@Version(VersionLog(Version.NONE))
fun Cursor?.getStringOrDefault(columnIndex: Int, action: () -> String): String =
    if (this == null || isNull(columnIndex)) action.invoke() else getString(columnIndex)

@Version(VersionLog(Version.NONE))
fun Cursor?.getShortOrDefault(columnIndex: Int, action: () -> Short): Short =
    if (this == null || isNull(columnIndex)) action.invoke() else getShort(columnIndex)

@Version(VersionLog(Version.NONE))
fun Cursor?.getIntOrDefault(columnIndex: Int, action: () -> Int): Int =
    if (this == null || isNull(columnIndex)) action.invoke() else getInt(columnIndex)

@Version(VersionLog(Version.NONE))
fun Cursor?.getLongOrDefault(columnIndex: Int, action: () -> Long): Long =
    if (this == null || isNull(columnIndex)) action.invoke() else getLong(columnIndex)

@Version(VersionLog(Version.NONE))
fun Cursor?.getFloatOrDefault(columnIndex: Int, action: () -> Float): Float =
    if (this == null || isNull(columnIndex)) action.invoke() else getFloat(columnIndex)

@Version(VersionLog(Version.NONE))
fun Cursor?.getDoubleOrDefault(columnIndex: Int, action: () -> Double): Double =
    if (this == null || isNull(columnIndex)) action.invoke() else getDouble(columnIndex)

@Version(VersionLog(Version.NONE))
fun Cursor?.getTypeOrDefault(columnIndex: Int, action: () -> Int): Int =
    if (this == null || isNull(columnIndex)) action.invoke() else getType(columnIndex)