package androidx.kotlin.expand.os

/**
 * simple typealias
 */
import android.os.Bundle
import android.util.Size
import android.util.SizeF
import java.io.Serializable

typealias Action<T> = () -> T
typealias ActionUnit = Action<Unit>
typealias ActionArrayCharSequence = Action<Array<CharSequence>>
typealias ActionArrayString = Action<Array<String>>
typealias ActionDoubleArray = Action<DoubleArray>
typealias ActionFloatArray = Action<FloatArray>
typealias ActionLongArray = Action<LongArray>
typealias ActionIntArray = Action<IntArray>
typealias ActionCharArray = Action<CharArray>
typealias ActionShortArray = Action<ShortArray>
typealias ActionByteArray = Action<ByteArray>
typealias ActionBooleanArray = Action<BooleanArray>
typealias ActionSerializable = Action<Serializable>
typealias ActionArrayListCharSequence = Action<ArrayList<CharSequence>>
typealias ActionArrayListString = Action<ArrayList<String>>
typealias ActionArrayListInt = Action<ArrayList<Int>>
typealias ActionSizeF = Action<SizeF>
typealias ActionSize = Action<Size>
typealias ActionBundle = Action<Bundle>
typealias ActionCharSequence = Action<CharSequence>
typealias ActionString = Action<String>
typealias ActionDouble = Action<Double>
typealias ActionFloat = Action<Float>
typealias ActionLong = Action<Long>
typealias ActionInt = Action<Int>
typealias ActionShort = Action<Short>
typealias ActionChar = Action<Char>
typealias ActionByte = Action<Byte>
typealias ActionBoolean = Action<Boolean>
typealias ActionAny = Action<Any>