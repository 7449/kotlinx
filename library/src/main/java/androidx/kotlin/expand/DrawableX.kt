@file:JvmName("DrawableUtils")

package androidx.kotlin.expand

import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.StateListDrawable
import androidx.annotation.ColorInt

@JvmName("getMinimumWidthAndHeightDrawable")
fun Drawable.minimumWidthAndHeightDrawableExpand(@ColorInt color: Int): Drawable {
    this.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP)
    this.setBounds(0, 0, this.minimumWidth, this.minimumHeight)
    return this
}

@JvmName("setCornerRadius")
fun GradientDrawable.cornerRadiusExpand(radius: Float) = also { cornerRadius = radius }

@JvmName("setColor")
fun GradientDrawable.colorExpand(color: Int) = also { setColor(color) }

@JvmName("addEnabledState")
fun StateListDrawable.addEnabledStateExpand(radius: Float, color: Int) = also {
    addState(
        intArrayOf(android.R.attr.state_enabled),
        GradientDrawable().cornerRadiusExpand(radius).colorExpand(color)
    )
}

@JvmName("addNormalState")
fun StateListDrawable.addNormalStateExpand(radius: Float, color: Int) = also {
    addState(
        intArrayOf(-android.R.attr.state_enabled),
        GradientDrawable().cornerRadiusExpand(radius).colorExpand(color)
    )
}
