@file:JvmName("ActivityExtraUtils")
@file:Suppress("UNCHECKED_CAST")

package com.kotlin.x

import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import android.util.Size
import android.util.SizeF
import android.util.SparseArray
import androidx.annotation.RequiresApi
import java.io.Serializable

val Activity?.intentExpand: Intent?
    get() = this?.intent

val Activity?.bundleExpand: Bundle?
    get() = this?.intent?.extras

// intent extras

fun Activity?.intentOrEmptyExpand(): Intent = intentExpand.orEmptyExpand()

fun Activity?.intentBooleanExpand(key: String): Boolean =
    intentExpand.getBooleanExpand(key)

fun Activity?.intentByteExpand(key: String): Byte =
    intentExpand.getByteExpand(key)

fun Activity?.intentCharExpand(key: String): Char =
    intentExpand.getCharExpand(key)

fun Activity?.intentShortExpand(key: String): Short =
    intentExpand.getShortExpand(key)

fun Activity?.intentIntExpand(key: String): Int =
    intentExpand.getIntExpand(key)

fun Activity?.intentLongExpand(key: String): Long =
    intentExpand.getLongExpand(key)

fun Activity?.intentFloatExpand(key: String): Float =
    intentExpand.getFloatExpand(key)

fun Activity?.intentDoubleExpand(key: String): Double =
    intentExpand.getDoubleExpand(key)

fun Activity?.intentStringExpand(key: String): String =
    intentExpand.getStringExpand(key)

fun Activity?.intentCharSequenceExpand(key: String): CharSequence =
    intentExpand.getCharSequenceExpand(key)

fun Activity?.intentIntArrayListExpand(key: String): ArrayList<Int> =
    intentExpand.getIntArrayListExpand(key)

fun Activity?.intentStringArrayListExpand(key: String): ArrayList<String> =
    intentExpand.getStringArrayListExpand(key)

fun Activity?.intentCharSequenceArrayListExpand(key: String): ArrayList<CharSequence> =
    intentExpand.getCharSequenceArrayListExpand(key)

fun Activity?.intentBooleanArrayExpand(key: String): BooleanArray =
    intentExpand.getBooleanArrayExpand(key)

fun Activity?.intentByteArrayExpand(key: String): ByteArray =
    intentExpand.getByteArrayExpand(key)

fun Activity?.intentShortArrayExpand(key: String): ShortArray =
    intentExpand.getShortArrayExpand(key)

fun Activity?.intentCharArrayExpand(key: String): CharArray =
    intentExpand.getCharArrayExpand(key)

fun Activity?.intentIntArrayExpand(key: String): IntArray =
    intentExpand.getIntArrayExpand(key)

fun Activity?.intentLongArrayExpand(key: String): LongArray =
    intentExpand.getLongArrayExpand(key)

fun Activity?.intentFloatArrayExpand(key: String): FloatArray =
    intentExpand.getFloatArrayExpand(key)

fun Activity?.intentDoubleArrayExpand(key: String): DoubleArray =
    intentExpand.getDoubleArrayExpand(key)

fun Activity?.intentStringArrayExpand(key: String): Array<String> =
    intentExpand.getStringArrayExpand(key)

fun Activity?.intentCharSequenceArrayExpand(key: String): Array<CharSequence> =
    intentExpand.getCharSequenceArrayExpand(key)

fun <T : Parcelable> Activity?.intentParcelableExpand(key: String): T =
    intentExpand.getParcelableExpand(key)

fun <T : Parcelable> Activity?.intentParcelableArrayExpand(key: String): Array<T> =
    intentExpand.getParcelableArrayExpand(key)

fun <T : Parcelable> Activity?.intentParcelableArrayListExpand(key: String): ArrayList<T> =
    intentExpand.getParcelableArrayListExpand(key)

fun Activity?.intentSerializableExpand(key: String): Serializable =
    intentExpand.getSerializableExpand(key)

fun Activity?.intentBundleExpand(key: String): Bundle =
    intentExpand.getBundleExpand(key)

fun Activity?.intentBooleanOrDefault(key: String, defaultValue: Boolean = false): Boolean =
    intentExpand.getBooleanOrDefault(key, defaultValue)

fun Activity?.intentByteOrDefault(key: String, defaultValue: Byte = 0.toByte()): Byte =
    intentExpand.getByteOrDefault(key, defaultValue)

