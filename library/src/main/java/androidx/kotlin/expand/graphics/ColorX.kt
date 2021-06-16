@file:JvmName("ColorUtils")

package androidx.kotlin.expand.graphics

import android.content.Context
import androidx.core.content.ContextCompat
import androidx.core.graphics.ColorUtils

//判断颜色是否为亮色
@JvmName("isLightColor")
fun Int.isLightColorExpand(): Boolean = ColorUtils.calculateLuminance(this) >= 0.5

//ColorInt
@JvmName("getColor")
fun Int.colorExpand(activity: Context): Int = ContextCompat.getColor(activity, this)
