@file:JvmName("IntentUtils")
@file:Suppress("UNCHECKED_CAST")

package androidx.kotlin.expand

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import java.io.Serializable

@JvmName("getOrEmpty")
fun Intent?.orEmptyExpand(): Intent = this ?: Intent()

@JvmName("getBoolean")
fun Intent?.getBooleanExpand(key: String): Boolean =
    getBooleanOrDefault(key)

@JvmName("getByte")
fun Intent?.getByteExpand(key: String): Byte =
    getByteOrDefault(key)

@JvmName("getChar")
fun Intent?.getCharExpand(key: String): Char =
    getCharOrDefault(key)

@JvmName("getShort")
fun Intent?.getShortExpand(key: String): Short =
    getShortOrDefault(key)

@JvmName("getInt")
fun Intent?.getIntExpand(key: String): Int =
    getIntOrDefault(key)

@JvmName("getLong")
fun Intent?.getLongExpand(key: String): Long =
    getLongOrDefault(key)

@JvmName("getFloat")
fun Intent?.getFloatExpand(key: String): Float =
    getFloatOrDefault(key)

@JvmName("getDouble")
fun Intent?.getDoubleExpand(key: String): Double =
    getDoubleOrDefault(key)

@JvmName("getString")
fun Intent?.getStringExpand(key: String): String =
    getStringOrDefault(key)

@JvmName("getCharSequence")
fun Intent?.getCharSequenceExpand(key: String): CharSequence =
    getCharSequenceOrDefault(key)

@JvmName("getIntArrayList")
fun Intent?.getIntArrayListExpand(key: String): ArrayList<Int> =
    getIntArrayListOrDefault(key)

@JvmName("getStringArrayList")
fun Intent?.getStringArrayListExpand(key: String): ArrayList<String> =
    getStringArrayListOrDefault(key)

@JvmName("getCharSequenceArrayList")
fun Intent?.getCharSequenceArrayListExpand(key: String): ArrayList<CharSequence> =
    getCharSequenceArrayListOrDefault(key)

@JvmName("getBooleanArray")
fun Intent?.getBooleanArrayExpand(key: String): BooleanArray =
    getBooleanArrayOrDefault(key)

@JvmName("getByteArray")
fun Intent?.getByteArrayExpand(key: String): ByteArray =
    getByteArrayOrDefault(key)

@JvmName("getShortArray")
fun Intent?.getShortArrayExpand(key: String): ShortArray =
    getShortArrayOrDefault(key)

@JvmName("getCharArray")
fun Intent?.getCharArrayExpand(key: String): CharArray =
    getCharArrayOrDefault(key)

@JvmName("getIntArray")
fun Intent?.getIntArrayExpand(key: String): IntArray =
    getIntArrayOrDefault(key)

@JvmName("getLongArray")
fun Intent?.getLongArrayExpand(key: String): LongArray =
    getLongArrayOrDefault(key)

@JvmName("getFloatArray")
fun Intent?.getFloatArrayExpand(key: String): FloatArray =
    getFloatArrayOrDefault(key)

@JvmName("getDoubleArray")
fun Intent?.getDoubleArrayExpand(key: String): DoubleArray =
    getDoubleArrayOrDefault(key)

@JvmName("getStringArray")
fun Intent?.getStringArrayExpand(key: String): Array<String> =
    getStringArrayOrDefault(key)

@JvmName("getCharSequenceArray")
fun Intent?.getCharSequenceArrayExpand(key: String): Array<CharSequence> =
    getCharSequenceArrayOrDefault(key)

@JvmName("getParcelable")
fun <T : Parcelable> Intent?.getParcelableExpand(key: String): T =
    getParcelableOrDefault(key)

@JvmName("getParcelableArray")
fun <T : Parcelable> Intent?.getParcelableArrayExpand(key: String): Array<T> =
    getParcelableArrayOrDefault(key)

@JvmName("getParcelableArrayList")
fun <T : Parcelable> Intent?.getParcelableArrayListExpand(key: String): ArrayList<T> =
    getParcelableArrayListOrDefault(key)

@JvmName("getSerializable")
fun Intent?.getSerializableExpand(key: String): Serializable =
    getSerializableOrDefault(key)

@JvmName("getBundle")
fun Intent?.getBundleExpand(key: String): Bundle =
    getBundleOrDefault(key)

fun Intent?.getBooleanOrDefault(key: String, defaultValue: Boolean = false): Boolean =
    getBooleanOrDefault(key) { defaultValue }

fun Intent?.getByteOrDefault(key: String, defaultValue: Byte = 0.toByte()): Byte =
    getByteOrDefault(key) { defaultValue }

fun Intent?.getShortOrDefault(key: String, defaultValue: Short = 0.toShort()): Short =
    getShortOrDefault(key) { defaultValue }

