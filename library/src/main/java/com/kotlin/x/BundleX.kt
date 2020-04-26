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

fun Bundle?.orEmpty() = this ?: Bundle.EMPTY

fun Bundle?.get(key: String) = getOrDefault(key, Any())

fun Bundle?.getBoolean(key: String) = getBooleanOrDefault(key, false)

fun Bundle?.getByte(key: String) = getByteOrDefault(key, 0)

fun Bundle?.getChar(key: String) = getCharOrDefault(key, 'a')

fun Bundle?.getShort(key: String) = getShortOrDefault(key, 0)

fun Bundle?.getInt(key: String) = getIntOrDefault(key, 0)

fun Bundle?.getLong(key: String) = getLongOrDefault(key, 0)

fun Bundle?.getFloat(key: String) = getFloatOrDefault(key, 0F)

fun Bundle?.getDouble(key: String) = getDoubleOrDefault(key, 0.0)

fun Bundle?.getString(key: String) = getStringOrDefault(key, "")

fun Bundle?.getCharSequence(key: String) = getCharSequenceOrDefault(key, "")

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Bundle?.getSize(key: String) = getSizeOrDefault(key, Size(0, 0))

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Bundle?.getSizeF(key: String) = getSizeFOrDefault(key, SizeF(0F, 0F))

fun Bundle?.getIntArrayList(key: String) = getIntArrayListOrDefault(key, ArrayList())

fun Bundle?.getStringArrayList(key: String) = getStringArrayListOrDefault(key, ArrayList())

fun Bundle?.getCharSequenceArrayList(key: String) =
    getCharSequenceArrayListOrDefault(key, ArrayList())

fun Bundle?.getBooleanArray(key: String) = getBooleanArrayOrDefault(key, booleanArrayOf())

fun Bundle?.getByteArray(key: String) = getByteArrayOrDefault(key, byteArrayOf())

fun Bundle?.getShortArray(key: String) = getShortArrayOrDefault(key, shortArrayOf())

fun Bundle?.getCharArray(key: String) = getCharArrayOrDefault(key, charArrayOf())

fun Bundle?.getIntArray(key: String) = getIntArrayOrDefault(key, intArrayOf())

fun Bundle?.getLongArray(key: String) = getLongArrayOrDefault(key, longArrayOf())

fun Bundle?.getFloatArray(key: String) = getFloatArrayOrDefault(key, floatArrayOf())

fun Bundle?.getDoubleArray(key: String) = getDoubleArrayOrDefault(key, doubleArrayOf())

fun Bundle?.getStringArray(key: String) = getStringArrayOrDefault(key, arrayOf())

fun Bundle?.getCharSequenceArray(key: String) = getCharSequenceArrayOrDefault(key, arrayOf())

fun Bundle?.getOrDefault(key: String, defaultValue: Any) =
    getOrDefault(key) { defaultValue }

fun Bundle?.getBooleanOrDefault(key: String, defaultValue: Boolean) =
    getBooleanOrDefault(key) { defaultValue }

fun Bundle?.getByteOrDefault(key: String, defaultValue: Byte) =
    getByteOrDefault(key) { defaultValue }

fun Bundle?.getCharOrDefault(key: String, defaultValue: Char) =
    getCharOrDefault(key) { defaultValue }

fun Bundle?.getShortOrDefault(key: String, defaultValue: Short) =
    getShortOrDefault(key) { defaultValue }

fun Bundle?.getIntOrDefault(key: String, defaultValue: Int) =
    getIntOrDefault(key) { defaultValue }

fun Bundle?.getLongOrDefault(key: String, defaultValue: Long) =
    getLongOrDefault(key) { defaultValue }

fun Bundle?.getFloatOrDefault(key: String, defaultValue: Float) =
    getFloatOrDefault(key) { defaultValue }

fun Bundle?.getDoubleOrDefault(key: String, defaultValue: Double) =
    getDoubleOrDefault(key) { defaultValue }

fun Bundle?.getStringOrDefault(key: String, defaultValue: String) =
    getStringOrDefault(key) { defaultValue }

fun Bundle?.getCharSequenceOrDefault(key: String, defaultValue: CharSequence) =
    getCharSequenceOrDefault(key) { defaultValue }

