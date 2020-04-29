@file:JvmName("ActivityUtils")
@file:Suppress("UNCHECKED_CAST")

package androidx.kotlin.expand.app

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.Rect
import android.net.Uri
import android.util.DisplayMetrics
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import androidx.kotlin.expand.os.camera.CameraStatus
import androidx.kotlin.expand.os.camera.openCameraExpand
import androidx.kotlin.expand.os.permission.permissionCameraExpand
import androidx.kotlin.expand.os.permission.permissionStorageExpand

@Suppress("DEPRECATION")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
val Activity.captureContent: Bitmap
    get() {
        val view: View = window.decorView
        view.isDrawingCacheEnabled = true
        view.buildDrawingCache()
        val b1: Bitmap = view.drawingCache
        val frame = Rect()
        window.decorView.getWindowVisibleDisplayFrame(frame)
        val statusBarHeight: Int = frame.top
        val width = windowManager.defaultDisplay.width
        val height = windowManager.defaultDisplay.height
        val b = Bitmap.createBitmap(b1, 0, statusBarHeight, width, height - statusBarHeight)
        view.destroyDrawingCache()
        return b
    }

@JvmName("hideStatusBar")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity.hideStatusBarExpand() {
    val attrs = window.attributes
    attrs.flags = attrs.flags or WindowManager.LayoutParams.FLAG_FULLSCREEN
    window.attributes = attrs
}

@JvmName("showStatusBar")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity.showStatusBarExpand() {
    val attrs = window.attributes
    attrs.flags = attrs.flags and WindowManager.LayoutParams.FLAG_FULLSCREEN
    window.attributes = attrs
}

@JvmName("square")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity.squareExpand(count: Int): Int {
    val dm = DisplayMetrics()
    window.windowManager.defaultDisplay.getMetrics(dm)
    return dm.widthPixels / count
}

@JvmName("openCamera")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Activity.openCameraExpand(fileUri: Uri, video: Boolean): CameraStatus =
    if (!permissionCameraExpand() || !permissionStorageExpand()) CameraStatus.PERMISSION else openCameraExpand(
        this,
        fileUri,
        video
    )

@JvmName("findFragmentByTag")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun AppCompatActivity.findFragmentByTagExpand(tag: String, of: (fragment: Fragment?) -> Unit) {
    of.invoke(supportFragmentManager.findFragmentByTag(tag))
}

@JvmName("findFragmentByTag")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Fragment> AppCompatActivity.findFragmentByTagExpand(
    tag: String,
    ifNone: (String) -> T
): T = supportFragmentManager.findFragmentByTag(tag) as T? ?: ifNone(tag)

@JvmName("showFragment")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun AppCompatActivity.showFragmentExpand(fragment: Fragment): Int =
    supportFragmentManager.beginTransaction().show(fragment).commitAllowingStateLoss()

@JvmName("hideFragment")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun AppCompatActivity.hideFragmentExpand(fragment: Fragment): Int =
    supportFragmentManager.beginTransaction().hide(fragment).commitAllowingStateLoss()

@JvmName("addFragment")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun AppCompatActivity.addFragmentExpand(id: Int, fragment: Fragment): Int =
    supportFragmentManager.beginTransaction().add(id, fragment, fragment.javaClass.simpleName)
        .commitAllowingStateLoss()

@JvmName("replaceFragment")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun AppCompatActivity.replaceFragmentExpand(id: Int, fragment: Fragment): Int =
    supportFragmentManager.beginTransaction().replace(id, fragment, fragment.javaClass.simpleName)
        .commitAllowingStateLoss()