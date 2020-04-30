@file:JvmName("CursorUtils")

// @see androidx.core:core-ktx:version   androidx.core.database.Cursor
// Cursor expand
package androidx.kotlin.expand.database

import android.database.Cursor
import android.os.Bundle
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import androidx.kotlin.expand.os.orEmptyExpand

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
val Cursor?.extrasExpand: Bundle
    get() = this?.extras.orEmptyExpand()

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
val Cursor?.columnNamesExpand: Array<String>
    get() = this?.columnNames ?: emptyArray()

@Version(
    version = [Version.CHOCOLATE],
    log = [VersionLog(Version.CHOCOLATE, "0.0.2 update cursor")]
)
inline fun <T> Cursor?.getValueOrDefault(name: String, valueNull: () -> T, a: (c: Cursor) -> T): T =
    if (this?.isNull(getColumnIndex(name)) == false) a.invoke(this) else valueNull.invoke()

@Version(
    version = [Version.CHOCOLATE],
    log = [VersionLog(Version.CHOCOLATE, "0.0.2 update cursor")]
)
inline fun <T> Cursor?.getValueOrDefault(index: Int, valueNull: () -> T, a: (c: Cursor) -> T): T =
    if (this?.isNull(index) == false) a.invoke(this) else valueNull.invoke()

@JvmName("move")
@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2 update cursor")
    ]
)
fun Cursor?.moveExpand(offset: Int): Boolean =
    this?.move(offset) ?: false

@JvmName("moveToPosition")
@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2 update cursor")
    ]
)
fun Cursor?.moveToPositionExpand(position: Int): Boolean =
    this?.moveToPosition(position) ?: false

@JvmName("getColumnName")
@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getColumnNameExpand(columnName: String): String =
    getColumnNameOrDefault(columnName)

@JvmName("getBlob")
@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getBlobExpand(columnName: String): ByteArray =
    getBlobOrDefault(columnName)

@JvmName("getString")
@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getStringExpand(columnName: String): String =
    getStringOrDefault(columnName)

@JvmName("getShort")
@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getShortExpand(columnName: String): Short =
    getShortOrDefault(columnName)

@JvmName("getInt")
@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getIntExpand(columnName: String): Int =
    getIntOrDefault(columnName)

@JvmName("getLong")
@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getLongExpand(columnName: String): Long =
    getLongOrDefault(columnName)

@JvmName("getFloat")
@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getFloatExpand(columnName: String): Float =
    getFloatOrDefault(columnName)

@JvmName("getDouble")
@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getDoubleExpand(columnName: String): Double =
    getDoubleOrDefault(columnName)

@JvmName("getType")
@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getTypeExpand(columnName: String): Int =
    getTypeOrDefault(columnName)

@JvmName("getColumnName")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getColumnNameExpand(columnIndex: Int): String =
    getColumnNameOrDefault(columnIndex)

@JvmName("getBlob")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getBlobExpand(columnIndex: Int): ByteArray =
    getBlobOrDefault(columnIndex)

@JvmName("getString")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getStringExpand(columnIndex: Int): String =
    getStringOrDefault(columnIndex)

@JvmName("getShort")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getShortExpand(columnIndex: Int): Short =
    getShortOrDefault(columnIndex)

@JvmName("getInt")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getIntExpand(columnIndex: Int): Int =
    getIntOrDefault(columnIndex)

@JvmName("getLong")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getLongExpand(columnIndex: Int): Long =
    getLongOrDefault(columnIndex)

@JvmName("getFloat")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getFloatExpand(columnIndex: Int): Float =
    getFloatOrDefault(columnIndex)

@JvmName("getDouble")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getDoubleExpand(columnIndex: Int): Double =
    getDoubleOrDefault(columnIndex)

@JvmName("getType")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getTypeExpand(columnIndex: Int): Int =
    getTypeOrDefault(columnIndex)

@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getColumnNameOrDefault(columnName: String, defaultValue: String = ""): String =
    getColumnNameOrDefault(columnName) { defaultValue }

@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getBlobOrDefault(name: String, defaultValue: ByteArray = byteArrayOf()): ByteArray =
    getBlobOrDefault(name) { defaultValue }

@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getStringOrDefault(columnName: String, defaultValue: String = ""): String =
    getStringOrDefault(columnName) { defaultValue }

@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getShortOrDefault(columnName: String, defaultValue: Short = 0.toShort()): Short =
    getShortOrDefault(columnName) { defaultValue }

@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getIntOrDefault(columnName: String, defaultValue: Int = 0): Int =
    getIntOrDefault(columnName) { defaultValue }

@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getLongOrDefault(columnName: String, defaultValue: Long = 0.toLong()): Long =
    getLongOrDefault(columnName) { defaultValue }

@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getFloatOrDefault(columnName: String, defaultValue: Float = 0.toFloat()): Float =
    getFloatOrDefault(columnName) { defaultValue }

@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getDoubleOrDefault(columnName: String, defaultValue: Double = 0.toDouble()): Double =
    getDoubleOrDefault(columnName) { defaultValue }

