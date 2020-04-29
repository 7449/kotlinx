@file:JvmName("ViewUtils")

package androidx.kotlin.expand.view

import android.view.View
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog

@JvmName("postDelayed")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun View.postDelayedExpand(
    delayInMillis: Long,
    action: () -> Unit
): Runnable {
    val runnable = Runnable { action() }
    postDelayed(runnable, delayInMillis)
    return runnable
}

@JvmName("isVisible")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun View.isVisibleExpand(): Boolean = visibility == View.VISIBLE

@JvmName("isGone")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun View.isGoneExpand(): Boolean = visibility == View.GONE

@JvmName("isInvisible")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun View.isInVisibleExpand(): Boolean = visibility == View.INVISIBLE

@JvmName("show")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun View.showExpand(): View = apply { if (!isVisibleExpand()) visibility = View.VISIBLE }

@JvmName("hide")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun View.hideExpand(): View = apply { if (!isGoneExpand()) visibility = View.GONE }

@JvmName("invisible")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun View.invisibleExpand(): View = apply { if (!isInVisibleExpand()) visibility = View.INVISIBLE }

@JvmName("goneViews")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun goneViews(vararg views: View?) {
    for (view in views) {
        view?.hideExpand()
    }
}

@JvmName("visibleViews")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun visibleViews(vararg views: View?) {
    for (view in views) {
        view?.showExpand()
    }
}

@JvmName("invisibleViews")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun invisibleView(vararg views: View?) {
    for (view in views) {
        view?.invisibleExpand()
    }
}