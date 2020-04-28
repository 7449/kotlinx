@file:JvmName("ViewPagerUtils")

package com.kotlin.x

import androidx.viewpager.widget.ViewPager

fun ViewPager.doOnPageScrolledExpand(action: (position: Int, positionOffset: Float, positionOffsetPixels: Int) -> Unit): ViewPager =
    addOnPageChangeListenerExpand(onPageScrolled = action)

fun ViewPager.doOnPageSelectedExpand(action: (position: Int) -> Unit): ViewPager =
    addOnPageChangeListenerExpand(onPageSelected = action)

fun ViewPager.doOnPageScrollStateChangedExpand(action: (state: Int) -> Unit): ViewPager =
    addOnPageChangeListenerExpand(onPageScrollStateChanged = action)

fun ViewPager.addOnPageChangeListenerExpand(
    onPageScrolled: (position: Int, positionOffset: Float, positionOffsetPixels: Int) -> Unit = { _: Int, _: Float, _: Int -> },
    onPageSelected: (position: Int) -> Unit = { _: Int -> },
    onPageScrollStateChanged: (state: Int) -> Unit = { _: Int -> }
): ViewPager {
    val listener = object : ViewPager.OnPageChangeListener {
        override fun onPageScrolled(
            position: Int,
            positionOffset: Float,
            positionOffsetPixels: Int
        ) = onPageScrolled(position, positionOffset, positionOffsetPixels)

        override fun onPageSelected(position: Int) = onPageSelected(position)
        override fun onPageScrollStateChanged(state: Int) = onPageScrollStateChanged(state)
    }
    addOnPageChangeListener(listener)
    return this
}