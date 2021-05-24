@file:JvmName("ArrayUtils")
@file:Suppress("NOTHING_TO_INLINE")

package androidx.kotlin.expand.util

import android.os.Build
import android.util.SparseArray
import android.util.SparseBooleanArray
import android.util.SparseIntArray
import android.util.SparseLongArray
import androidx.annotation.RequiresApi
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog

@Version(VersionLog(Version.NONE))
fun <T> sparseArrayOf(vararg pairs: Pair<Int, T>): SparseArray<T> =
    sparseArrayOf<T>().apply {
        for ((key, value) in pairs) {
            put(key, value)
        }
    }

@Version(VersionLog(Version.NONE))
fun sparseBooleanArrayOf(vararg pairs: Pair<Int, Boolean>): SparseBooleanArray =
    sparseBooleanArrayOf().apply {
        for ((key, value) in pairs) {
            put(key, value)
        }
    }

@Version(VersionLog(Version.NONE))
fun sparseIntArrayOf(vararg pairs: Pair<Int, Int>): SparseIntArray =
    sparseIntArrayOf().apply {
        for ((key, value) in pairs) {
            put(key, value)
        }
    }

@RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
@Version(VersionLog(Version.NONE))
fun sparseLongArrayOf(vararg pairs: Pair<Int, Long>): SparseLongArray =
    sparseLongArrayOf().apply {
        for ((key, value) in pairs) {
            put(key, value)
        }
    }

@JvmName("getEmptySparseArray")
@Version(VersionLog(Version.NONE))
inline fun <T> sparseArrayOf(): SparseArray<T> = SparseArray()

@JvmName("getEmptySparseBooleanArray")
@Version(VersionLog(Version.NONE))
inline fun sparseBooleanArrayOf(): SparseBooleanArray = SparseBooleanArray()

@JvmName("getEmptySparseIntArray")
@Version(VersionLog(Version.NONE))
inline fun sparseIntArrayOf(): SparseIntArray = SparseIntArray()

@JvmName("getEmptySparseLongArray")
@RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
@Version(VersionLog(Version.NONE))
inline fun sparseLongArrayOf(): SparseLongArray = SparseLongArray()