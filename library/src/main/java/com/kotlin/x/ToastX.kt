@file:Suppress("NOTHING_TO_INLINE")

package com.kotlin.x

import android.content.Context
import android.widget.Toast
import androidx.fragment.app.Fragment

inline fun Context.toast(any: Any) =
    android.widget.Toast.makeText(this, any.toString(), android.widget.Toast.LENGTH_SHORT).show()

inline fun Fragment.toast(any: Any) =
    activity?.let { android.widget.Toast.makeText(it, any.toString(), android.widget.Toast.LENGTH_SHORT).show() }

inline fun String.toast(context: Context) {
    Toast.makeText(context, this, Toast.LENGTH_SHORT).show()
}