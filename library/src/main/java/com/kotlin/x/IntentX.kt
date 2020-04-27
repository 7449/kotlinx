@file:JvmName("IntentUtils")

package com.kotlin.x

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import java.io.Serializable

fun Intent?.orEmptyExpand(): Intent = this ?: Intent()

fun Intent?.getBooleanExpand(key: String): Boolean =
    getBooleanOrDefault(key, false)

fun Intent?.getByteExpand(key: String): Byte =
    getByteOrDefault(key, 0)

fun Intent?.getCharExpand(key: String): Char =
    getCharOrDefault(key, 'a')

fun Intent?.getShortExpand(key: String): Short =
    getShortOrDefault(key, 0)

fun Intent?.getIntExpand(key: String): Int =
    getIntOrDefault(key, 0)

fun Intent?.getLongExpand(key: String): Long =
    getLongOrDefault(key, 0)

fun Intent?.getFloatExpand(key: String): Float =
    getFloatOrDefault(key, 0F)

fun Intent?.getDoubleExpand(key: String): Double =
    getDoubleOrDefault(key, 0.0)

fun Intent?.getStringExpand(key: String): String =
    getStringOrDefault(key, "")

fun Intent?.getCharSequenceExpand(key: String): CharSequence =
    getCharSequenceOrDefault(key, "")

fun Intent?.getIntArrayListExpand(key: String): ArrayList<Int> =
    getIntArrayListOrDefault(key, ArrayList())

fun Intent?.getStringArrayListExpand(key: String): ArrayList<String> =
    getStringArrayListOrDefault(key, ArrayList())

fun Intent?.getCharSequenceArrayListExpand(key: String): ArrayList<CharSequence> =
    getCharSequenceArrayListOrDefault(key, ArrayList())

fun Intent?.getBooleanArrayExpand(key: String): BooleanArray =
    getBooleanArrayOrDefault(key, booleanArrayOf())

fun Intent?.getByteArrayExpand(key: String): ByteArray =
    getByteArrayOrDefault(key, byteArrayOf())

fun Intent?.getShortArrayExpand(key: String): ShortArray =
    getShortArrayOrDefault(key, shortArrayOf())

fun Intent?.getCharArrayExpand(key: String): CharArray =
    getCharArrayOrDefault(key, charArrayOf())

fun Intent?.getIntArrayExpand(key: String): IntArray =
    getIntArrayOrDefault(key, intArrayOf())

fun Intent?.getLongArrayExpand(key: String): LongArray =
    getLongArrayOrDefault(key, longArrayOf())

fun Intent?.getFloatArrayExpand(key: String): FloatArray =
    getFloatArrayOrDefault(key, floatArrayOf())

fun Intent?.getDoubleArrayExpand(key: String): DoubleArray =
    getDoubleArrayOrDefault(key, doubleArrayOf())

fun Intent?.getStringArrayExpand(key: String): Array<String> =
    getStringArrayOrDefault(key, arrayOf())

fun Intent?.getCharSequenceArrayExpand(key: String): Array<CharSequence> =
    getCharSequenceArrayOrDefault(key, arrayOf())

inline fun <reified T : Parcelable> Intent?.getParcelableArrayExpand(key: String): Array<in T> =
    getParcelableArrayOrDefault(key, arrayOf())

fun <T : Parcelable> Intent?.getParcelableArrayListExpand(key: String): ArrayList<T> =
    getParcelableArrayListOrDefault(key, ArrayList())

fun Intent?.getBooleanOrDefault(key: String, defaultValue: Boolean): Boolean =
    getBooleanOrDefault(key) { defaultValue }

fun Intent?.getByteOrDefault(key: String, defaultValue: Byte): Byte =
    getByteOrDefault(key) { defaultValue }

fun Intent?.getShortOrDefault(key: String, defaultValue: Short): Short =
    getShortOrDefault(key) { defaultValue }

fun Intent?.getCharOrDefault(key: String, defaultValue: Char): Char =
    getCharOrDefault(key) { defaultValue }