fun Activity?.intentShortOrDefault(key: String, defaultValue: Short = 0.toShort()): Short =
    intentExpand.getShortOrDefault(key, defaultValue)

fun Activity?.intentCharOrDefault(key: String, defaultValue: Char = 0.toChar()): Char =
    intentExpand.getCharOrDefault(key, defaultValue)

fun Activity?.intentIntOrDefault(key: String, defaultValue: Int = 0): Int =
    intentExpand.getIntOrDefault(key, defaultValue)

fun Activity?.intentLongOrDefault(key: String, defaultValue: Long = 0.toLong()): Long =
    intentExpand.getLongOrDefault(key, defaultValue)

fun Activity?.intentFloatOrDefault(key: String, defaultValue: Float = 0.toFloat()): Float =
    intentExpand.getFloatOrDefault(key, defaultValue)

fun Activity?.intentDoubleOrDefault(key: String, defaultValue: Double = 0.toDouble()): Double =
    intentExpand.getDoubleOrDefault(key, defaultValue)

fun Activity?.intentStringOrDefault(key: String, defaultValue: String = ""): String =
    intentExpand.getStringOrDefault(key, defaultValue)

fun Activity?.intentCharSequenceOrDefault(
    key: String,
    defaultValue: CharSequence = ""
): CharSequence = intentExpand.getCharSequenceOrDefault(key, defaultValue)

fun <T : Parcelable> Activity?.intentParcelableOrDefault(
    key: String,
    defaultValue: Parcelable = intentExpand?.getParcelableExtra<T>(key)!!
): T = intentExpand.getParcelableOrDefault(key, defaultValue)

fun <T : Parcelable> Activity?.intentParcelableArrayOrDefault(
    key: String,
    defaultValue: Array<Parcelable> = emptyArray()
): Array<T> = intentExpand.getParcelableArrayOrDefault(key, defaultValue)

fun <T : Parcelable> Activity?.intentParcelableArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<T> = arrayListOf()
): ArrayList<T> = intentExpand.getParcelableArrayListOrDefault(key, defaultValue)

fun Activity?.intentSerializableOrDefault(
    key: String,
    defaultValue: Serializable = intentExpand?.getSerializableExtra(key)!!
): Serializable = intentExpand.getSerializableOrDefault(key, defaultValue)

fun Activity?.intentIntArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<Int> = arrayListOf()
): ArrayList<Int> = intentExpand.getIntArrayListOrDefault(key, defaultValue)

fun Activity?.intentStringArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<String> = arrayListOf()
): ArrayList<String> = intentExpand.getStringArrayListOrDefault(key, defaultValue)

fun Activity?.intentCharSequenceArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<CharSequence> = arrayListOf()
): ArrayList<CharSequence> = intentExpand.getCharSequenceArrayListOrDefault(key, defaultValue)

fun Activity?.intentBooleanArrayOrDefault(
    key: String,
    defaultValue: BooleanArray = booleanArrayOf()
): BooleanArray = intentExpand.getBooleanArrayOrDefault(key, defaultValue)

fun Activity?.intentByteArrayOrDefault(
    key: String,
    defaultValue: ByteArray = byteArrayOf()
): ByteArray = intentExpand.getByteArrayOrDefault(key, defaultValue)

fun Activity?.intentShortArrayOrDefault(
    key: String,
    defaultValue: ShortArray = shortArrayOf()
): ShortArray = intentExpand.getShortArrayOrDefault(key, defaultValue)

fun Activity?.intentCharArrayOrDefault(
    key: String,
    defaultValue: CharArray = charArrayOf()
): CharArray = intentExpand.getCharArrayOrDefault(key, defaultValue)

fun Activity?.intentIntArrayOrDefault(
    key: String,
    defaultValue: IntArray = intArrayOf()
): IntArray = intentExpand.getIntArrayOrDefault(key, defaultValue)

fun Activity?.intentLongArrayOrDefault(
    key: String,
    defaultValue: LongArray = longArrayOf()
): LongArray = intentExpand.getLongArrayOrDefault(key, defaultValue)

fun Activity?.intentFloatArrayOrDefault(
    key: String,
    defaultValue: FloatArray = floatArrayOf()
): FloatArray = intentExpand.getFloatArrayOrDefault(key, defaultValue)

fun Activity?.intentDoubleArrayOrDefault(
    key: String,
    defaultValue: DoubleArray = doubleArrayOf()
): DoubleArray = intentExpand.getDoubleArrayOrDefault(key, defaultValue)

