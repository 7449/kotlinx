@file:JvmName("FragmentExtraUtils")
@file:Suppress("HasPlatformType")

package androidx.kotlin.expand.os

import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import android.util.Size
import android.util.SizeF
import android.util.SparseArray
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment

import java.io.Serializable

val Fragment?.bundleExpand: Bundle?
    get() = this?.arguments

@JvmName("getArgsOrEmpty")
fun Fragment?.bundleOrEmptyExpand(): Bundle = this?.arguments.orEmptyExpand()

@JvmName("get")
fun Fragment?.getExpand(key: String): Any =
    bundleExpand.getExpand(key)

@JvmName("getBoolean")
fun Fragment?.getBooleanExpand(key: String): Boolean =
    bundleExpand.getBooleanExpand(key)

@JvmName("getByte")
fun Fragment?.getByteExpand(key: String): Byte =
    bundleExpand.getByteExpand(key)

@JvmName("getChar")
fun Fragment?.getCharExpand(key: String): Char =
    bundleExpand.getCharExpand(key)

@JvmName("getShort")
fun Fragment?.getShortExpand(key: String): Short =
    bundleExpand.getShortExpand(key)

@JvmName("getInt")
fun Fragment?.getIntExpand(key: String): Int =
    bundleExpand.getIntExpand(key)

@JvmName("getLong")
fun Fragment?.getLongExpand(key: String): Long =
    bundleExpand.getLongExpand(key)

@JvmName("getFloat")
fun Fragment?.getFloatExpand(key: String): Float =
    bundleExpand.getFloatExpand(key)

@JvmName("getDouble")
fun Fragment?.getDoubleExpand(key: String): Double =
    bundleExpand.getDoubleExpand(key)

@JvmName("getString")
fun Fragment?.getStringExpand(key: String): String =
    bundleExpand.getStringExpand(key)

@JvmName("getCharSequence")
fun Fragment?.getCharSequenceExpand(key: String): CharSequence =
    bundleExpand.getCharSequenceExpand(key)

@JvmName("getSize")
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Fragment?.getSizeExpand(key: String): Size =
    bundleExpand.getSizeExpand(key)

@JvmName("getSizeF")
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Fragment?.getSizeFExpand(key: String): SizeF =
    bundleExpand.getSizeFExpand(key)

@JvmName("getIntArrayList")
fun Fragment?.getIntArrayListExpand(key: String): ArrayList<Int> =
    bundleExpand.getIntArrayListExpand(key)

@JvmName("getStringArrayList")
fun Fragment?.getStringArrayListExpand(key: String): ArrayList<String> =
    bundleExpand.getStringArrayListExpand(key)

@JvmName("getCharSequenceArrayList")
fun Fragment?.getCharSequenceArrayListExpand(key: String): ArrayList<CharSequence> =
    bundleExpand.getCharSequenceArrayListExpand(key)

@JvmName("getSerializable")
fun Fragment?.getSerializableExpand(key: String): Serializable =
    bundleExpand.getSerializableExpand(key)

@JvmName("getBooleanArray")
fun Fragment?.getBooleanArrayExpand(key: String): BooleanArray =
    bundleExpand.getBooleanArrayExpand(key)

@JvmName("getByteArray")
fun Fragment?.getByteArrayExpand(key: String): ByteArray =
    bundleExpand.getByteArrayExpand(key)

@JvmName("getShortArray")
fun Fragment?.getShortArrayExpand(key: String): ShortArray =
    bundleExpand.getShortArrayExpand(key)

@JvmName("getCharArray")
fun Fragment?.getCharArrayExpand(key: String): CharArray =
    bundleExpand.getCharArrayExpand(key)

@JvmName("getIntArray")
fun Fragment?.getIntArrayExpand(key: String): IntArray =
    bundleExpand.getIntArrayExpand(key)

@JvmName("getLongArray")
fun Fragment?.getLongArrayExpand(key: String): LongArray =
    bundleExpand.getLongArrayExpand(key)

@JvmName("getFloatArray")
fun Fragment?.getFloatArrayExpand(key: String): FloatArray =
    bundleExpand.getFloatArrayExpand(key)

@JvmName("getDoubleArray")
fun Fragment?.getDoubleArrayExpand(key: String): DoubleArray =
    bundleExpand.getDoubleArrayExpand(key)

@JvmName("getStringArray")
fun Fragment?.getStringArrayExpand(key: String): Array<String> =
    bundleExpand.getStringArrayExpand(key)