@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getTypeOrDefault(columnName: String, defaultValue: Int = 0): Int =
    getTypeOrDefault(columnName) { defaultValue }

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getColumnNameOrDefault(columnIndex: Int, defaultValue: String = ""): String =
    getColumnNameOrDefault(columnIndex) { defaultValue }

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getBlobOrDefault(columnIndex: Int, defaultValue: ByteArray = byteArrayOf()): ByteArray =
    getBlobOrDefault(columnIndex) { defaultValue }

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getStringOrDefault(columnIndex: Int, defaultValue: String = ""): String =
    getStringOrDefault(columnIndex) { defaultValue }

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getShortOrDefault(columnIndex: Int, defaultValue: Short = 0.toShort()): Short =
    getShortOrDefault(columnIndex) { defaultValue }

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getIntOrDefault(columnIndex: Int, defaultValue: Int = 0): Int =
    getIntOrDefault(columnIndex) { defaultValue }

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getLongOrDefault(columnIndex: Int, defaultValue: Long = 0.toLong()): Long =
    getLongOrDefault(columnIndex) { defaultValue }

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getFloatOrDefault(columnIndex: Int, defaultValue: Float = 0.toFloat()): Float =
    getFloatOrDefault(columnIndex) { defaultValue }

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getDoubleOrDefault(columnIndex: Int, defaultValue: Double = 0.toDouble()): Double =
    getDoubleOrDefault(columnIndex) { defaultValue }

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getTypeOrDefault(columnIndex: Int, defaultValue: Int = 0): Int =
    getTypeOrDefault(columnIndex) { defaultValue }

//action
@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getColumnNameOrDefault(columnName: String, action: () -> String): String =
    getValueOrDefault(columnName, action) { it.getColumnName(it.getColumnIndex(columnName)) }

@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getBlobOrDefault(columnName: String, action: () -> ByteArray): ByteArray =
    getValueOrDefault(columnName, action) { it.getBlob(it.getColumnIndex(columnName)) }

@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getStringOrDefault(columnName: String, action: () -> String): String =
    getValueOrDefault(columnName, action) { it.getString(it.getColumnIndex(columnName)) }

@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getShortOrDefault(columnName: String, action: () -> Short): Short =
    getValueOrDefault(columnName, action) { it.getShort(it.getColumnIndex(columnName)) }

@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getIntOrDefault(columnName: String, action: () -> Int): Int =
    getValueOrDefault(columnName, action) { it.getInt(it.getColumnIndex(columnName)) }

@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getLongOrDefault(columnName: String, action: () -> Long): Long =
    getValueOrDefault(columnName, action) { it.getLong(it.getColumnIndex(columnName)) }

@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getFloatOrDefault(columnName: String, action: () -> Float): Float =
    getValueOrDefault(columnName, action) { it.getFloat(it.getColumnIndex(columnName)) }

@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getDoubleOrDefault(columnName: String, action: () -> Double): Double =
    getValueOrDefault(columnName, action) { it.getDouble(it.getColumnIndex(columnName)) }

@Version(
    version = [Version.CHOCOLATE],
    log = [
        VersionLog(Version.CHOCOLATE, "0.0.2, add new api")
    ]
)
fun Cursor?.getTypeOrDefault(columnName: String, action: () -> Int): Int =
    getValueOrDefault(columnName, action) { it.getType(it.getColumnIndex(columnName)) }

//action
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getColumnNameOrDefault(columnIndex: Int, action: () -> String): String =
    if (this == null || isNull(columnIndex)) action.invoke() else getColumnName(columnIndex)

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getBlobOrDefault(columnIndex: Int, action: () -> ByteArray): ByteArray =
    if (this == null || isNull(columnIndex)) action.invoke() else getBlob(columnIndex)

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getStringOrDefault(columnIndex: Int, action: () -> String): String =
    if (this == null || isNull(columnIndex)) action.invoke() else getString(columnIndex)

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getShortOrDefault(columnIndex: Int, action: () -> Short): Short =
    if (this == null || isNull(columnIndex)) action.invoke() else getShort(columnIndex)

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getIntOrDefault(columnIndex: Int, action: () -> Int): Int =
    if (this == null || isNull(columnIndex)) action.invoke() else getInt(columnIndex)

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getLongOrDefault(columnIndex: Int, action: () -> Long): Long =
    if (this == null || isNull(columnIndex)) action.invoke() else getLong(columnIndex)

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getFloatOrDefault(columnIndex: Int, action: () -> Float): Float =
    if (this == null || isNull(columnIndex)) action.invoke() else getFloat(columnIndex)

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getDoubleOrDefault(columnIndex: Int, action: () -> Double): Double =
    if (this == null || isNull(columnIndex)) action.invoke() else getDouble(columnIndex)

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Cursor?.getTypeOrDefault(columnIndex: Int, action: () -> Int): Int =
    if (this == null || isNull(columnIndex)) action.invoke() else getType(columnIndex)