fun Activity?.intentStringArrayOrDefault(
    key: String,
    defaultValue: Array<String> = emptyArray()
): Array<String> = intentExpand.getStringArrayOrDefault(key, defaultValue)

fun Activity?.intentCharSequenceArrayOrDefault(
    key: String,
    defaultValue: Array<CharSequence> = emptyArray()
): Array<CharSequence> = intentExpand.getCharSequenceArrayOrDefault(key, defaultValue)

fun Activity?.intentBundleOrDefault(key: String, defaultValue: Bundle = Bundle.EMPTY): Bundle =
    intentExpand.getBundleOrDefault(key, defaultValue)

//ifNone
fun Activity?.intentBooleanOrDefault(key: String, ifNone: () -> Boolean): Boolean =
    intentExpand.getBooleanOrDefault(key, ifNone)

fun Activity?.intentByteOrDefault(key: String, ifNone: () -> Byte): Byte =
    intentExpand.getByteOrDefault(key, ifNone)

fun Activity?.intentShortOrDefault(key: String, ifNone: () -> Short): Short =
    intentExpand.getShortOrDefault(key, ifNone)

fun Activity?.intentCharOrDefault(key: String, ifNone: () -> Char): Char =
    intentExpand.getCharOrDefault(key, ifNone)

fun Activity?.intentIntOrDefault(key: String, ifNone: () -> Int): Int =
    intentExpand.getIntOrDefault(key, ifNone)

fun Activity?.intentLongOrDefault(key: String, ifNone: () -> Long): Long =
    intentExpand.getLongOrDefault(key, ifNone)

fun Activity?.intentFloatOrDefault(key: String, ifNone: () -> Float): Float =
    intentExpand.getFloatOrDefault(key, ifNone)

fun Activity?.intentDoubleOrDefault(key: String, ifNone: () -> Double): Double =
    intentExpand.getDoubleOrDefault(key, ifNone)

fun Activity?.intentStringOrDefault(key: String, ifNone: () -> String): String =
    intentExpand.getStringOrDefault(key, ifNone)

fun Activity?.intentCharSequenceOrDefault(key: String, ifNone: () -> CharSequence): CharSequence =
    intentExpand.getCharSequenceOrDefault(key, ifNone)

fun <T : Parcelable> Activity?.intentParcelableOrDefault(key: String, ifNone: () -> T): T =
    intentExpand.getParcelableOrDefault(key, ifNone)

fun <T : Parcelable> Activity?.intentParcelableArrayOrDefault(
    key: String,
    ifNone: () -> Array<T>
): Array<T> = intentExpand.getParcelableArrayOrDefault(key, ifNone)

fun <T : Parcelable> Activity?.intentParcelableArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<T>
): ArrayList<T> = intentExpand.getParcelableArrayListOrDefault(key, ifNone)

fun Activity?.intentSerializableOrDefault(key: String, ifNone: () -> Serializable): Serializable =
    intentExpand.getSerializableOrDefault(key, ifNone)

fun Activity?.intentIntArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<Int>
): ArrayList<Int> =
    intentExpand.getIntArrayListOrDefault(key, ifNone)

fun Activity?.intentStringArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<String>
): ArrayList<String> = intentExpand.getStringArrayListOrDefault(key, ifNone)

fun Activity?.intentCharSequenceArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<CharSequence>
): ArrayList<CharSequence> = intentExpand.getCharSequenceArrayListOrDefault(key, ifNone)

fun Activity?.intentBooleanArrayOrDefault(key: String, ifNone: () -> BooleanArray): BooleanArray =
    intentExpand.getBooleanArrayOrDefault(key, ifNone)

fun Activity?.intentByteArrayOrDefault(key: String, ifNone: () -> ByteArray): ByteArray =
    intentExpand.getByteArrayOrDefault(key, ifNone)

fun Activity?.intentShortArrayOrDefault(key: String, ifNone: () -> ShortArray): ShortArray =
    intentExpand.getShortArrayOrDefault(key, ifNone)

fun Activity?.intentCharArrayOrDefault(key: String, ifNone: () -> CharArray): CharArray =
    intentExpand.getCharArrayOrDefault(key, ifNone)

fun Activity?.intentIntArrayOrDefault(key: String, ifNone: () -> IntArray): IntArray =
    intentExpand.getIntArrayOrDefault(key, ifNone)

