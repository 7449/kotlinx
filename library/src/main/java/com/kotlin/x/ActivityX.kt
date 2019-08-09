@file:Suppress("NOTHING_TO_INLINE")

package com.kotlin.x

import android.app.Activity
import android.view.WindowManager

inline fun Activity.hideStatusBar() {
    val attrs = window.attributes
    attrs.flags = attrs.flags or WindowManager.LayoutParams.FLAG_FULLSCREEN
    window.attributes = attrs
}

inline fun Activity.showStatusBar() {
    val attrs = window.attributes
    attrs.flags = attrs.flags and WindowManager.LayoutParams.FLAG_FULLSCREEN
    window.attributes = attrs
}