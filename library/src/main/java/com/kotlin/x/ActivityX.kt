@file:Suppress("NOTHING_TO_INLINE")

package com.kotlin.x

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager

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

inline fun Activity.startActivityForResult(clz: Class<*>, code: Int, bundle: Bundle) {
    startActivityForResult(Intent(this, clz).putExtras(bundle), code)
}

inline fun Activity.forceOffKeyboard() {
    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager?
    currentFocus?.let {
        if (imm != null && imm.isActive) {
            if (it.windowToken != null) {
                imm.hideSoftInputFromWindow(it.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
            }
        }
    }
}