fun <T : Parcelable> Bundle?.getParcelableOrDefault(key: String, defaultValue: Parcelable) =
    getParcelableOrDefault(key) {
        @Suppress("UNCHECKED_CAST")
        defaultValue as T
    }

fun <T : Parcelable> Bundle?.getParcelableArrayOrDefault(
    key: String,
    defaultValue: Array<T>
) = getParcelableArrayOrDefault(key) { defaultValue }

fun <T : Parcelable> Bundle?.getParcelableArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<T>
) = getParcelableArrayListOrDefault(key) { defaultValue }

fun <T : Parcelable> Bundle?.getSparseParcelableArrayOrDefault(
    key: String,
    defaultValue: SparseArray<T>
) = getSparseParcelableArrayOrDefault(key) { defaultValue }

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Bundle?.getSizeOrDefault(key: String, defaultValue: Size) =
    getSizeOrDefault(key) { defaultValue }

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Bundle?.getSizeFOrDefault(key: String, defaultValue: SizeF) =
    getSizeFOrDefault(key) { defaultValue }

fun Bundle?.getIntArrayListOrDefault(key: String, defaultValue: ArrayList<Int>) =
    getIntArrayListOrDefault(key) { defaultValue }

fun Bundle?.getStringArrayListOrDefault(key: String, defaultValue: ArrayList<String>) =
    getStringArrayListOrDefault(key) { defaultValue }

fun Bundle?.getCharSequenceArrayListOrDefault(key: String, defaultValue: ArrayList<CharSequence>) =
    getCharSequenceArrayListOrDefault(key) { defaultValue }

fun Bundle?.getSerializableOrDefault(key: String, defaultValue: Serializable) =
    getSerializableOrDefault(key) { defaultValue }

fun Bundle?.getBooleanArrayOrDefault(key: String, defaultValue: BooleanArray) =
    getBooleanArrayOrDefault(key) { defaultValue }

fun Bundle?.getByteArrayOrDefault(key: String, defaultValue: ByteArray) =
    getByteArrayOrDefault(key) { defaultValue }

fun Bundle?.getShortArrayOrDefault(key: String, defaultValue: ShortArray) =
    getShortArrayOrDefault(key) { defaultValue }

fun Bundle?.getCharArrayOrDefault(key: String, defaultValue: CharArray) =
    getCharArrayOrDefault(key) { defaultValue }

fun Bundle?.getIntArrayOrDefault(key: String, defaultValue: IntArray) =
    getIntArrayOrDefault(key) { defaultValue }

fun Bundle?.getLongArrayOrDefault(key: String, defaultValue: LongArray) =
    getLongArrayOrDefault(key) { defaultValue }

fun Bundle?.getFloatArrayOrDefault(key: String, defaultValue: FloatArray) =
    getFloatArrayOrDefault(key) { defaultValue }

fun Bundle?.getDoubleArrayOrDefault(key: String, defaultValue: DoubleArray) =
    getDoubleArrayOrDefault(key) { defaultValue }

fun Bundle?.getStringArrayOrDefault(key: String, defaultValue: Array<String>) =
    getStringArrayOrDefault(key) { defaultValue }

fun Bundle?.getCharSequenceArrayOrDefault(key: String, defaultValue: Array<CharSequence>) =
    getCharSequenceArrayOrDefault(key) { defaultValue }

//ifNone
fun Bundle?.getOrDefault(key: String, ifNone: () -> Any) =
    this?.get(key) ?: ifNone.invoke()

fun Bundle?.getBooleanOrDefault(key: String, ifNone: () -> Boolean) =
    this?.getBoolean(key, ifNone.invoke()) ?: ifNone.invoke()

fun Bundle?.getByteOrDefault(key: String, ifNone: () -> Byte) =
    this?.getByte(key, ifNone.invoke()) ?: ifNone.invoke()

fun Bundle?.getCharOrDefault(key: String, ifNone: () -> Char) =
    this?.getChar(key, ifNone.invoke()) ?: ifNone.invoke()

fun Bundle?.getShortOrDefault(key: String, ifNone: () -> Short) =
    this?.getShort(key, ifNone.invoke()) ?: ifNone.invoke()

fun Bundle?.getIntOrDefault(key: String, ifNone: () -> Int) =
    this?.getInt(key, ifNone.invoke()) ?: ifNone.invoke()

