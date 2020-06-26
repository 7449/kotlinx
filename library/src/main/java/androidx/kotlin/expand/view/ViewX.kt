@file:JvmName("ViewUtils")

package androidx.kotlin.expand.view

import android.view.View
import android.view.ViewTreeObserver
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog

@JvmName("addOnPreDrawListener")
@Version([VersionLog(Version.PINEAPPLE)])
fun View.addOnPreDrawListenerExpand(action: () -> Unit) {
    viewTreeObserver.addOnPreDrawListener(object : ViewTreeObserver.OnPreDrawListener {
        override fun onPreDraw(): Boolean {
            viewTreeObserver.removeOnPreDrawListener(this)
            action.invoke()
            return true
        }
    })
}

@JvmName("postDelayed")
@Version([VersionLog(Version.BANANA)])
fun View.postDelayedExpand(
    delayInMillis: Long,
    action: () -> Unit
): Runnable {
    val runnable = Runnable { action() }
    postDelayed(runnable, delayInMillis)
    return runnable
}

@JvmName("isVisible")
@Version([VersionLog(Version.BANANA)])
fun View.isVisibleExpand(): Boolean = visibility == View.VISIBLE

@JvmName("isGone")
@Version([VersionLog(Version.BANANA)])
fun View.isGoneExpand(): Boolean = visibility == View.GONE

@JvmName("isInvisible")
@Version([VersionLog(Version.BANANA)])
fun View.isInVisibleExpand(): Boolean = visibility == View.INVISIBLE

@JvmName("show")
@Version([VersionLog(Version.BANANA)])
fun View.showExpand(): View = apply { if (!isVisibleExpand()) visibility = View.VISIBLE }

@JvmName("hide")
@Version([VersionLog(Version.BANANA)])
fun View.hideExpand(): View = apply { if (!isGoneExpand()) visibility = View.GONE }

@JvmName("invisible")
@Version([VersionLog(Version.BANANA)])
fun View.invisibleExpand(): View = apply { if (!isInVisibleExpand()) visibility = View.INVISIBLE }

@JvmName("goneViews")
@Version([VersionLog(Version.BANANA)])
fun goneViews(vararg views: View?) {
    for (view in views) {
        view?.hideExpand()
    }
}

@JvmName("visibleViews")
@Version([VersionLog(Version.BANANA)])
fun visibleViews(vararg views: View?) {
    for (view in views) {
        view?.showExpand()
    }
}

@JvmName("invisibleViews")
@Version([VersionLog(Version.BANANA)])
fun invisibleView(vararg views: View?) {
    for (view in views) {
        view?.invisibleExpand()
    }
}