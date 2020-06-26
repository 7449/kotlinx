@file:JvmName("TextViewUtils")

// @see androidx.core:core-ktx:version   androidx.core.widget.TextView
// TextView expand
package androidx.kotlin.expand.widget

import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import androidx.kotlin.expand.content.colorExpand

@JvmName("setTextColor")
@Version([VersionLog(Version.BANANA)])
fun TextView.colorExpend(@ColorRes id: Int): TextView = apply {
    setTextColor(context.colorExpand(id))
}

@JvmName("addOnAfterTextChanged")
@Version([VersionLog(Version.BANANA)])
fun TextView.doOnAfterTextChangedExpend(action: (editable: Editable) -> Unit): TextView =
    addTextChangedListenerExpand(afterTextChanged = action)

@JvmName("addOnBeforeTextChanged")
@Version([VersionLog(Version.BANANA)])
fun TextView.doOnBeforeTextChangedExpend(action: (charSequence: CharSequence, start: Int, count: Int, after: Int) -> Unit): TextView =
    addTextChangedListenerExpand(beforeTextChanged = action)

@JvmName("addOnTextChanged")
@Version([VersionLog(Version.BANANA)])
fun TextView.doOnTextChangedExpend(action: (charSequence: CharSequence, start: Int, before: Int, count: Int) -> Unit): TextView =
    addTextChangedListenerExpand(onTextChanged = action)

@Version([VersionLog(Version.BANANA)])
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

