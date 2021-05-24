@file:JvmName("AnimationUtils")

package androidx.kotlin.expand.widget

import android.view.animation.Animation
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog

@JvmName("onAnimationStart")
@Version(VersionLog(Version.NONE))
fun Animation.doOnAnimationStartExpand(action: (animation: Animation) -> Unit): Animation =
    setAnimationListenerExpand(onAnimationStart = action)

@JvmName("onAnimationEnd")
@Version(VersionLog(Version.NONE))
fun Animation.doOnAnimationEndExpand(action: (animation: Animation) -> Unit): Animation =
    setAnimationListenerExpand(onAnimationEnd = action)

@JvmName("onAnimationRepeat")
@Version(VersionLog(Version.NONE))
fun Animation.doOnAnimationRepeatExpand(action: (animation: Animation) -> Unit): Animation =
    setAnimationListenerExpand(onAnimationRepeat = action)

@Version(VersionLog(Version.NONE))
fun Animation.setAnimationListenerExpand(
    onAnimationRepeat: (animation: Animation) -> Unit = {},
    onAnimationEnd: (animation: Animation) -> Unit = {},
    onAnimationStart: (animation: Animation) -> Unit = {}
): Animation {
    val listener = object : Animation.AnimationListener {
        override fun onAnimationRepeat(animation: Animation) {
            onAnimationRepeat.invoke(animation)
        }

        override fun onAnimationEnd(animation: Animation) {
            onAnimationEnd.invoke(animation)
        }

        override fun onAnimationStart(animation: Animation) {
            onAnimationStart.invoke(animation)
        }
    }
    setAnimationListener(listener)
    return this
}