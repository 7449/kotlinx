@file:JvmName("ArrayUtils")
@file:Suppress("NOTHING_TO_INLINE")

package androidx.kotlin.expand.util

import android.os.Build
import android.util.SparseArray
import android.util.SparseBooleanArray
import android.util.SparseIntArray
import android.util.SparseLongArray
import androidx.annotation.RequiresApi
import androidx.kotlin.expand.annotation.Casually
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog

@Casually
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
interface OnSparseArrayListener<T> {
    fun putValue(key: Int, value: T)
}

@Casually
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T> SparseArray<T>.putExpand(action: OnSparseArrayListener<T>.() -> Unit): SparseArray<T> {
    action(object : OnSparseArrayListener<T> {
        override fun putValue(key: Int, value: T) {
            this@putExpand.put(key, value)
        }
    })
    return this
}

@Casually
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun SparseBooleanArray.putExpand(action: OnSparseArrayListener<Boolean>.() -> Unit): SparseBooleanArray {
    action(object : OnSparseArrayListener<Boolean> {
        override fun putValue(key: Int, value: Boolean) {
            this@putExpand.put(key, value)
        }
    })
    return this
}

@Casually
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun SparseIntArray.putExpand(action: OnSparseArrayListener<Int>.() -> Unit): SparseIntArray {
    action(object : OnSparseArrayListener<Int> {
        override fun putValue(key: Int, value: Int) {
            this@putExpand.put(key, value)
        }
    })
    return this
}

@Casually
@RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun SparseLongArray.putExpand(action: OnSparseArrayListener<Long>.() -> Unit): SparseLongArray {
    action(object : OnSparseArrayListener<Long> {
        override fun putValue(key: Int, value: Long) {
            this@putExpand.put(key, value)
        }
    })
    return this
}

@Casually
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T> sparseArrayOf(vararg pairs: Pair<Int, T>): SparseArray<T> =
    sparseArrayOf<T>().apply {
        for ((key, value) in pairs) {
            put(key, value)
        }
    }

@Casually
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun sparseBooleanArrayOf(vararg pairs: Pair<Int, Boolean>): SparseBooleanArray =
    sparseBooleanArrayOf().apply {
        for ((key, value) in pairs) {
            put(key, value)
        }
    }

@Casually
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun sparseIntArrayOf(vararg pairs: Pair<Int, Int>): SparseIntArray =
    sparseIntArrayOf().apply {
        for ((key, value) in pairs) {
            put(key, value)
        }
    }

@Casually
@RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun sparseLongArrayOf(vararg pairs: Pair<Int, Long>): SparseLongArray =
    sparseLongArrayOf().apply {
        for ((key, value) in pairs) {
            put(key, value)
        }
    }

@JvmName("getEmptySparseArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
inline fun <T> sparseArrayOf(): SparseArray<T> = SparseArray<T>()

@JvmName("getEmptySparseBooleanArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
inline fun sparseBooleanArrayOf(): SparseBooleanArray = SparseBooleanArray()

@JvmName("getEmptySparseIntArray")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
inline fun sparseIntArrayOf(): SparseIntArray = SparseIntArray()

@JvmName("getEmptySparseLongArray")
@RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
inline fun sparseLongArrayOf(): SparseLongArray = SparseLongArray()