fun Activity?.intentLongArrayOrDefault(key: String, ifNone: () -> LongArray): LongArray =
    intentExpand.getLongArrayOrDefault(key, ifNone)

fun Activity?.intentFloatArrayOrDefault(key: String, ifNone: () -> FloatArray): FloatArray =
    intentExpand.getFloatArrayOrDefault(key, ifNone)

fun Activity?.intentDoubleArrayOrDefault(key: String, ifNone: () -> DoubleArray): DoubleArray =
    intentExpand.getDoubleArrayOrDefault(key, ifNone)

fun Activity?.intentStringArrayOrDefault(key: String, ifNone: () -> Array<String>): Array<String> =
    intentExpand.getStringArrayOrDefault(key, ifNone)

fun Activity?.intentCharSequenceArrayOrDefault(
    key: String,
    ifNone: () -> Array<CharSequence>
): Array<CharSequence> = intentExpand.getCharSequenceArrayOrDefault(key, ifNone)

fun Activity?.intentBundleOrDefault(key: String, ifNone: () -> Bundle): Bundle =
    intentExpand.getBundleOrDefault(key, ifNone)

// bundle extras

fun Activity?.bundleOrEmptyExpand(): Bundle = bundleExpand.orEmptyExpand()

fun Activity?.bundleAnyExpand(key: String): Any =
    bundleExpand.getExpand(key)

fun Activity?.bundleBooleanExpand(key: String): Boolean =
    bundleExpand.getBooleanExpand(key)

fun Activity?.bundleByteExpand(key: String): Byte =
    bundleExpand.getByteExpand(key)

fun Activity?.bundleCharExpand(key: String): Char =
    bundleExpand.getCharExpand(key)

fun Activity?.bundleShortExpand(key: String): Short =
    bundleExpand.getShortExpand(key)

fun Activity?.bundleIntExpand(key: String): Int =
    bundleExpand.getIntExpand(key)

fun Activity?.bundleLongExpand(key: String): Long =
    bundleExpand.getLongExpand(key)

fun Activity?.bundleFloatExpand(key: String): Float =
    bundleExpand.getFloatExpand(key)

fun Activity?.bundleDoubleExpand(key: String): Double =
    bundleExpand.getDoubleExpand(key)

fun Activity?.bundleStringExpand(key: String): String =
    bundleExpand.getStringExpand(key)

fun Activity?.bundleCharSequenceExpand(key: String): CharSequence =
    bundleExpand.getCharSequenceExpand(key)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Activity?.bundleSizeExpand(key: String): Size =
    bundleExpand.getSizeExpand(key)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Activity?.bundleSizeFExpand(key: String): SizeF =
    bundleExpand.getSizeFExpand(key)

fun Activity?.bundleIntArrayListExpand(key: String): ArrayList<Int> =
    bundleExpand.getIntArrayListExpand(key)

fun Activity?.bundleStringArrayListExpand(key: String): ArrayList<String> =
    bundleExpand.getStringArrayListExpand(key)

fun Activity?.bundleCharSequenceArrayListExpand(key: String): ArrayList<CharSequence> =
    bundleExpand.getCharSequenceArrayListExpand(key)

fun Activity?.bundleSerializableExpand(key: String): Serializable =
    bundleExpand.getSerializableExpand(key)

fun Activity?.bundleBooleanArrayExpand(key: String): BooleanArray =
    bundleExpand.getBooleanArrayExpand(key)

fun Activity?.bundleByteArrayExpand(key: String): ByteArray =
    bundleExpand.getByteArrayExpand(key)

fun Activity?.bundleShortArrayExpand(key: String): ShortArray =
    bundleExpand.getShortArrayExpand(key)

fun Activity?.bundleCharArrayExpand(key: String): CharArray =
    bundleExpand.getCharArrayExpand(key)

fun Activity?.bundleIntArrayExpand(key: String): IntArray =
    bundleExpand.getIntArrayExpand(key)

fun Activity?.bundleLongArrayExpand(key: String): LongArray =
    bundleExpand.getLongArrayExpand(key)

fun Activity?.bundleFloatArrayExpand(key: String): FloatArray =
    bundleExpand.getFloatArrayExpand(key)

fun Activity?.bundleDoubleArrayExpand(key: String): DoubleArray =
    bundleExpand.getDoubleArrayExpand(key)

fun Activity?.bundleStringArrayExpand(key: String): Array<String> =
    bundleExpand.getStringArrayExpand(key)

