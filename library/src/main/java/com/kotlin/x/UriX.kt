@file:JvmName("UriUtils")

package com.kotlin.x

import android.net.Uri

fun Uri?.orEmptyExpand(): Uri = this ?: Uri.EMPTY

fun String.getQueryParameterExpand(key: String, defaultValue: String = ""): String =
    Uri.parse(this).getQueryParameter(key) ?: defaultValue

fun String.getBooleanQueryParameterExpand(key: String, defaultValue: Boolean = false): Boolean =
    Uri.parse(this).getBooleanQueryParameter(key, defaultValue)

fun String.getListQueryParameterExpand(vararg key: String): ArrayList<String> {
    val parse = Uri.parse(this)
    val list = ArrayList<String>()
    key.forEach {
        list.add(parse.getQueryParameter(it) ?: "")
    }
    return list
}
