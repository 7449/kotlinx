package com.kotlin.x

import android.content.ContentResolver
import android.net.Uri

fun ContentResolver.query(uri: Uri, name: String) = query(uri, arrayOf(name), null, null, null)