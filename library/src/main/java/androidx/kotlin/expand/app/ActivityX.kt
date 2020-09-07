@file:JvmName("ActivityUtils")
@file:Suppress("UNCHECKED_CAST")

package androidx.kotlin.expand.app

import android.app.Activity
import android.view.WindowManager
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import androidx.kotlin.expand.view.squareExpand

@JvmName("hideStatusBar")
@Version(VersionLog(Version.NONE))
fun Activity.hideStatusBarExpand() {
    val attrs = window.attributes
    attrs.flags = attrs.flags or WindowManager.LayoutParams.FLAG_FULLSCREEN
    window.attributes = attrs
}

@JvmName("showStatusBar")
@Version(VersionLog(Version.NONE))
fun Activity.showStatusBarExpand() {
    val attrs = window.attributes
    attrs.flags = attrs.flags and WindowManager.LayoutParams.FLAG_FULLSCREEN
    window.attributes = attrs
}

@JvmName("square")
@Version(VersionLog(Version.NONE))
fun Activity.squareExpand(count: Int): Int =
    window.squareExpand(count)

@JvmName("fragmentList")
@Version(VersionLog(Version.NONE))
fun AppCompatActivity.fragmentsExpand(): MutableList<Fragment> =
    supportFragmentManager.fragments

@JvmName("findFragmentByTag")
@Version(VersionLog(Version.NONE))
fun AppCompatActivity.findFragmentByTagExpand(tag: String, of: (fragment: Fragment?) -> Unit) {
    of.invoke(supportFragmentManager.findFragmentByTag(tag))
}

@JvmName("findFragmentById")
@Version(VersionLog(Version.NONE))
fun AppCompatActivity.findFragmentByIdExpand(@IdRes id: Int, of: (fragment: Fragment?) -> Unit) {
    of.invoke(supportFragmentManager.findFragmentById(id))
}

@JvmName("findFragmentByTag")
@Version(VersionLog(Version.NONE))
fun <T : Fragment> AppCompatActivity.findFragmentByTagExpand(
    tag: String,
    ifNone: (String) -> T
): T = supportFragmentManager.findFragmentByTag(tag) as T? ?: ifNone(tag)

@JvmName("runOnCommit")
@Version(VersionLog(Version.NONE))
fun AppCompatActivity.showRunOnCommitExpand(
    fragment: Fragment,
    runnable: Runnable
): FragmentTransaction =
    supportFragmentManager.beginTransaction().show(fragment).runOnCommit(runnable)

@JvmName("showFragment")
@Version(VersionLog(Version.NONE))
fun AppCompatActivity.showFragmentExpand(
    fragmentType: FragmentType = FragmentType.COMMIT_ALLOWING_STATE_LOSS,
    fragment: Fragment
) = supportFragmentManager.beginTransaction().show(fragment).commitExpand(fragmentType)

@JvmName("hideFragment")
@Version(VersionLog(Version.NONE))
fun AppCompatActivity.hideFragmentExpand(
    fragmentType: FragmentType = FragmentType.COMMIT_ALLOWING_STATE_LOSS,
    fragment: Fragment
) = supportFragmentManager.beginTransaction().hide(fragment).commitExpand(fragmentType)

@JvmName("addFragment")
@Version(VersionLog(Version.NONE))
fun AppCompatActivity.addFragmentExpand(
    id: Int,
    fragmentType: FragmentType = FragmentType.COMMIT_ALLOWING_STATE_LOSS,
    fragment: Fragment
) = supportFragmentManager.beginTransaction().add(id, fragment, fragment.javaClass.simpleName)
    .commitExpand(fragmentType)

@JvmName("replaceFragment")
@Version(VersionLog(Version.NONE))
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