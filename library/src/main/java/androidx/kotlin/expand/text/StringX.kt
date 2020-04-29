@file:JvmName("StringUtils")

package androidx.kotlin.expand.text

import android.content.Context
import android.widget.Toast
import java.util.regex.Pattern

val utf8CodingExpand: String
    get() = "utf-8"

val textHtmlMimeTypeExpand: String
    get() = "text/html"

val String.intExpand: Int
    get() = Pattern.compile("[^0-9]").matcher(this).replaceAll("").trim { it <= ' ' }.toInt()

@JvmName("toast")
fun String.toastExpand(context: Context): Unit =
    Toast.makeText(context, this, Toast.LENGTH_SHORT).show()
