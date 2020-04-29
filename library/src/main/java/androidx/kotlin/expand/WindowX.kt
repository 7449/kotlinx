@file:JvmName("WindowUtils")

package androidx.kotlin.expand

import android.view.View
import android.view.Window
import androidx.annotation.ColorInt

@JvmName("setStatusBarColor")
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