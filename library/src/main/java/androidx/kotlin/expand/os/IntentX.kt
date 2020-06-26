@file:JvmName("IntentUtils")
@file:Suppress("UNCHECKED_CAST")

package androidx.kotlin.expand.os

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import java.io.Serializable

@JvmName("getOrEmpty")
@Version([VersionLog(Version.BANANA)])
fun Intent?.orEmptyExpand(): Intent = this ?: Intent()

@JvmName("getBoolean")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getBooleanExpand(key: String): Boolean =
    getBooleanOrDefault(key)

@JvmName("getByte")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getByteExpand(key: String): Byte =
    getByteOrDefault(key)

@JvmName("getChar")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getCharExpand(key: String): Char =
    getCharOrDefault(key)

@JvmName("getShort")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getShortExpand(key: String): Short =
    getShortOrDefault(key)

@JvmName("getInt")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getIntExpand(key: String): Int =
    getIntOrDefault(key)

@JvmName("getLong")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getLongExpand(key: String): Long =
    getLongOrDefault(key)

@JvmName("getFloat")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getFloatExpand(key: String): Float =
    getFloatOrDefault(key)

@JvmName("getDouble")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getDoubleExpand(key: String): Double =
    getDoubleOrDefault(key)

@JvmName("getString")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getStringExpand(key: String): String =
    getStringOrDefault(key)

@JvmName("getCharSequence")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getCharSequenceExpand(key: String): CharSequence =
    getCharSequenceOrDefault(key)

@JvmName("getIntArrayList")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getIntArrayListExpand(key: String): ArrayList<Int> =
    getIntArrayListOrDefault(key)

@JvmName("getStringArrayList")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getStringArrayListExpand(key: String): ArrayList<String> =
    getStringArrayListOrDefault(key)

@JvmName("getCharSequenceArrayList")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getCharSequenceArrayListExpand(key: String): ArrayList<CharSequence> =
    getCharSequenceArrayListOrDefault(key)

@JvmName("getBooleanArray")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getBooleanArrayExpand(key: String): BooleanArray =
    getBooleanArrayOrDefault(key)

@JvmName("getByteArray")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getByteArrayExpand(key: String): ByteArray =
    getByteArrayOrDefault(key)

@JvmName("getShortArray")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getShortArrayExpand(key: String): ShortArray =
    getShortArrayOrDefault(key)

@JvmName("getCharArray")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getCharArrayExpand(key: String): CharArray =
    getCharArrayOrDefault(key)

@JvmName("getIntArray")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getIntArrayExpand(key: String): IntArray =
    getIntArrayOrDefault(key)

@JvmName("getLongArray")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getLongArrayExpand(key: String): LongArray =
    getLongArrayOrDefault(key)

@JvmName("getFloatArray")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getFloatArrayExpand(key: String): FloatArray =
    getFloatArrayOrDefault(key)

@JvmName("getDoubleArray")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getDoubleArrayExpand(key: String): DoubleArray =
    getDoubleArrayOrDefault(key)

@JvmName("getStringArray")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getStringArrayExpand(key: String): Array<String> =
    getStringArrayOrDefault(key)

@JvmName("getCharSequenceArray")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getCharSequenceArrayExpand(key: String): Array<CharSequence> =
    getCharSequenceArrayOrDefault(key)

@JvmName("getParcelable")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Intent?.getParcelableExpand(key: String): T =
    getParcelableOrDefault(key)

@JvmName("getParcelableArray")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Intent?.getParcelableArrayExpand(key: String): Array<T> =
    getParcelableArrayOrDefault(key)

@JvmName("getParcelableArrayList")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Intent?.getParcelableArrayListExpand(key: String): ArrayList<T> =
    getParcelableArrayListOrDefault(key)

@JvmName("getSerializable")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getSerializableExpand(key: String): Serializable =
    getSerializableOrDefault(key)

@JvmName("getBundle")
@Version([VersionLog(Version.BANANA)])
fun Intent?.getBundleExpand(key: String): Bundle =
    getBundleOrDefault(key)

