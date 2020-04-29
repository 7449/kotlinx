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

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
val Drawable.getAlphaExpand: Int
    get() = DrawableCompat.getAlpha(this)

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
val Drawable.canApplyThemeExpand: Boolean
    get() = DrawableCompat.canApplyTheme(this)

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
val Drawable.getColorFilterExpand: ColorFilter
    get() = DrawableCompat.getColorFilter(this)

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
val Drawable.getLayoutDirectionExpand: Int
    get() = DrawableCompat.getLayoutDirection(this)

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Drawable.setHotspotExpand(x: Float, y: Float) =
    DrawableCompat.setHotspot(this, x, y)

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Drawable.setHotspotBoundsExpand(left: Int, top: Int, right: Int, bottom: Int) =
    DrawableCompat.setHotspotBounds(this, left, top, right, bottom)

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Drawable.setTintExpand(@ColorInt tint: Int) =
    DrawableCompat.setTint(this, tint)

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Drawable.setTintListExpand(tint: ColorStateList?) =
    DrawableCompat.setTintList(this, tint)

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Drawable.setTintModeExpand(tint: PorterDuff.Mode) =
    DrawableCompat.setTintMode(this, tint)

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Drawable.applyThemeExpand(theme: Resources.Theme) =
    DrawableCompat.applyTheme(this, theme)

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Drawable.cleanColorFilterExpand() =
    DrawableCompat.clearColorFilter(this)

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Drawable.wrapExpand(): Drawable =
    DrawableCompat.wrap(this)

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun <T : Drawable> Drawable.unwrapExpand(): T =
    DrawableCompat.unwrap(this)

@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Drawable.setLayoutDirectionExpand(layoutDirection: Int) =
    DrawableCompat.setLayoutDirection(this, layoutDirection)

@JvmName("getMinimumWidthAndHeightDrawable")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Drawable.minimumWidthAndHeightDrawableExpand(@ColorInt color: Int): Drawable {
    this.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP)
    this.setBounds(0, 0, this.minimumWidth, this.minimumHeight)
    return this
}

@JvmName("setCornerRadius")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun GradientDrawable.cornerRadiusExpand(radius: Float) = also { cornerRadius = radius }

@JvmName("setColor")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun GradientDrawable.colorExpand(color: Int) = also { setColor(color) }

@JvmName("addEnabledState")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun StateListDrawable.addEnabledStateExpand(radius: Float, color: Int) = also {
    addState(
        intArrayOf(android.R.attr.state_enabled),
        GradientDrawable().cornerRadiusExpand(radius).colorExpand(color)
    )
}

@JvmName("addNormalState")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun StateListDrawable.addNormalStateExpand(radius: Float, color: Int) = also {
    addState(
        intArrayOf(-android.R.attr.state_enabled),
        GradientDrawable().cornerRadiusExpand(radius).colorExpand(color)
    )
}
