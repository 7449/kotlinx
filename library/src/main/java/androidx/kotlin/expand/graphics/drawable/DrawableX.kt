@file:JvmName("DrawableUtils")

//@see androidx.core.graphics.drawable.DrawableCompat
//Drawable Expand
package androidx.kotlin.expand.graphics.drawable

import android.content.res.ColorStateList
import android.content.res.Resources
import android.graphics.ColorFilter
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.StateListDrawable
import androidx.annotation.ColorInt
import androidx.core.graphics.drawable.DrawableCompat
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog

@Version([VersionLog(Version.BANANA), VersionLog(Version.CHERRY)])
val Drawable.alphaExpand: Int
    get() = DrawableCompat.getAlpha(this)

@Version([VersionLog(Version.BANANA)])
val Drawable.canApplyThemeExpand: Boolean
    get() = DrawableCompat.canApplyTheme(this)

@Version([VersionLog(Version.BANANA), VersionLog(Version.CHERRY)])
val Drawable.colorFilterExpand: ColorFilter
    get() = DrawableCompat.getColorFilter(this)

@Version([VersionLog(Version.BANANA), VersionLog(Version.CHERRY)])
val Drawable.layoutDirectionExpand: Int
    get() = DrawableCompat.getLayoutDirection(this)

@JvmName("setHotspot")
@Version([VersionLog(Version.BANANA)])
fun Drawable.setHotspotExpand(x: Float, y: Float) =
    DrawableCompat.setHotspot(this, x, y)

@JvmName("setHotspotBounds")
@Version([VersionLog(Version.BANANA)])
fun Drawable.setHotspotBoundsExpand(left: Int, top: Int, right: Int, bottom: Int) =
    DrawableCompat.setHotspotBounds(this, left, top, right, bottom)

@JvmName("setTint")
@Version([VersionLog(Version.BANANA)])
fun Drawable.setTintExpand(@ColorInt tint: Int) =
    DrawableCompat.setTint(this, tint)

@JvmName("setTintList")
@Version([VersionLog(Version.BANANA)])
fun Drawable.setTintListExpand(tint: ColorStateList?) =
    DrawableCompat.setTintList(this, tint)

@JvmName("setTintMode")
@Version([VersionLog(Version.BANANA)])
fun Drawable.setTintModeExpand(tint: PorterDuff.Mode) =
    DrawableCompat.setTintMode(this, tint)

@JvmName("applyTheme")
@Version([VersionLog(Version.BANANA)])
fun Drawable.applyThemeExpand(theme: Resources.Theme) =
    DrawableCompat.applyTheme(this, theme)

@JvmName("clearColorFilter")
@Version([VersionLog(Version.BANANA)])
fun Drawable.cleanColorFilterExpand() =
    DrawableCompat.clearColorFilter(this)

@JvmName("wrap")
@Version([VersionLog(Version.BANANA)])
fun Drawable.wrapExpand(): Drawable =
    DrawableCompat.wrap(this)

@JvmName("unwrap")
@Version([VersionLog(Version.BANANA)])
fun <T : Drawable> Drawable.unwrapExpand(): T =
    DrawableCompat.unwrap(this)

@JvmName("setLayoutDirection")
@Version([VersionLog(Version.BANANA)])
fun Drawable.setLayoutDirectionExpand(layoutDirection: Int) =
    DrawableCompat.setLayoutDirection(this, layoutDirection)

@JvmName("getMinimumWidthAndHeightDrawable")
@Version([VersionLog(Version.BANANA)])
fun Drawable.minimumWidthAndHeightDrawableExpand(@ColorInt color: Int): Drawable {
    this.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP)
    this.setBounds(0, 0, this.minimumWidth, this.minimumHeight)
    return this
}

@JvmName("setCornerRadius")
@Version([VersionLog(Version.BANANA)])
fun GradientDrawable.cornerRadiusExpand(radius: Float) = also { cornerRadius = radius }

@JvmName("setColor")
@Version([VersionLog(Version.BANANA)])
fun GradientDrawable.colorExpand(color: Int) = also { setColor(color) }

@JvmName("addEnabledState")
@Version([VersionLog(Version.BANANA)])
fun StateListDrawable.addEnabledStateExpand(radius: Float, color: Int) = also {
    addState(
        intArrayOf(android.R.attr.state_enabled),
        GradientDrawable().cornerRadiusExpand(radius).colorExpand(color)
    )
}

@JvmName("addNormalState")
@Version([VersionLog(Version.BANANA)])
fun StateListDrawable.addNormalStateExpand(radius: Float, color: Int) = also {
    addState(
        intArrayOf(-android.R.attr.state_enabled),
        GradientDrawable().cornerRadiusExpand(radius).colorExpand(color)
    )
}
