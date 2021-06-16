@file:JvmName("BundleUtils")
@file:Suppress("HasPlatformType", "UNCHECKED_CAST")

package androidx.kotlin.expand.os

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
 *   BundleUtils.getXXX(key)
 *
 * kotlin
 *   Bundle.getXXXExpand(key) or Bundle.getXXXOrDefault(key,default) or Bundle.getXXXOrDefault(key){default}
 *
 */

@JvmName("getOrEmpty")
fun Bundle?.orEmptyExpand(): Bundle = this ?: Bundle.EMPTY

@JvmName("get")
fun Bundle?.getExpand(key: String): Any =
    getOrDefault(key)

@JvmName("getBoolean")
fun Bundle?.getBooleanExpand(key: String): Boolean =
    getBooleanOrDefault(key)

@JvmName("getByte")
fun Bundle?.getByteExpand(key: String): Byte =
    getByteOrDefault(key)

@JvmName("getChar")
fun Bundle?.getCharExpand(key: String): Char =
    getCharOrDefault(key)

@JvmName("getShort")
fun Bundle?.getShortExpand(key: String): Short =
    getShortOrDefault(key)

@JvmName("getInt")
fun Bundle?.getIntExpand(key: String): Int =
    getIntOrDefault(key)

@JvmName("getLong")
fun Bundle?.getLongExpand(key: String): Long =
    getLongOrDefault(key)

@JvmName("getFloat")
fun Bundle?.getFloatExpand(key: String): Float =
    getFloatOrDefault(key)

@JvmName("getDouble")
fun Bundle?.getDoubleExpand(key: String): Double =
    getDoubleOrDefault(key)

@JvmName("getString")
fun Bundle?.getStringExpand(key: String): String =
    getStringOrDefault(key)

@JvmName("getCharSequence")
fun Bundle?.getCharSequenceExpand(key: String): CharSequence =
    getCharSequenceOrDefault(key)

@JvmName("getSize")
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Bundle?.getSizeExpand(key: String): Size =
    getSizeOrDefault(key)

@JvmName("getSizeF")
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Bundle?.getSizeFExpand(key: String): SizeF =
    getSizeFOrDefault(key)

@JvmName("getIntArrayList")
fun Bundle?.getIntArrayListExpand(key: String): ArrayList<Int> =
    getIntArrayListOrDefault(key)

@JvmName("getStringArrayList")
fun Bundle?.getStringArrayListExpand(key: String): ArrayList<String> =
    getStringArrayListOrDefault(key)

@JvmName("getCharSequenceArrayList")
fun Bundle?.getCharSequenceArrayListExpand(key: String): ArrayList<CharSequence> =
    getCharSequenceArrayListOrDefault(key)

@JvmName("getSerializable")
fun Bundle?.getSerializableExpand(key: String): Serializable =
    getSerializableOrDefault(key)

@JvmName("getBooleanArray")
fun Bundle?.getBooleanArrayExpand(key: String): BooleanArray =
    getBooleanArrayOrDefault(key)

@JvmName("getByteArray")
fun Bundle?.getByteArrayExpand(key: String): ByteArray =
    getByteArrayOrDefault(key)

@JvmName("getShortArray")
fun Bundle?.getShortArrayExpand(key: String): ShortArray =
    getShortArrayOrDefault(key)

@JvmName("getCharArray")
fun Bundle?.getCharArrayExpand(key: String): CharArray =
    getCharArrayOrDefault(key)

@JvmName("getIntArray")
fun Bundle?.getIntArrayExpand(key: String): IntArray =
    getIntArrayOrDefault(key)

@JvmName("getLongArray")
fun Bundle?.getLongArrayExpand(key: String): LongArray =
    getLongArrayOrDefault(key)

@JvmName("getFloatArray")
fun Bundle?.getFloatArrayExpand(key: String): FloatArray =
    getFloatArrayOrDefault(key)

@JvmName("getDoubleArray")
fun Bundle?.getDoubleArrayExpand(key: String): DoubleArray =
    getDoubleArrayOrDefault(key)

@JvmName("getStringArray")
fun Bundle?.getStringArrayExpand(key: String): Array<String> =
    getStringArrayOrDefault(key)

@JvmName("getCharSequenceArray")
fun Bundle?.getCharSequenceArrayExpand(key: String): Array<CharSequence> =
    getCharSequenceArrayOrDefault(key)

@JvmName("getParcelable")
fun <T : Parcelable> Bundle?.getParcelableExpand(key: String): T =
    getParcelableOrDefault(key)

@JvmName("getParcelableArray")
fun <T : Parcelable> Bundle?.getParcelableArrayExpand(key: String): Array<T> =
    getParcelableArrayOrDefault(key)

@JvmName("getParcelableArrayList")
fun <T : Parcelable> Bundle?.getParcelableArrayListExpand(key: String): ArrayList<T> =
    getParcelableArrayListOrDefault(key)

