@file:JvmName("FragmentBundleUtils")
@file:Suppress("HasPlatformType")

package com.kotlin.x

import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import android.util.Size
import android.util.SizeF
import android.util.SparseArray
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import java.io.Serializable

fun Fragment?.orEmptyExpand(): Bundle = this?.arguments ?: Bundle.EMPTY

fun Fragment?.getExpand(key: String): Any =
    getOrDefault(key, Any())

fun Fragment?.getBooleanExpand(key: String): Boolean =
    getBooleanOrDefault(key, false)

fun Fragment?.getByteExpand(key: String): Byte =
    getByteOrDefault(key, 0)

fun Fragment?.getCharExpand(key: String): Char =
    getCharOrDefault(key, 'a')

fun Fragment?.getShortExpand(key: String): Short =
    getShortOrDefault(key, 0)

fun Fragment?.getIntExpand(key: String): Int =
    getIntOrDefault(key, 0)

fun Fragment?.getLongExpand(key: String): Long =
    getLongOrDefault(key, 0)

fun Fragment?.getFloatExpand(key: String): Float =
    getFloatOrDefault(key, 0F)

fun Fragment?.getDoubleExpand(key: String): Double =
    getDoubleOrDefault(key, 0.0)

fun Fragment?.getStringExpand(key: String): String =
    getStringOrDefault(key, "")

fun Fragment?.getCharSequenceExpand(key: String): CharSequence =
    getCharSequenceOrDefault(key, "")

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Fragment?.getSizeExpand(key: String): Size =
    getSizeOrDefault(key, Size(0, 0))

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Fragment?.getSizeFExpand(key: String): SizeF =
    getSizeFOrDefault(key, SizeF(0F, 0F))

fun Fragment?.getIntArrayListExpand(key: String): ArrayList<Int> =
    getIntArrayListOrDefault(key, ArrayList())

fun Fragment?.getStringArrayListExpand(key: String): ArrayList<String> =
    getStringArrayListOrDefault(key, ArrayList())

fun Fragment?.getCharSequenceArrayListExpand(key: String): ArrayList<CharSequence> =
    getCharSequenceArrayListOrDefault(key, ArrayList())

fun Fragment?.getBooleanArrayExpand(key: String): BooleanArray =
    getBooleanArrayOrDefault(key, booleanArrayOf())

fun Fragment?.getByteArrayExpand(key: String): ByteArray =
    getByteArrayOrDefault(key, byteArrayOf())

fun Fragment?.getShortArrayExpand(key: String): ShortArray =
    getShortArrayOrDefault(key, shortArrayOf())

fun Fragment?.getCharArrayExpand(key: String): CharArray =
    getCharArrayOrDefault(key, charArrayOf())

fun Fragment?.getIntArrayExpand(key: String): IntArray =
    getIntArrayOrDefault(key, intArrayOf())

fun Fragment?.getLongArrayExpand(key: String): LongArray =
    getLongArrayOrDefault(key, longArrayOf())

fun Fragment?.getFloatArrayExpand(key: String): FloatArray =
    getFloatArrayOrDefault(key, floatArrayOf())

fun Fragment?.getDoubleArrayExpand(key: String): DoubleArray =
    getDoubleArrayOrDefault(key, doubleArrayOf())

fun Fragment?.getStringArrayExpand(key: String): Array<String> =
    getStringArrayOrDefault(key, arrayOf())

fun Fragment?.getCharSequenceArrayExpand(key: String): Array<CharSequence> =
    getCharSequenceArrayOrDefault(key, arrayOf())

inline fun <reified T : Parcelable> Fragment?.getParcelableArrayExpand(key: String): Array<in T> =
    getParcelableArrayOrDefault(key, arrayOf())

fun <T : Parcelable> Fragment?.getParcelableArrayListExpand(key: String): ArrayList<T> =
    getParcelableArrayListOrDefault(key, ArrayList())

fun <T : Parcelable> Fragment?.getSparseParcelableArrayExpand(key: String): SparseArray<T> =
    getSparseParcelableArrayOrDefault(key, SparseArray())

fun Fragment?.getOrDefault(key: String, defaultValue: Any): Any =
    getOrDefault(key) { defaultValue }

fun Fragment?.getBooleanOrDefault(key: String, defaultValue: Boolean): Boolean =
    getBooleanOrDefault(key) { defaultValue }

fun Fragment?.getByteOrDefault(key: String, defaultValue: Byte): Byte =
    getByteOrDefault(key) { defaultValue }

fun Fragment?.getCharOrDefault(key: String, defaultValue: Char): Char =
    getCharOrDefault(key) { defaultValue }

fun Fragment?.getShortOrDefault(key: String, defaultValue: Short): Short =
    getShortOrDefault(key) { defaultValue }

fun Fragment?.getIntOrDefault(key: String, defaultValue: Int): Int =
    getIntOrDefault(key) { defaultValue }

fun Fragment?.getLongOrDefault(key: String, defaultValue: Long): Long =
    getLongOrDefault(key) { defaultValue }

