@file:JvmName("ActivityExtraUtils")
@file:Suppress("UNCHECKED_CAST")

/**
 *
 * java
 *   ActivityExtraUtils.getXxx(key)
 *   ActivityExtraUtils.getXxxOrDefault(key,defaultValue)
 *   ActivityExtraUtils.getXxxOrDefault(key,new Function())
 *
 * kotlin
 *   Bundle.getXXXExpand(key) or Bundle.getXXXOrDefault(key,default) or Bundle.getXXXOrDefault(key){default}
 *
 */

package androidx.kotlin.expand.os

import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import android.util.Size
import android.util.SizeF
import android.util.SparseArray
import androidx.annotation.RequiresApi
import androidx.kotlin.expand.util.sparseArrayOf
import java.io.Serializable

val Activity?.intentExpand: Intent?
    get() = this?.intent

val Activity?.bundleExpand: Bundle?
    get() = this?.intent?.extras

// intent extras

@JvmName("getIntentOrEmpty")
fun Activity?.intentOrEmptyExpand(): Intent = intentExpand.orEmptyExpand()

@JvmName("getIntentBoolean")
fun Activity?.intentBooleanExpand(key: String): Boolean =
    intentExpand.getBooleanExpand(key)

@JvmName("getIntentByte")
fun Activity?.intentByteExpand(key: String): Byte =
    intentExpand.getByteExpand(key)

@JvmName("getIntentChar")
fun Activity?.intentCharExpand(key: String): Char =
    intentExpand.getCharExpand(key)

@JvmName("getIntentShort")
fun Activity?.intentShortExpand(key: String): Short =
    intentExpand.getShortExpand(key)

@JvmName("getIntentInt")
fun Activity?.intentIntExpand(key: String): Int =
    intentExpand.getIntExpand(key)

@JvmName("getIntentLong")
fun Activity?.intentLongExpand(key: String): Long =
    intentExpand.getLongExpand(key)

@JvmName("getIntentFloat")
fun Activity?.intentFloatExpand(key: String): Float =
    intentExpand.getFloatExpand(key)

@JvmName("getIntentDouble")
fun Activity?.intentDoubleExpand(key: String): Double =
    intentExpand.getDoubleExpand(key)

@JvmName("getIntentString")
fun Activity?.intentStringExpand(key: String): String =
    intentExpand.getStringExpand(key)

@JvmName("getIntentCharSequence")
fun Activity?.intentCharSequenceExpand(key: String): CharSequence =
    intentExpand.getCharSequenceExpand(key)

@JvmName("getIntentIntArrayList")
fun Activity?.intentIntArrayListExpand(key: String): ArrayList<Int> =
    intentExpand.getIntArrayListExpand(key)

@JvmName("getIntentStringArrayList")
fun Activity?.intentStringArrayListExpand(key: String): ArrayList<String> =
    intentExpand.getStringArrayListExpand(key)

@JvmName("getIntentCharSequenceArrayList")
fun Activity?.intentCharSequenceArrayListExpand(key: String): ArrayList<CharSequence> =
    intentExpand.getCharSequenceArrayListExpand(key)

@JvmName("getIntentBooleanArray")
fun Activity?.intentBooleanArrayExpand(key: String): BooleanArray =
    intentExpand.getBooleanArrayExpand(key)

@JvmName("getIntentByteArray")
fun Activity?.intentByteArrayExpand(key: String): ByteArray =
    intentExpand.getByteArrayExpand(key)

@JvmName("getIntentShortArray")
fun Activity?.intentShortArrayExpand(key: String): ShortArray =
    intentExpand.getShortArrayExpand(key)

@JvmName("getIntentCharArray")
fun Activity?.intentCharArrayExpand(key: String): CharArray =
    intentExpand.getCharArrayExpand(key)

@JvmName("getIntentIntArray")
fun Activity?.intentIntArrayExpand(key: String): IntArray =
    intentExpand.getIntArrayExpand(key)

@JvmName("getIntentLongArray")
fun Activity?.intentLongArrayExpand(key: String): LongArray =
    intentExpand.getLongArrayExpand(key)

@JvmName("getIntentFloatArray")
fun Activity?.intentFloatArrayExpand(key: String): FloatArray =
    intentExpand.getFloatArrayExpand(key)

@JvmName("getIntentDoubleArray")
fun Activity?.intentDoubleArrayExpand(key: String): DoubleArray =
    intentExpand.getDoubleArrayExpand(key)

@JvmName("getIntentStringArray")
fun Activity?.intentStringArrayExpand(key: String): Array<String> =
    intentExpand.getStringArrayExpand(key)

@JvmName("getIntentCharSequenceArray")
fun Activity?.intentCharSequenceArrayExpand(key: String): Array<CharSequence> =
    intentExpand.getCharSequenceArrayExpand(key)

@JvmName("getIntentParcelable")
fun <T : Parcelable> Activity?.intentParcelableExpand(key: String): T =
    intentExpand.getParcelableExpand(key)

