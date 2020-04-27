@file:JvmName("ViewUtils")

package com.kotlin.x

import android.view.View

fun View.hasVisibleExpand(): Boolean = visibility == View.VISIBLE

fun View.showExpand(): Unit = let { if (!hasVisibleExpand()) visibility = View.VISIBLE }

fun View.hideExpand(): Unit = let { if (hasVisibleExpand()) visibility = View.GONE }

fun View?.isGoneExpand(): Boolean = this?.visibility == View.GONE

fun View?.isVisibleExpand(): Boolean = this?.visibility == View.GONE

fun View?.isInVisibleExpand(): Boolean = this?.visibility == View.INVISIBLE

fun View?.goneExpand() {
    if (!isGoneExpand()) {
        this?.visibility = View.GONE
    }
}

fun View?.visibleExpand() {
    if (!isVisibleExpand()) {
        this?.visibility = View.VISIBLE
    }
}

fun View?.inVisibleExpand() {
    if (!isInVisibleExpand()) {
        this?.visibility = View.INVISIBLE
    }
}

fun goneAllViews(vararg views: View?) {
    for (view in views) {
        view.goneExpand()
    }
}

fun visibleAllViews(vararg views: View?) {
    for (view in views) {
        view.visibleExpand()
    }
}

fun invisibleView(vararg views: View?) {
    for (view in views) {
        view.inVisibleExpand()
    }
}