fun Fragment?.getFloatOrDefault(key: String, defaultValue: Float): Float =
    getFloatOrDefault(key) { defaultValue }

fun Fragment?.getDoubleOrDefault(key: String, defaultValue: Double): Double =
    getDoubleOrDefault(key) { defaultValue }

fun Fragment?.getStringOrDefault(key: String, defaultValue: String): String =
    getStringOrDefault(key) { defaultValue }

fun Fragment?.getCharSequenceOrDefault(key: String, defaultValue: CharSequence): CharSequence =
    getCharSequenceOrDefault(key) { defaultValue }

fun <T : Parcelable> Fragment?.getParcelableOrDefault(key: String, defaultValue: Parcelable): T =
    getParcelableOrDefault(key) {
        @Suppress("UNCHECKED_CAST")
        defaultValue as T
    }

fun <T : Parcelable> Fragment?.getParcelableArrayOrDefault(
    key: String,
    defaultValue: Array<in T>
): Array<in T> = getParcelableArrayOrDefault(key) { defaultValue }

fun <T : Parcelable> Fragment?.getParcelableArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<T>
): ArrayList<T> = getParcelableArrayListOrDefault(key) { defaultValue }

fun <T : Parcelable> Fragment?.getSparseParcelableArrayOrDefault(
    key: String,
    defaultValue: SparseArray<T>
): SparseArray<T> = getSparseParcelableArrayOrDefault(key) { defaultValue }

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Fragment?.getSizeOrDefault(key: String, defaultValue: Size): Size =
    getSizeOrDefault(key) { defaultValue }

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Fragment?.getSizeFOrDefault(key: String, defaultValue: SizeF): SizeF =
    getSizeFOrDefault(key) { defaultValue }

fun Fragment?.getIntArrayListOrDefault(key: String, defaultValue: ArrayList<Int>): ArrayList<Int> =
    getIntArrayListOrDefault(key) { defaultValue }

fun Fragment?.getStringArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<String>
): ArrayList<String> = getStringArrayListOrDefault(key) { defaultValue }

fun Fragment?.getCharSequenceArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<CharSequence>
): ArrayList<CharSequence> = getCharSequenceArrayListOrDefault(key) { defaultValue }

fun Fragment?.getSerializableOrDefault(key: String, defaultValue: Serializable): Serializable =
    getSerializableOrDefault(key) { defaultValue }

fun Fragment?.getBooleanArrayOrDefault(key: String, defaultValue: BooleanArray): BooleanArray =
    getBooleanArrayOrDefault(key) { defaultValue }

fun Fragment?.getByteArrayOrDefault(key: String, defaultValue: ByteArray): ByteArray =
    getByteArrayOrDefault(key) { defaultValue }

fun Fragment?.getShortArrayOrDefault(key: String, defaultValue: ShortArray): ShortArray =
    getShortArrayOrDefault(key) { defaultValue }

fun Fragment?.getCharArrayOrDefault(key: String, defaultValue: CharArray): CharArray =
    getCharArrayOrDefault(key) { defaultValue }

fun Fragment?.getIntArrayOrDefault(key: String, defaultValue: IntArray): IntArray =
    getIntArrayOrDefault(key) { defaultValue }

fun Fragment?.getLongArrayOrDefault(key: String, defaultValue: LongArray): LongArray =
    getLongArrayOrDefault(key) { defaultValue }

fun Fragment?.getFloatArrayOrDefault(key: String, defaultValue: FloatArray): FloatArray =
    getFloatArrayOrDefault(key) { defaultValue }

fun Fragment?.getDoubleArrayOrDefault(key: String, defaultValue: DoubleArray): DoubleArray =
    getDoubleArrayOrDefault(key) { defaultValue }

fun Fragment?.getStringArrayOrDefault(key: String, defaultValue: Array<String>): Array<String> =
    getStringArrayOrDefault(key) { defaultValue }

fun Fragment?.getCharSequenceArrayOrDefault(
    key: String,
    defaultValue: Array<CharSequence>
): Array<CharSequence> = getCharSequenceArrayOrDefault(key) { defaultValue }

//ifNone
fun Fragment?.getOrDefault(key: String, ifNone: () -> Any): Any =
    this?.arguments?.get(key) ?: ifNone.invoke()

fun Fragment?.getBooleanOrDefault(key: String, ifNone: () -> Boolean): Boolean =
    this?.arguments?.getBoolean(key, ifNone.invoke()) ?: ifNone.invoke()

fun Fragment?.getByteOrDefault(key: String, ifNone: () -> Byte): Byte =
    this?.arguments?.getByte(key, ifNone.invoke()) ?: ifNone.invoke()

fun Fragment?.getCharOrDefault(key: String, ifNone: () -> Char): Char =
    this?.arguments?.getChar(key, ifNone.invoke()) ?: ifNone.invoke()

fun Fragment?.getShortOrDefault(key: String, ifNone: () -> Short): Short =
    this?.arguments?.getShort(key, ifNone.invoke()) ?: ifNone.invoke()

