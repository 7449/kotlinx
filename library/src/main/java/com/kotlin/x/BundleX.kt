@file:JvmName("BundleUtils")
@file:Suppress("HasPlatformType")

package com.kotlin.x

import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import android.util.Size
import android.util.SizeF
import android.util.SparseArray
import androidx.annotation.RequiresApi
import java.io.Serializable

fun Bundle?.orEmpty(): Bundle = this ?: Bundle.EMPTY

fun Bundle?.get(key: String): Any =
    getOrDefault(key, Any())

fun Bundle?.getBoolean(key: String): Boolean =
    getBooleanOrDefault(key, false)

fun Bundle?.getByte(key: String): Byte =
    getByteOrDefault(key, 0)

fun Bundle?.getChar(key: String): Char =
    getCharOrDefault(key, 'a')

fun Bundle?.getShort(key: String): Short =
    getShortOrDefault(key, 0)

fun Bundle?.getInt(key: String): Int =
    getIntOrDefault(key, 0)

fun Bundle?.getLong(key: String): Long =
    getLongOrDefault(key, 0)

fun Bundle?.getFloat(key: String): Float =
    getFloatOrDefault(key, 0F)

fun Bundle?.getDouble(key: String): Double =
    getDoubleOrDefault(key, 0.0)

fun Bundle?.getString(key: String): String =
    getStringOrDefault(key, "")

fun Bundle?.getCharSequence(key: String): CharSequence =
    getCharSequenceOrDefault(key, "")

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Bundle?.getSize(key: String): Size =
    getSizeOrDefault(key, Size(0, 0))

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Bundle?.getSizeF(key: String): SizeF =
    getSizeFOrDefault(key, SizeF(0F, 0F))

fun Bundle?.getIntArrayList(key: String): ArrayList<Int> =
    getIntArrayListOrDefault(key, ArrayList())

fun Bundle?.getStringArrayList(key: String): ArrayList<String> =
    getStringArrayListOrDefault(key, ArrayList())

fun Bundle?.getCharSequenceArrayList(key: String): ArrayList<CharSequence> =
    getCharSequenceArrayListOrDefault(key, ArrayList())

fun Bundle?.getBooleanArray(key: String): BooleanArray =
    getBooleanArrayOrDefault(key, booleanArrayOf())

fun Bundle?.getByteArray(key: String): ByteArray =
    getByteArrayOrDefault(key, byteArrayOf())

fun Bundle?.getShortArray(key: String): ShortArray =
    getShortArrayOrDefault(key, shortArrayOf())

fun Bundle?.getCharArray(key: String): CharArray =
    getCharArrayOrDefault(key, charArrayOf())

fun Bundle?.getIntArray(key: String): IntArray =
    getIntArrayOrDefault(key, intArrayOf())

fun Bundle?.getLongArray(key: String): LongArray =
    getLongArrayOrDefault(key, longArrayOf())

fun Bundle?.getFloatArray(key: String): FloatArray =
    getFloatArrayOrDefault(key, floatArrayOf())

fun Bundle?.getDoubleArray(key: String): DoubleArray =
    getDoubleArrayOrDefault(key, doubleArrayOf())

fun Bundle?.getStringArray(key: String): Array<String> =
    getStringArrayOrDefault(key, arrayOf())

fun Bundle?.getCharSequenceArray(key: String): Array<CharSequence> =
    getCharSequenceArrayOrDefault(key, arrayOf())

fun Bundle?.getOrDefault(key: String, defaultValue: Any): Any =
    getOrDefault(key) { defaultValue }

fun Bundle?.getBooleanOrDefault(key: String, defaultValue: Boolean): Boolean =
    getBooleanOrDefault(key) { defaultValue }

fun Bundle?.getByteOrDefault(key: String, defaultValue: Byte): Byte =
    getByteOrDefault(key) { defaultValue }

fun Bundle?.getCharOrDefault(key: String, defaultValue: Char): Char =
    getCharOrDefault(key) { defaultValue }

fun Bundle?.getShortOrDefault(key: String, defaultValue: Short): Short =
    getShortOrDefault(key) { defaultValue }

fun Bundle?.getIntOrDefault(key: String, defaultValue: Int): Int =
    getIntOrDefault(key) { defaultValue }

fun Bundle?.getLongOrDefault(key: String, defaultValue: Long): Long =
    getLongOrDefault(key) { defaultValue }

fun Bundle?.getFloatOrDefault(key: String, defaultValue: Float): Float =
    getFloatOrDefault(key) { defaultValue }

fun Bundle?.getDoubleOrDefault(key: String, defaultValue: Double): Double =
    getDoubleOrDefault(key) { defaultValue }

