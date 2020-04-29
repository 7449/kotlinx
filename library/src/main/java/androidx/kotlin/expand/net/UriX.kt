@file:JvmName("UriUtils")

package androidx.kotlin.expand.net

import android.net.Uri

@JvmName("getUriOrEmpty")
fun Uri?.orEmptyExpand(): Uri = this ?: Uri.EMPTY

@JvmName("getQueryParameter")
fun String.getQueryParameterExpand(key: String, defaultValue: String = ""): String =
    Uri.parse(this).getQueryParameter(key) ?: defaultValue

@JvmName("getBooleanQueryParameter")
fun String.getBooleanQueryParameterExpand(key: String, defaultValue: Boolean = false): Boolean =
    Uri.parse(this).getBooleanQueryParameter(key, defaultValue)

@JvmName("getListQueryParameter")
fun String.getListQueryParameterExpand(vararg key: String): ArrayList<String> {
    val parse = Uri.parse(this)
    val list = ArrayList<String>()
    key.forEach {
        list.add(parse.getQueryParameter(it) ?: "")
    }
    return list
}
