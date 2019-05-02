@file:Suppress("NOTHING_TO_INLINE")

package com.kotlin.x

import android.content.Context
import android.content.Intent
import android.os.Bundle

inline fun Context.startActivity(clazz: Class<*>, bundle: Bundle = Bundle.EMPTY) {
    val intent = Intent(this, clazz)
    intent.putExtras(bundle)
    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
    startActivity(intent)
}
