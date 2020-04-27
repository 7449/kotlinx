@file:JvmName("KeyboardUtils")

package com.kotlin.x

import android.content.Context
import android.os.Build
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import java.lang.reflect.Method

fun EditText.offKeyboardExpand() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager?
    imm?.hideSoftInputFromWindow(windowToken, InputMethodManager.HIDE_IMPLICIT_ONLY)
}

fun EditText.openKeyboardExpand() {
    isFocusable = true
    isFocusableInTouchMode = true
    requestFocus()
    val inputManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager?
    inputManager?.showSoftInput(this, 0)
}

fun EditText.forceOpenKeyBoardExpand() {
    isFocusable = true
    isFocusableInTouchMode = true
    requestFocus()
    findFocus()
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS)
}

fun EditText.disableShowSoftInputExpand() {
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