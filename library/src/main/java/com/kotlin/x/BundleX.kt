@file:JvmName("BundleUtils")
@file:Suppress("HasPlatformType", "UNCHECKED_CAST")

package com.kotlin.x

import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import android.util.Size
import android.util.SizeF
import android.util.SparseArray
import androidx.annotation.RequiresApi
import java.io.Serializable

/**
 *
 * java
 *   BundleUtils.getXXXExpand(key)
 *
 * kotlin
 *   Bundle.getXXXExpand(key) or Bundle.getXXXOrDefault(key,default) or Bundle.getXXXOrDefault(key){default}
 *
 */

fun Bundle?.orEmptyExpand(): Bundle = this ?: Bundle.EMPTY

fun Bundle?.getExpand(key: String): Any =
    getOrDefault(key)

fun Bundle?.getBooleanExpand(key: String): Boolean =
    getBooleanOrDefault(key)

fun Bundle?.getByteExpand(key: String): Byte =
    getByteOrDefault(key)

fun Bundle?.getCharExpand(key: String): Char =
    getCharOrDefault(key)

fun Bundle?.getShortExpand(key: String): Short =
    getShortOrDefault(key)

fun Bundle?.getIntExpand(key: String): Int =
    getIntOrDefault(key)

fun Bundle?.getLongExpand(key: String): Long =
    getLongOrDefault(key)

fun Bundle?.getFloatExpand(key: String): Float =
    getFloatOrDefault(key)

fun Bundle?.getDoubleExpand(key: String): Double =
    getDoubleOrDefault(key)

fun Bundle?.getStringExpand(key: String): String =
    getStringOrDefault(key)

fun Bundle?.getCharSequenceExpand(key: String): CharSequence =
    getCharSequenceOrDefault(key)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Bundle?.getSizeExpand(key: String): Size =
    getSizeOrDefault(key)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Bundle?.getSizeFExpand(key: String): SizeF =
    getSizeFOrDefault(key)

fun Bundle?.getIntArrayListExpand(key: String): ArrayList<Int> =
    getIntArrayListOrDefault(key)

fun Bundle?.getStringArrayListExpand(key: String): ArrayList<String> =
    getStringArrayListOrDefault(key)

fun Bundle?.getCharSequenceArrayListExpand(key: String): ArrayList<CharSequence> =
    getCharSequenceArrayListOrDefault(key)

fun Bundle?.getSerializableExpand(key: String): Serializable =
    getSerializableOrDefault(key)

fun Bundle?.getBooleanArrayExpand(key: String): BooleanArray =
    getBooleanArrayOrDefault(key)

fun Bundle?.getByteArrayExpand(key: String): ByteArray =
    getByteArrayOrDefault(key)

fun Bundle?.getShortArrayExpand(key: String): ShortArray =
    getShortArrayOrDefault(key)

fun Bundle?.getCharArrayExpand(key: String): CharArray =
    getCharArrayOrDefault(key)

fun Bundle?.getIntArrayExpand(key: String): IntArray =
    getIntArrayOrDefault(key)

fun Bundle?.getLongArrayExpand(key: String): LongArray =
    getLongArrayOrDefault(key)

fun Bundle?.getFloatArrayExpand(key: String): FloatArray =
    getFloatArrayOrDefault(key)

fun Bundle?.getDoubleArrayExpand(key: String): DoubleArray =
    getDoubleArrayOrDefault(key)

fun Bundle?.getStringArrayExpand(key: String): Array<String> =
    getStringArrayOrDefault(key)

fun Bundle?.getCharSequenceArrayExpand(key: String): Array<CharSequence> =
    getCharSequenceArrayOrDefault(key)

fun <T : Parcelable> Bundle?.getParcelableExpand(key: String): T =
    getParcelableOrDefault(key)

fun <T : Parcelable> Bundle?.getParcelableArrayExpand(key: String): Array<T> =
    getParcelableArrayOrDefault(key)

fun <T : Parcelable> Bundle?.getParcelableArrayListExpand(key: String): ArrayList<T> =
    getParcelableArrayListOrDefault(key)