fun Activity?.bundleCharSequenceArrayExpand(key: String): Array<CharSequence> =
    bundleExpand.getCharSequenceArrayExpand(key)

fun <T : Parcelable> Activity?.bundleParcelableExpand(key: String): T =
    bundleExpand.getParcelableExpand(key)

fun <T : Parcelable> Activity?.bundleParcelableArrayExpand(key: String): Array<T> =
    bundleExpand.getParcelableArrayExpand(key)

fun <T : Parcelable> Activity?.bundleParcelableArrayListExpand(key: String): ArrayList<T> =
    bundleExpand.getParcelableArrayListExpand(key)

fun <T : Parcelable> Activity?.bundleSparseParcelableArrayExpand(key: String): SparseArray<T> =
    bundleExpand.getSparseParcelableArrayExpand(key)

fun Activity?.bundleBundleExpand(key: String): Bundle =
    bundleExpand.getBundleExpand(key)

fun Activity?.bundleAnyOrDefault(key: String, defaultValue: Any = Any()): Any =
    bundleExpand.getOrDefault(key, defaultValue)

fun Activity?.bundleBooleanOrDefault(key: String, defaultValue: Boolean = false): Boolean =
    bundleExpand.getBooleanOrDefault(key, defaultValue)

fun Activity?.bundleByteOrDefault(key: String, defaultValue: Byte = 0.toByte()): Byte =
    bundleExpand.getByteOrDefault(key, defaultValue)

fun Activity?.bundleCharOrDefault(key: String, defaultValue: Char = 0.toChar()): Char =
    bundleExpand.getCharOrDefault(key, defaultValue)

fun Activity?.bundleShortOrDefault(key: String, defaultValue: Short = 0.toShort()): Short =
    bundleExpand.getShortOrDefault(key, defaultValue)

fun Activity?.bundleIntOrDefault(key: String, defaultValue: Int = 0): Int =
    bundleExpand.getIntOrDefault(key, defaultValue)

fun Activity?.bundleLongOrDefault(key: String, defaultValue: Long = 0.toLong()): Long =
    bundleExpand.getLongOrDefault(key, defaultValue)

fun Activity?.bundleFloatOrDefault(key: String, defaultValue: Float = 0.toFloat()): Float =
    bundleExpand.getFloatOrDefault(key, defaultValue)

fun Activity?.bundleDoubleOrDefault(key: String, defaultValue: Double = 0.toDouble()): Double =
    bundleExpand.getDoubleOrDefault(key, defaultValue)

fun Activity?.bundleStringOrDefault(key: String, defaultValue: String = ""): String =
    bundleExpand.getStringOrDefault(key, defaultValue)

fun Activity?.bundleCharSequenceOrDefault(
    key: String,
    defaultValue: CharSequence = ""
): CharSequence =
    bundleExpand.getCharSequenceOrDefault(key, defaultValue)

fun <T : Parcelable> Activity?.bundleParcelableOrDefault(
    key: String,
    defaultValue: Parcelable = bundleExpand?.getParcelable<T>(key)!!
): T = bundleExpand.getParcelableOrDefault(key) { defaultValue as T }

fun <T : Parcelable> Activity?.bundleParcelableArrayOrDefault(
    key: String,
    defaultValue: Array<Parcelable> = emptyArray()
): Array<T> = bundleExpand.getParcelableArrayOrDefault(key) { defaultValue as Array<T> }

fun <T : Parcelable> Activity?.bundleParcelableArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<T> = arrayListOf()
): ArrayList<T> = bundleExpand.getParcelableArrayListOrDefault(key, defaultValue)

fun <T : Parcelable> Activity?.bundleSparseParcelableArrayOrDefault(
    key: String,
    defaultValue: SparseArray<T> = sparseArrayOf()
): SparseArray<T> = bundleExpand.getSparseParcelableArrayOrDefault(key, defaultValue)

fun Activity?.bundleBundleOrDefault(
    key: String,
    defaultValue: Bundle = Bundle.EMPTY
): Bundle = bundleExpand.getBundleOrDefault(key, defaultValue)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Activity?.bundleSizeOrDefault(
    key: String,
    defaultValue: Size = Size(0, 0)
): Size = bundleExpand.getSizeOrDefault(key, defaultValue)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Activity?.bundleSizeFOrDefault(
    key: String,
    defaultValue: SizeF = SizeF(0.toFloat(), 0.toFloat())
): SizeF = bundleExpand.getSizeFOrDefault(key, defaultValue)