@JvmName("getIntentParcelableArray")
fun <T : Parcelable> Activity?.intentParcelableArrayExpand(key: String): Array<T> =
    intentExpand.getParcelableArrayExpand(key)

@JvmName("getIntentParcelableArrayList")
fun <T : Parcelable> Activity?.intentParcelableArrayListExpand(key: String): ArrayList<T> =
    intentExpand.getParcelableArrayListExpand(key)

@JvmName("getIntentSerializable")
fun Activity?.intentSerializableExpand(key: String): Serializable =
    intentExpand.getSerializableExpand(key)

@JvmName("getIntentBundle")
fun Activity?.intentBundleExpand(key: String): Bundle =
    intentExpand.getBundleExpand(key)

@JvmName("getIntentBooleanOrDefault")
fun Activity?.intentBooleanOrDefault(key: String, defaultValue: Boolean = false): Boolean =
    intentExpand.getBooleanOrDefault(key, defaultValue)

@JvmName("getIntentByteOrDefault")
fun Activity?.intentByteOrDefault(key: String, defaultValue: Byte = 0.toByte()): Byte =
    intentExpand.getByteOrDefault(key, defaultValue)

@JvmName("getIntentShortOrDefault")
fun Activity?.intentShortOrDefault(key: String, defaultValue: Short = 0.toShort()): Short =
    intentExpand.getShortOrDefault(key, defaultValue)

@JvmName("getIntentCharOrDefault")
fun Activity?.intentCharOrDefault(key: String, defaultValue: Char = 0.toChar()): Char =
    intentExpand.getCharOrDefault(key, defaultValue)

@JvmName("getIntentIntOrDefault")
fun Activity?.intentIntOrDefault(key: String, defaultValue: Int = 0): Int =
    intentExpand.getIntOrDefault(key, defaultValue)

@JvmName("getIntentLongOrDefault")
fun Activity?.intentLongOrDefault(key: String, defaultValue: Long = 0.toLong()): Long =
    intentExpand.getLongOrDefault(key, defaultValue)

@JvmName("getIntentFloatOrDefault")
fun Activity?.intentFloatOrDefault(key: String, defaultValue: Float = 0.toFloat()): Float =
    intentExpand.getFloatOrDefault(key, defaultValue)

@JvmName("getIntentDoubleOrDefault")
fun Activity?.intentDoubleOrDefault(key: String, defaultValue: Double = 0.toDouble()): Double =
    intentExpand.getDoubleOrDefault(key, defaultValue)

@JvmName("getIntentStringOrDefault")
fun Activity?.intentStringOrDefault(key: String, defaultValue: String = ""): String =
    intentExpand.getStringOrDefault(key, defaultValue)

@JvmName("getIntentCharSequenceOrDefault")
fun Activity?.intentCharSequenceOrDefault(
    key: String,
    defaultValue: CharSequence = ""
): CharSequence = intentExpand.getCharSequenceOrDefault(key, defaultValue)

@JvmName("getIntentParcelableOrDefault")
fun <T : Parcelable> Activity?.intentParcelableOrDefault(
    key: String,
    defaultValue: Parcelable = intentExpand?.getParcelableExtra<T>(key)!!
): T = intentExpand.getParcelableOrDefault(key, defaultValue)

@JvmName("getIntentParcelableArrayOrDefault")
fun <T : Parcelable> Activity?.intentParcelableArrayOrDefault(
    key: String,
    defaultValue: Array<Parcelable> = emptyArray()
): Array<T> = intentExpand.getParcelableArrayOrDefault(key, defaultValue)

@JvmName("getIntentParcelableArrayListOrDefault")
fun <T : Parcelable> Activity?.intentParcelableArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<T> = arrayListOf()
): ArrayList<T> = intentExpand.getParcelableArrayListOrDefault(key, defaultValue)

@JvmName("getIntentSerializableOrDefault")
fun Activity?.intentSerializableOrDefault(
    key: String,
    defaultValue: Serializable = intentExpand?.getSerializableExtra(key)!!
): Serializable = intentExpand.getSerializableOrDefault(key, defaultValue)

@JvmName("getIntentIntArrayListOrDefault")
fun Activity?.intentIntArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<Int> = arrayListOf()
): ArrayList<Int> = intentExpand.getIntArrayListOrDefault(key, defaultValue)

@JvmName("getIntentStringArrayListOrDefault")
fun Activity?.intentStringArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<String> = arrayListOf()
): ArrayList<String> = intentExpand.getStringArrayListOrDefault(key, defaultValue)

@JvmName("getIntentCharSequenceArrayListOrDefault")
fun Activity?.intentCharSequenceArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<CharSequence> = arrayListOf()
): ArrayList<CharSequence> = intentExpand.getCharSequenceArrayListOrDefault(key, defaultValue)

@JvmName("getIntentBooleanArrayOrDefault")
fun Activity?.intentBooleanArrayOrDefault(
    key: String,
    defaultValue: BooleanArray = booleanArrayOf()
): BooleanArray = intentExpand.getBooleanArrayOrDefault(key, defaultValue)

