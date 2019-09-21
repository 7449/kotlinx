package com.kotlin.x

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun <T : Fragment> AppCompatActivity.findFragmentByTag(tag: String, ifNone: (String) -> T): T = supportFragmentManager.findFragmentByTag(tag) as T?
        ?: ifNone(tag)

fun Fragment.currentActivity() = activity?.let { it } ?: throw NullPointerException()

fun Fragment.startActivity(clz: Class<*>, code: Int, bundle: Bundle) {
    startActivityForResult(Intent(currentActivity(), clz).putExtras(bundle), code)
}