fun <T : Parcelable> Bundle?.getSparseParcelableArrayExpand(key: String): SparseArray<T> =
    getSparseParcelableArrayOrDefault(key)

fun Bundle?.getBundleExpand(key: String): Bundle =
    getBundleOrDefault(key)

fun Bundle?.getOrDefault(key: String, defaultValue: Any = Any()): Any =
    getOrDefault(key) { defaultValue }

fun Bundle?.getBooleanOrDefault(key: String, defaultValue: Boolean = false): Boolean =
    getBooleanOrDefault(key) { defaultValue }

fun Bundle?.getByteOrDefault(key: String, defaultValue: Byte = 0.toByte()): Byte =
    getByteOrDefault(key) { defaultValue }

fun Bundle?.getCharOrDefault(key: String, defaultValue: Char = 0.toChar()): Char =
    getCharOrDefault(key) { defaultValue }

fun Bundle?.getShortOrDefault(key: String, defaultValue: Short = 0.toShort()): Short =
    getShortOrDefault(key) { defaultValue }

fun Bundle?.getIntOrDefault(key: String, defaultValue: Int = 0): Int =
    getIntOrDefault(key) { defaultValue }

fun Bundle?.getLongOrDefault(key: String, defaultValue: Long = 0.toLong()): Long =
    getLongOrDefault(key) { defaultValue }

fun Bundle?.getFloatOrDefault(key: String, defaultValue: Float = 0.toFloat()): Float =
    getFloatOrDefault(key) { defaultValue }

fun Bundle?.getDoubleOrDefault(key: String, defaultValue: Double = 0.toDouble()): Double =
    getDoubleOrDefault(key) { defaultValue }

fun Bundle?.getStringOrDefault(key: String, defaultValue: String = ""): String =
    getStringOrDefault(key) { defaultValue }

fun Bundle?.getCharSequenceOrDefault(key: String, defaultValue: CharSequence = ""): CharSequence =
    getCharSequenceOrDefault(key) { defaultValue }

fun <T : Parcelable> Bundle?.getParcelableOrDefault(
    key: String,
    defaultValue: Parcelable = this?.getParcelable<T>(key)!!
): T = getParcelableOrDefault(key) { defaultValue as T }

fun <T : Parcelable> Bundle?.getParcelableArrayOrDefault(
    key: String,
    defaultValue: Array<Parcelable> = emptyArray()
): Array<T> = getParcelableArrayOrDefault(key) { defaultValue as Array<T> }

fun <T : Parcelable> Bundle?.getParcelableArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<T> = arrayListOf()
): ArrayList<T> = getParcelableArrayListOrDefault(key) { defaultValue }

fun <T : Parcelable> Bundle?.getSparseParcelableArrayOrDefault(
    key: String,
    defaultValue: SparseArray<T> = sparseArrayOf()
): SparseArray<T> = getSparseParcelableArrayOrDefault(key) { defaultValue }

fun Bundle?.getBundleOrDefault(
    key: String,
    defaultValue: Bundle = Bundle.EMPTY
): Bundle = getBundleOrDefault(key) { defaultValue }

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Bundle?.getSizeOrDefault(
    key: String,
    defaultValue: Size = Size(0, 0)
): Size = getSizeOrDefault(key) { defaultValue }

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Bundle?.getSizeFOrDefault(
    key: String,
    defaultValue: SizeF = SizeF(0.toFloat(), 0.toFloat())
): SizeF = getSizeFOrDefault(key) { defaultValue }

fun Bundle?.getIntArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<Int> = arrayListOf()
): ArrayList<Int> = getIntArrayListOrDefault(key) { defaultValue }

fun Bundle?.getStringArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<String> = arrayListOf()
): ArrayList<String> = getStringArrayListOrDefault(key) { defaultValue }

fun Bundle?.getCharSequenceArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<CharSequence> = arrayListOf()
): ArrayList<CharSequence> = getCharSequenceArrayListOrDefault(key) { defaultValue }

