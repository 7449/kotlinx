package com.kotlin.x

import android.view.View
import android.view.Window
import androidx.annotation.ColorInt

fun Window.statusBarColor(@ColorInt color: Int) {
    if (hasM()) {
        statusBarColor = color
        if (color.isLightColor()) {
            decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        } else {
            decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
        }
    }
}