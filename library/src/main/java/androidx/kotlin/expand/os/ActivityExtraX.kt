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

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
val Activity?.intentExpand: Intent?
    get() = this?.intent

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
val Activity?.bundleExpand: Bundle?
    get() = this?.intent?.extras

// intent extras

@JvmName("getIntentOrEmpty")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentOrEmptyExpand(): Intent = intentExpand.orEmptyExpand()

@JvmName("getIntentBoolean")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentBooleanExpand(key: String): Boolean =
    intentExpand.getBooleanExpand(key)

@JvmName("getIntentByte")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentByteExpand(key: String): Byte =
    intentExpand.getByteExpand(key)

@JvmName("getIntentChar")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentCharExpand(key: String): Char =
    intentExpand.getCharExpand(key)

@JvmName("getIntentShort")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentShortExpand(key: String): Short =
    intentExpand.getShortExpand(key)

@JvmName("getIntentInt")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentIntExpand(key: String): Int =
    intentExpand.getIntExpand(key)

@JvmName("getIntentLong")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentLongExpand(key: String): Long =
    intentExpand.getLongExpand(key)

@JvmName("getIntentFloat")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentFloatExpand(key: String): Float =
    intentExpand.getFloatExpand(key)

@JvmName("getIntentDouble")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentDoubleExpand(key: String): Double =
    intentExpand.getDoubleExpand(key)

@JvmName("getIntentString")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentStringExpand(key: String): String =
    intentExpand.getStringExpand(key)

@JvmName("getIntentCharSequence")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentCharSequenceExpand(key: String): CharSequence =
    intentExpand.getCharSequenceExpand(key)

@JvmName("getIntentIntArrayList")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentIntArrayListExpand(key: String): ArrayList<Int> =
    intentExpand.getIntArrayListExpand(key)

@JvmName("getIntentStringArrayList")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentStringArrayListExpand(key: String): ArrayList<String> =
    intentExpand.getStringArrayListExpand(key)

@JvmName("getIntentCharSequenceArrayList")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentCharSequenceArrayListExpand(key: String): ArrayList<CharSequence> =
    intentExpand.getCharSequenceArrayListExpand(key)

