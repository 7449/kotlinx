@file:JvmName("ActivityUtils")

package com.kotlin.x

import android.app.Activity
import android.net.Uri
import android.util.DisplayMetrics
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun Activity.hideStatusBarExpand() {
    val attrs = window.attributes
    attrs.flags = attrs.flags or WindowManager.LayoutParams.FLAG_FULLSCREEN
    window.attributes = attrs
}

fun Activity.showStatusBarExpand() {
    val attrs = window.attributes
    attrs.flags = attrs.flags and WindowManager.LayoutParams.FLAG_FULLSCREEN
    window.attributes = attrs
}

fun Activity.squareExpand(count: Int): Int {
    val dm = DisplayMetrics()
    window.windowManager.defaultDisplay.getMetrics(dm)
    return dm.widthPixels / count
}

fun Activity.openCameraExpand(fileUri: Uri, video: Boolean): CameraStatus =
    if (!permissionCameraExpand() || !permissionStorageExpand()) CameraStatus.PERMISSION else openCameraExpand(
        this,
        fileUri,
        video
    )

fun AppCompatActivity.findFragmentByTagExpand(tag: String, of: (fragment: Fragment?) -> Unit) {
    of.invoke(supportFragmentManager.findFragmentByTag(tag))
}

fun <T : Fragment> AppCompatActivity.findFragmentByTagExpand(
    tag: String,
    ifNone: (String) -> T
): T = supportFragmentManager.findFragmentByTag(tag) as T? ?: ifNone(tag)

fun AppCompatActivity.showFragmentExpand(fragment: Fragment): Int =
    supportFragmentManager.beginTransaction().show(fragment).commitAllowingStateLoss()

fun AppCompatActivity.hideFragmentExpand(fragment: Fragment): Int =
    supportFragmentManager.beginTransaction().hide(fragment).commitAllowingStateLoss()

fun AppCompatActivity.addFragmentExpand(id: Int, fragment: Fragment): Int =
    supportFragmentManager.beginTransaction().add(id, fragment, fragment.javaClass.simpleName)
        .commitAllowingStateLoss()

fun AppCompatActivity.replaceFragmentExpand(id: Int, fragment: Fragment): Int =
    supportFragmentManager.beginTransaction().replace(id, fragment, fragment.javaClass.simpleName)
        .commitAllowingStateLoss()