@JvmName("getIntentByteArrayOrDefault")
fun Activity?.intentByteArrayOrDefault(
    key: String,
    defaultValue: ByteArray = byteArrayOf()
): ByteArray = intentExpand.getByteArrayOrDefault(key, defaultValue)

@JvmName("getIntentShortArrayOrDefault")
fun Activity?.intentShortArrayOrDefault(
    key: String,
    defaultValue: ShortArray = shortArrayOf()
): ShortArray = intentExpand.getShortArrayOrDefault(key, defaultValue)

@JvmName("getIntentCharArrayOrDefault")
fun Activity?.intentCharArrayOrDefault(
    key: String,
    defaultValue: CharArray = charArrayOf()
): CharArray = intentExpand.getCharArrayOrDefault(key, defaultValue)

@JvmName("getIntentIntArrayOrDefault")
fun Activity?.intentIntArrayOrDefault(
    key: String,
    defaultValue: IntArray = intArrayOf()
): IntArray = intentExpand.getIntArrayOrDefault(key, defaultValue)

@JvmName("getIntentLongArrayOrDefault")
fun Activity?.intentLongArrayOrDefault(
    key: String,
    defaultValue: LongArray = longArrayOf()
): LongArray = intentExpand.getLongArrayOrDefault(key, defaultValue)

@JvmName("getIntentFloatArrayOrDefault")
fun Activity?.intentFloatArrayOrDefault(
    key: String,
    defaultValue: FloatArray = floatArrayOf()
): FloatArray = intentExpand.getFloatArrayOrDefault(key, defaultValue)

@JvmName("getIntentDoubleArrayOrDefault")
fun Activity?.intentDoubleArrayOrDefault(
    key: String,
    defaultValue: DoubleArray = doubleArrayOf()
): DoubleArray = intentExpand.getDoubleArrayOrDefault(key, defaultValue)

@JvmName("getIntentStringArrayOrDefault")
fun Activity?.intentStringArrayOrDefault(
    key: String,
    defaultValue: Array<String> = emptyArray()
): Array<String> = intentExpand.getStringArrayOrDefault(key, defaultValue)

@JvmName("getIntentCharSequenceArrayOrDefault")
fun Activity?.intentCharSequenceArrayOrDefault(
    key: String,
    defaultValue: Array<CharSequence> = emptyArray()
): Array<CharSequence> = intentExpand.getCharSequenceArrayOrDefault(key, defaultValue)

@JvmName("getIntentBundleOrDefault")
fun Activity?.intentBundleOrDefault(key: String, defaultValue: Bundle = Bundle.EMPTY): Bundle =
    intentExpand.getBundleOrDefault(key, defaultValue)

//ifNone
@JvmName("getIntentBooleanOrDefault")
fun Activity?.intentBooleanOrDefault(key: String, ifNone: () -> Boolean): Boolean =
    intentExpand.getBooleanOrDefault(key, ifNone)

@JvmName("getIntentByteOrDefault")
fun Activity?.intentByteOrDefault(key: String, ifNone: () -> Byte): Byte =
    intentExpand.getByteOrDefault(key, ifNone)

@JvmName("getIntentShortOrDefault")
fun Activity?.intentShortOrDefault(key: String, ifNone: () -> Short): Short =
    intentExpand.getShortOrDefault(key, ifNone)

@JvmName("getIntentCharOrDefault")
fun Activity?.intentCharOrDefault(key: String, ifNone: () -> Char): Char =
    intentExpand.getCharOrDefault(key, ifNone)

@JvmName("getIntentIntOrDefault")
fun Activity?.intentIntOrDefault(key: String, ifNone: () -> Int): Int =
    intentExpand.getIntOrDefault(key, ifNone)

@JvmName("getIntentLongOrDefault")
fun Activity?.intentLongOrDefault(key: String, ifNone: () -> Long): Long =
    intentExpand.getLongOrDefault(key, ifNone)

@JvmName("getIntentFloatOrDefault")
fun Activity?.intentFloatOrDefault(key: String, ifNone: () -> Float): Float =
    intentExpand.getFloatOrDefault(key, ifNone)

@JvmName("getIntentDoubleOrDefault")
fun Activity?.intentDoubleOrDefault(key: String, ifNone: () -> Double): Double =
    intentExpand.getDoubleOrDefault(key, ifNone)

@JvmName("getIntentStringOrDefault")
fun Activity?.intentStringOrDefault(key: String, ifNone: () -> String): String =
    intentExpand.getStringOrDefault(key, ifNone)

@JvmName("getIntentCharSequenceOrDefault")
fun Activity?.intentCharSequenceOrDefault(key: String, ifNone: () -> CharSequence): CharSequence =
    intentExpand.getCharSequenceOrDefault(key, ifNone)

@JvmName("getIntentParcelableOrDefault")
fun <T : Parcelable> Activity?.intentParcelableOrDefault(key: String, ifNone: () -> T): T =
    intentExpand.getParcelableOrDefault(key, ifNone)

