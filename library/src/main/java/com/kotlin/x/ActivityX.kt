package com.kotlin.x

import android.app.Activity
import android.view.WindowManager

fun Activity.hideStatusBar() {
    val attrs = window.attributes
    attrs.flags = attrs.flags or WindowManager.LayoutParams.FLAG_FULLSCREEN
    window.attributes = attrs
}

fun Activity.showStatusBar() {
    val attrs = window.attributes
    attrs.flags = attrs.flags and WindowManager.LayoutParams.FLAG_FULLSCREEN
    window.attributes = attrs
}