package com.kotlin.x

import android.os.Bundle

fun Bundle?.orEmpty() = this ?: Bundle.EMPTY