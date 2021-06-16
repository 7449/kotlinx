@file:JvmName("DensityUtils")

package androidx.kotlin.expand.util

import android.content.Context
import android.util.TypedValue

@JvmName("dp2px")
fun Context.dp2pxExpand(dpVal: Float): Int =
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpVal, resources.displayMetrics).toInt()

@JvmName("sp2px")
fun Context.sp2pxExpand(spVal: Float): Int =
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, spVal, resources.displayMetrics).toInt()

@JvmName("px2dp")
fun Context.px2dpExpand(pxVal: Float): Float =
    pxVal / resources.displayMetrics.density

@JvmName("px2sp")
fun Context.px2spExpand(pxVal: Float): Float =
    pxVal / resources.displayMetrics.scaledDensity