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
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
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

@Deprecated(
    "@see ActivityResultContracts.TakePicture or Custom ActivityResultContract",
    ReplaceWith("")
)
@JvmName("openCamera")
@Version(
    version = [Version.BANANA, Version.PINEAPPLE],
    log = [
        VersionLog(Version.BANANA, "init submit"),
        VersionLog(Version.PINEAPPLE, "deprecated")
    ]
)
fun Activity.openCameraExpand(fileUri: Uri, video: Boolean): CameraStatus =
    if (!permissionCameraExpand() || !permissionStorageExpand()) CameraStatus.PERMISSION else openCameraExpand(
        this,
        fileUri,
        video
    )

@Version(
    version = [Version.PINEAPPLE],
    log = [
        VersionLog(Version.PINEAPPLE, "add findFragmentByIdExpand")
    ]
)
val AppCompatActivity.fragmentsExpand: MutableList<Fragment>
    get() = supportFragmentManager.fragments

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

@JvmName("findFragmentById")
@Version(
    version = [Version.PINEAPPLE],
    log = [
        VersionLog(Version.PINEAPPLE, "add findFragmentByIdExpand")
    ]
)
fun AppCompatActivity.findFragmentByIdExpand(@IdRes id: Int, of: (fragment: Fragment?) -> Unit) {
    of.invoke(supportFragmentManager.findFragmentById(id))
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

@JvmName("runOnCommit")
@Version(
    version = [Version.PINEAPPLE],
    log = [
        VersionLog(Version.PINEAPPLE, "add runOnCommit")
    ]
)
fun AppCompatActivity.showRunOnCommitExpand(
    fragment: Fragment,
    runnable: Runnable
): FragmentTransaction =
    supportFragmentManager.beginTransaction().show(fragment).runOnCommit(runnable)

@JvmName("showFragment")
@Version(
    version = [Version.BANANA, Version.PINEAPPLE],
    log = [
        VersionLog(Version.BANANA, "init submit"),
        VersionLog(Version.PINEAPPLE, "add commit type")
    ]
)
fun AppCompatActivity.showFragmentExpand(
    fragmentType: FragmentType = FragmentType.COMMIT_ALLOWING_STATE_LOSS,
    fragment: Fragment
) = supportFragmentManager.beginTransaction().show(fragment).commitExpand(fragmentType)

@JvmName("hideFragment")
@Version(
    version = [Version.BANANA, Version.PINEAPPLE],
    log = [
        VersionLog(Version.BANANA, "init submit"),
        VersionLog(Version.PINEAPPLE, "add commit type")
    ]
)
fun AppCompatActivity.hideFragmentExpand(
    fragmentType: FragmentType = FragmentType.COMMIT_ALLOWING_STATE_LOSS,
    fragment: Fragment
) = supportFragmentManager.beginTransaction().hide(fragment).commitExpand(fragmentType)

@JvmName("addFragment")
@Version(
    version = [Version.BANANA, Version.PINEAPPLE],
    log = [
        VersionLog(Version.BANANA, "init submit"),
        VersionLog(Version.PINEAPPLE, "add commit type")
    ]
)
fun AppCompatActivity.addFragmentExpand(
    id: Int,
    fragmentType: FragmentType = FragmentType.COMMIT_ALLOWING_STATE_LOSS,
    fragment: Fragment
) = supportFragmentManager.beginTransaction().add(id, fragment, fragment.javaClass.simpleName)
    .commitExpand(fragmentType)

@JvmName("replaceFragment")
@Version(
    version = [Version.BANANA, Version.PINEAPPLE],
    log = [
        VersionLog(Version.BANANA, "init submit"),
        VersionLog(Version.PINEAPPLE, "add commit type")
    ]
)
fun AppCompatActivity.replaceFragmentExpand(
    id: Int,
    fragmentType: FragmentType = FragmentType.COMMIT_ALLOWING_STATE_LOSS,
    fragment: Fragment
) = supportFragmentManager.beginTransaction().replace(id, fragment, fragment.javaClass.simpleName)
    .commitExpand(fragmentType)

@Suppress("NOTHING_TO_INLINE")
internal inline fun FragmentTransaction.commitExpand(fragmentType: FragmentType) {
    when (fragmentType) {
        FragmentType.COMMIT -> commit()
        FragmentType.COMMIT_ALLOWING_STATE_LOSS -> commitAllowingStateLoss()
        FragmentType.NOW -> commitNow()
        FragmentType.NOW_ALLOWING_STATE_LOSS -> commitNowAllowingStateLoss()
    }
}

enum class FragmentType {
    COMMIT,
    COMMIT_ALLOWING_STATE_LOSS,
    NOW,
    NOW_ALLOWING_STATE_LOSS
}