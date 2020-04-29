@file:JvmName("StringUtils")

package androidx.kotlin.expand

import android.content.Context
import android.widget.Toast

val utf8CodingExpand: String
    get() = "utf-8"

val textHtmlMimeTypeExpand: String
    get() = "text/html"

@JvmName("toast")
fun String.toastExpand(context: Context): Unit =
    Toast.makeText(context, this, Toast.LENGTH_SHORT).show()