@JvmName("getSparseParcelableArray")
fun <T : Parcelable> Bundle?.getSparseParcelableArrayExpand(key: String): SparseArray<T> =
    getSparseParcelableArrayOrDefault(key)

@JvmName("getBundle")
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
    defaultValue: SparseArray<T> = SparseArray()
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
    getObjExpand(key, ifNone)

fun Bundle?.getBooleanOrDefault(
    key: String,
    ifNone: () -> Boolean
): Boolean = getObjExpand(key, ifNone)

fun Bundle?.getByteOrDefault(key: String, ifNone: () -> Byte): Byte =
    getObjExpand(key, ifNone)

fun Bundle?.getCharOrDefault(key: String, ifNone: () -> Char): Char =
    getObjExpand(key, ifNone)

fun Bundle?.getShortOrDefault(key: String, ifNone: () -> Short): Short =
    getObjExpand(key, ifNone)

fun Bundle?.getIntOrDefault(key: String, ifNone: () -> Int): Int =
    getObjExpand(key, ifNone)

fun Bundle?.getLongOrDefault(key: String, ifNone: () -> Long): Long =
    getObjExpand(key, ifNone)

fun Bundle?.getFloatOrDefault(key: String, ifNone: () -> Float): Float =
    getObjExpand(key, ifNone)

fun Bundle?.getDoubleOrDefault(key: String, ifNone: () -> Double): Double =
    getObjExpand(key, ifNone)

fun Bundle?.getStringOrDefault(key: String, ifNone: () -> String): String =
    getObjExpand(key, ifNone)

fun Bundle?.getCharSequenceOrDefault(key: String, ifNone: () -> CharSequence): CharSequence =
    getObjExpand(key, ifNone)

fun <T : Parcelable> Bundle?.getParcelableOrDefault(
    key: String,
    ifNone: () -> T
): T = getObjExpand(key, ifNone)

fun <T : Parcelable> Bundle?.getParcelableArrayOrDefault(
    key: String,
    ifNone: () -> Array<T>
): Array<T> = getObjExpand(key, ifNone)

fun <T : Parcelable> Bundle?.getParcelableArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<T>
): ArrayList<T> = getObjExpand(key, ifNone)

fun <T : Parcelable> Bundle?.getSparseParcelableArrayOrDefault(
    key: String,
    ifNone: () -> SparseArray<T>
): SparseArray<T> = getObjExpand(key, ifNone)

fun Bundle?.getBundleOrDefault(key: String, ifNone: () -> Bundle): Bundle =
    getObjExpand(key, ifNone)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Bundle?.getSizeOrDefault(key: String, ifNone: () -> Size): Size =
    getObjExpand(key, ifNone)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Bundle?.getSizeFOrDefault(key: String, ifNone: () -> SizeF): SizeF =
    getObjExpand(key, ifNone)

fun Bundle?.getIntArrayListOrDefault(key: String, ifNone: () -> ArrayList<Int>): ArrayList<Int> =
    getObjExpand(key, ifNone)

fun Bundle?.getStringArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<String>
): ArrayList<String> =
    getObjExpand(key, ifNone)

fun Bundle?.getCharSequenceArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<CharSequence>
): ArrayList<CharSequence> =
    getObjExpand(key, ifNone)

fun Bundle?.getSerializableOrDefault(key: String, ifNone: () -> Serializable): Serializable =
    getObjExpand(key, ifNone)

fun Bundle?.getBooleanArrayOrDefault(key: String, ifNone: () -> BooleanArray): BooleanArray =
    getObjExpand(key, ifNone)

fun Bundle?.getByteArrayOrDefault(key: String, ifNone: () -> ByteArray): ByteArray =
    getObjExpand(key, ifNone)

fun Bundle?.getShortArrayOrDefault(key: String, ifNone: () -> ShortArray): ShortArray =
    getObjExpand(key, ifNone)

fun Bundle?.getCharArrayOrDefault(key: String, ifNone: () -> CharArray): CharArray =
    getObjExpand(key, ifNone)

fun Bundle?.getIntArrayOrDefault(key: String, ifNone: () -> IntArray): IntArray =
    getObjExpand(key, ifNone)

fun Bundle?.getLongArrayOrDefault(key: String, ifNone: () -> LongArray): LongArray =
    getObjExpand(key, ifNone)

fun Bundle?.getFloatArrayOrDefault(key: String, ifNone: () -> FloatArray): FloatArray =
    getObjExpand(key, ifNone)

fun Bundle?.getDoubleArrayOrDefault(key: String, ifNone: () -> DoubleArray): DoubleArray =
    getObjExpand(key, ifNone)

fun Bundle?.getStringArrayOrDefault(key: String, ifNone: () -> Array<String>): Array<String> =
    getObjExpand(key, ifNone)

fun Bundle?.getCharSequenceArrayOrDefault(
    key: String,
    ifNone: () -> Array<CharSequence>
): Array<CharSequence> = getObjExpand(key, ifNone)

fun <T> Bundle?.getObjExpand(key: String, action: Action<T>): T =
    this?.get(key) as? T ?: action.invoke()