fun Intent?.getCharOrDefault(key: String, defaultValue: Char = 0.toChar()): Char =
    getCharOrDefault(key) { defaultValue }

fun Intent?.getIntOrDefault(key: String, defaultValue: Int = 0): Int =
    getIntOrDefault(key) { defaultValue }

fun Intent?.getLongOrDefault(key: String, defaultValue: Long = 0.toLong()): Long =
    getLongOrDefault(key) { defaultValue }

fun Intent?.getFloatOrDefault(key: String, defaultValue: Float = 0.toFloat()): Float =
    getFloatOrDefault(key) { defaultValue }

fun Intent?.getDoubleOrDefault(key: String, defaultValue: Double = 0.toDouble()): Double =
    getDoubleOrDefault(key) { defaultValue }

fun Intent?.getStringOrDefault(key: String, defaultValue: String = ""): String =
    getStringOrDefault(key) { defaultValue }

fun Intent?.getCharSequenceOrDefault(key: String, defaultValue: CharSequence = ""): CharSequence =
    getCharSequenceOrDefault(key) { defaultValue }

fun <T : Parcelable> Intent?.getParcelableOrDefault(
    key: String,
    defaultValue: Parcelable = this?.getParcelableExtra<T>(key)!!
): T = getParcelableOrDefault(key) { defaultValue as T }

fun <T : Parcelable> Intent?.getParcelableArrayOrDefault(
    key: String,
    defaultValue: Array<Parcelable> = emptyArray()
): Array<T> = getParcelableArrayOrDefault(key) { defaultValue as Array<T> }

fun <T : Parcelable> Intent?.getParcelableArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<T> = arrayListOf()
): ArrayList<T> = getParcelableArrayListOrDefault(key) { defaultValue }

fun Intent?.getSerializableOrDefault(
    key: String,
    defaultValue: Serializable = this?.getSerializableExtra(key)!!
): Serializable = getSerializableOrDefault(key) { defaultValue }

fun Intent?.getIntArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<Int> = arrayListOf()
): ArrayList<Int> = getIntArrayListOrDefault(key) { defaultValue }

fun Intent?.getStringArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<String> = arrayListOf()
): ArrayList<String> = getStringArrayListOrDefault(key) { defaultValue }

fun Intent?.getCharSequenceArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<CharSequence> = arrayListOf()
): ArrayList<CharSequence> = getCharSequenceArrayListOrDefault(key) { defaultValue }

fun Intent?.getBooleanArrayOrDefault(
    key: String,
    defaultValue: BooleanArray = booleanArrayOf()
): BooleanArray = getBooleanArrayOrDefault(key) { defaultValue }

fun Intent?.getByteArrayOrDefault(
    key: String,
    defaultValue: ByteArray = byteArrayOf()
): ByteArray = getByteArrayOrDefault(key) { defaultValue }

fun Intent?.getShortArrayOrDefault(
    key: String,
    defaultValue: ShortArray = shortArrayOf()
): ShortArray = getShortArrayOrDefault(key) { defaultValue }

fun Intent?.getCharArrayOrDefault(
    key: String,
    defaultValue: CharArray = charArrayOf()
): CharArray = getCharArrayOrDefault(key) { defaultValue }

fun Intent?.getIntArrayOrDefault(
    key: String,
    defaultValue: IntArray = intArrayOf()
): IntArray = getIntArrayOrDefault(key) { defaultValue }

fun Intent?.getLongArrayOrDefault(
    key: String,
    defaultValue: LongArray = longArrayOf()
): LongArray = getLongArrayOrDefault(key) { defaultValue }

fun Intent?.getFloatArrayOrDefault(
    key: String,
    defaultValue: FloatArray = floatArrayOf()
): FloatArray = getFloatArrayOrDefault(key) { defaultValue }

fun Intent?.getDoubleArrayOrDefault(
    key: String,
    defaultValue: DoubleArray = doubleArrayOf()
): DoubleArray = getDoubleArrayOrDefault(key) { defaultValue }

fun Intent?.getStringArrayOrDefault(
    key: String,
    defaultValue: Array<String> = emptyArray()
): Array<String> = getStringArrayOrDefault(key) { defaultValue }

fun Intent?.getCharSequenceArrayOrDefault(
    key: String,
    defaultValue: Array<CharSequence> = emptyArray()
): Array<CharSequence> = getCharSequenceArrayOrDefault(key) { defaultValue }

fun Intent?.getBundleOrDefault(key: String, defaultValue: Bundle = Bundle.EMPTY): Bundle =
    getBundleOrDefault(key) { defaultValue }

//ifNone
fun Intent?.getBooleanOrDefault(key: String, ifNone: () -> Boolean): Boolean =
    this?.getBooleanExtra(key, ifNone.invoke()) ?: ifNone.invoke()

fun Intent?.getByteOrDefault(key: String, ifNone: () -> Byte): Byte =
    this?.getByteExtra(key, ifNone.invoke()) ?: ifNone.invoke()

