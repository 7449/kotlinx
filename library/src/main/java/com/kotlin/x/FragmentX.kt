@file:Suppress("NOTHING_TO_INLINE")

package com.kotlin.x

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

inline fun <T : Fragment> AppCompatActivity.findFragmentByTag(tag: String, ifNone: (String) -> T): T =
    supportFragmentManager.findFragmentByTag(tag) as T? ?: ifNone(tag)

inline fun Fragment.currentActivity() = activity?.let { it } ?: throw NullPointerException()

inline fun Fragment.startActivity(clz: Class<*>, code: Int, bundle: Bundle) {
    startActivityForResult(Intent(this.activity, clz).putExtras(bundle), code)
}