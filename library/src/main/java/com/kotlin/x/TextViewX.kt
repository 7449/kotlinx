@file:JvmName("TextViewUtils")

package com.kotlin.x

import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView
import androidx.annotation.ColorRes

fun TextView.colorExpend(@ColorRes id: Int): TextView = apply {
    setTextColor(context.colorExpand(id))
}

fun TextView.doOnAfterTextChangedExpend(action: (editable: Editable) -> Unit): TextView =
    addTextChangedListenerExpand(afterTextChanged = action)

fun TextView.doOnBeforeTextChangedExpend(action: (charSequence: CharSequence, start: Int, count: Int, after: Int) -> Unit): TextView =
    addTextChangedListenerExpand(beforeTextChanged = action)

fun TextView.doOnTextChangedExpend(action: (charSequence: CharSequence, start: Int, before: Int, count: Int) -> Unit): TextView =
    addTextChangedListenerExpand(onTextChanged = action)

fun TextView.addTextChangedListenerExpand(
    afterTextChanged: (editable: Editable) -> Unit = { _: Editable -> },
    beforeTextChanged: (charSequence: CharSequence, start: Int, count: Int, after: Int) -> Unit = { _: CharSequence, _: Int, _: Int, _: Int -> },
    onTextChanged: (charSequence: CharSequence, start: Int, before: Int, count: Int) -> Unit = { _: CharSequence, _: Int, _: Int, _: Int -> }
): TextView {
    val textWatcher = object : TextWatcher {
        override fun afterTextChanged(s: Editable) = afterTextChanged.invoke(s)
        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) =
            beforeTextChanged.invoke(s, start, count, after)

        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) =
            onTextChanged.invoke(s, start, before, count)
    }
    addTextChangedListener(textWatcher)
    return this
}