fun Activity?.bundleIntArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<Int> = arrayListOf()
): ArrayList<Int> = bundleExpand.getIntArrayListOrDefault(key, defaultValue)

fun Activity?.bundleStringArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<String> = arrayListOf()
): ArrayList<String> = bundleExpand.getStringArrayListOrDefault(key, defaultValue)

fun Activity?.bundleCharSequenceArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<CharSequence> = arrayListOf()
): ArrayList<CharSequence> = bundleExpand.getCharSequenceArrayListOrDefault(key, defaultValue)

fun Activity?.bundleSerializableOrDefault(
    key: String,
    defaultValue: Serializable = bundleExpand?.getSerializable(key)!!
): Serializable = bundleExpand.getSerializableOrDefault(key, defaultValue)

fun Activity?.bundleBooleanArrayOrDefault(
    key: String,
    defaultValue: BooleanArray = booleanArrayOf()
): BooleanArray = bundleExpand.getBooleanArrayOrDefault(key, defaultValue)

fun Activity?.bundleByteArrayOrDefault(
    key: String,
    defaultValue: ByteArray = byteArrayOf()
): ByteArray = bundleExpand.getByteArrayOrDefault(key, defaultValue)

fun Activity?.bundleShortArrayOrDefault(
    key: String,
    defaultValue: ShortArray = shortArrayOf()
): ShortArray = bundleExpand.getShortArrayOrDefault(key, defaultValue)

fun Activity?.bundleCharArrayOrDefault(
    key: String,
    defaultValue: CharArray = charArrayOf()
): CharArray = bundleExpand.getCharArrayOrDefault(key, defaultValue)

fun Activity?.bundleIntArrayOrDefault(
    key: String,
    defaultValue: IntArray = intArrayOf()
): IntArray = bundleExpand.getIntArrayOrDefault(key, defaultValue)

fun Activity?.bundleLongArrayOrDefault(
    key: String,
    defaultValue: LongArray = longArrayOf()
): LongArray = bundleExpand.getLongArrayOrDefault(key, defaultValue)

fun Activity?.bundleFloatArrayOrDefault(
    key: String,
    defaultValue: FloatArray = floatArrayOf()
): FloatArray = bundleExpand.getFloatArrayOrDefault(key, defaultValue)

fun Activity?.bundleDoubleArrayOrDefault(
    key: String,
    defaultValue: DoubleArray = doubleArrayOf()
): DoubleArray = bundleExpand.getDoubleArrayOrDefault(key, defaultValue)

fun Activity?.bundleStringArrayOrDefault(
    key: String,
    defaultValue: Array<String> = emptyArray()
): Array<String> = bundleExpand.getStringArrayOrDefault(key, defaultValue)

fun Activity?.bundleCharSequenceArrayOrDefault(
    key: String,
    defaultValue: Array<CharSequence> = emptyArray()
): Array<CharSequence> = bundleExpand.getCharSequenceArrayOrDefault(key, defaultValue)

//ifNone
fun Activity?.bundleAnyOrDefault(key: String, ifNone: () -> Any): Any =
    bundleExpand.getOrDefault(key, ifNone)

fun Activity?.bundleBooleanOrDefault(key: String, ifNone: () -> Boolean): Boolean =
    bundleExpand.getBooleanOrDefault(key, ifNone)

fun Activity?.bundleByteOrDefault(key: String, ifNone: () -> Byte): Byte =
    bundleExpand.getByteOrDefault(key, ifNone)

fun Activity?.bundleCharOrDefault(key: String, ifNone: () -> Char): Char =
    bundleExpand.getCharOrDefault(key, ifNone)

fun Activity?.bundleShortOrDefault(key: String, ifNone: () -> Short): Short =
    bundleExpand.getShortOrDefault(key, ifNone)

fun Activity?.bundleIntOrDefault(key: String, ifNone: () -> Int): Int =
    bundleExpand.getIntOrDefault(key, ifNone)

fun Activity?.bundleLongOrDefault(key: String, ifNone: () -> Long): Long =
    bundleExpand.getLongOrDefault(key, ifNone)

fun Activity?.bundleFloatOrDefault(key: String, ifNone: () -> Float): Float =
    bundleExpand.getFloatOrDefault(key, ifNone)