fun Bundle?.getSerializableOrDefault(
    key: String,
    defaultValue: Serializable = this?.getSerializable(key)!!
): Serializable = getSerializableOrDefault(key) { defaultValue }

fun Bundle?.getBooleanArrayOrDefault(
    key: String,
    defaultValue: BooleanArray = booleanArrayOf()
): BooleanArray = getBooleanArrayOrDefault(key) { defaultValue }

fun Bundle?.getByteArrayOrDefault(
    key: String,
    defaultValue: ByteArray = byteArrayOf()
): ByteArray = getByteArrayOrDefault(key) { defaultValue }

fun Bundle?.getShortArrayOrDefault(
    key: String,
    defaultValue: ShortArray = shortArrayOf()
): ShortArray = getShortArrayOrDefault(key) { defaultValue }

fun Bundle?.getCharArrayOrDefault(
    key: String,
    defaultValue: CharArray = charArrayOf()
): CharArray = getCharArrayOrDefault(key) { defaultValue }

fun Bundle?.getIntArrayOrDefault(
    key: String,
    defaultValue: IntArray = intArrayOf()
): IntArray = getIntArrayOrDefault(key) { defaultValue }

fun Bundle?.getLongArrayOrDefault(
    key: String,
    defaultValue: LongArray = longArrayOf()
): LongArray = getLongArrayOrDefault(key) { defaultValue }

fun Bundle?.getFloatArrayOrDefault(
    key: String,
    defaultValue: FloatArray = floatArrayOf()
): FloatArray = getFloatArrayOrDefault(key) { defaultValue }

fun Bundle?.getDoubleArrayOrDefault(
    key: String,
    defaultValue: DoubleArray = doubleArrayOf()
): DoubleArray = getDoubleArrayOrDefault(key) { defaultValue }

fun Bundle?.getStringArrayOrDefault(
    key: String,
    defaultValue: Array<String> = emptyArray()
): Array<String> = getStringArrayOrDefault(key) { defaultValue }

fun Bundle?.getCharSequenceArrayOrDefault(
    key: String,
    defaultValue: Array<CharSequence> = emptyArray()
): Array<CharSequence> = getCharSequenceArrayOrDefault(key) { defaultValue }

//ifNone
fun Bundle?.getOrDefault(key: String, ifNone: () -> Any): Any =
    this?.get(key) ?: ifNone.invoke()

fun Bundle?.getBooleanOrDefault(key: String, ifNone: () -> Boolean): Boolean =
    this?.getBoolean(key, ifNone.invoke()) ?: ifNone.invoke()

fun Bundle?.getByteOrDefault(key: String, ifNone: () -> Byte): Byte =
    this?.getByte(key, ifNone.invoke()) ?: ifNone.invoke()

fun Bundle?.getCharOrDefault(key: String, ifNone: () -> Char): Char =
    this?.getChar(key, ifNone.invoke()) ?: ifNone.invoke()

fun Bundle?.getShortOrDefault(key: String, ifNone: () -> Short): Short =
    this?.getShort(key, ifNone.invoke()) ?: ifNone.invoke()

fun Bundle?.getIntOrDefault(key: String, ifNone: () -> Int): Int =
    this?.getInt(key, ifNone.invoke()) ?: ifNone.invoke()

fun Bundle?.getLongOrDefault(key: String, ifNone: () -> Long): Long =
    this?.getLong(key, ifNone.invoke()) ?: ifNone.invoke()

fun Bundle?.getFloatOrDefault(key: String, ifNone: () -> Float): Float =
    this?.getFloat(key, ifNone.invoke()) ?: ifNone.invoke()

fun Bundle?.getDoubleOrDefault(key: String, ifNone: () -> Double): Double =
    this?.getDouble(key, ifNone.invoke()) ?: ifNone.invoke()

fun Bundle?.getStringOrDefault(key: String, ifNone: () -> String): String =
    this?.getString(key, ifNone.invoke()) ?: ifNone.invoke()