@JvmName("getIntentParcelableArrayOrDefault")
fun <T : Parcelable> Activity?.intentParcelableArrayOrDefault(
    key: String,
    ifNone: () -> Array<T>
): Array<T> = intentExpand.getParcelableArrayOrDefault(key, ifNone)

@JvmName("getIntentParcelableArrayListOrDefault")
fun <T : Parcelable> Activity?.intentParcelableArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<T>
): ArrayList<T> = intentExpand.getParcelableArrayListOrDefault(key, ifNone)

@JvmName("getIntentSerializableOrDefault")
fun Activity?.intentSerializableOrDefault(key: String, ifNone: () -> Serializable): Serializable =
    intentExpand.getSerializableOrDefault(key, ifNone)

@JvmName("getIntentIntArrayListOrDefault")
fun Activity?.intentIntArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<Int>
): ArrayList<Int> =
    intentExpand.getIntArrayListOrDefault(key, ifNone)

@JvmName("getIntentStringArrayListOrDefault")
fun Activity?.intentStringArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<String>
): ArrayList<String> = intentExpand.getStringArrayListOrDefault(key, ifNone)

@JvmName("getIntentCharSequenceArrayListOrDefault")
fun Activity?.intentCharSequenceArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<CharSequence>
): ArrayList<CharSequence> = intentExpand.getCharSequenceArrayListOrDefault(key, ifNone)

@JvmName("getIntentBooleanArrayOrDefault")
fun Activity?.intentBooleanArrayOrDefault(key: String, ifNone: () -> BooleanArray): BooleanArray =
    intentExpand.getBooleanArrayOrDefault(key, ifNone)

@JvmName("getIntentByteArrayOrDefault")
fun Activity?.intentByteArrayOrDefault(key: String, ifNone: () -> ByteArray): ByteArray =
    intentExpand.getByteArrayOrDefault(key, ifNone)

@JvmName("getIntentShortArrayOrDefault")
fun Activity?.intentShortArrayOrDefault(key: String, ifNone: () -> ShortArray): ShortArray =
    intentExpand.getShortArrayOrDefault(key, ifNone)

@JvmName("getIntentCharArrayOrDefault")
fun Activity?.intentCharArrayOrDefault(key: String, ifNone: () -> CharArray): CharArray =
    intentExpand.getCharArrayOrDefault(key, ifNone)

@JvmName("getIntentIntArrayOrDefault")
fun Activity?.intentIntArrayOrDefault(key: String, ifNone: () -> IntArray): IntArray =
    intentExpand.getIntArrayOrDefault(key, ifNone)

@JvmName("getIntentLongArrayOrDefault")
fun Activity?.intentLongArrayOrDefault(key: String, ifNone: () -> LongArray): LongArray =
    intentExpand.getLongArrayOrDefault(key, ifNone)

@JvmName("getIntentFloatArrayOrDefault")
fun Activity?.intentFloatArrayOrDefault(key: String, ifNone: () -> FloatArray): FloatArray =
    intentExpand.getFloatArrayOrDefault(key, ifNone)

@JvmName("getIntentDoubleArrayOrDefault")
fun Activity?.intentDoubleArrayOrDefault(key: String, ifNone: () -> DoubleArray): DoubleArray =
    intentExpand.getDoubleArrayOrDefault(key, ifNone)

@JvmName("getIntentStringArrayOrDefault")
fun Activity?.intentStringArrayOrDefault(key: String, ifNone: () -> Array<String>): Array<String> =
    intentExpand.getStringArrayOrDefault(key, ifNone)

@JvmName("getIntentCharSequenceArrayOrDefault")
fun Activity?.intentCharSequenceArrayOrDefault(
    key: String,
    ifNone: () -> Array<CharSequence>
): Array<CharSequence> = intentExpand.getCharSequenceArrayOrDefault(key, ifNone)

@JvmName("getIntentBundleOrDefault")
fun Activity?.intentBundleOrDefault(key: String, ifNone: () -> Bundle): Bundle =
    intentExpand.getBundleOrDefault(key, ifNone)

// bundle extras
@JvmName("getBundleOrEmpty")
fun Activity?.bundleOrEmptyExpand(): Bundle = bundleExpand.orEmptyExpand()

@JvmName("getBundleAny")
fun Activity?.bundleAnyExpand(key: String): Any =
    bundleExpand.getExpand(key)

@JvmName("getBundleBoolean")
fun Activity?.bundleBooleanExpand(key: String): Boolean =
    bundleExpand.getBooleanExpand(key)

@JvmName("getBundleByte")
fun Activity?.bundleByteExpand(key: String): Byte =
    bundleExpand.getByteExpand(key)

@JvmName("getBundleChar")
fun Activity?.bundleCharExpand(key: String): Char =
    bundleExpand.getCharExpand(key)

@JvmName("getBundleShort")
fun Activity?.bundleShortExpand(key: String): Short =
    bundleExpand.getShortExpand(key)

@JvmName("getBundleInt")
fun Activity?.bundleIntExpand(key: String): Int =
    bundleExpand.getIntExpand(key)

@JvmName("getBundleLong")
fun Activity?.bundleLongExpand(key: String): Long =
    bundleExpand.getLongExpand(key)