@Version([VersionLog(Version.BANANA)])
fun Intent?.getBooleanOrDefault(key: String, defaultValue: Boolean = false): Boolean =
    getBooleanOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getByteOrDefault(key: String, defaultValue: Byte = 0.toByte()): Byte =
    getByteOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getShortOrDefault(key: String, defaultValue: Short = 0.toShort()): Short =
    getShortOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getCharOrDefault(key: String, defaultValue: Char = 0.toChar()): Char =
    getCharOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getIntOrDefault(key: String, defaultValue: Int = 0): Int =
    getIntOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getLongOrDefault(key: String, defaultValue: Long = 0.toLong()): Long =
    getLongOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getFloatOrDefault(key: String, defaultValue: Float = 0.toFloat()): Float =
    getFloatOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getDoubleOrDefault(key: String, defaultValue: Double = 0.toDouble()): Double =
    getDoubleOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getStringOrDefault(key: String, defaultValue: String = ""): String =
    getStringOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getCharSequenceOrDefault(key: String, defaultValue: CharSequence = ""): CharSequence =
    getCharSequenceOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Intent?.getParcelableOrDefault(
    key: String,
    defaultValue: Parcelable = this?.getParcelableExtra<T>(key)!!
): T = getParcelableOrDefault(key) { defaultValue as T }

@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Intent?.getParcelableArrayOrDefault(
    key: String,
    defaultValue: Array<Parcelable> = emptyArray()
): Array<T> = getParcelableArrayOrDefault(key) { defaultValue as Array<T> }

@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Intent?.getParcelableArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<T> = arrayListOf()
): ArrayList<T> = getParcelableArrayListOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getSerializableOrDefault(
    key: String,
    defaultValue: Serializable = this?.getSerializableExtra(key)!!
): Serializable = getSerializableOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getIntArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<Int> = arrayListOf()
): ArrayList<Int> = getIntArrayListOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getStringArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<String> = arrayListOf()
): ArrayList<String> = getStringArrayListOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getCharSequenceArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<CharSequence> = arrayListOf()
): ArrayList<CharSequence> = getCharSequenceArrayListOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getBooleanArrayOrDefault(
    key: String,
    defaultValue: BooleanArray = booleanArrayOf()
): BooleanArray = getBooleanArrayOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getByteArrayOrDefault(
    key: String,
    defaultValue: ByteArray = byteArrayOf()
): ByteArray = getByteArrayOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getShortArrayOrDefault(
    key: String,
    defaultValue: ShortArray = shortArrayOf()
): ShortArray = getShortArrayOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getCharArrayOrDefault(
    key: String,
    defaultValue: CharArray = charArrayOf()
): CharArray = getCharArrayOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getIntArrayOrDefault(
    key: String,
    defaultValue: IntArray = intArrayOf()
): IntArray = getIntArrayOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getLongArrayOrDefault(
    key: String,
    defaultValue: LongArray = longArrayOf()
): LongArray = getLongArrayOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getFloatArrayOrDefault(
    key: String,
    defaultValue: FloatArray = floatArrayOf()
): FloatArray = getFloatArrayOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getDoubleArrayOrDefault(
    key: String,
    defaultValue: DoubleArray = doubleArrayOf()
): DoubleArray = getDoubleArrayOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getStringArrayOrDefault(
    key: String,
    defaultValue: Array<String> = emptyArray()
): Array<String> = getStringArrayOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getCharSequenceArrayOrDefault(
    key: String,
    defaultValue: Array<CharSequence> = emptyArray()
): Array<CharSequence> = getCharSequenceArrayOrDefault(key) { defaultValue }

@Version([VersionLog(Version.BANANA)])
fun Intent?.getBundleOrDefault(key: String, defaultValue: Bundle = Bundle.EMPTY): Bundle =
    getBundleOrDefault(key) { defaultValue }