fun Bundle?.getCharSequenceOrDefault(key: String, ifNone: () -> CharSequence): CharSequence =
    this?.getCharSequence(key, ifNone.invoke()) ?: ifNone.invoke()

fun <T : Parcelable> Bundle?.getParcelableOrDefault(
    key: String,
    ifNone: () -> T
): T = this?.getParcelable(key) ?: ifNone.invoke()

fun <T : Parcelable> Bundle?.getParcelableArrayOrDefault(
    key: String,
    ifNone: () -> Array<T>
): Array<T> = this?.getParcelableArray(key) as? Array<T> ?: ifNone.invoke()

fun <T : Parcelable> Bundle?.getParcelableArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<T>
): ArrayList<T> = this?.getParcelableArrayList(key) ?: ifNone.invoke()

fun <T : Parcelable> Bundle?.getSparseParcelableArrayOrDefault(
    key: String,
    ifNone: () -> SparseArray<T>
): SparseArray<T> = this?.getSparseParcelableArray(key) ?: ifNone.invoke()

fun Bundle?.getBundleOrDefault(key: String, ifNone: () -> Bundle): Bundle =
    this?.getBundle(key) ?: ifNone.invoke()

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Bundle?.getSizeOrDefault(key: String, ifNone: () -> Size): Size =
    this?.getSize(key) ?: ifNone.invoke()

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Bundle?.getSizeFOrDefault(key: String, ifNone: () -> SizeF): SizeF =
    this?.getSizeF(key) ?: ifNone.invoke()

fun Bundle?.getIntArrayListOrDefault(key: String, ifNone: () -> ArrayList<Int>): ArrayList<Int> =
    this?.getIntegerArrayList(key) ?: ifNone.invoke()

fun Bundle?.getStringArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<String>
): ArrayList<String> = this?.getStringArrayList(key) ?: ifNone.invoke()

fun Bundle?.getCharSequenceArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<CharSequence>
): ArrayList<CharSequence> = this?.getCharSequenceArrayList(key) ?: ifNone.invoke()

fun Bundle?.getSerializableOrDefault(key: String, ifNone: () -> Serializable): Serializable =
    this?.getSerializable(key) ?: ifNone.invoke()

fun Bundle?.getBooleanArrayOrDefault(key: String, ifNone: () -> BooleanArray): BooleanArray =
    this?.getBooleanArray(key) ?: ifNone.invoke()

fun Bundle?.getByteArrayOrDefault(key: String, ifNone: () -> ByteArray): ByteArray =
    this?.getByteArray(key) ?: ifNone.invoke()

fun Bundle?.getShortArrayOrDefault(key: String, ifNone: () -> ShortArray): ShortArray =
    this?.getShortArray(key) ?: ifNone.invoke()

fun Bundle?.getCharArrayOrDefault(key: String, ifNone: () -> CharArray): CharArray =
    this?.getCharArray(key) ?: ifNone.invoke()

fun Bundle?.getIntArrayOrDefault(key: String, ifNone: () -> IntArray): IntArray =
    this?.getIntArray(key) ?: ifNone.invoke()

fun Bundle?.getLongArrayOrDefault(key: String, ifNone: () -> LongArray): LongArray =
    this?.getLongArray(key) ?: ifNone.invoke()

fun Bundle?.getFloatArrayOrDefault(key: String, ifNone: () -> FloatArray): FloatArray =
    this?.getFloatArray(key) ?: ifNone.invoke()

fun Bundle?.getDoubleArrayOrDefault(key: String, ifNone: () -> DoubleArray): DoubleArray =
    this?.getDoubleArray(key) ?: ifNone.invoke()

fun Bundle?.getStringArrayOrDefault(key: String, ifNone: () -> Array<String>): Array<String> =
    this?.getStringArray(key) ?: ifNone.invoke()

fun Bundle?.getCharSequenceArrayOrDefault(
    key: String,
    ifNone: () -> Array<CharSequence>
): Array<CharSequence> = this?.getCharSequenceArray(key) ?: ifNone.invoke()