fun Bundle?.getStringOrDefault(key: String, defaultValue: String): String =
    getStringOrDefault(key) { defaultValue }

fun Bundle?.getCharSequenceOrDefault(key: String, defaultValue: CharSequence): CharSequence =
    getCharSequenceOrDefault(key) { defaultValue }

fun <T : Parcelable> Bundle?.getParcelableOrDefault(key: String, defaultValue: Parcelable): T =
    getParcelableOrDefault(key) {
        @Suppress("UNCHECKED_CAST")
        defaultValue as T
    }

fun <T : Parcelable> Bundle?.getParcelableArrayOrDefault(
    key: String,
    defaultValue: Array<T>
): Array<out Parcelable> = getParcelableArrayOrDefault(key) { defaultValue }

fun <T : Parcelable> Bundle?.getParcelableArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<T>
): ArrayList<T> = getParcelableArrayListOrDefault(key) { defaultValue }

fun <T : Parcelable> Bundle?.getSparseParcelableArrayOrDefault(
    key: String,
    defaultValue: SparseArray<T>
): SparseArray<T> = getSparseParcelableArrayOrDefault(key) { defaultValue }

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Bundle?.getSizeOrDefault(key: String, defaultValue: Size): Size =
    getSizeOrDefault(key) { defaultValue }

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Bundle?.getSizeFOrDefault(key: String, defaultValue: SizeF): SizeF =
    getSizeFOrDefault(key) { defaultValue }

fun Bundle?.getIntArrayListOrDefault(key: String, defaultValue: ArrayList<Int>): ArrayList<Int> =
    getIntArrayListOrDefault(key) { defaultValue }

fun Bundle?.getStringArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<String>
): ArrayList<String> = getStringArrayListOrDefault(key) { defaultValue }

fun Bundle?.getCharSequenceArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<CharSequence>
): ArrayList<CharSequence> = getCharSequenceArrayListOrDefault(key) { defaultValue }

fun Bundle?.getSerializableOrDefault(key: String, defaultValue: Serializable): Serializable =
    getSerializableOrDefault(key) { defaultValue }

fun Bundle?.getBooleanArrayOrDefault(key: String, defaultValue: BooleanArray): BooleanArray =
    getBooleanArrayOrDefault(key) { defaultValue }

fun Bundle?.getByteArrayOrDefault(key: String, defaultValue: ByteArray): ByteArray =
    getByteArrayOrDefault(key) { defaultValue }

fun Bundle?.getShortArrayOrDefault(key: String, defaultValue: ShortArray): ShortArray =
    getShortArrayOrDefault(key) { defaultValue }

fun Bundle?.getCharArrayOrDefault(key: String, defaultValue: CharArray): CharArray =
    getCharArrayOrDefault(key) { defaultValue }

fun Bundle?.getIntArrayOrDefault(key: String, defaultValue: IntArray): IntArray =
    getIntArrayOrDefault(key) { defaultValue }

fun Bundle?.getLongArrayOrDefault(key: String, defaultValue: LongArray): LongArray =
    getLongArrayOrDefault(key) { defaultValue }

fun Bundle?.getFloatArrayOrDefault(key: String, defaultValue: FloatArray): FloatArray =
    getFloatArrayOrDefault(key) { defaultValue }

fun Bundle?.getDoubleArrayOrDefault(key: String, defaultValue: DoubleArray): DoubleArray =
    getDoubleArrayOrDefault(key) { defaultValue }

fun Bundle?.getStringArrayOrDefault(key: String, defaultValue: Array<String>): Array<String> =
    getStringArrayOrDefault(key) { defaultValue }

fun Bundle?.getCharSequenceArrayOrDefault(
    key: String,
    defaultValue: Array<CharSequence>
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

fun <T : Parcelable> Bundle?.getParcelableOrDefault(key: String, ifNone: () -> T): T =
    this?.getParcelable(key) ?: ifNone.invoke()

fun <T : Parcelable> Bundle?.getParcelableArrayOrDefault(
    key: String,
    ifNone: () -> Array<T>
): Array<out Parcelable> = this?.getParcelableArray(key) ?: ifNone.invoke()

fun <T : Parcelable> Bundle?.getParcelableArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<T>
): ArrayList<T> = this?.getParcelableArrayList(key) ?: ifNone.invoke()

fun <T : Parcelable> Bundle?.getSparseParcelableArrayOrDefault(
    key: String,
    ifNone: () -> SparseArray<T>
): SparseArray<T> = this?.getSparseParcelableArray(key) ?: ifNone.invoke()

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