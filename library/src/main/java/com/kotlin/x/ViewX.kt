package com.kotlin.x

import android.view.View

//View是否显示
fun View.hasVisible() = visibility == View.VISIBLE

//View显示
fun View.show() = let { if (!hasVisible()) visibility = View.VISIBLE }

//View隐藏
fun View.hide() = let { if (hasVisible()) visibility = View.GONE }

fun View?.isGone(): Boolean = this?.visibility == View.GONE

fun View?.isVisible(): Boolean = this?.visibility == View.GONE

fun View?.isInVisible(): Boolean = this?.visibility == View.INVISIBLE

fun View?.gone() {
    if (!isGone()) {
        this?.visibility = View.GONE
    }
}

fun View?.visible() {
    if (!isVisible()) {
        this?.visibility = View.VISIBLE
    }
}

fun View?.inVisible() {
    if (!isInVisible()) {
        this?.visibility = View.INVISIBLE
    }
}

fun goneAllViews(vararg views: View?) {
    for (view in views) {
        view.gone()
    }
}

fun visibleAllViews(vararg views: View?) {
    for (view in views) {
        view.visible()
    }
}

fun invisibleView(vararg views: View?) {
    for (view in views) {
        view.inVisible()
    }
}