@JvmName("getBundleFloat")
fun Activity?.bundleFloatExpand(key: String): Float =
    bundleExpand.getFloatExpand(key)

@JvmName("getBundleDouble")
fun Activity?.bundleDoubleExpand(key: String): Double =
    bundleExpand.getDoubleExpand(key)

@JvmName("getBundleString")
fun Activity?.bundleStringExpand(key: String): String =
    bundleExpand.getStringExpand(key)

@JvmName("getBundleCharSequence")
fun Activity?.bundleCharSequenceExpand(key: String): CharSequence =
    bundleExpand.getCharSequenceExpand(key)

@JvmName("getBundleSize")
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Activity?.bundleSizeExpand(key: String): Size =
    bundleExpand.getSizeExpand(key)

@JvmName("getBundleSizeF")
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Activity?.bundleSizeFExpand(key: String): SizeF =
    bundleExpand.getSizeFExpand(key)

@JvmName("getBundleIntArrayList")
fun Activity?.bundleIntArrayListExpand(key: String): ArrayList<Int> =
    bundleExpand.getIntArrayListExpand(key)

@JvmName("getBundleStringArrayList")
fun Activity?.bundleStringArrayListExpand(key: String): ArrayList<String> =
    bundleExpand.getStringArrayListExpand(key)

@JvmName("getBundleCharSequenceArrayList")
fun Activity?.bundleCharSequenceArrayListExpand(key: String): ArrayList<CharSequence> =
    bundleExpand.getCharSequenceArrayListExpand(key)

@JvmName("getBundleSerializable")
fun Activity?.bundleSerializableExpand(key: String): Serializable =
    bundleExpand.getSerializableExpand(key)

@JvmName("getBundleBooleanArray")
fun Activity?.bundleBooleanArrayExpand(key: String): BooleanArray =
    bundleExpand.getBooleanArrayExpand(key)

@JvmName("getBundleByteArray")
fun Activity?.bundleByteArrayExpand(key: String): ByteArray =
    bundleExpand.getByteArrayExpand(key)

@JvmName("getBundleShortArray")
fun Activity?.bundleShortArrayExpand(key: String): ShortArray =
    bundleExpand.getShortArrayExpand(key)

@JvmName("getBundleCharArray")
fun Activity?.bundleCharArrayExpand(key: String): CharArray =
    bundleExpand.getCharArrayExpand(key)

@JvmName("getBundleIntArray")
fun Activity?.bundleIntArrayExpand(key: String): IntArray =
    bundleExpand.getIntArrayExpand(key)

@JvmName("getBundleLongArray")
fun Activity?.bundleLongArrayExpand(key: String): LongArray =
    bundleExpand.getLongArrayExpand(key)

@JvmName("getBundleFloatArray")
fun Activity?.bundleFloatArrayExpand(key: String): FloatArray =
    bundleExpand.getFloatArrayExpand(key)

@JvmName("getBundleDoubleArray")
fun Activity?.bundleDoubleArrayExpand(key: String): DoubleArray =
    bundleExpand.getDoubleArrayExpand(key)

@JvmName("getBundleStringArray")
fun Activity?.bundleStringArrayExpand(key: String): Array<String> =
    bundleExpand.getStringArrayExpand(key)

@JvmName("getBundleCharSequenceArray")
fun Activity?.bundleCharSequenceArrayExpand(key: String): Array<CharSequence> =
    bundleExpand.getCharSequenceArrayExpand(key)

@JvmName("getBundleParcelable")
fun <T : Parcelable> Activity?.bundleParcelableExpand(key: String): T =
    bundleExpand.getParcelableExpand(key)

@JvmName("getBundleParcelableArray")
fun <T : Parcelable> Activity?.bundleParcelableArrayExpand(key: String): Array<T> =
    bundleExpand.getParcelableArrayExpand(key)

@JvmName("getBundleParcelableArrayList")
fun <T : Parcelable> Activity?.bundleParcelableArrayListExpand(key: String): ArrayList<T> =
    bundleExpand.getParcelableArrayListExpand(key)

@JvmName("getBundleSparseParcelableArray")
fun <T : Parcelable> Activity?.bundleSparseParcelableArrayExpand(key: String): SparseArray<T> =
    bundleExpand.getSparseParcelableArrayExpand(key)

@JvmName("getBundleBundle")
fun Activity?.bundleBundleExpand(key: String): Bundle =
    bundleExpand.getBundleExpand(key)

@JvmName("getBundleAnyOrDefault")
fun Activity?.bundleAnyOrDefault(key: String, defaultValue: Any = Any()): Any =
    bundleExpand.getOrDefault(key, defaultValue)

@JvmName("getBundleBooleanOrDefault")
fun Activity?.bundleBooleanOrDefault(key: String, defaultValue: Boolean = false): Boolean =
    bundleExpand.getBooleanOrDefault(key, defaultValue)

@JvmName("getBundleByteOrDefault")
fun Activity?.bundleByteOrDefault(key: String, defaultValue: Byte = 0.toByte()): Byte =
    bundleExpand.getByteOrDefault(key, defaultValue)

