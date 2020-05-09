@file:JvmName("DensityUtils")

package androidx.kotlin.expand.util

import android.content.Context
import android.util.TypedValue
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog

@JvmName("dp2px")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
fun Context.dp2pxExpand(dpVal: Float): Int =
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpVal, resources.displayMetrics).toInt()

@JvmName("sp2px")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
fun Context.sp2pxExpand(spVal: Float): Int =
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, spVal, resources.displayMetrics).toInt()

@JvmName("px2dp")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
fun Context.px2dpExpand(pxVal: Float): Float =
    pxVal / resources.displayMetrics.density

@JvmName("px2sp")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
fun Context.px2spExpand(pxVal: Float): Float =
    pxVal / resources.displayMetrics.scaledDensity
