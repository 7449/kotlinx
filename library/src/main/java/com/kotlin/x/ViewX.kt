@file:Suppress("NOTHING_TO_INLINE")

package com.kotlin.x

import android.content.Context
import android.os.Build
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import java.lang.reflect.Method

inline fun View?.isGone(): Boolean = this?.visibility == View.GONE

inline fun View?.isVisible(): Boolean = this?.visibility == View.GONE

inline fun View?.isInVisible(): Boolean = this?.visibility == View.INVISIBLE

inline fun View?.gone() {
    if (!isGone()) {
        this?.visibility = View.GONE
    }
}

inline fun View?.visible() {
    if (!isVisible()) {
        this?.visibility = View.VISIBLE
    }
}

inline fun View?.inVisible() {
    if (!isInVisible()) {
        this?.visibility = View.INVISIBLE
    }
}

inline fun goneAllViews(vararg views: View?) {
    for (view in views) {
        view.gone()
    }
}

inline fun visibleAllViews(vararg views: View?) {
    for (view in views) {
        view.visible()
    }
}

inline fun invisibleView(vararg views: View?) {
    for (view in views) {
        view.inVisible()
    }
}

inline fun EditText.offKeyboard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager?
    imm?.hideSoftInputFromWindow(windowToken, InputMethodManager.HIDE_IMPLICIT_ONLY)
}

inline fun EditText.openKeyboard() {
    isFocusable = true
    isFocusableInTouchMode = true
    requestFocus()
    val inputManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager?
    inputManager?.showSoftInput(this, 0)
}

inline fun EditText.forceOpenKeyBoard() {
    isFocusable = true
    isFocusableInTouchMode = true
    requestFocus()
    findFocus()
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS)
}

inline fun EditText.disableShowSoftInput() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        showSoftInputOnFocus = false
        return
    }
    val cls = EditText::class.java
    var method: Method
    try {
        method = cls.getMethod("setShowSoftInputOnFocus", Boolean::class.javaPrimitiveType)
        method.isAccessible = true
        method.invoke(this, false)
    } catch (ignored: Exception) {
    }

    try {
        method = cls.getMethod("setSoftInputShownOnFocus", Boolean::class.javaPrimitiveType)
        method.isAccessible = true
        method.invoke(this, false)
    } catch (ignored: Exception) {
    }

}
