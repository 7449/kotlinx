@file:JvmName("ActivityUtils")

package com.kotlin.x

import android.app.Activity
import android.net.Uri
import android.util.DisplayMetrics
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun Activity.hideStatusBar() {
    val attrs = window.attributes
    attrs.flags = attrs.flags or WindowManager.LayoutParams.FLAG_FULLSCREEN
    window.attributes = attrs
}

fun Activity.showStatusBar() {
    val attrs = window.attributes
    attrs.flags = attrs.flags and WindowManager.LayoutParams.FLAG_FULLSCREEN
    window.attributes = attrs
}

fun Activity.square(count: Int): Int {
    val dm = DisplayMetrics()
    window.windowManager.defaultDisplay.getMetrics(dm)
    return dm.widthPixels / count
}

fun Activity.openCamera(fileUri: Uri, video: Boolean): CameraStatus =
    if (!permissionCamera() || !permissionStorage()) CameraStatus.PERMISSION else openCamera(
        this,
        fileUri,
        video
    )

fun AppCompatActivity.findFragmentByTag(tag: String, of: (fragment: Fragment?) -> Unit) {
    of.invoke(supportFragmentManager.findFragmentByTag(tag))
}

fun <T : Fragment> AppCompatActivity.findFragmentByTag(tag: String, ifNone: (String) -> T): T =
    supportFragmentManager.findFragmentByTag(tag) as T?
        ?: ifNone(tag)

fun AppCompatActivity.showFragment(fragment: Fragment): Int =
    supportFragmentManager.beginTransaction().show(fragment).commitAllowingStateLoss()

fun AppCompatActivity.hideFragment(fragment: Fragment): Int =
    supportFragmentManager.beginTransaction().hide(fragment).commitAllowingStateLoss()

fun AppCompatActivity.addFragment(id: Int, fragment: Fragment): Int =
    supportFragmentManager.beginTransaction().add(id, fragment, fragment.javaClass.simpleName)
        .commitAllowingStateLoss()

fun AppCompatActivity.replaceFragment(id: Int, fragment: Fragment): Int =
    supportFragmentManager.beginTransaction().replace(id, fragment, fragment.javaClass.simpleName)
        .commitAllowingStateLoss()