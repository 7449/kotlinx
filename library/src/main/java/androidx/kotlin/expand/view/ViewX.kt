@file:JvmName("ViewUtils")

package androidx.kotlin.expand.view

import android.view.View
import android.view.ViewTreeObserver

@JvmName("addOnPreDrawListener")
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
fun View.postDelayedExpand(
    delayInMillis: Long,
    action: () -> Unit
): Runnable {
    val runnable = Runnable { action() }
    postDelayed(runnable, delayInMillis)
    return runnable
}

@JvmName("isVisible")
fun View.isVisibleExpand(): Boolean = visibility == View.VISIBLE

@JvmName("isGone")
fun View.isGoneExpand(): Boolean = visibility == View.GONE

@JvmName("isInvisible")
fun View.isInVisibleExpand(): Boolean = visibility == View.INVISIBLE

@JvmName("show")
fun View.showExpand(): View = apply { if (!isVisibleExpand()) visibility = View.VISIBLE }

@JvmName("hide")
fun View.hideExpand(): View = apply { if (!isGoneExpand()) visibility = View.GONE }

@JvmName("invisible")
fun View.invisibleExpand(): View = apply { if (!isInVisibleExpand()) visibility = View.INVISIBLE }

@JvmName("goneViews")
fun goneViews(vararg views: View?) {
    for (view in views) {
        view?.hideExpand()
    }
}

@JvmName("visibleViews")
fun visibleViews(vararg views: View?) {
    for (view in views) {
        view?.showExpand()
    }
}

@JvmName("invisibleViews")
fun invisibleView(vararg views: View?) {
    for (view in views) {
        view?.invisibleExpand()
    }
}