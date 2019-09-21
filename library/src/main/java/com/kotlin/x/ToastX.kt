package com.kotlin.x

import android.content.Context
import android.widget.Toast
import androidx.fragment.app.Fragment

fun Context.toast(any: Any) = Toast.makeText(this, any.toString(), Toast.LENGTH_SHORT).show()

fun Fragment.toast(any: Any) = activity?.let { Toast.makeText(it, any.toString(), Toast.LENGTH_SHORT).show() }

fun String.toast(context: Context) = Toast.makeText(context, this, Toast.LENGTH_SHORT).show()