fun Fragment?.getIntOrDefault(key: String, ifNone: () -> Int): Int =
    this?.arguments?.getInt(key, ifNone.invoke()) ?: ifNone.invoke()

fun Fragment?.getLongOrDefault(key: String, ifNone: () -> Long): Long =
    this?.arguments?.getLong(key, ifNone.invoke()) ?: ifNone.invoke()

fun Fragment?.getFloatOrDefault(key: String, ifNone: () -> Float): Float =
    this?.arguments?.getFloat(key, ifNone.invoke()) ?: ifNone.invoke()

fun Fragment?.getDoubleOrDefault(key: String, ifNone: () -> Double): Double =
    this?.arguments?.getDouble(key, ifNone.invoke()) ?: ifNone.invoke()

fun Fragment?.getStringOrDefault(key: String, ifNone: () -> String): String =
    this?.arguments?.getString(key, ifNone.invoke()) ?: ifNone.invoke()

fun Fragment?.getCharSequenceOrDefault(key: String, ifNone: () -> CharSequence): CharSequence =
    this?.arguments?.getCharSequence(key, ifNone.invoke()) ?: ifNone.invoke()

fun <T : Parcelable> Fragment?.getParcelableOrDefault(key: String, ifNone: () -> T): T =
    this?.arguments?.getParcelable(key) ?: ifNone.invoke()

fun <T : Parcelable> Fragment?.getParcelableArrayOrDefault(
    key: String,
    ifNone: () -> Array<in T>
): Array<in T> = this?.arguments?.getParcelableArray(key) ?: ifNone.invoke()

fun <T : Parcelable> Fragment?.getParcelableArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<T>
): ArrayList<T> = this?.arguments?.getParcelableArrayList(key) ?: ifNone.invoke()

fun <T : Parcelable> Fragment?.getSparseParcelableArrayOrDefault(
    key: String,
    ifNone: () -> SparseArray<T>
): SparseArray<T> = this?.arguments?.getSparseParcelableArray(key) ?: ifNone.invoke()

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Fragment?.getSizeOrDefault(key: String, ifNone: () -> Size): Size =
    this?.arguments?.getSize(key) ?: ifNone.invoke()

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Fragment?.getSizeFOrDefault(key: String, ifNone: () -> SizeF): SizeF =
    this?.arguments?.getSizeF(key) ?: ifNone.invoke()

fun Fragment?.getIntArrayListOrDefault(key: String, ifNone: () -> ArrayList<Int>): ArrayList<Int> =
    this?.arguments?.getIntegerArrayList(key) ?: ifNone.invoke()

fun Fragment?.getStringArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<String>
): ArrayList<String> = this?.arguments?.getStringArrayList(key) ?: ifNone.invoke()

fun Fragment?.getCharSequenceArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<CharSequence>
): ArrayList<CharSequence> = this?.arguments?.getCharSequenceArrayList(key) ?: ifNone.invoke()

fun Fragment?.getSerializableOrDefault(key: String, ifNone: () -> Serializable): Serializable =
    this?.arguments?.getSerializable(key) ?: ifNone.invoke()

fun Fragment?.getBooleanArrayOrDefault(key: String, ifNone: () -> BooleanArray): BooleanArray =
    this?.arguments?.getBooleanArray(key) ?: ifNone.invoke()

fun Fragment?.getByteArrayOrDefault(key: String, ifNone: () -> ByteArray): ByteArray =
    this?.arguments?.getByteArray(key) ?: ifNone.invoke()

fun Fragment?.getShortArrayOrDefault(key: String, ifNone: () -> ShortArray): ShortArray =
    this?.arguments?.getShortArray(key) ?: ifNone.invoke()

fun Fragment?.getCharArrayOrDefault(key: String, ifNone: () -> CharArray): CharArray =
    this?.arguments?.getCharArray(key) ?: ifNone.invoke()

fun Fragment?.getIntArrayOrDefault(key: String, ifNone: () -> IntArray): IntArray =
    this?.arguments?.getIntArray(key) ?: ifNone.invoke()

fun Fragment?.getLongArrayOrDefault(key: String, ifNone: () -> LongArray): LongArray =
    this?.arguments?.getLongArray(key) ?: ifNone.invoke()

fun Fragment?.getFloatArrayOrDefault(key: String, ifNone: () -> FloatArray): FloatArray =
    this?.arguments?.getFloatArray(key) ?: ifNone.invoke()

fun Fragment?.getDoubleArrayOrDefault(key: String, ifNone: () -> DoubleArray): DoubleArray =
    this?.arguments?.getDoubleArray(key) ?: ifNone.invoke()

fun Fragment?.getStringArrayOrDefault(key: String, ifNone: () -> Array<String>): Array<String> =
    this?.arguments?.getStringArray(key) ?: ifNone.invoke()

fun Fragment?.getCharSequenceArrayOrDefault(
    key: String,
    ifNone: () -> Array<CharSequence>
): Array<CharSequence> = this?.arguments?.getCharSequenceArray(key) ?: ifNone.invoke()