@JvmName("getCharSequenceArray")
fun Fragment?.getCharSequenceArrayExpand(key: String): Array<CharSequence> =
    bundleExpand.getCharSequenceArrayExpand(key)

@JvmName("getParcelable")
fun <T : Parcelable> Fragment?.getParcelableExpand(key: String): T =
    bundleExpand.getParcelableExpand(key)

@JvmName("getParcelableArray")
fun <T : Parcelable> Fragment?.getParcelableArrayExpand(key: String): Array<T> =
    bundleExpand.getParcelableArrayExpand(key)

@JvmName("getParcelableArrayList")
fun <T : Parcelable> Fragment?.getParcelableArrayListExpand(key: String): ArrayList<T> =
    bundleExpand.getParcelableArrayListExpand(key)

@JvmName("getSparseParcelableArray")
fun <T : Parcelable> Fragment?.getSparseParcelableArrayExpand(key: String): SparseArray<T> =
    bundleExpand.getSparseParcelableArrayExpand(key)

@JvmName("getBundle")
fun Fragment?.getBundleExpand(key: String): Bundle =
    bundleExpand.getBundleExpand(key)

fun Fragment?.getOrDefault(key: String, defaultValue: Any = Any()): Any =
    bundleExpand.getOrDefault(key, defaultValue)

fun Fragment?.getBooleanOrDefault(key: String, defaultValue: Boolean = false): Boolean =
    bundleExpand.getBooleanOrDefault(key, defaultValue)

fun Fragment?.getByteOrDefault(key: String, defaultValue: Byte = 0.toByte()): Byte =
    bundleExpand.getByteOrDefault(key, defaultValue)

fun Fragment?.getCharOrDefault(key: String, defaultValue: Char = 0.toChar()): Char =
    bundleExpand.getCharOrDefault(key, defaultValue)

fun Fragment?.getShortOrDefault(key: String, defaultValue: Short = 0.toShort()): Short =
    bundleExpand.getShortOrDefault(key, defaultValue)

fun Fragment?.getIntOrDefault(key: String, defaultValue: Int = 0): Int =
    bundleExpand.getIntOrDefault(key, defaultValue)

fun Fragment?.getLongOrDefault(key: String, defaultValue: Long = 0.toLong()): Long =
    bundleExpand.getLongOrDefault(key, defaultValue)

fun Fragment?.getFloatOrDefault(key: String, defaultValue: Float = 0.toFloat()): Float =
    bundleExpand.getFloatOrDefault(key, defaultValue)

fun Fragment?.getDoubleOrDefault(key: String, defaultValue: Double = 0.toDouble()): Double =
    bundleExpand.getDoubleOrDefault(key, defaultValue)

fun Fragment?.getStringOrDefault(key: String, defaultValue: String = ""): String =
    bundleExpand.getStringOrDefault(key, defaultValue)

fun Fragment?.getCharSequenceOrDefault(key: String, defaultValue: CharSequence = ""): CharSequence =
    bundleExpand.getCharSequenceOrDefault(key, defaultValue)

fun <T : Parcelable> Fragment?.getParcelableOrDefault(
    key: String,
    defaultValue: Parcelable = this?.arguments?.getParcelable<T>(key)!!
): T = bundleExpand.getParcelableOrDefault(key, defaultValue)

fun <T : Parcelable> Fragment?.getParcelableArrayOrDefault(
    key: String,
    defaultValue: Array<Parcelable> = emptyArray()
): Array<T> = bundleExpand.getParcelableArrayOrDefault(key, defaultValue)

fun <T : Parcelable> Fragment?.getParcelableArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<T> = arrayListOf()
): ArrayList<T> = bundleExpand.getParcelableArrayListOrDefault(key, defaultValue)

fun <T : Parcelable> Fragment?.getSparseParcelableArrayOrDefault(
    key: String,
    defaultValue: SparseArray<T> = SparseArray()
): SparseArray<T> = bundleExpand.getSparseParcelableArrayOrDefault(key, defaultValue)

fun Fragment?.getBundleOrDefault(
    key: String,
    defaultValue: Bundle = Bundle.EMPTY
): Bundle = bundleExpand.getBundleOrDefault(key, defaultValue)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Fragment?.getSizeOrDefault(
    key: String,
    defaultValue: Size = Size(0, 0)
): Size = bundleExpand.getSizeOrDefault(key, defaultValue)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Fragment?.getSizeFOrDefault(
    key: String,
    defaultValue: SizeF = SizeF(0.toFloat(), 0.toFloat())
): SizeF = bundleExpand.getSizeFOrDefault(key, defaultValue)

