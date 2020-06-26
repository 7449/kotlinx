@file:JvmName("WindowUtils")

package androidx.kotlin.expand.view

import android.util.DisplayMetrics
import android.view.View
import android.view.Window
import androidx.annotation.ColorInt
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import androidx.kotlin.expand.graphics.isLightColorExpand
import androidx.kotlin.expand.version.hasMExpand

@JvmName("setStatusBarColor")
@Version([VersionLog(Version.BANANA)])
fun Window.statusBarColorExpand(@ColorInt color: Int) {
    if (hasMExpand()) {
        statusBarColor = color
        if (color.isLightColorExpand()) {
            decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        } else {
            decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
        }
    }
}

@JvmName("square")
@Version([VersionLog(Version.CHERRY)])
fun Window.squareExpand(count: Int): Int {
    val dm = DisplayMetrics()
    windowManager.defaultDisplay.getMetrics(dm)
    return dm.widthPixels / count
}