fun Intent?.getIntOrDefault(key: String, defaultValue: Int): Int =
    getIntOrDefault(key) { defaultValue }

fun Intent?.getLongOrDefault(key: String, defaultValue: Long): Long =
    getLongOrDefault(key) { defaultValue }

fun Intent?.getFloatOrDefault(key: String, defaultValue: Float): Float =
    getFloatOrDefault(key) { defaultValue }

fun Intent?.getDoubleOrDefault(key: String, defaultValue: Double): Double =
    getDoubleOrDefault(key) { defaultValue }

fun Intent?.getStringOrDefault(key: String, defaultValue: String): String =
    getStringOrDefault(key) { defaultValue }

fun Intent?.getCharSequenceOrDefault(key: String, defaultValue: CharSequence): CharSequence =
    getCharSequenceOrDefault(key) { defaultValue }

fun <T : Parcelable> Intent?.getParcelableOrDefault(key: String, defaultValue: Parcelable): T =
    getParcelableOrDefault(key) {
        @Suppress("UNCHECKED_CAST")
        defaultValue as T
    }

fun <T : Parcelable> Intent?.getParcelableArrayOrDefault(
    key: String,
    defaultValue: Array<in T>
): Array<in T> = getParcelableArrayOrDefault(key) { defaultValue }

fun <T : Parcelable> Intent?.getParcelableArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<T>
): ArrayList<T> = getParcelableArrayListOrDefault(key) { defaultValue }

fun Intent?.getSerializableOrDefault(key: String, defaultValue: Serializable): Serializable =
    getSerializableOrDefault(key) { defaultValue }

fun Intent?.getIntArrayListOrDefault(key: String, defaultValue: ArrayList<Int>): ArrayList<Int> =
    getIntArrayListOrDefault(key) { defaultValue }

fun Intent?.getStringArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<String>
): ArrayList<String> = getStringArrayListOrDefault(key) { defaultValue }

fun Intent?.getCharSequenceArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<CharSequence>
): ArrayList<CharSequence> = getCharSequenceArrayListOrDefault(key) { defaultValue }

fun Intent?.getBooleanArrayOrDefault(key: String, defaultValue: BooleanArray): BooleanArray =
    getBooleanArrayOrDefault(key) { defaultValue }

fun Intent?.getByteArrayOrDefault(key: String, defaultValue: ByteArray): ByteArray =
    getByteArrayOrDefault(key) { defaultValue }

fun Intent?.getShortArrayOrDefault(key: String, defaultValue: ShortArray): ShortArray =
    getShortArrayOrDefault(key) { defaultValue }

fun Intent?.getCharArrayOrDefault(key: String, defaultValue: CharArray): CharArray =
    getCharArrayOrDefault(key) { defaultValue }

fun Intent?.getIntArrayOrDefault(key: String, defaultValue: IntArray): IntArray =
    getIntArrayOrDefault(key) { defaultValue }

fun Intent?.getLongArrayOrDefault(key: String, defaultValue: LongArray): LongArray =
    getLongArrayOrDefault(key) { defaultValue }

fun Intent?.getFloatArrayOrDefault(key: String, defaultValue: FloatArray): FloatArray =
    getFloatArrayOrDefault(key) { defaultValue }

fun Intent?.getDoubleArrayOrDefault(key: String, defaultValue: DoubleArray): DoubleArray =
    getDoubleArrayOrDefault(key) { defaultValue }

fun Intent?.getStringArrayOrDefault(key: String, defaultValue: Array<String>): Array<String> =
    getStringArrayOrDefault(key) { defaultValue }

fun Intent?.getCharSequenceArrayOrDefault(
    key: String,
    defaultValue: Array<CharSequence>
): Array<CharSequence> = getCharSequenceArrayOrDefault(key) { defaultValue }

fun Intent?.getBundleOrDefault(key: String, defaultValue: Bundle): Bundle =
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
    ifNone: () -> Array<in T>
): Array<in T> = this?.getParcelableArrayExtra(key) ?: ifNone.invoke()

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