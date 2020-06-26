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
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import androidx.kotlin.expand.util.sparseArrayOf
import java.io.Serializable

@Version([VersionLog(Version.BANANA)])
val Activity?.intentExpand: Intent?
    get() = this?.intent

@Version([VersionLog(Version.BANANA)])
val Activity?.bundleExpand: Bundle?
    get() = this?.intent?.extras

// intent extras

@JvmName("getIntentOrEmpty")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentOrEmptyExpand(): Intent = intentExpand.orEmptyExpand()

@JvmName("getIntentBoolean")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentBooleanExpand(key: String): Boolean =
    intentExpand.getBooleanExpand(key)

@JvmName("getIntentByte")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentByteExpand(key: String): Byte =
    intentExpand.getByteExpand(key)

@JvmName("getIntentChar")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentCharExpand(key: String): Char =
    intentExpand.getCharExpand(key)

@JvmName("getIntentShort")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentShortExpand(key: String): Short =
    intentExpand.getShortExpand(key)

@JvmName("getIntentInt")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentIntExpand(key: String): Int =
    intentExpand.getIntExpand(key)

@JvmName("getIntentLong")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentLongExpand(key: String): Long =
    intentExpand.getLongExpand(key)

@JvmName("getIntentFloat")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentFloatExpand(key: String): Float =
    intentExpand.getFloatExpand(key)

@JvmName("getIntentDouble")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentDoubleExpand(key: String): Double =
    intentExpand.getDoubleExpand(key)

@JvmName("getIntentString")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentStringExpand(key: String): String =
    intentExpand.getStringExpand(key)

@JvmName("getIntentCharSequence")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentCharSequenceExpand(key: String): CharSequence =
    intentExpand.getCharSequenceExpand(key)

@JvmName("getIntentIntArrayList")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentIntArrayListExpand(key: String): ArrayList<Int> =
    intentExpand.getIntArrayListExpand(key)

@JvmName("getIntentStringArrayList")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentStringArrayListExpand(key: String): ArrayList<String> =
    intentExpand.getStringArrayListExpand(key)

@JvmName("getIntentCharSequenceArrayList")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentCharSequenceArrayListExpand(key: String): ArrayList<CharSequence> =
    intentExpand.getCharSequenceArrayListExpand(key)

@JvmName("getIntentBooleanArray")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentBooleanArrayExpand(key: String): BooleanArray =
    intentExpand.getBooleanArrayExpand(key)

@JvmName("getIntentByteArray")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentByteArrayExpand(key: String): ByteArray =
    intentExpand.getByteArrayExpand(key)

@JvmName("getIntentShortArray")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentShortArrayExpand(key: String): ShortArray =
    intentExpand.getShortArrayExpand(key)

@JvmName("getIntentCharArray")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentCharArrayExpand(key: String): CharArray =
    intentExpand.getCharArrayExpand(key)

@JvmName("getIntentIntArray")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentIntArrayExpand(key: String): IntArray =
    intentExpand.getIntArrayExpand(key)

@JvmName("getIntentLongArray")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentLongArrayExpand(key: String): LongArray =
    intentExpand.getLongArrayExpand(key)

@JvmName("getIntentFloatArray")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentFloatArrayExpand(key: String): FloatArray =
    intentExpand.getFloatArrayExpand(key)

@JvmName("getIntentDoubleArray")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentDoubleArrayExpand(key: String): DoubleArray =
    intentExpand.getDoubleArrayExpand(key)

@JvmName("getIntentStringArray")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentStringArrayExpand(key: String): Array<String> =
    intentExpand.getStringArrayExpand(key)

@JvmName("getIntentCharSequenceArray")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentCharSequenceArrayExpand(key: String): Array<CharSequence> =
    intentExpand.getCharSequenceArrayExpand(key)

@JvmName("getIntentParcelable")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Activity?.intentParcelableExpand(key: String): T =
    intentExpand.getParcelableExpand(key)

@JvmName("getIntentParcelableArray")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Activity?.intentParcelableArrayExpand(key: String): Array<T> =
    intentExpand.getParcelableArrayExpand(key)

@JvmName("getIntentParcelableArrayList")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Activity?.intentParcelableArrayListExpand(key: String): ArrayList<T> =
    intentExpand.getParcelableArrayListExpand(key)

