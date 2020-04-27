@file:JvmName("StringUtils")

package com.kotlin.x

import android.content.Context
import android.widget.Toast

val utf8CodingExpand: String
    get() = "utf-8"

val textHtmlMimeTypeExpand: String
    get() = "text/html"

fun String.toastExpand(context: Context): Unit =
    Toast.makeText(context, this, Toast.LENGTH_SHORT).show()