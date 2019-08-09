@file:Suppress("NOTHING_TO_INLINE")

package com.kotlin.x

import android.view.View

inline fun View?.isGone(): Boolean = this?.visibility == View.GONE

inline fun View?.isVisible(): Boolean = this?.visibility == View.GONE

inline fun View?.isInVisible(): Boolean = this?.visibility == View.INVISIBLE

inline fun View?.gone() {
    if (!isGone()) {
        this?.visibility = View.GONE
    }
}

inline fun View?.visible() {
    if (!isVisible()) {
        this?.visibility = View.VISIBLE
    }
}

inline fun View?.inVisible() {
    if (!isInVisible()) {
        this?.visibility = View.INVISIBLE
    }
}

inline fun goneAllViews(vararg views: View?) {
    for (view in views) {
        view.gone()
    }
}

inline fun visibleAllViews(vararg views: View?) {
    for (view in views) {
        view.visible()
    }
}

inline fun invisibleView(vararg views: View?) {
    for (view in views) {
        view.inVisible()
    }
}