fun Activity?.bundleDoubleOrDefault(key: String, ifNone: () -> Double): Double =
    bundleExpand.getDoubleOrDefault(key, ifNone)

fun Activity?.bundleStringOrDefault(key: String, ifNone: () -> String): String =
    bundleExpand.getStringOrDefault(key, ifNone)

fun Activity?.bundleCharSequenceOrDefault(key: String, ifNone: () -> CharSequence): CharSequence =
    bundleExpand.getCharSequenceOrDefault(key, ifNone)

fun <T : Parcelable> Activity?.bundleParcelableOrDefault(
    key: String,
    ifNone: () -> T
): T = bundleExpand.getParcelableOrDefault(key, ifNone)

fun <T : Parcelable> Activity?.bundleParcelableArrayOrDefault(
    key: String,
    ifNone: () -> Array<T>
): Array<T> = bundleExpand.getParcelableArrayOrDefault(key, ifNone)

fun <T : Parcelable> Activity?.bundleParcelableArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<T>
): ArrayList<T> = bundleExpand.getParcelableArrayListOrDefault(key, ifNone)

fun <T : Parcelable> Activity?.bundleSparseParcelableArrayOrDefault(
    key: String,
    ifNone: () -> SparseArray<T>
): SparseArray<T> = bundleExpand.getSparseParcelableArrayOrDefault(key, ifNone)

fun Activity?.bundleBundleOrDefault(key: String, ifNone: () -> Bundle): Bundle =
    bundleExpand.getBundleOrDefault(key, ifNone)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Activity?.bundleSizeOrDefault(key: String, ifNone: () -> Size): Size =
    bundleExpand.getSizeOrDefault(key, ifNone)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Activity?.bundleSizeFOrDefault(key: String, ifNone: () -> SizeF): SizeF =
    bundleExpand.getSizeFOrDefault(key, ifNone)

fun Activity?.bundleIntArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<Int>
): ArrayList<Int> =
    bundleExpand.getIntArrayListOrDefault(key, ifNone)

fun Activity?.bundleStringArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<String>
): ArrayList<String> = bundleExpand.getStringArrayListOrDefault(key, ifNone)

fun Activity?.bundleCharSequenceArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<CharSequence>
): ArrayList<CharSequence> = bundleExpand.getCharSequenceArrayListOrDefault(key, ifNone)

fun Activity?.bundleSerializableOrDefault(key: String, ifNone: () -> Serializable): Serializable =
    bundleExpand.getSerializableOrDefault(key, ifNone)

fun Activity?.bundleBooleanArrayOrDefault(key: String, ifNone: () -> BooleanArray): BooleanArray =
    bundleExpand.getBooleanArrayOrDefault(key, ifNone)

fun Activity?.bundleByteArrayOrDefault(key: String, ifNone: () -> ByteArray): ByteArray =
    bundleExpand.getByteArrayOrDefault(key, ifNone)

fun Activity?.bundleShortArrayOrDefault(key: String, ifNone: () -> ShortArray): ShortArray =
    bundleExpand.getShortArrayOrDefault(key, ifNone)

fun Activity?.bundleCharArrayOrDefault(key: String, ifNone: () -> CharArray): CharArray =
    bundleExpand.getCharArrayOrDefault(key, ifNone)

fun Activity?.bundleIntArrayOrDefault(key: String, ifNone: () -> IntArray): IntArray =
    bundleExpand.getIntArrayOrDefault(key, ifNone)

fun Activity?.bundleLongArrayOrDefault(key: String, ifNone: () -> LongArray): LongArray =
    bundleExpand.getLongArrayOrDefault(key, ifNone)

fun Activity?.bundleFloatArrayOrDefault(key: String, ifNone: () -> FloatArray): FloatArray =
    bundleExpand.getFloatArrayOrDefault(key, ifNone)

fun Activity?.bundleDoubleArrayOrDefault(key: String, ifNone: () -> DoubleArray): DoubleArray =
    bundleExpand.getDoubleArrayOrDefault(key, ifNone)

fun Activity?.bundleStringArrayOrDefault(key: String, ifNone: () -> Array<String>): Array<String> =
    bundleExpand.getStringArrayOrDefault(key, ifNone)

fun Activity?.bundleCharSequenceArrayOrDefault(
    key: String,
    ifNone: () -> Array<CharSequence>
): Array<CharSequence> = bundleExpand.getCharSequenceArrayOrDefault(key, ifNone)
