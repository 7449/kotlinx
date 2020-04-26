@file:JvmName("ColorUtils")

package com.kotlin.x

import android.content.Context
import androidx.core.content.ContextCompat
import androidx.core.graphics.ColorUtils

//判断颜色是否为亮色
fun Int.isLightColor() = ColorUtils.calculateLuminance(this) >= 0.5

//ColorInt
fun Int.color(activity: Context) = ContextCompat.getColor(activity, this)
