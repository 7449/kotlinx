@file:JvmName("ActivityUtils")

package androidx.kotlin.expand

import android.app.Activity
import android.net.Uri
import android.util.DisplayMetrics
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

@JvmName("hideStatusBar")
fun Activity.hideStatusBarExpand() {
    val attrs = window.attributes
    attrs.flags = attrs.flags or WindowManager.LayoutParams.FLAG_FULLSCREEN
    window.attributes = attrs
}

@JvmName("showStatusBar")
fun Activity.showStatusBarExpand() {
    val attrs = window.attributes
    attrs.flags = attrs.flags and WindowManager.LayoutParams.FLAG_FULLSCREEN
    window.attributes = attrs
}

@JvmName("square")
fun Activity.squareExpand(count: Int): Int {
    val dm = DisplayMetrics()
    window.windowManager.defaultDisplay.getMetrics(dm)
    return dm.widthPixels / count
}

@JvmName("openCamera")
fun Activity.openCameraExpand(fileUri: Uri, video: Boolean): CameraStatus =
    if (!permissionCameraExpand() || !permissionStorageExpand()) CameraStatus.PERMISSION else openCameraExpand(
        this,
        fileUri,
        video
    )

@JvmName("findFragmentByTag")
fun AppCompatActivity.findFragmentByTagExpand(tag: String, of: (fragment: Fragment?) -> Unit) {
    of.invoke(supportFragmentManager.findFragmentByTag(tag))
}

@JvmName("findFragmentByTag")
fun <T : Fragment> AppCompatActivity.findFragmentByTagExpand(
    tag: String,
    ifNone: (String) -> T
): T = supportFragmentManager.findFragmentByTag(tag) as T? ?: ifNone(tag)

@JvmName("showFragment")
fun AppCompatActivity.showFragmentExpand(fragment: Fragment): Int =
    supportFragmentManager.beginTransaction().show(fragment).commitAllowingStateLoss()

@JvmName("hideFragment")
fun AppCompatActivity.hideFragmentExpand(fragment: Fragment): Int =
    supportFragmentManager.beginTransaction().hide(fragment).commitAllowingStateLoss()

@JvmName("addFragment")
fun AppCompatActivity.addFragmentExpand(id: Int, fragment: Fragment): Int =
    supportFragmentManager.beginTransaction().add(id, fragment, fragment.javaClass.simpleName)
        .commitAllowingStateLoss()

@JvmName("replaceFragment")
fun AppCompatActivity.replaceFragmentExpand(id: Int, fragment: Fragment): Int =
    supportFragmentManager.beginTransaction().replace(id, fragment, fragment.javaClass.simpleName)
        .commitAllowingStateLoss()