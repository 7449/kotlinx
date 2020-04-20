package com.kotlin.x

import android.content.Context
import android.widget.Toast

val utf8Coding: String
    get() = "utf-8"

val textHtmlMimeType: String
    get() = "text/html"

fun String.toast(context: Context) = Toast.makeText(context, this, Toast.LENGTH_SHORT).show()