@JvmName("getBundleCharOrDefault")
fun Activity?.bundleCharOrDefault(key: String, defaultValue: Char = 0.toChar()): Char =
    bundleExpand.getCharOrDefault(key, defaultValue)

@JvmName("getBundleShortOrDefault")
fun Activity?.bundleShortOrDefault(key: String, defaultValue: Short = 0.toShort()): Short =
    bundleExpand.getShortOrDefault(key, defaultValue)

@JvmName("getBundleIntOrDefault")
fun Activity?.bundleIntOrDefault(key: String, defaultValue: Int = 0): Int =
    bundleExpand.getIntOrDefault(key, defaultValue)

@JvmName("getBundleLongOrDefault")
fun Activity?.bundleLongOrDefault(key: String, defaultValue: Long = 0.toLong()): Long =
    bundleExpand.getLongOrDefault(key, defaultValue)

@JvmName("getBundleFloatOrDefault")
fun Activity?.bundleFloatOrDefault(key: String, defaultValue: Float = 0.toFloat()): Float =
    bundleExpand.getFloatOrDefault(key, defaultValue)

@JvmName("getBundleDoubleOrDefault")
fun Activity?.bundleDoubleOrDefault(key: String, defaultValue: Double = 0.toDouble()): Double =
    bundleExpand.getDoubleOrDefault(key, defaultValue)

@JvmName("getBundleStringOrDefault")
fun Activity?.bundleStringOrDefault(key: String, defaultValue: String = ""): String =
    bundleExpand.getStringOrDefault(key, defaultValue)

@JvmName("getBundleCharSequenceOrDefault")
fun Activity?.bundleCharSequenceOrDefault(
    key: String,
    defaultValue: CharSequence = ""
): CharSequence =
    bundleExpand.getCharSequenceOrDefault(key, defaultValue)

@JvmName("getBundleParcelableOrDefault")
fun <T : Parcelable> Activity?.bundleParcelableOrDefault(
    key: String,
    defaultValue: Parcelable = bundleExpand?.getParcelable<T>(key)!!
): T = bundleExpand.getParcelableOrDefault(key) { defaultValue as T }

@JvmName("getBundleParcelableArrayOrDefault")
fun <T : Parcelable> Activity?.bundleParcelableArrayOrDefault(
    key: String,
    defaultValue: Array<Parcelable> = emptyArray()
): Array<T> = bundleExpand.getParcelableArrayOrDefault(key) { defaultValue as Array<T> }

@JvmName("getBundleParcelableArrayListOrDefault")
fun <T : Parcelable> Activity?.bundleParcelableArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<T> = arrayListOf()
): ArrayList<T> = bundleExpand.getParcelableArrayListOrDefault(key, defaultValue)

@JvmName("getBundleSparseParcelableArrayOrDefault")
fun <T : Parcelable> Activity?.bundleSparseParcelableArrayOrDefault(
    key: String,
    defaultValue: SparseArray<T> = sparseArrayOf()
): SparseArray<T> = bundleExpand.getSparseParcelableArrayOrDefault(key, defaultValue)

@JvmName("getBundleBundleOrDefault")
fun Activity?.bundleBundleOrDefault(
    key: String,
    defaultValue: Bundle = Bundle.EMPTY
): Bundle = bundleExpand.getBundleOrDefault(key, defaultValue)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@JvmName("getBundleSizeOrDefault")
fun Activity?.bundleSizeOrDefault(
    key: String,
    defaultValue: Size = Size(0, 0)
): Size = bundleExpand.getSizeOrDefault(key, defaultValue)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@JvmName("getBundleSizeFOrDefault")
fun Activity?.bundleSizeFOrDefault(
    key: String,
    defaultValue: SizeF = SizeF(0.toFloat(), 0.toFloat())
): SizeF = bundleExpand.getSizeFOrDefault(key, defaultValue)

@JvmName("getBundleIntArrayListOrDefault")
fun Activity?.bundleIntArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<Int> = arrayListOf()
): ArrayList<Int> = bundleExpand.getIntArrayListOrDefault(key, defaultValue)

@JvmName("getBundleStringArrayListOrDefault")
fun Activity?.bundleStringArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<String> = arrayListOf()
): ArrayList<String> = bundleExpand.getStringArrayListOrDefault(key, defaultValue)

@JvmName("getBundleCharSequenceArrayListOrDefault")
fun Activity?.bundleCharSequenceArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<CharSequence> = arrayListOf()
): ArrayList<CharSequence> = bundleExpand.getCharSequenceArrayListOrDefault(key, defaultValue)

@JvmName("getBundleSerializableOrDefault")
fun Activity?.bundleSerializableOrDefault(
    key: String,
    defaultValue: Serializable = bundleExpand?.getSerializable(key)!!
): Serializable = bundleExpand.getSerializableOrDefault(key, defaultValue)

