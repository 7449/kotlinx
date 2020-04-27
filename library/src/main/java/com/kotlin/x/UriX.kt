@file:JvmName("UriUtils")

package com.kotlin.x

import android.net.Uri

fun Uri?.orEmpty(): Uri = this ?: Uri.EMPTY

fun String.getQueryParameter(key: String, defaultValue: String = ""): String =
    Uri.parse(this).getQueryParameter(key) ?: defaultValue

fun String.getBooleanQueryParameter(key: String, defaultValue: Boolean = false): Boolean =
    Uri.parse(this).getBooleanQueryParameter(key, defaultValue)

fun String.getListQueryParameter(vararg key: String): ArrayList<String> {
    val parse = Uri.parse(this)
    val list = ArrayList<String>()
    key.forEach {
        list.add(parse.getQueryParameter(it) ?: "")
    }
    return list
}