@JvmName("getIntentSerializable")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentSerializableExpand(key: String): Serializable =
    intentExpand.getSerializableExpand(key)

@JvmName("getIntentBundle")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentBundleExpand(key: String): Bundle =
    intentExpand.getBundleExpand(key)

@JvmName("getIntentBooleanOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentBooleanOrDefault(key: String, defaultValue: Boolean = false): Boolean =
    intentExpand.getBooleanOrDefault(key, defaultValue)

@JvmName("getIntentByteOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentByteOrDefault(key: String, defaultValue: Byte = 0.toByte()): Byte =
    intentExpand.getByteOrDefault(key, defaultValue)

@JvmName("getIntentShortOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentShortOrDefault(key: String, defaultValue: Short = 0.toShort()): Short =
    intentExpand.getShortOrDefault(key, defaultValue)

@JvmName("getIntentCharOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentCharOrDefault(key: String, defaultValue: Char = 0.toChar()): Char =
    intentExpand.getCharOrDefault(key, defaultValue)

@JvmName("getIntentIntOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentIntOrDefault(key: String, defaultValue: Int = 0): Int =
    intentExpand.getIntOrDefault(key, defaultValue)

@JvmName("getIntentLongOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentLongOrDefault(key: String, defaultValue: Long = 0.toLong()): Long =
    intentExpand.getLongOrDefault(key, defaultValue)

@JvmName("getIntentFloatOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentFloatOrDefault(key: String, defaultValue: Float = 0.toFloat()): Float =
    intentExpand.getFloatOrDefault(key, defaultValue)

@JvmName("getIntentDoubleOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentDoubleOrDefault(key: String, defaultValue: Double = 0.toDouble()): Double =
    intentExpand.getDoubleOrDefault(key, defaultValue)

@JvmName("getIntentStringOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentStringOrDefault(key: String, defaultValue: String = ""): String =
    intentExpand.getStringOrDefault(key, defaultValue)

@JvmName("getIntentCharSequenceOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentCharSequenceOrDefault(
    key: String,
    defaultValue: CharSequence = ""
): CharSequence = intentExpand.getCharSequenceOrDefault(key, defaultValue)

@JvmName("getIntentParcelableOrDefault")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Activity?.intentParcelableOrDefault(
    key: String,
    defaultValue: Parcelable = intentExpand?.getParcelableExtra<T>(key)!!
): T = intentExpand.getParcelableOrDefault(key, defaultValue)

@JvmName("getIntentParcelableArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Activity?.intentParcelableArrayOrDefault(
    key: String,
    defaultValue: Array<Parcelable> = emptyArray()
): Array<T> = intentExpand.getParcelableArrayOrDefault(key, defaultValue)

@JvmName("getIntentParcelableArrayListOrDefault")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Activity?.intentParcelableArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<T> = arrayListOf()
): ArrayList<T> = intentExpand.getParcelableArrayListOrDefault(key, defaultValue)

@JvmName("getIntentSerializableOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentSerializableOrDefault(
    key: String,
    defaultValue: Serializable = intentExpand?.getSerializableExtra(key)!!
): Serializable = intentExpand.getSerializableOrDefault(key, defaultValue)

@JvmName("getIntentIntArrayListOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentIntArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<Int> = arrayListOf()
): ArrayList<Int> = intentExpand.getIntArrayListOrDefault(key, defaultValue)

@JvmName("getIntentStringArrayListOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentStringArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<String> = arrayListOf()
): ArrayList<String> = intentExpand.getStringArrayListOrDefault(key, defaultValue)

@JvmName("getIntentCharSequenceArrayListOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentCharSequenceArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<CharSequence> = arrayListOf()
): ArrayList<CharSequence> = intentExpand.getCharSequenceArrayListOrDefault(key, defaultValue)

@JvmName("getIntentBooleanArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentBooleanArrayOrDefault(
    key: String,
    defaultValue: BooleanArray = booleanArrayOf()
): BooleanArray = intentExpand.getBooleanArrayOrDefault(key, defaultValue)

@JvmName("getIntentByteArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentByteArrayOrDefault(
    key: String,
    defaultValue: ByteArray = byteArrayOf()
): ByteArray = intentExpand.getByteArrayOrDefault(key, defaultValue)

@JvmName("getIntentShortArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentShortArrayOrDefault(
    key: String,
    defaultValue: ShortArray = shortArrayOf()
): ShortArray = intentExpand.getShortArrayOrDefault(key, defaultValue)

@JvmName("getIntentCharArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentCharArrayOrDefault(
    key: String,
    defaultValue: CharArray = charArrayOf()
): CharArray = intentExpand.getCharArrayOrDefault(key, defaultValue)

@JvmName("getIntentIntArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentIntArrayOrDefault(
    key: String,
    defaultValue: IntArray = intArrayOf()
): IntArray = intentExpand.getIntArrayOrDefault(key, defaultValue)

@JvmName("getIntentLongArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentLongArrayOrDefault(
    key: String,
    defaultValue: LongArray = longArrayOf()
): LongArray = intentExpand.getLongArrayOrDefault(key, defaultValue)

@JvmName("getIntentFloatArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentFloatArrayOrDefault(
    key: String,
    defaultValue: FloatArray = floatArrayOf()
): FloatArray = intentExpand.getFloatArrayOrDefault(key, defaultValue)

@JvmName("getIntentDoubleArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentDoubleArrayOrDefault(
    key: String,
    defaultValue: DoubleArray = doubleArrayOf()
): DoubleArray = intentExpand.getDoubleArrayOrDefault(key, defaultValue)

@JvmName("getIntentStringArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentStringArrayOrDefault(
    key: String,
    defaultValue: Array<String> = emptyArray()
): Array<String> = intentExpand.getStringArrayOrDefault(key, defaultValue)

@JvmName("getIntentCharSequenceArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentCharSequenceArrayOrDefault(
    key: String,
    defaultValue: Array<CharSequence> = emptyArray()
): Array<CharSequence> = intentExpand.getCharSequenceArrayOrDefault(key, defaultValue)

@JvmName("getIntentBundleOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentBundleOrDefault(key: String, defaultValue: Bundle = Bundle.EMPTY): Bundle =
    intentExpand.getBundleOrDefault(key, defaultValue)

//ifNone
@JvmName("getIntentBooleanOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentBooleanOrDefault(key: String, ifNone: () -> Boolean): Boolean =
    intentExpand.getBooleanOrDefault(key, ifNone)

@JvmName("getIntentByteOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentByteOrDefault(key: String, ifNone: () -> Byte): Byte =
    intentExpand.getByteOrDefault(key, ifNone)

@JvmName("getIntentShortOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentShortOrDefault(key: String, ifNone: () -> Short): Short =
    intentExpand.getShortOrDefault(key, ifNone)

@JvmName("getIntentCharOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentCharOrDefault(key: String, ifNone: () -> Char): Char =
    intentExpand.getCharOrDefault(key, ifNone)

@JvmName("getIntentIntOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentIntOrDefault(key: String, ifNone: () -> Int): Int =
    intentExpand.getIntOrDefault(key, ifNone)

@JvmName("getIntentLongOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentLongOrDefault(key: String, ifNone: () -> Long): Long =
    intentExpand.getLongOrDefault(key, ifNone)

@JvmName("getIntentFloatOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentFloatOrDefault(key: String, ifNone: () -> Float): Float =
    intentExpand.getFloatOrDefault(key, ifNone)

@JvmName("getIntentDoubleOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentDoubleOrDefault(key: String, ifNone: () -> Double): Double =
    intentExpand.getDoubleOrDefault(key, ifNone)

@JvmName("getIntentStringOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentStringOrDefault(key: String, ifNone: () -> String): String =
    intentExpand.getStringOrDefault(key, ifNone)

@JvmName("getIntentCharSequenceOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentCharSequenceOrDefault(key: String, ifNone: () -> CharSequence): CharSequence =
    intentExpand.getCharSequenceOrDefault(key, ifNone)

@JvmName("getIntentParcelableOrDefault")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Activity?.intentParcelableOrDefault(key: String, ifNone: () -> T): T =
    intentExpand.getParcelableOrDefault(key, ifNone)

@JvmName("getIntentParcelableArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Activity?.intentParcelableArrayOrDefault(
    key: String,
    ifNone: () -> Array<T>
): Array<T> = intentExpand.getParcelableArrayOrDefault(key, ifNone)

@JvmName("getIntentParcelableArrayListOrDefault")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Activity?.intentParcelableArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<T>
): ArrayList<T> = intentExpand.getParcelableArrayListOrDefault(key, ifNone)

@JvmName("getIntentSerializableOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentSerializableOrDefault(key: String, ifNone: () -> Serializable): Serializable =
    intentExpand.getSerializableOrDefault(key, ifNone)

@JvmName("getIntentIntArrayListOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentIntArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<Int>
): ArrayList<Int> =
    intentExpand.getIntArrayListOrDefault(key, ifNone)

@JvmName("getIntentStringArrayListOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentStringArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<String>
): ArrayList<String> = intentExpand.getStringArrayListOrDefault(key, ifNone)

@JvmName("getIntentCharSequenceArrayListOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentCharSequenceArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<CharSequence>
): ArrayList<CharSequence> = intentExpand.getCharSequenceArrayListOrDefault(key, ifNone)

@JvmName("getIntentBooleanArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentBooleanArrayOrDefault(key: String, ifNone: () -> BooleanArray): BooleanArray =
    intentExpand.getBooleanArrayOrDefault(key, ifNone)

@JvmName("getIntentByteArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentByteArrayOrDefault(key: String, ifNone: () -> ByteArray): ByteArray =
    intentExpand.getByteArrayOrDefault(key, ifNone)

@JvmName("getIntentShortArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentShortArrayOrDefault(key: String, ifNone: () -> ShortArray): ShortArray =
    intentExpand.getShortArrayOrDefault(key, ifNone)

@JvmName("getIntentCharArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentCharArrayOrDefault(key: String, ifNone: () -> CharArray): CharArray =
    intentExpand.getCharArrayOrDefault(key, ifNone)

@JvmName("getIntentIntArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentIntArrayOrDefault(key: String, ifNone: () -> IntArray): IntArray =
    intentExpand.getIntArrayOrDefault(key, ifNone)

@JvmName("getIntentLongArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentLongArrayOrDefault(key: String, ifNone: () -> LongArray): LongArray =
    intentExpand.getLongArrayOrDefault(key, ifNone)

@JvmName("getIntentFloatArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentFloatArrayOrDefault(key: String, ifNone: () -> FloatArray): FloatArray =
    intentExpand.getFloatArrayOrDefault(key, ifNone)

@JvmName("getIntentDoubleArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentDoubleArrayOrDefault(key: String, ifNone: () -> DoubleArray): DoubleArray =
    intentExpand.getDoubleArrayOrDefault(key, ifNone)

@JvmName("getIntentStringArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentStringArrayOrDefault(key: String, ifNone: () -> Array<String>): Array<String> =
    intentExpand.getStringArrayOrDefault(key, ifNone)

@JvmName("getIntentCharSequenceArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentCharSequenceArrayOrDefault(
    key: String,
    ifNone: () -> Array<CharSequence>
): Array<CharSequence> = intentExpand.getCharSequenceArrayOrDefault(key, ifNone)

@JvmName("getIntentBundleOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.intentBundleOrDefault(key: String, ifNone: () -> Bundle): Bundle =
    intentExpand.getBundleOrDefault(key, ifNone)

// bundle extras
@JvmName("getBundleOrEmpty")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleOrEmptyExpand(): Bundle = bundleExpand.orEmptyExpand()

@JvmName("getBundleAny")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleAnyExpand(key: String): Any =
    bundleExpand.getExpand(key)

@JvmName("getBundleBoolean")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleBooleanExpand(key: String): Boolean =
    bundleExpand.getBooleanExpand(key)

@JvmName("getBundleByte")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleByteExpand(key: String): Byte =
    bundleExpand.getByteExpand(key)

@JvmName("getBundleChar")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleCharExpand(key: String): Char =
    bundleExpand.getCharExpand(key)

@JvmName("getBundleShort")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleShortExpand(key: String): Short =
    bundleExpand.getShortExpand(key)

@JvmName("getBundleInt")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleIntExpand(key: String): Int =
    bundleExpand.getIntExpand(key)

@JvmName("getBundleLong")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleLongExpand(key: String): Long =
    bundleExpand.getLongExpand(key)

@JvmName("getBundleFloat")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleFloatExpand(key: String): Float =
    bundleExpand.getFloatExpand(key)

@JvmName("getBundleDouble")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleDoubleExpand(key: String): Double =
    bundleExpand.getDoubleExpand(key)

@JvmName("getBundleString")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleStringExpand(key: String): String =
    bundleExpand.getStringExpand(key)

@JvmName("getBundleCharSequence")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleCharSequenceExpand(key: String): CharSequence =
    bundleExpand.getCharSequenceExpand(key)

@JvmName("getBundleSize")
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleSizeExpand(key: String): Size =
    bundleExpand.getSizeExpand(key)

@JvmName("getBundleSizeF")
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleSizeFExpand(key: String): SizeF =
    bundleExpand.getSizeFExpand(key)

@JvmName("getBundleIntArrayList")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleIntArrayListExpand(key: String): ArrayList<Int> =
    bundleExpand.getIntArrayListExpand(key)

@JvmName("getBundleStringArrayList")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleStringArrayListExpand(key: String): ArrayList<String> =
    bundleExpand.getStringArrayListExpand(key)

@JvmName("getBundleCharSequenceArrayList")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleCharSequenceArrayListExpand(key: String): ArrayList<CharSequence> =
    bundleExpand.getCharSequenceArrayListExpand(key)

@JvmName("getBundleSerializable")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleSerializableExpand(key: String): Serializable =
    bundleExpand.getSerializableExpand(key)

@JvmName("getBundleBooleanArray")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleBooleanArrayExpand(key: String): BooleanArray =
    bundleExpand.getBooleanArrayExpand(key)

@JvmName("getBundleByteArray")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleByteArrayExpand(key: String): ByteArray =
    bundleExpand.getByteArrayExpand(key)

@JvmName("getBundleShortArray")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleShortArrayExpand(key: String): ShortArray =
    bundleExpand.getShortArrayExpand(key)

@JvmName("getBundleCharArray")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleCharArrayExpand(key: String): CharArray =
    bundleExpand.getCharArrayExpand(key)

@JvmName("getBundleIntArray")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleIntArrayExpand(key: String): IntArray =
    bundleExpand.getIntArrayExpand(key)

@JvmName("getBundleLongArray")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleLongArrayExpand(key: String): LongArray =
    bundleExpand.getLongArrayExpand(key)

@JvmName("getBundleFloatArray")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleFloatArrayExpand(key: String): FloatArray =
    bundleExpand.getFloatArrayExpand(key)

@JvmName("getBundleDoubleArray")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleDoubleArrayExpand(key: String): DoubleArray =
    bundleExpand.getDoubleArrayExpand(key)

@JvmName("getBundleStringArray")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleStringArrayExpand(key: String): Array<String> =
    bundleExpand.getStringArrayExpand(key)

@JvmName("getBundleCharSequenceArray")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleCharSequenceArrayExpand(key: String): Array<CharSequence> =
    bundleExpand.getCharSequenceArrayExpand(key)

@JvmName("getBundleParcelable")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Activity?.bundleParcelableExpand(key: String): T =
    bundleExpand.getParcelableExpand(key)

@JvmName("getBundleParcelableArray")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Activity?.bundleParcelableArrayExpand(key: String): Array<T> =
    bundleExpand.getParcelableArrayExpand(key)

@JvmName("getBundleParcelableArrayList")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Activity?.bundleParcelableArrayListExpand(key: String): ArrayList<T> =
    bundleExpand.getParcelableArrayListExpand(key)

@JvmName("getBundleSparseParcelableArray")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Activity?.bundleSparseParcelableArrayExpand(key: String): SparseArray<T> =
    bundleExpand.getSparseParcelableArrayExpand(key)

@JvmName("getBundleBundle")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleBundleExpand(key: String): Bundle =
    bundleExpand.getBundleExpand(key)

@JvmName("getBundleAnyOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleAnyOrDefault(key: String, defaultValue: Any = Any()): Any =
    bundleExpand.getOrDefault(key, defaultValue)

@JvmName("getBundleBooleanOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleBooleanOrDefault(key: String, defaultValue: Boolean = false): Boolean =
    bundleExpand.getBooleanOrDefault(key, defaultValue)

@JvmName("getBundleByteOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleByteOrDefault(key: String, defaultValue: Byte = 0.toByte()): Byte =
    bundleExpand.getByteOrDefault(key, defaultValue)

@JvmName("getBundleCharOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleCharOrDefault(key: String, defaultValue: Char = 0.toChar()): Char =
    bundleExpand.getCharOrDefault(key, defaultValue)

@JvmName("getBundleShortOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleShortOrDefault(key: String, defaultValue: Short = 0.toShort()): Short =
    bundleExpand.getShortOrDefault(key, defaultValue)

@JvmName("getBundleIntOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleIntOrDefault(key: String, defaultValue: Int = 0): Int =
    bundleExpand.getIntOrDefault(key, defaultValue)

@JvmName("getBundleLongOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleLongOrDefault(key: String, defaultValue: Long = 0.toLong()): Long =
    bundleExpand.getLongOrDefault(key, defaultValue)

@JvmName("getBundleFloatOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleFloatOrDefault(key: String, defaultValue: Float = 0.toFloat()): Float =
    bundleExpand.getFloatOrDefault(key, defaultValue)

@JvmName("getBundleDoubleOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleDoubleOrDefault(key: String, defaultValue: Double = 0.toDouble()): Double =
    bundleExpand.getDoubleOrDefault(key, defaultValue)

@JvmName("getBundleStringOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleStringOrDefault(key: String, defaultValue: String = ""): String =
    bundleExpand.getStringOrDefault(key, defaultValue)

@JvmName("getBundleCharSequenceOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleCharSequenceOrDefault(
    key: String,
    defaultValue: CharSequence = ""
): CharSequence =
    bundleExpand.getCharSequenceOrDefault(key, defaultValue)

@JvmName("getBundleParcelableOrDefault")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Activity?.bundleParcelableOrDefault(
    key: String,
    defaultValue: Parcelable = bundleExpand?.getParcelable<T>(key)!!
): T = bundleExpand.getParcelableOrDefault(key) { defaultValue as T }

@JvmName("getBundleParcelableArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Activity?.bundleParcelableArrayOrDefault(
    key: String,
    defaultValue: Array<Parcelable> = emptyArray()
): Array<T> = bundleExpand.getParcelableArrayOrDefault(key) { defaultValue as Array<T> }

@JvmName("getBundleParcelableArrayListOrDefault")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Activity?.bundleParcelableArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<T> = arrayListOf()
): ArrayList<T> = bundleExpand.getParcelableArrayListOrDefault(key, defaultValue)

@JvmName("getBundleSparseParcelableArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Activity?.bundleSparseParcelableArrayOrDefault(
    key: String,
    defaultValue: SparseArray<T> = sparseArrayOf()
): SparseArray<T> = bundleExpand.getSparseParcelableArrayOrDefault(key, defaultValue)

@JvmName("getBundleBundleOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleBundleOrDefault(
    key: String,
    defaultValue: Bundle = Bundle.EMPTY
): Bundle = bundleExpand.getBundleOrDefault(key, defaultValue)

@JvmName("getBundleSizeOrDefault")
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleSizeOrDefault(
    key: String,
    defaultValue: Size = Size(0, 0)
): Size = bundleExpand.getSizeOrDefault(key, defaultValue)

@JvmName("getBundleSizeFOrDefault")
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleSizeFOrDefault(
    key: String,
    defaultValue: SizeF = SizeF(0.toFloat(), 0.toFloat())
): SizeF = bundleExpand.getSizeFOrDefault(key, defaultValue)

@JvmName("getBundleIntArrayListOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleIntArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<Int> = arrayListOf()
): ArrayList<Int> = bundleExpand.getIntArrayListOrDefault(key, defaultValue)

@JvmName("getBundleStringArrayListOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleStringArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<String> = arrayListOf()
): ArrayList<String> = bundleExpand.getStringArrayListOrDefault(key, defaultValue)

@JvmName("getBundleCharSequenceArrayListOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleCharSequenceArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<CharSequence> = arrayListOf()
): ArrayList<CharSequence> = bundleExpand.getCharSequenceArrayListOrDefault(key, defaultValue)

@JvmName("getBundleSerializableOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleSerializableOrDefault(
    key: String,
    defaultValue: Serializable = bundleExpand?.getSerializable(key)!!
): Serializable = bundleExpand.getSerializableOrDefault(key, defaultValue)

@JvmName("getBundleBooleanArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleBooleanArrayOrDefault(
    key: String,
    defaultValue: BooleanArray = booleanArrayOf()
): BooleanArray = bundleExpand.getBooleanArrayOrDefault(key, defaultValue)

@JvmName("getBundleByteArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleByteArrayOrDefault(
    key: String,
    defaultValue: ByteArray = byteArrayOf()
): ByteArray = bundleExpand.getByteArrayOrDefault(key, defaultValue)

@JvmName("getBundleShortArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleShortArrayOrDefault(
    key: String,
    defaultValue: ShortArray = shortArrayOf()
): ShortArray = bundleExpand.getShortArrayOrDefault(key, defaultValue)

@JvmName("getBundleCharArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleCharArrayOrDefault(
    key: String,
    defaultValue: CharArray = charArrayOf()
): CharArray = bundleExpand.getCharArrayOrDefault(key, defaultValue)

@JvmName("getBundleIntArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleIntArrayOrDefault(
    key: String,
    defaultValue: IntArray = intArrayOf()
): IntArray = bundleExpand.getIntArrayOrDefault(key, defaultValue)

@JvmName("getBundleLongArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleLongArrayOrDefault(
    key: String,
    defaultValue: LongArray = longArrayOf()
): LongArray = bundleExpand.getLongArrayOrDefault(key, defaultValue)

@JvmName("getBundleFloatArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleFloatArrayOrDefault(
    key: String,
    defaultValue: FloatArray = floatArrayOf()
): FloatArray = bundleExpand.getFloatArrayOrDefault(key, defaultValue)

@JvmName("getBundleDoubleArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleDoubleArrayOrDefault(
    key: String,
    defaultValue: DoubleArray = doubleArrayOf()
): DoubleArray = bundleExpand.getDoubleArrayOrDefault(key, defaultValue)

@JvmName("getBundleStringArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleStringArrayOrDefault(
    key: String,
    defaultValue: Array<String> = emptyArray()
): Array<String> = bundleExpand.getStringArrayOrDefault(key, defaultValue)

@JvmName("getBundleCharSequenceArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleCharSequenceArrayOrDefault(
    key: String,
    defaultValue: Array<CharSequence> = emptyArray()
): Array<CharSequence> = bundleExpand.getCharSequenceArrayOrDefault(key, defaultValue)

//ifNone
@JvmName("getBundleAnyOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleAnyOrDefault(key: String, ifNone: () -> Any): Any =
    bundleExpand.getOrDefault(key, ifNone)

@JvmName("getBundleBooleanOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleBooleanOrDefault(key: String, ifNone: () -> Boolean): Boolean =
    bundleExpand.getBooleanOrDefault(key, ifNone)

@JvmName("getBundleByteOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleByteOrDefault(key: String, ifNone: () -> Byte): Byte =
    bundleExpand.getByteOrDefault(key, ifNone)

@JvmName("getBundleCharOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleCharOrDefault(key: String, ifNone: () -> Char): Char =
    bundleExpand.getCharOrDefault(key, ifNone)

@JvmName("getBundleShortOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleShortOrDefault(key: String, ifNone: () -> Short): Short =
    bundleExpand.getShortOrDefault(key, ifNone)

@JvmName("getBundleIntOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleIntOrDefault(key: String, ifNone: () -> Int): Int =
    bundleExpand.getIntOrDefault(key, ifNone)

@JvmName("getBundleLongOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleLongOrDefault(key: String, ifNone: () -> Long): Long =
    bundleExpand.getLongOrDefault(key, ifNone)

@JvmName("getBundleFloatOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleFloatOrDefault(key: String, ifNone: () -> Float): Float =
    bundleExpand.getFloatOrDefault(key, ifNone)

@JvmName("getBundleDoubleOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleDoubleOrDefault(key: String, ifNone: () -> Double): Double =
    bundleExpand.getDoubleOrDefault(key, ifNone)

@JvmName("getBundleStringOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleStringOrDefault(key: String, ifNone: () -> String): String =
    bundleExpand.getStringOrDefault(key, ifNone)

@JvmName("getBundleCharSequenceOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleCharSequenceOrDefault(key: String, ifNone: () -> CharSequence): CharSequence =
    bundleExpand.getCharSequenceOrDefault(key, ifNone)

@JvmName("getBundleParcelableOrDefault")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Activity?.bundleParcelableOrDefault(
    key: String,
    ifNone: () -> T
): T = bundleExpand.getParcelableOrDefault(key, ifNone)

@JvmName("getBundleParcelableArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Activity?.bundleParcelableArrayOrDefault(
    key: String,
    ifNone: () -> Array<T>
): Array<T> = bundleExpand.getParcelableArrayOrDefault(key, ifNone)

@JvmName("getBundleParcelableArrayListOrDefault")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Activity?.bundleParcelableArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<T>
): ArrayList<T> = bundleExpand.getParcelableArrayListOrDefault(key, ifNone)

@JvmName("getBundleSparseParcelableArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun <T : Parcelable> Activity?.bundleSparseParcelableArrayOrDefault(
    key: String,
    ifNone: () -> SparseArray<T>
): SparseArray<T> = bundleExpand.getSparseParcelableArrayOrDefault(key, ifNone)

@JvmName("getBundleBundleOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleBundleOrDefault(key: String, ifNone: () -> Bundle): Bundle =
    bundleExpand.getBundleOrDefault(key, ifNone)

@JvmName("getBundleSizeOrDefault")
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleSizeOrDefault(key: String, ifNone: () -> Size): Size =
    bundleExpand.getSizeOrDefault(key, ifNone)

@JvmName("getBundleSizeFOrDefault")
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleSizeFOrDefault(key: String, ifNone: () -> SizeF): SizeF =
    bundleExpand.getSizeFOrDefault(key, ifNone)

@JvmName("getBundleIntArrayListOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleIntArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<Int>
): ArrayList<Int> =
    bundleExpand.getIntArrayListOrDefault(key, ifNone)

@JvmName("getBundleStringArrayListOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleStringArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<String>
): ArrayList<String> = bundleExpand.getStringArrayListOrDefault(key, ifNone)

@JvmName("getBundleCharSequenceArrayListOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleCharSequenceArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<CharSequence>
): ArrayList<CharSequence> = bundleExpand.getCharSequenceArrayListOrDefault(key, ifNone)

@JvmName("getBundleSerializableOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleSerializableOrDefault(key: String, ifNone: () -> Serializable): Serializable =
    bundleExpand.getSerializableOrDefault(key, ifNone)

@JvmName("getBundleBooleanArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleBooleanArrayOrDefault(key: String, ifNone: () -> BooleanArray): BooleanArray =
    bundleExpand.getBooleanArrayOrDefault(key, ifNone)

@JvmName("getBundleByteArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleByteArrayOrDefault(key: String, ifNone: () -> ByteArray): ByteArray =
    bundleExpand.getByteArrayOrDefault(key, ifNone)

@JvmName("getBundleShortArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleShortArrayOrDefault(key: String, ifNone: () -> ShortArray): ShortArray =
    bundleExpand.getShortArrayOrDefault(key, ifNone)

@JvmName("getBundleCharArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleCharArrayOrDefault(key: String, ifNone: () -> CharArray): CharArray =
    bundleExpand.getCharArrayOrDefault(key, ifNone)

@JvmName("getBundleIntArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleIntArrayOrDefault(key: String, ifNone: () -> IntArray): IntArray =
    bundleExpand.getIntArrayOrDefault(key, ifNone)

@JvmName("getBundleLongArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleLongArrayOrDefault(key: String, ifNone: () -> LongArray): LongArray =
    bundleExpand.getLongArrayOrDefault(key, ifNone)

@JvmName("getBundleFloatArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleFloatArrayOrDefault(key: String, ifNone: () -> FloatArray): FloatArray =
    bundleExpand.getFloatArrayOrDefault(key, ifNone)

@JvmName("getBundleDoubleArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleDoubleArrayOrDefault(key: String, ifNone: () -> DoubleArray): DoubleArray =
    bundleExpand.getDoubleArrayOrDefault(key, ifNone)

@JvmName("getBundleStringArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleStringArrayOrDefault(key: String, ifNone: () -> Array<String>): Array<String> =
    bundleExpand.getStringArrayOrDefault(key, ifNone)

@JvmName("getBundleCharSequenceArrayOrDefault")
@Version([VersionLog(Version.BANANA)])
fun Activity?.bundleCharSequenceArrayOrDefault(
    key: String,
    ifNone: () -> Array<CharSequence>
): Array<CharSequence> = bundleExpand.getCharSequenceArrayOrDefault(key, ifNone)
