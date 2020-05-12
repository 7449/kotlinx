package androidx.kotlin.expand.os

import android.os.Bundle
import android.util.Size
import android.util.SizeF
import androidx.kotlin.expand.annotation.Casually
import java.io.Serializable

@Casually
typealias Action<T> = () -> T
@Casually
typealias ActionUnit = Action<Unit>
@Casually
typealias ActionArrayCharSequence = Action<Array<CharSequence>>
@Casually
typealias ActionArrayString = Action<Array<String>>
@Casually
typealias ActionDoubleArray = Action<DoubleArray>
@Casually
typealias ActionFloatArray = Action<FloatArray>
@Casually
typealias ActionLongArray = Action<LongArray>
@Casually
typealias ActionIntArray = Action<IntArray>
@Casually
typealias ActionCharArray = Action<CharArray>
@Casually
typealias ActionShortArray = Action<ShortArray>
@Casually
typealias ActionByteArray = Action<ByteArray>
@Casually
typealias ActionBooleanArray = Action<BooleanArray>
@Casually
typealias ActionSerializable = Action<Serializable>
@Casually
typealias ActionArrayListCharSequence = Action<ArrayList<CharSequence>>
@Casually
typealias ActionArrayListString = Action<ArrayList<String>>
@Casually
typealias ActionArrayListInt = Action<ArrayList<Int>>
@Casually
typealias ActionSizeF = Action<SizeF>
@Casually
typealias ActionSize = Action<Size>
@Casually
typealias ActionBundle = Action<Bundle>
@Casually
typealias ActionCharSequence = Action<CharSequence>
@Casually
typealias ActionString = Action<String>
@Casually
typealias ActionDouble = Action<Double>
@Casually
typealias ActionFloat = Action<Float>
@Casually
typealias ActionLong = Action<Long>
@Casually
typealias ActionInt = Action<Int>
@Casually
typealias ActionShort = Action<Short>
@Casually
typealias ActionChar = Action<Char>
@Casually
typealias ActionByte = Action<Byte>
@Casually
typealias ActionBoolean = Action<Boolean>
@Casually
typealias ActionAny = Action<Any>