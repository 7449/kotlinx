package com.kotlin.x

import android.net.Uri

fun Uri?.orEmpty() = this ?: Uri.EMPTY