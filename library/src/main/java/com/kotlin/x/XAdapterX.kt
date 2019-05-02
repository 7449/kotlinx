@file:Suppress("NOTHING_TO_INLINE")

package com.kotlin.x

import android.graphics.Color
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.xadapter.adapter.XRecyclerViewAdapter
import com.xadapter.widget.XLoadMoreView

enum class ViewStatus {
    STATUS,
    REFRESH,
    LOAD_MORE,
}

class RefreshAdapter<T>(val swipeRefreshLayout: SwipeRefreshLayout, color: Int = Color.BLACK) :
    XRecyclerViewAdapter<T>() {

    init {
        swipeRefreshLayout.setColorSchemeColors(color)
        swipeRefreshLayout.setOnRefreshListener {
            if (loadMoreState != XLoadMoreView.LOAD) {
                xRefreshListener?.invoke()
            }
        }
    }

    override fun onScrollBottom() {
        if (loadMoreState != XLoadMoreView.LOAD && !swipeRefreshLayout.isRefreshing) {
            super.onScrollBottom()
        }
    }
}

inline fun <T> RefreshAdapter<T>.onComplete(type: ViewStatus) {
    if (type == ViewStatus.REFRESH) {
        swipeRefreshLayout.isRefreshing = false
    } else {
        loadMoreState = XLoadMoreView.SUCCESS
    }
}

inline fun <T> RefreshAdapter<T>.onError(type: ViewStatus) {
    if (type == ViewStatus.REFRESH) {
        swipeRefreshLayout.isRefreshing = false
    } else {
        loadMoreState = XLoadMoreView.ERROR
    }
}

inline fun <T> RefreshAdapter<T>.loadNoMore() {
    loadMoreState = XLoadMoreView.NO_MORE
}