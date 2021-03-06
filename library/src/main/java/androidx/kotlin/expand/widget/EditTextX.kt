@file:JvmName("EditTextUtils")

package androidx.kotlin.expand.widget

import android.content.Context
import android.view.inputmethod.InputMethodManager
import android.widget.EditText


import androidx.kotlin.expand.version.hasLExpand

@JvmName("offKeyboard")
fun EditText.offKeyboardExpand() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager?
    imm?.hideSoftInputFromWindow(windowToken, InputMethodManager.HIDE_IMPLICIT_ONLY)
}

@JvmName("openKeyboard")
fun EditText.openKeyboardExpand() {
    isFocusable = true
    isFocusableInTouchMode = true
    requestFocus()
    val inputManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager?
    inputManager?.showSoftInput(this, 0)
}

@JvmName("forceOpenKeyBoard")
fun EditText.forceOpenKeyBoardExpand() {
    isFocusable = true
    isFocusableInTouchMode = true
    requestFocus()
    findFocus()
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager?
    imm?.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS)
}

@JvmName("disableShowSoftInput")
fun EditText.disableShowSoftInputExpand() {
    if (hasLExpand()) {
        showSoftInputOnFocus = false
        return
    }
    runCatching {
        val method = EditText::class.java.getMethod(
            "setShowSoftInputOnFocus",
            Boolean::class.javaPrimitiveType
        )
        method.isAccessible = true
        method.invoke(this, false)
    }
    runCatching {
        val method = EditText::class.java.getMethod(
            "setSoftInputShownOnFocus",
            Boolean::class.javaPrimitiveType
        )
        method.isAccessible = true
        method.invoke(this, false)
    }
}