fun Fragment?.getIntArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<Int> = arrayListOf()
): ArrayList<Int> = bundleExpand.getIntArrayListOrDefault(key, defaultValue)

fun Fragment?.getStringArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<String> = arrayListOf()
): ArrayList<String> = bundleExpand.getStringArrayListOrDefault(key, defaultValue)

fun Fragment?.getCharSequenceArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<CharSequence> = arrayListOf()
): ArrayList<CharSequence> = bundleExpand.getCharSequenceArrayListOrDefault(key, defaultValue)

fun Fragment?.getSerializableOrDefault(
    key: String,
    defaultValue: Serializable = this?.arguments?.getSerializable(key)!!
): Serializable = bundleExpand.getSerializableOrDefault(key, defaultValue)

fun Fragment?.getBooleanArrayOrDefault(
    key: String,
    defaultValue: BooleanArray = booleanArrayOf()
): BooleanArray = bundleExpand.getBooleanArrayOrDefault(key, defaultValue)

fun Fragment?.getByteArrayOrDefault(
    key: String,
    defaultValue: ByteArray = byteArrayOf()
): ByteArray = bundleExpand.getByteArrayOrDefault(key, defaultValue)

fun Fragment?.getShortArrayOrDefault(
    key: String,
    defaultValue: ShortArray = shortArrayOf()
): ShortArray = bundleExpand.getShortArrayOrDefault(key, defaultValue)

fun Fragment?.getCharArrayOrDefault(
    key: String,
    defaultValue: CharArray = charArrayOf()
): CharArray = bundleExpand.getCharArrayOrDefault(key, defaultValue)

fun Fragment?.getIntArrayOrDefault(
    key: String,
    defaultValue: IntArray = intArrayOf()
): IntArray = bundleExpand.getIntArrayOrDefault(key, defaultValue)

fun Fragment?.getLongArrayOrDefault(
    key: String,
    defaultValue: LongArray = longArrayOf()
): LongArray = bundleExpand.getLongArrayOrDefault(key, defaultValue)

fun Fragment?.getFloatArrayOrDefault(
    key: String,
    defaultValue: FloatArray = floatArrayOf()
): FloatArray = bundleExpand.getFloatArrayOrDefault(key, defaultValue)

fun Fragment?.getDoubleArrayOrDefault(
    key: String,
    defaultValue: DoubleArray = doubleArrayOf()
): DoubleArray = bundleExpand.getDoubleArrayOrDefault(key, defaultValue)

fun Fragment?.getStringArrayOrDefault(
    key: String,
    defaultValue: Array<String> = emptyArray()
): Array<String> = bundleExpand.getStringArrayOrDefault(key, defaultValue)

fun Fragment?.getCharSequenceArrayOrDefault(
    key: String,
    defaultValue: Array<CharSequence> = emptyArray()
): Array<CharSequence> = bundleExpand.getCharSequenceArrayOrDefault(key, defaultValue)

//ifNone
fun Fragment?.getOrDefault(key: String, ifNone: () -> Any): Any =
    bundleExpand.getOrDefault(key, ifNone)

fun Fragment?.getBooleanOrDefault(
    key: String,
    ifNone: () -> Boolean
): Boolean = bundleExpand.getBooleanOrDefault(key, ifNone)

fun Fragment?.getByteOrDefault(key: String, ifNone: () -> Byte): Byte =
    bundleExpand.getByteOrDefault(key, ifNone)

fun Fragment?.getCharOrDefault(key: String, ifNone: () -> Char): Char =
    bundleExpand.getCharOrDefault(key, ifNone)

fun Fragment?.getShortOrDefault(key: String, ifNone: () -> Short): Short =
    bundleExpand.getShortOrDefault(key, ifNone)

fun Fragment?.getIntOrDefault(key: String, ifNone: () -> Int): Int =
    bundleExpand.getIntOrDefault(key, ifNone)

fun Fragment?.getLongOrDefault(key: String, ifNone: () -> Long): Long =
    bundleExpand.getLongOrDefault(key, ifNone)

fun Fragment?.getFloatOrDefault(key: String, ifNone: () -> Float): Float =
    bundleExpand.getFloatOrDefault(key, ifNone)

