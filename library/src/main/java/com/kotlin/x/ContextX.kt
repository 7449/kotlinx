@file:Suppress("NOTHING_TO_INLINE")

package com.kotlin.x

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import androidx.core.content.ContextCompat

inline fun Context.startActivity(clazz: Class<*>, bundle: Bundle = Bundle.EMPTY) {
    val intent = Intent(this, clazz)
    intent.putExtras(bundle)
    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
    startActivity(intent)
}

inline fun Context.appIntent(packageName: String) = packageManager.getLaunchIntentForPackage(packageName)

inline fun Context.getDrawable(id: Int): Drawable? = ContextCompat.getDrawable(this, id)

inline fun Context.getColor(id: Int): Int = ContextCompat.getColor(this, id)

inline fun Context.getString(id: Int): String = this.resources.getString(id)

inline fun Context.getStringArray(id: Int): Array<String> = this.resources.getStringArray(id)

inline fun Context.getIntArray(id: Int): IntArray = this.resources.getIntArray(id)

inline fun Context.getDimension(id: Int): Float = this.resources.getDimension(id)

inline fun Context.isLandscape(): Boolean = resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE

inline fun Context.gotoStore(): Boolean {
    val goToMarket = Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=$packageName"))
    return try {
        goToMarket.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(goToMarket)
        true
    } catch (ignored: ActivityNotFoundException) {
        false
    }
}