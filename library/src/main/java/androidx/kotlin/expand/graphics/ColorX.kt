@file:JvmName("ColorUtils")

package androidx.kotlin.expand.graphics

import android.content.Context
import androidx.core.content.ContextCompat
import androidx.core.graphics.ColorUtils
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog

//判断颜色是否为亮色
@JvmName("isLightColor")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Int.isLightColorExpand(): Boolean = ColorUtils.calculateLuminance(this) >= 0.5

//ColorInt
@JvmName("getColor")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Int.colorExpand(activity: Context): Int = ContextCompat.getColor(activity, this)