//ifNone
@Version([VersionLog(Version.BANANA)])
fun Intent?.getBooleanOrDefault(key: String, ifNone: () -> Boolean): Boolean =
    this?.getBooleanExtra(key, ifNone.invoke()) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getByteOrDefault(key: String, ifNone: () -> Byte): Byte =
    this?.getByteExtra(key, ifNone.invoke()) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getShortOrDefault(key: String, ifNone: () -> Short): Short =
    this?.getShortExtra(key, ifNone.invoke()) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getCharOrDefault(key: String, ifNone: () -> Char): Char =
    this?.getCharExtra(key, ifNone.invoke()) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getIntOrDefault(key: String, ifNone: () -> Int): Int =
    this?.getIntExtra(key, ifNone.invoke()) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getLongOrDefault(key: String, ifNone: () -> Long): Long =
    this?.getLongExtra(key, ifNone.invoke()) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getFloatOrDefault(key: String, ifNone: () -> Float): Float =
    this?.getFloatExtra(key, ifNone.invoke()) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getDoubleOrDefault(key: String, ifNone: () -> Double): Double =
    this?.getDoubleExtra(key, ifNone.invoke()) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getStringOrDefault(key: String, ifNone: () -> String): String =
    this?.getStringExtra(key) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getCharSequenceOrDefault(key: String, ifNone: () -> CharSequence): CharSequence =
    this?.getCharSequenceExtra(key) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Intent?.getParcelableOrDefault(key: String, ifNone: () -> T): T =
    this?.getParcelableExtra(key) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Intent?.getParcelableArrayOrDefault(
    key: String,
    ifNone: () -> Array<T>
): Array<T> = this?.getParcelableArrayExtra(key) as? Array<T> ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Intent?.getParcelableArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<T>
): ArrayList<T> = this?.getParcelableArrayListExtra(key) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getSerializableOrDefault(key: String, ifNone: () -> Serializable): Serializable =
    this?.getSerializableExtra(key) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getIntArrayListOrDefault(key: String, ifNone: () -> ArrayList<Int>): ArrayList<Int> =
    this?.getIntegerArrayListExtra(key) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getStringArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<String>
): ArrayList<String> = this?.getStringArrayListExtra(key) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getCharSequenceArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<CharSequence>
): ArrayList<CharSequence> = this?.getCharSequenceArrayListExtra(key) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getBooleanArrayOrDefault(key: String, ifNone: () -> BooleanArray): BooleanArray =
    this?.getBooleanArrayExtra(key) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getByteArrayOrDefault(key: String, ifNone: () -> ByteArray): ByteArray =
    this?.getByteArrayExtra(key) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getShortArrayOrDefault(key: String, ifNone: () -> ShortArray): ShortArray =
    this?.getShortArrayExtra(key) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getCharArrayOrDefault(key: String, ifNone: () -> CharArray): CharArray =
    this?.getCharArrayExtra(key) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getIntArrayOrDefault(key: String, ifNone: () -> IntArray): IntArray =
    this?.getIntArrayExtra(key) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getLongArrayOrDefault(key: String, ifNone: () -> LongArray): LongArray =
    this?.getLongArrayExtra(key) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getFloatArrayOrDefault(key: String, ifNone: () -> FloatArray): FloatArray =
    this?.getFloatArrayExtra(key) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getDoubleArrayOrDefault(key: String, ifNone: () -> DoubleArray): DoubleArray =
    this?.getDoubleArrayExtra(key) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getStringArrayOrDefault(key: String, ifNone: () -> Array<String>): Array<String> =
    this?.getStringArrayExtra(key) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getCharSequenceArrayOrDefault(
    key: String,
    ifNone: () -> Array<CharSequence>
): Array<CharSequence> = this?.getCharSequenceArrayExtra(key) ?: ifNone.invoke()

@Version([VersionLog(Version.BANANA)])
fun Intent?.getBundleOrDefault(key: String, ifNone: () -> Bundle): Bundle =
    this?.getBundleExtra(key) ?: ifNone.invoke()