@JvmName("getIntentBooleanArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentBooleanArrayExpand(key: String): BooleanArray =
    intentExpand.getBooleanArrayExpand(key)

@JvmName("getIntentByteArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentByteArrayExpand(key: String): ByteArray =
    intentExpand.getByteArrayExpand(key)

@JvmName("getIntentShortArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentShortArrayExpand(key: String): ShortArray =
    intentExpand.getShortArrayExpand(key)

@JvmName("getIntentCharArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentCharArrayExpand(key: String): CharArray =
    intentExpand.getCharArrayExpand(key)

@JvmName("getIntentIntArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentIntArrayExpand(key: String): IntArray =
    intentExpand.getIntArrayExpand(key)

@JvmName("getIntentLongArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentLongArrayExpand(key: String): LongArray =
    intentExpand.getLongArrayExpand(key)

@JvmName("getIntentFloatArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentFloatArrayExpand(key: String): FloatArray =
    intentExpand.getFloatArrayExpand(key)

@JvmName("getIntentDoubleArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentDoubleArrayExpand(key: String): DoubleArray =
    intentExpand.getDoubleArrayExpand(key)

@JvmName("getIntentStringArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentStringArrayExpand(key: String): Array<String> =
    intentExpand.getStringArrayExpand(key)

@JvmName("getIntentCharSequenceArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentCharSequenceArrayExpand(key: String): Array<CharSequence> =
    intentExpand.getCharSequenceArrayExpand(key)

@JvmName("getIntentParcelable")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Parcelable> Activity?.intentParcelableExpand(key: String): T =
    intentExpand.getParcelableExpand(key)

@JvmName("getIntentParcelableArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Parcelable> Activity?.intentParcelableArrayExpand(key: String): Array<T> =
    intentExpand.getParcelableArrayExpand(key)

@JvmName("getIntentParcelableArrayList")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Parcelable> Activity?.intentParcelableArrayListExpand(key: String): ArrayList<T> =
    intentExpand.getParcelableArrayListExpand(key)

@JvmName("getIntentSerializable")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentSerializableExpand(key: String): Serializable =
    intentExpand.getSerializableExpand(key)

@JvmName("getIntentBundle")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentBundleExpand(key: String): Bundle =
    intentExpand.getBundleExpand(key)

@JvmName("getIntentBooleanOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentBooleanOrDefault(key: String, defaultValue: Boolean = false): Boolean =
    intentExpand.getBooleanOrDefault(key, defaultValue)

@JvmName("getIntentByteOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentByteOrDefault(key: String, defaultValue: Byte = 0.toByte()): Byte =
    intentExpand.getByteOrDefault(key, defaultValue)

@JvmName("getIntentShortOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentShortOrDefault(key: String, defaultValue: Short = 0.toShort()): Short =
    intentExpand.getShortOrDefault(key, defaultValue)

@JvmName("getIntentCharOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentCharOrDefault(key: String, defaultValue: Char = 0.toChar()): Char =
    intentExpand.getCharOrDefault(key, defaultValue)

@JvmName("getIntentIntOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentIntOrDefault(key: String, defaultValue: Int = 0): Int =
    intentExpand.getIntOrDefault(key, defaultValue)

@JvmName("getIntentLongOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentLongOrDefault(key: String, defaultValue: Long = 0.toLong()): Long =
    intentExpand.getLongOrDefault(key, defaultValue)

@JvmName("getIntentFloatOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentFloatOrDefault(key: String, defaultValue: Float = 0.toFloat()): Float =
    intentExpand.getFloatOrDefault(key, defaultValue)

@JvmName("getIntentDoubleOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentDoubleOrDefault(key: String, defaultValue: Double = 0.toDouble()): Double =
    intentExpand.getDoubleOrDefault(key, defaultValue)

@JvmName("getIntentStringOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentStringOrDefault(key: String, defaultValue: String = ""): String =
    intentExpand.getStringOrDefault(key, defaultValue)

@JvmName("getIntentCharSequenceOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentCharSequenceOrDefault(
    key: String,
    defaultValue: CharSequence = ""
): CharSequence = intentExpand.getCharSequenceOrDefault(key, defaultValue)

@JvmName("getIntentParcelableOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Parcelable> Activity?.intentParcelableOrDefault(
    key: String,
    defaultValue: Parcelable = intentExpand?.getParcelableExtra<T>(key)!!
): T = intentExpand.getParcelableOrDefault(key, defaultValue)

@JvmName("getIntentParcelableArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Parcelable> Activity?.intentParcelableArrayOrDefault(
    key: String,
    defaultValue: Array<Parcelable> = emptyArray()
): Array<T> = intentExpand.getParcelableArrayOrDefault(key, defaultValue)

@JvmName("getIntentParcelableArrayListOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Parcelable> Activity?.intentParcelableArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<T> = arrayListOf()
): ArrayList<T> = intentExpand.getParcelableArrayListOrDefault(key, defaultValue)

@JvmName("getIntentSerializableOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentSerializableOrDefault(
    key: String,
    defaultValue: Serializable = intentExpand?.getSerializableExtra(key)!!
): Serializable = intentExpand.getSerializableOrDefault(key, defaultValue)

@JvmName("getIntentIntArrayListOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentIntArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<Int> = arrayListOf()
): ArrayList<Int> = intentExpand.getIntArrayListOrDefault(key, defaultValue)

@JvmName("getIntentStringArrayListOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentStringArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<String> = arrayListOf()
): ArrayList<String> = intentExpand.getStringArrayListOrDefault(key, defaultValue)

@JvmName("getIntentCharSequenceArrayListOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentCharSequenceArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<CharSequence> = arrayListOf()
): ArrayList<CharSequence> = intentExpand.getCharSequenceArrayListOrDefault(key, defaultValue)

@JvmName("getIntentBooleanArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentBooleanArrayOrDefault(
    key: String,
    defaultValue: BooleanArray = booleanArrayOf()
): BooleanArray = intentExpand.getBooleanArrayOrDefault(key, defaultValue)

@JvmName("getIntentByteArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentByteArrayOrDefault(
    key: String,
    defaultValue: ByteArray = byteArrayOf()
): ByteArray = intentExpand.getByteArrayOrDefault(key, defaultValue)

@JvmName("getIntentShortArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentShortArrayOrDefault(
    key: String,
    defaultValue: ShortArray = shortArrayOf()
): ShortArray = intentExpand.getShortArrayOrDefault(key, defaultValue)

@JvmName("getIntentCharArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentCharArrayOrDefault(
    key: String,
    defaultValue: CharArray = charArrayOf()
): CharArray = intentExpand.getCharArrayOrDefault(key, defaultValue)

@JvmName("getIntentIntArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentIntArrayOrDefault(
    key: String,
    defaultValue: IntArray = intArrayOf()
): IntArray = intentExpand.getIntArrayOrDefault(key, defaultValue)

@JvmName("getIntentLongArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentLongArrayOrDefault(
    key: String,
    defaultValue: LongArray = longArrayOf()
): LongArray = intentExpand.getLongArrayOrDefault(key, defaultValue)

@JvmName("getIntentFloatArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentFloatArrayOrDefault(
    key: String,
    defaultValue: FloatArray = floatArrayOf()
): FloatArray = intentExpand.getFloatArrayOrDefault(key, defaultValue)

@JvmName("getIntentDoubleArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentDoubleArrayOrDefault(
    key: String,
    defaultValue: DoubleArray = doubleArrayOf()
): DoubleArray = intentExpand.getDoubleArrayOrDefault(key, defaultValue)

@JvmName("getIntentStringArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentStringArrayOrDefault(
    key: String,
    defaultValue: Array<String> = emptyArray()
): Array<String> = intentExpand.getStringArrayOrDefault(key, defaultValue)

@JvmName("getIntentCharSequenceArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentCharSequenceArrayOrDefault(
    key: String,
    defaultValue: Array<CharSequence> = emptyArray()
): Array<CharSequence> = intentExpand.getCharSequenceArrayOrDefault(key, defaultValue)

@JvmName("getIntentBundleOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentBundleOrDefault(key: String, defaultValue: Bundle = Bundle.EMPTY): Bundle =
    intentExpand.getBundleOrDefault(key, defaultValue)

//ifNone
@JvmName("getIntentBooleanOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentBooleanOrDefault(key: String, ifNone: () -> Boolean): Boolean =
    intentExpand.getBooleanOrDefault(key, ifNone)

@JvmName("getIntentByteOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentByteOrDefault(key: String, ifNone: () -> Byte): Byte =
    intentExpand.getByteOrDefault(key, ifNone)

@JvmName("getIntentShortOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentShortOrDefault(key: String, ifNone: () -> Short): Short =
    intentExpand.getShortOrDefault(key, ifNone)

@JvmName("getIntentCharOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentCharOrDefault(key: String, ifNone: () -> Char): Char =
    intentExpand.getCharOrDefault(key, ifNone)

@JvmName("getIntentIntOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentIntOrDefault(key: String, ifNone: () -> Int): Int =
    intentExpand.getIntOrDefault(key, ifNone)

@JvmName("getIntentLongOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentLongOrDefault(key: String, ifNone: () -> Long): Long =
    intentExpand.getLongOrDefault(key, ifNone)

@JvmName("getIntentFloatOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentFloatOrDefault(key: String, ifNone: () -> Float): Float =
    intentExpand.getFloatOrDefault(key, ifNone)

@JvmName("getIntentDoubleOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentDoubleOrDefault(key: String, ifNone: () -> Double): Double =
    intentExpand.getDoubleOrDefault(key, ifNone)

@JvmName("getIntentStringOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentStringOrDefault(key: String, ifNone: () -> String): String =
    intentExpand.getStringOrDefault(key, ifNone)

@JvmName("getIntentCharSequenceOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentCharSequenceOrDefault(key: String, ifNone: () -> CharSequence): CharSequence =
    intentExpand.getCharSequenceOrDefault(key, ifNone)

@JvmName("getIntentParcelableOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Parcelable> Activity?.intentParcelableOrDefault(key: String, ifNone: () -> T): T =
    intentExpand.getParcelableOrDefault(key, ifNone)

@JvmName("getIntentParcelableArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Parcelable> Activity?.intentParcelableArrayOrDefault(
    key: String,
    ifNone: () -> Array<T>
): Array<T> = intentExpand.getParcelableArrayOrDefault(key, ifNone)

@JvmName("getIntentParcelableArrayListOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Parcelable> Activity?.intentParcelableArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<T>
): ArrayList<T> = intentExpand.getParcelableArrayListOrDefault(key, ifNone)

@JvmName("getIntentSerializableOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentSerializableOrDefault(key: String, ifNone: () -> Serializable): Serializable =
    intentExpand.getSerializableOrDefault(key, ifNone)

@JvmName("getIntentIntArrayListOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentIntArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<Int>
): ArrayList<Int> =
    intentExpand.getIntArrayListOrDefault(key, ifNone)

@JvmName("getIntentStringArrayListOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentStringArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<String>
): ArrayList<String> = intentExpand.getStringArrayListOrDefault(key, ifNone)

@JvmName("getIntentCharSequenceArrayListOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentCharSequenceArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<CharSequence>
): ArrayList<CharSequence> = intentExpand.getCharSequenceArrayListOrDefault(key, ifNone)

@JvmName("getIntentBooleanArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentBooleanArrayOrDefault(key: String, ifNone: () -> BooleanArray): BooleanArray =
    intentExpand.getBooleanArrayOrDefault(key, ifNone)

@JvmName("getIntentByteArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentByteArrayOrDefault(key: String, ifNone: () -> ByteArray): ByteArray =
    intentExpand.getByteArrayOrDefault(key, ifNone)

@JvmName("getIntentShortArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentShortArrayOrDefault(key: String, ifNone: () -> ShortArray): ShortArray =
    intentExpand.getShortArrayOrDefault(key, ifNone)

@JvmName("getIntentCharArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentCharArrayOrDefault(key: String, ifNone: () -> CharArray): CharArray =
    intentExpand.getCharArrayOrDefault(key, ifNone)

@JvmName("getIntentIntArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentIntArrayOrDefault(key: String, ifNone: () -> IntArray): IntArray =
    intentExpand.getIntArrayOrDefault(key, ifNone)

@JvmName("getIntentLongArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentLongArrayOrDefault(key: String, ifNone: () -> LongArray): LongArray =
    intentExpand.getLongArrayOrDefault(key, ifNone)

@JvmName("getIntentFloatArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentFloatArrayOrDefault(key: String, ifNone: () -> FloatArray): FloatArray =
    intentExpand.getFloatArrayOrDefault(key, ifNone)

@JvmName("getIntentDoubleArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentDoubleArrayOrDefault(key: String, ifNone: () -> DoubleArray): DoubleArray =
    intentExpand.getDoubleArrayOrDefault(key, ifNone)

@JvmName("getIntentStringArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentStringArrayOrDefault(key: String, ifNone: () -> Array<String>): Array<String> =
    intentExpand.getStringArrayOrDefault(key, ifNone)

@JvmName("getIntentCharSequenceArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentCharSequenceArrayOrDefault(
    key: String,
    ifNone: () -> Array<CharSequence>
): Array<CharSequence> = intentExpand.getCharSequenceArrayOrDefault(key, ifNone)

@JvmName("getIntentBundleOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.intentBundleOrDefault(key: String, ifNone: () -> Bundle): Bundle =
    intentExpand.getBundleOrDefault(key, ifNone)

// bundle extras
@JvmName("getBundleOrEmpty")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleOrEmptyExpand(): Bundle = bundleExpand.orEmptyExpand()

@JvmName("getBundleAny")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleAnyExpand(key: String): Any =
    bundleExpand.getExpand(key)

@JvmName("getBundleBoolean")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleBooleanExpand(key: String): Boolean =
    bundleExpand.getBooleanExpand(key)

@JvmName("getBundleByte")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleByteExpand(key: String): Byte =
    bundleExpand.getByteExpand(key)

@JvmName("getBundleChar")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleCharExpand(key: String): Char =
    bundleExpand.getCharExpand(key)

@JvmName("getBundleShort")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleShortExpand(key: String): Short =
    bundleExpand.getShortExpand(key)

@JvmName("getBundleInt")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleIntExpand(key: String): Int =
    bundleExpand.getIntExpand(key)

@JvmName("getBundleLong")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleLongExpand(key: String): Long =
    bundleExpand.getLongExpand(key)

@JvmName("getBundleFloat")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleFloatExpand(key: String): Float =
    bundleExpand.getFloatExpand(key)

@JvmName("getBundleDouble")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleDoubleExpand(key: String): Double =
    bundleExpand.getDoubleExpand(key)

@JvmName("getBundleString")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleStringExpand(key: String): String =
    bundleExpand.getStringExpand(key)

@JvmName("getBundleCharSequence")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleCharSequenceExpand(key: String): CharSequence =
    bundleExpand.getCharSequenceExpand(key)

@JvmName("getBundleSize")
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleSizeExpand(key: String): Size =
    bundleExpand.getSizeExpand(key)

@JvmName("getBundleSizeF")
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleSizeFExpand(key: String): SizeF =
    bundleExpand.getSizeFExpand(key)

@JvmName("getBundleIntArrayList")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleIntArrayListExpand(key: String): ArrayList<Int> =
    bundleExpand.getIntArrayListExpand(key)

@JvmName("getBundleStringArrayList")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleStringArrayListExpand(key: String): ArrayList<String> =
    bundleExpand.getStringArrayListExpand(key)

@JvmName("getBundleCharSequenceArrayList")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleCharSequenceArrayListExpand(key: String): ArrayList<CharSequence> =
    bundleExpand.getCharSequenceArrayListExpand(key)

@JvmName("getBundleSerializable")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleSerializableExpand(key: String): Serializable =
    bundleExpand.getSerializableExpand(key)

@JvmName("getBundleBooleanArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleBooleanArrayExpand(key: String): BooleanArray =
    bundleExpand.getBooleanArrayExpand(key)

@JvmName("getBundleByteArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleByteArrayExpand(key: String): ByteArray =
    bundleExpand.getByteArrayExpand(key)

@JvmName("getBundleShortArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleShortArrayExpand(key: String): ShortArray =
    bundleExpand.getShortArrayExpand(key)

@JvmName("getBundleCharArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleCharArrayExpand(key: String): CharArray =
    bundleExpand.getCharArrayExpand(key)

@JvmName("getBundleIntArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleIntArrayExpand(key: String): IntArray =
    bundleExpand.getIntArrayExpand(key)

@JvmName("getBundleLongArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleLongArrayExpand(key: String): LongArray =
    bundleExpand.getLongArrayExpand(key)

@JvmName("getBundleFloatArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleFloatArrayExpand(key: String): FloatArray =
    bundleExpand.getFloatArrayExpand(key)

@JvmName("getBundleDoubleArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleDoubleArrayExpand(key: String): DoubleArray =
    bundleExpand.getDoubleArrayExpand(key)

@JvmName("getBundleStringArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleStringArrayExpand(key: String): Array<String> =
    bundleExpand.getStringArrayExpand(key)

@JvmName("getBundleCharSequenceArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleCharSequenceArrayExpand(key: String): Array<CharSequence> =
    bundleExpand.getCharSequenceArrayExpand(key)

@JvmName("getBundleParcelable")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Parcelable> Activity?.bundleParcelableExpand(key: String): T =
    bundleExpand.getParcelableExpand(key)

@JvmName("getBundleParcelableArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Parcelable> Activity?.bundleParcelableArrayExpand(key: String): Array<T> =
    bundleExpand.getParcelableArrayExpand(key)

@JvmName("getBundleParcelableArrayList")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Parcelable> Activity?.bundleParcelableArrayListExpand(key: String): ArrayList<T> =
    bundleExpand.getParcelableArrayListExpand(key)

@JvmName("getBundleSparseParcelableArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Parcelable> Activity?.bundleSparseParcelableArrayExpand(key: String): SparseArray<T> =
    bundleExpand.getSparseParcelableArrayExpand(key)

@JvmName("getBundleBundle")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleBundleExpand(key: String): Bundle =
    bundleExpand.getBundleExpand(key)

@JvmName("getBundleAnyOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleAnyOrDefault(key: String, defaultValue: Any = Any()): Any =
    bundleExpand.getOrDefault(key, defaultValue)

@JvmName("getBundleBooleanOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleBooleanOrDefault(key: String, defaultValue: Boolean = false): Boolean =
    bundleExpand.getBooleanOrDefault(key, defaultValue)

@JvmName("getBundleByteOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleByteOrDefault(key: String, defaultValue: Byte = 0.toByte()): Byte =
    bundleExpand.getByteOrDefault(key, defaultValue)

@JvmName("getBundleCharOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleCharOrDefault(key: String, defaultValue: Char = 0.toChar()): Char =
    bundleExpand.getCharOrDefault(key, defaultValue)

@JvmName("getBundleShortOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleShortOrDefault(key: String, defaultValue: Short = 0.toShort()): Short =
    bundleExpand.getShortOrDefault(key, defaultValue)

@JvmName("getBundleIntOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleIntOrDefault(key: String, defaultValue: Int = 0): Int =
    bundleExpand.getIntOrDefault(key, defaultValue)

@JvmName("getBundleLongOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleLongOrDefault(key: String, defaultValue: Long = 0.toLong()): Long =
    bundleExpand.getLongOrDefault(key, defaultValue)

@JvmName("getBundleFloatOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleFloatOrDefault(key: String, defaultValue: Float = 0.toFloat()): Float =
    bundleExpand.getFloatOrDefault(key, defaultValue)

@JvmName("getBundleDoubleOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleDoubleOrDefault(key: String, defaultValue: Double = 0.toDouble()): Double =
    bundleExpand.getDoubleOrDefault(key, defaultValue)

@JvmName("getBundleStringOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleStringOrDefault(key: String, defaultValue: String = ""): String =
    bundleExpand.getStringOrDefault(key, defaultValue)

@JvmName("getBundleCharSequenceOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleCharSequenceOrDefault(
    key: String,
    defaultValue: CharSequence = ""
): CharSequence =
    bundleExpand.getCharSequenceOrDefault(key, defaultValue)

@JvmName("getBundleParcelableOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Parcelable> Activity?.bundleParcelableOrDefault(
    key: String,
    defaultValue: Parcelable = bundleExpand?.getParcelable<T>(key)!!
): T = bundleExpand.getParcelableOrDefault(key) { defaultValue as T }

@JvmName("getBundleParcelableArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Parcelable> Activity?.bundleParcelableArrayOrDefault(
    key: String,
    defaultValue: Array<Parcelable> = emptyArray()
): Array<T> = bundleExpand.getParcelableArrayOrDefault(key) { defaultValue as Array<T> }

@JvmName("getBundleParcelableArrayListOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Parcelable> Activity?.bundleParcelableArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<T> = arrayListOf()
): ArrayList<T> = bundleExpand.getParcelableArrayListOrDefault(key, defaultValue)

@JvmName("getBundleSparseParcelableArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Parcelable> Activity?.bundleSparseParcelableArrayOrDefault(
    key: String,
    defaultValue: SparseArray<T> = sparseArrayOf()
): SparseArray<T> = bundleExpand.getSparseParcelableArrayOrDefault(key, defaultValue)

@JvmName("getBundleBundleOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleBundleOrDefault(
    key: String,
    defaultValue: Bundle = Bundle.EMPTY
): Bundle = bundleExpand.getBundleOrDefault(key, defaultValue)

@JvmName("getBundleSizeOrDefault")
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleSizeOrDefault(
    key: String,
    defaultValue: Size = Size(0, 0)
): Size = bundleExpand.getSizeOrDefault(key, defaultValue)

@JvmName("getBundleSizeFOrDefault")
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleSizeFOrDefault(
    key: String,
    defaultValue: SizeF = SizeF(0.toFloat(), 0.toFloat())
): SizeF = bundleExpand.getSizeFOrDefault(key, defaultValue)

@JvmName("getBundleIntArrayListOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleIntArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<Int> = arrayListOf()
): ArrayList<Int> = bundleExpand.getIntArrayListOrDefault(key, defaultValue)

@JvmName("getBundleStringArrayListOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleStringArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<String> = arrayListOf()
): ArrayList<String> = bundleExpand.getStringArrayListOrDefault(key, defaultValue)

@JvmName("getBundleCharSequenceArrayListOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleCharSequenceArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<CharSequence> = arrayListOf()
): ArrayList<CharSequence> = bundleExpand.getCharSequenceArrayListOrDefault(key, defaultValue)

@JvmName("getBundleSerializableOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleSerializableOrDefault(
    key: String,
    defaultValue: Serializable = bundleExpand?.getSerializable(key)!!
): Serializable = bundleExpand.getSerializableOrDefault(key, defaultValue)

@JvmName("getBundleBooleanArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleBooleanArrayOrDefault(
    key: String,
    defaultValue: BooleanArray = booleanArrayOf()
): BooleanArray = bundleExpand.getBooleanArrayOrDefault(key, defaultValue)

@JvmName("getBundleByteArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleByteArrayOrDefault(
    key: String,
    defaultValue: ByteArray = byteArrayOf()
): ByteArray = bundleExpand.getByteArrayOrDefault(key, defaultValue)

@JvmName("getBundleShortArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleShortArrayOrDefault(
    key: String,
    defaultValue: ShortArray = shortArrayOf()
): ShortArray = bundleExpand.getShortArrayOrDefault(key, defaultValue)

@JvmName("getBundleCharArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleCharArrayOrDefault(
    key: String,
    defaultValue: CharArray = charArrayOf()
): CharArray = bundleExpand.getCharArrayOrDefault(key, defaultValue)

@JvmName("getBundleIntArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleIntArrayOrDefault(
    key: String,
    defaultValue: IntArray = intArrayOf()
): IntArray = bundleExpand.getIntArrayOrDefault(key, defaultValue)

@JvmName("getBundleLongArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleLongArrayOrDefault(
    key: String,
    defaultValue: LongArray = longArrayOf()
): LongArray = bundleExpand.getLongArrayOrDefault(key, defaultValue)

@JvmName("getBundleFloatArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleFloatArrayOrDefault(
    key: String,
    defaultValue: FloatArray = floatArrayOf()
): FloatArray = bundleExpand.getFloatArrayOrDefault(key, defaultValue)

@JvmName("getBundleDoubleArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleDoubleArrayOrDefault(
    key: String,
    defaultValue: DoubleArray = doubleArrayOf()
): DoubleArray = bundleExpand.getDoubleArrayOrDefault(key, defaultValue)

@JvmName("getBundleStringArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleStringArrayOrDefault(
    key: String,
    defaultValue: Array<String> = emptyArray()
): Array<String> = bundleExpand.getStringArrayOrDefault(key, defaultValue)

@JvmName("getBundleCharSequenceArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleCharSequenceArrayOrDefault(
    key: String,
    defaultValue: Array<CharSequence> = emptyArray()
): Array<CharSequence> = bundleExpand.getCharSequenceArrayOrDefault(key, defaultValue)

//ifNone
@JvmName("getBundleAnyOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleAnyOrDefault(key: String, ifNone: () -> Any): Any =
    bundleExpand.getOrDefault(key, ifNone)

@JvmName("getBundleBooleanOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleBooleanOrDefault(key: String, ifNone: () -> Boolean): Boolean =
    bundleExpand.getBooleanOrDefault(key, ifNone)

@JvmName("getBundleByteOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleByteOrDefault(key: String, ifNone: () -> Byte): Byte =
    bundleExpand.getByteOrDefault(key, ifNone)

@JvmName("getBundleCharOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleCharOrDefault(key: String, ifNone: () -> Char): Char =
    bundleExpand.getCharOrDefault(key, ifNone)

@JvmName("getBundleShortOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleShortOrDefault(key: String, ifNone: () -> Short): Short =
    bundleExpand.getShortOrDefault(key, ifNone)

@JvmName("getBundleIntOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleIntOrDefault(key: String, ifNone: () -> Int): Int =
    bundleExpand.getIntOrDefault(key, ifNone)

@JvmName("getBundleLongOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleLongOrDefault(key: String, ifNone: () -> Long): Long =
    bundleExpand.getLongOrDefault(key, ifNone)

@JvmName("getBundleFloatOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleFloatOrDefault(key: String, ifNone: () -> Float): Float =
    bundleExpand.getFloatOrDefault(key, ifNone)

@JvmName("getBundleDoubleOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleDoubleOrDefault(key: String, ifNone: () -> Double): Double =
    bundleExpand.getDoubleOrDefault(key, ifNone)

@JvmName("getBundleStringOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleStringOrDefault(key: String, ifNone: () -> String): String =
    bundleExpand.getStringOrDefault(key, ifNone)

@JvmName("getBundleCharSequenceOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleCharSequenceOrDefault(key: String, ifNone: () -> CharSequence): CharSequence =
    bundleExpand.getCharSequenceOrDefault(key, ifNone)

@JvmName("getBundleParcelableOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Parcelable> Activity?.bundleParcelableOrDefault(
    key: String,
    ifNone: () -> T
): T = bundleExpand.getParcelableOrDefault(key, ifNone)

@JvmName("getBundleParcelableArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Parcelable> Activity?.bundleParcelableArrayOrDefault(
    key: String,
    ifNone: () -> Array<T>
): Array<T> = bundleExpand.getParcelableArrayOrDefault(key, ifNone)

@JvmName("getBundleParcelableArrayListOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Parcelable> Activity?.bundleParcelableArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<T>
): ArrayList<T> = bundleExpand.getParcelableArrayListOrDefault(key, ifNone)

@JvmName("getBundleSparseParcelableArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Parcelable> Activity?.bundleSparseParcelableArrayOrDefault(
    key: String,
    ifNone: () -> SparseArray<T>
): SparseArray<T> = bundleExpand.getSparseParcelableArrayOrDefault(key, ifNone)

@JvmName("getBundleBundleOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleBundleOrDefault(key: String, ifNone: () -> Bundle): Bundle =
    bundleExpand.getBundleOrDefault(key, ifNone)

@JvmName("getBundleSizeOrDefault")
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleSizeOrDefault(key: String, ifNone: () -> Size): Size =
    bundleExpand.getSizeOrDefault(key, ifNone)

@JvmName("getBundleSizeFOrDefault")
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleSizeFOrDefault(key: String, ifNone: () -> SizeF): SizeF =
    bundleExpand.getSizeFOrDefault(key, ifNone)

@JvmName("getBundleIntArrayListOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleIntArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<Int>
): ArrayList<Int> =
    bundleExpand.getIntArrayListOrDefault(key, ifNone)

@JvmName("getBundleStringArrayListOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleStringArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<String>
): ArrayList<String> = bundleExpand.getStringArrayListOrDefault(key, ifNone)

@JvmName("getBundleCharSequenceArrayListOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleCharSequenceArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<CharSequence>
): ArrayList<CharSequence> = bundleExpand.getCharSequenceArrayListOrDefault(key, ifNone)

@JvmName("getBundleSerializableOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleSerializableOrDefault(key: String, ifNone: () -> Serializable): Serializable =
    bundleExpand.getSerializableOrDefault(key, ifNone)

@JvmName("getBundleBooleanArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleBooleanArrayOrDefault(key: String, ifNone: () -> BooleanArray): BooleanArray =
    bundleExpand.getBooleanArrayOrDefault(key, ifNone)

@JvmName("getBundleByteArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleByteArrayOrDefault(key: String, ifNone: () -> ByteArray): ByteArray =
    bundleExpand.getByteArrayOrDefault(key, ifNone)

@JvmName("getBundleShortArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleShortArrayOrDefault(key: String, ifNone: () -> ShortArray): ShortArray =
    bundleExpand.getShortArrayOrDefault(key, ifNone)

@JvmName("getBundleCharArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleCharArrayOrDefault(key: String, ifNone: () -> CharArray): CharArray =
    bundleExpand.getCharArrayOrDefault(key, ifNone)

@JvmName("getBundleIntArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleIntArrayOrDefault(key: String, ifNone: () -> IntArray): IntArray =
    bundleExpand.getIntArrayOrDefault(key, ifNone)

@JvmName("getBundleLongArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleLongArrayOrDefault(key: String, ifNone: () -> LongArray): LongArray =
    bundleExpand.getLongArrayOrDefault(key, ifNone)

@JvmName("getBundleFloatArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleFloatArrayOrDefault(key: String, ifNone: () -> FloatArray): FloatArray =
    bundleExpand.getFloatArrayOrDefault(key, ifNone)

@JvmName("getBundleDoubleArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleDoubleArrayOrDefault(key: String, ifNone: () -> DoubleArray): DoubleArray =
    bundleExpand.getDoubleArrayOrDefault(key, ifNone)

@JvmName("getBundleStringArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleStringArrayOrDefault(key: String, ifNone: () -> Array<String>): Array<String> =
    bundleExpand.getStringArrayOrDefault(key, ifNone)

@JvmName("getBundleCharSequenceArrayOrDefault")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity?.bundleCharSequenceArrayOrDefault(
    key: String,
    ifNone: () -> Array<CharSequence>
): Array<CharSequence> = bundleExpand.getCharSequenceArrayOrDefault(key, ifNone)