fun Intent?.getShortOrDefault(key: String, ifNone: () -> Short): Short =
    this?.getShortExtra(key, ifNone.invoke()) ?: ifNone.invoke()

fun Intent?.getCharOrDefault(key: String, ifNone: () -> Char): Char =
    this?.getCharExtra(key, ifNone.invoke()) ?: ifNone.invoke()

fun Intent?.getIntOrDefault(key: String, ifNone: () -> Int): Int =
    this?.getIntExtra(key, ifNone.invoke()) ?: ifNone.invoke()

fun Intent?.getLongOrDefault(key: String, ifNone: () -> Long): Long =
    this?.getLongExtra(key, ifNone.invoke()) ?: ifNone.invoke()

fun Intent?.getFloatOrDefault(key: String, ifNone: () -> Float): Float =
    this?.getFloatExtra(key, ifNone.invoke()) ?: ifNone.invoke()

fun Intent?.getDoubleOrDefault(key: String, ifNone: () -> Double): Double =
    this?.getDoubleExtra(key, ifNone.invoke()) ?: ifNone.invoke()

fun Intent?.getStringOrDefault(key: String, ifNone: () -> String): String =
    this?.getStringExtra(key) ?: ifNone.invoke()

fun Intent?.getCharSequenceOrDefault(key: String, ifNone: () -> CharSequence): CharSequence =
    this?.getCharSequenceExtra(key) ?: ifNone.invoke()

fun <T : Parcelable> Intent?.getParcelableOrDefault(key: String, ifNone: () -> T): T =
    this?.getParcelableExtra(key) ?: ifNone.invoke()

fun <T : Parcelable> Intent?.getParcelableArrayOrDefault(
    key: String,
    ifNone: () -> Array<T>
): Array<T> = this?.getParcelableArrayExtra(key) as? Array<T> ?: ifNone.invoke()

fun <T : Parcelable> Intent?.getParcelableArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<T>
): ArrayList<T> = this?.getParcelableArrayListExtra(key) ?: ifNone.invoke()

fun Intent?.getSerializableOrDefault(key: String, ifNone: () -> Serializable): Serializable =
    this?.getSerializableExtra(key) ?: ifNone.invoke()

fun Intent?.getIntArrayListOrDefault(key: String, ifNone: () -> ArrayList<Int>): ArrayList<Int> =
    this?.getIntegerArrayListExtra(key) ?: ifNone.invoke()

fun Intent?.getStringArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<String>
): ArrayList<String> = this?.getStringArrayListExtra(key) ?: ifNone.invoke()

fun Intent?.getCharSequenceArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<CharSequence>
): ArrayList<CharSequence> = this?.getCharSequenceArrayListExtra(key) ?: ifNone.invoke()

fun Intent?.getBooleanArrayOrDefault(key: String, ifNone: () -> BooleanArray): BooleanArray =
    this?.getBooleanArrayExtra(key) ?: ifNone.invoke()

fun Intent?.getByteArrayOrDefault(key: String, ifNone: () -> ByteArray): ByteArray =
    this?.getByteArrayExtra(key) ?: ifNone.invoke()

fun Intent?.getShortArrayOrDefault(key: String, ifNone: () -> ShortArray): ShortArray =
    this?.getShortArrayExtra(key) ?: ifNone.invoke()

fun Intent?.getCharArrayOrDefault(key: String, ifNone: () -> CharArray): CharArray =
    this?.getCharArrayExtra(key) ?: ifNone.invoke()

fun Intent?.getIntArrayOrDefault(key: String, ifNone: () -> IntArray): IntArray =
    this?.getIntArrayExtra(key) ?: ifNone.invoke()

fun Intent?.getLongArrayOrDefault(key: String, ifNone: () -> LongArray): LongArray =
    this?.getLongArrayExtra(key) ?: ifNone.invoke()

fun Intent?.getFloatArrayOrDefault(key: String, ifNone: () -> FloatArray): FloatArray =
    this?.getFloatArrayExtra(key) ?: ifNone.invoke()

fun Intent?.getDoubleArrayOrDefault(key: String, ifNone: () -> DoubleArray): DoubleArray =
    this?.getDoubleArrayExtra(key) ?: ifNone.invoke()

fun Intent?.getStringArrayOrDefault(key: String, ifNone: () -> Array<String>): Array<String> =
    this?.getStringArrayExtra(key) ?: ifNone.invoke()

fun Intent?.getCharSequenceArrayOrDefault(
    key: String,
    ifNone: () -> Array<CharSequence>
): Array<CharSequence> = this?.getCharSequenceArrayExtra(key) ?: ifNone.invoke()

fun Intent?.getBundleOrDefault(key: String, ifNone: () -> Bundle): Bundle =
    this?.getBundleExtra(key) ?: ifNone.invoke()