@JvmName("getBundleBooleanArrayOrDefault")
fun Activity?.bundleBooleanArrayOrDefault(
    key: String,
    defaultValue: BooleanArray = booleanArrayOf()
): BooleanArray = bundleExpand.getBooleanArrayOrDefault(key, defaultValue)

@JvmName("getBundleByteArrayOrDefault")
fun Activity?.bundleByteArrayOrDefault(
    key: String,
    defaultValue: ByteArray = byteArrayOf()
): ByteArray = bundleExpand.getByteArrayOrDefault(key, defaultValue)

@JvmName("getBundleShortArrayOrDefault")
fun Activity?.bundleShortArrayOrDefault(
    key: String,
    defaultValue: ShortArray = shortArrayOf()
): ShortArray = bundleExpand.getShortArrayOrDefault(key, defaultValue)

@JvmName("getBundleCharArrayOrDefault")
fun Activity?.bundleCharArrayOrDefault(
    key: String,
    defaultValue: CharArray = charArrayOf()
): CharArray = bundleExpand.getCharArrayOrDefault(key, defaultValue)

@JvmName("getBundleIntArrayOrDefault")
fun Activity?.bundleIntArrayOrDefault(
    key: String,
    defaultValue: IntArray = intArrayOf()
): IntArray = bundleExpand.getIntArrayOrDefault(key, defaultValue)

@JvmName("getBundleLongArrayOrDefault")
fun Activity?.bundleLongArrayOrDefault(
    key: String,
    defaultValue: LongArray = longArrayOf()
): LongArray = bundleExpand.getLongArrayOrDefault(key, defaultValue)

@JvmName("getBundleFloatArrayOrDefault")
fun Activity?.bundleFloatArrayOrDefault(
    key: String,
    defaultValue: FloatArray = floatArrayOf()
): FloatArray = bundleExpand.getFloatArrayOrDefault(key, defaultValue)

@JvmName("getBundleDoubleArrayOrDefault")
fun Activity?.bundleDoubleArrayOrDefault(
    key: String,
    defaultValue: DoubleArray = doubleArrayOf()
): DoubleArray = bundleExpand.getDoubleArrayOrDefault(key, defaultValue)

@JvmName("getBundleStringArrayOrDefault")
fun Activity?.bundleStringArrayOrDefault(
    key: String,
    defaultValue: Array<String> = emptyArray()
): Array<String> = bundleExpand.getStringArrayOrDefault(key, defaultValue)

@JvmName("getBundleCharSequenceArrayOrDefault")
fun Activity?.bundleCharSequenceArrayOrDefault(
    key: String,
    defaultValue: Array<CharSequence> = emptyArray()
): Array<CharSequence> = bundleExpand.getCharSequenceArrayOrDefault(key, defaultValue)

//ifNone
@JvmName("getBundleAnyOrDefault")
fun Activity?.bundleAnyOrDefault(key: String, ifNone: () -> Any): Any =
    bundleExpand.getOrDefault(key, ifNone)

@JvmName("getBundleBooleanOrDefault")
fun Activity?.bundleBooleanOrDefault(key: String, ifNone: () -> Boolean): Boolean =
    bundleExpand.getBooleanOrDefault(key, ifNone)

@JvmName("getBundleByteOrDefault")
fun Activity?.bundleByteOrDefault(key: String, ifNone: () -> Byte): Byte =
    bundleExpand.getByteOrDefault(key, ifNone)

@JvmName("getBundleCharOrDefault")
fun Activity?.bundleCharOrDefault(key: String, ifNone: () -> Char): Char =
    bundleExpand.getCharOrDefault(key, ifNone)

@JvmName("getBundleShortOrDefault")
fun Activity?.bundleShortOrDefault(key: String, ifNone: () -> Short): Short =
    bundleExpand.getShortOrDefault(key, ifNone)

@JvmName("getBundleIntOrDefault")
fun Activity?.bundleIntOrDefault(key: String, ifNone: () -> Int): Int =
    bundleExpand.getIntOrDefault(key, ifNone)

@JvmName("getBundleLongOrDefault")
fun Activity?.bundleLongOrDefault(key: String, ifNone: () -> Long): Long =
    bundleExpand.getLongOrDefault(key, ifNone)

@JvmName("getBundleFloatOrDefault")
fun Activity?.bundleFloatOrDefault(key: String, ifNone: () -> Float): Float =
    bundleExpand.getFloatOrDefault(key, ifNone)

@JvmName("getBundleDoubleOrDefault")
fun Activity?.bundleDoubleOrDefault(key: String, ifNone: () -> Double): Double =
    bundleExpand.getDoubleOrDefault(key, ifNone)

@JvmName("getBundleStringOrDefault")
fun Activity?.bundleStringOrDefault(key: String, ifNone: () -> String): String =
    bundleExpand.getStringOrDefault(key, ifNone)

@JvmName("getBundleCharSequenceOrDefault")
fun Activity?.bundleCharSequenceOrDefault(key: String, ifNone: () -> CharSequence): CharSequence =
    bundleExpand.getCharSequenceOrDefault(key, ifNone)