fun Fragment?.getDoubleOrDefault(key: String, ifNone: () -> Double): Double =
    bundleExpand.getDoubleOrDefault(key, ifNone)

fun Fragment?.getStringOrDefault(key: String, ifNone: () -> String): String =
    bundleExpand.getStringOrDefault(key, ifNone)

fun Fragment?.getCharSequenceOrDefault(key: String, ifNone: () -> CharSequence): CharSequence =
    bundleExpand.getCharSequenceOrDefault(key, ifNone)

fun <T : Parcelable> Fragment?.getParcelableOrDefault(
    key: String,
    ifNone: () -> T
): T = bundleExpand.getParcelableOrDefault(key, ifNone)

fun <T : Parcelable> Fragment?.getParcelableArrayOrDefault(
    key: String,
    ifNone: () -> Array<T>
): Array<T> = bundleExpand.getParcelableArrayOrDefault(key, ifNone)

fun <T : Parcelable> Fragment?.getParcelableArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<T>
): ArrayList<T> = bundleExpand.getParcelableArrayListOrDefault(key, ifNone)

fun <T : Parcelable> Fragment?.getSparseParcelableArrayOrDefault(
    key: String,
    ifNone: () -> SparseArray<T>
): SparseArray<T> = bundleExpand.getSparseParcelableArrayOrDefault(key, ifNone)

fun Fragment?.getBundleOrDefault(key: String, ifNone: () -> Bundle): Bundle =
    bundleExpand.getBundleOrDefault(key, ifNone)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Fragment?.getSizeOrDefault(key: String, ifNone: () -> Size): Size =
    bundleExpand.getSizeOrDefault(key, ifNone)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Fragment?.getSizeFOrDefault(key: String, ifNone: () -> SizeF): SizeF =
    bundleExpand.getSizeFOrDefault(key, ifNone)

fun Fragment?.getIntArrayListOrDefault(key: String, ifNone: () -> ArrayList<Int>): ArrayList<Int> =
    bundleExpand.getIntArrayListOrDefault(key, ifNone)

fun Fragment?.getStringArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<String>
): ArrayList<String> = bundleExpand.getStringArrayListOrDefault(key, ifNone)

fun Fragment?.getCharSequenceArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<CharSequence>
): ArrayList<CharSequence> = bundleExpand.getCharSequenceArrayListOrDefault(key, ifNone)

fun Fragment?.getSerializableOrDefault(key: String, ifNone: () -> Serializable): Serializable =
    bundleExpand.getSerializableOrDefault(key, ifNone)

fun Fragment?.getBooleanArrayOrDefault(key: String, ifNone: () -> BooleanArray): BooleanArray =
    bundleExpand.getBooleanArrayOrDefault(key, ifNone)

fun Fragment?.getByteArrayOrDefault(key: String, ifNone: () -> ByteArray): ByteArray =
    bundleExpand.getByteArrayOrDefault(key, ifNone)

fun Fragment?.getShortArrayOrDefault(key: String, ifNone: () -> ShortArray): ShortArray =
    bundleExpand.getShortArrayOrDefault(key, ifNone)

fun Fragment?.getCharArrayOrDefault(key: String, ifNone: () -> CharArray): CharArray =
    bundleExpand.getCharArrayOrDefault(key, ifNone)

fun Fragment?.getIntArrayOrDefault(key: String, ifNone: () -> IntArray): IntArray =
    bundleExpand.getIntArrayOrDefault(key, ifNone)

fun Fragment?.getLongArrayOrDefault(key: String, ifNone: () -> LongArray): LongArray =
    bundleExpand.getLongArrayOrDefault(key, ifNone)

fun Fragment?.getFloatArrayOrDefault(key: String, ifNone: () -> FloatArray): FloatArray =
    bundleExpand.getFloatArrayOrDefault(key, ifNone)

fun Fragment?.getDoubleArrayOrDefault(key: String, ifNone: () -> DoubleArray): DoubleArray =
    bundleExpand.getDoubleArrayOrDefault(key, ifNone)

fun Fragment?.getStringArrayOrDefault(key: String, ifNone: () -> Array<String>): Array<String> =
    bundleExpand.getStringArrayOrDefault(key, ifNone)

fun Fragment?.getCharSequenceArrayOrDefault(
    key: String,
    ifNone: () -> Array<CharSequence>
): Array<CharSequence> = bundleExpand.getCharSequenceArrayOrDefault(key, ifNone)