@file:JvmName("ViewPagerUtils")

package androidx.kotlin.expand.widget

import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import androidx.viewpager.widget.ViewPager

@JvmName("addOnPageScrolled")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun ViewPager.doOnPageScrolledExpand(action: (position: Int, positionOffset: Float, positionOffsetPixels: Int) -> Unit): ViewPager =
    addOnPageChangeListenerExpand(onPageScrolled = action)

@JvmName("addOnPageSelected")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun ViewPager.doOnPageSelectedExpand(action: (position: Int) -> Unit): ViewPager =
    addOnPageChangeListenerExpand(onPageSelected = action)

@JvmName("addOnPageScrollStateChanged")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun ViewPager.doOnPageScrollStateChangedExpand(action: (state: Int) -> Unit): ViewPager =
    addOnPageChangeListenerExpand(onPageScrollStateChanged = action)

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
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
        ): Unit = onPageScrolled(position, positionOffset, positionOffsetPixels)

        override fun onPageSelected(position: Int): Unit = onPageSelected(position)
        override fun onPageScrollStateChanged(state: Int): Unit = onPageScrollStateChanged(state)
    }
    addOnPageChangeListener(listener)
    return this
}