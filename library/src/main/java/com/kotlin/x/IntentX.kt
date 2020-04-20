package com.kotlin.x

import android.content.Intent

fun Intent?.orEmpty() = this ?: Intent()