fun Bundle?.getLongOrDefault(key: String, ifNone: () -> Long) =
    this?.getLong(key, ifNone.invoke()) ?: ifNone.invoke()

fun Bundle?.getFloatOrDefault(key: String, ifNone: () -> Float) =
    this?.getFloat(key, ifNone.invoke()) ?: ifNone.invoke()

fun Bundle?.getDoubleOrDefault(key: String, ifNone: () -> Double) =
    this?.getDouble(key, ifNone.invoke()) ?: ifNone.invoke()

fun Bundle?.getStringOrDefault(key: String, ifNone: () -> String) =
    this?.getString(key, ifNone.invoke()) ?: ifNone.invoke()

fun Bundle?.getCharSequenceOrDefault(key: String, ifNone: () -> CharSequence) =
    this?.getCharSequence(key, ifNone.invoke()) ?: ifNone.invoke()

fun <T : Parcelable> Bundle?.getParcelableOrDefault(key: String, ifNone: () -> T) =
    this?.getParcelable(key) ?: ifNone.invoke()

fun <T : Parcelable> Bundle?.getParcelableArrayOrDefault(
    key: String,
    ifNone: () -> Array<T>
) = this?.getParcelableArray(key) ?: ifNone.invoke()

fun <T : Parcelable> Bundle?.getParcelableArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<T>
) = this?.getParcelableArrayList(key) ?: ifNone.invoke()

fun <T : Parcelable> Bundle?.getSparseParcelableArrayOrDefault(
    key: String,
    ifNone: () -> SparseArray<T>
) = this?.getSparseParcelableArray(key) ?: ifNone.invoke()

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Bundle?.getSizeOrDefault(key: String, ifNone: () -> Size) =
    this?.getSize(key) ?: ifNone.invoke()

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Bundle?.getSizeFOrDefault(key: String, ifNone: () -> SizeF) =
    this?.getSizeF(key) ?: ifNone.invoke()

fun Bundle?.getIntArrayListOrDefault(key: String, ifNone: () -> ArrayList<Int>) =
    this?.getIntegerArrayList(key) ?: ifNone.invoke()

fun Bundle?.getStringArrayListOrDefault(key: String, ifNone: () -> ArrayList<String>) =
    this?.getStringArrayList(key) ?: ifNone.invoke()

fun Bundle?.getCharSequenceArrayListOrDefault(key: String, ifNone: () -> ArrayList<CharSequence>) =
    this?.getCharSequenceArrayList(key) ?: ifNone.invoke()

fun Bundle?.getSerializableOrDefault(key: String, ifNone: () -> Serializable) =
    this?.getSerializable(key) ?: ifNone.invoke()

fun Bundle?.getBooleanArrayOrDefault(key: String, ifNone: () -> BooleanArray) =
    this?.getBooleanArray(key) ?: ifNone.invoke()

fun Bundle?.getByteArrayOrDefault(key: String, ifNone: () -> ByteArray) =
    this?.getByteArray(key) ?: ifNone.invoke()

fun Bundle?.getShortArrayOrDefault(key: String, ifNone: () -> ShortArray) =
    this?.getShortArray(key) ?: ifNone.invoke()

fun Bundle?.getCharArrayOrDefault(key: String, ifNone: () -> CharArray) =
    this?.getCharArray(key) ?: ifNone.invoke()

fun Bundle?.getIntArrayOrDefault(key: String, ifNone: () -> IntArray) =
    this?.getIntArray(key) ?: ifNone.invoke()

fun Bundle?.getLongArrayOrDefault(key: String, ifNone: () -> LongArray) =
    this?.getLongArray(key) ?: ifNone.invoke()

fun Bundle?.getFloatArrayOrDefault(key: String, ifNone: () -> FloatArray) =
    this?.getFloatArray(key) ?: ifNone.invoke()

fun Bundle?.getDoubleArrayOrDefault(key: String, ifNone: () -> DoubleArray) =
    this?.getDoubleArray(key) ?: ifNone.invoke()

fun Bundle?.getStringArrayOrDefault(key: String, ifNone: () -> Array<String>) =
    this?.getStringArray(key) ?: ifNone.invoke()

fun Bundle?.getCharSequenceArrayOrDefault(key: String, ifNone: () -> Array<CharSequence>) =
    this?.getCharSequenceArray(key) ?: ifNone.invoke()