@JvmName("getBundleParcelableOrDefault")
fun <T : Parcelable> Activity?.bundleParcelableOrDefault(
    key: String,
    ifNone: () -> T
): T = bundleExpand.getParcelableOrDefault(key, ifNone)

@JvmName("getBundleParcelableArrayOrDefault")
fun <T : Parcelable> Activity?.bundleParcelableArrayOrDefault(
    key: String,
    ifNone: () -> Array<T>
): Array<T> = bundleExpand.getParcelableArrayOrDefault(key, ifNone)

@JvmName("getBundleParcelableArrayListOrDefault")
fun <T : Parcelable> Activity?.bundleParcelableArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<T>
): ArrayList<T> = bundleExpand.getParcelableArrayListOrDefault(key, ifNone)

@JvmName("getBundleSparseParcelableArrayOrDefault")
fun <T : Parcelable> Activity?.bundleSparseParcelableArrayOrDefault(
    key: String,
    ifNone: () -> SparseArray<T>
): SparseArray<T> = bundleExpand.getSparseParcelableArrayOrDefault(key, ifNone)

@JvmName("getBundleBundleOrDefault")
fun Activity?.bundleBundleOrDefault(key: String, ifNone: () -> Bundle): Bundle =
    bundleExpand.getBundleOrDefault(key, ifNone)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@JvmName("getBundleSizeOrDefault")
fun Activity?.bundleSizeOrDefault(key: String, ifNone: () -> Size): Size =
    bundleExpand.getSizeOrDefault(key, ifNone)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@JvmName("getBundleSizeFOrDefault")
fun Activity?.bundleSizeFOrDefault(key: String, ifNone: () -> SizeF): SizeF =
    bundleExpand.getSizeFOrDefault(key, ifNone)

@JvmName("getBundleIntArrayListOrDefault")
fun Activity?.bundleIntArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<Int>
): ArrayList<Int> =
    bundleExpand.getIntArrayListOrDefault(key, ifNone)

@JvmName("getBundleStringArrayListOrDefault")
fun Activity?.bundleStringArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<String>
): ArrayList<String> = bundleExpand.getStringArrayListOrDefault(key, ifNone)

@JvmName("getBundleCharSequenceArrayListOrDefault")
fun Activity?.bundleCharSequenceArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<CharSequence>
): ArrayList<CharSequence> = bundleExpand.getCharSequenceArrayListOrDefault(key, ifNone)

@JvmName("getBundleSerializableOrDefault")
fun Activity?.bundleSerializableOrDefault(key: String, ifNone: () -> Serializable): Serializable =
    bundleExpand.getSerializableOrDefault(key, ifNone)

@JvmName("getBundleBooleanArrayOrDefault")
fun Activity?.bundleBooleanArrayOrDefault(key: String, ifNone: () -> BooleanArray): BooleanArray =
    bundleExpand.getBooleanArrayOrDefault(key, ifNone)

@JvmName("getBundleByteArrayOrDefault")
fun Activity?.bundleByteArrayOrDefault(key: String, ifNone: () -> ByteArray): ByteArray =
    bundleExpand.getByteArrayOrDefault(key, ifNone)

@JvmName("getBundleShortArrayOrDefault")
fun Activity?.bundleShortArrayOrDefault(key: String, ifNone: () -> ShortArray): ShortArray =
    bundleExpand.getShortArrayOrDefault(key, ifNone)

@JvmName("getBundleCharArrayOrDefault")
fun Activity?.bundleCharArrayOrDefault(key: String, ifNone: () -> CharArray): CharArray =
    bundleExpand.getCharArrayOrDefault(key, ifNone)

@JvmName("getBundleIntArrayOrDefault")
fun Activity?.bundleIntArrayOrDefault(key: String, ifNone: () -> IntArray): IntArray =
    bundleExpand.getIntArrayOrDefault(key, ifNone)

@JvmName("getBundleLongArrayOrDefault")
fun Activity?.bundleLongArrayOrDefault(key: String, ifNone: () -> LongArray): LongArray =
    bundleExpand.getLongArrayOrDefault(key, ifNone)

@JvmName("getBundleFloatArrayOrDefault")
fun Activity?.bundleFloatArrayOrDefault(key: String, ifNone: () -> FloatArray): FloatArray =
    bundleExpand.getFloatArrayOrDefault(key, ifNone)

@JvmName("getBundleDoubleArrayOrDefault")
fun Activity?.bundleDoubleArrayOrDefault(key: String, ifNone: () -> DoubleArray): DoubleArray =
    bundleExpand.getDoubleArrayOrDefault(key, ifNone)

@JvmName("getBundleStringArrayOrDefault")
fun Activity?.bundleStringArrayOrDefault(key: String, ifNone: () -> Array<String>): Array<String> =
    bundleExpand.getStringArrayOrDefault(key, ifNone)

@JvmName("getBundleCharSequenceArrayOrDefault")
fun Activity?.bundleCharSequenceArrayOrDefault(
    key: String,
    ifNone: () -> Array<CharSequence>
): Array<CharSequence> = bundleExpand.getCharSequenceArrayOrDefault(key, ifNone)
