@file:Suppress("NOTHING_TO_INLINE")

package com.kotlin.x

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
import java.io.File

inline fun ImageView.centerCropGlideFile(url: Any) {
    scaleType = ImageView.ScaleType.CENTER_CROP
    Glide.with(context).asFile().load(url).placeholder(R.drawable.ic_default_loading)
        .into(object : SimpleTarget<File>() {
            override fun onResourceReady(resource: File, transition: Transition<in File>?) {
                Glide.with(context).load(resource.absolutePath).placeholder(R.drawable.ic_default_loading)
                    .into(this@centerCropGlideFile)
            }
        })
}

inline fun ImageView.glideFile(url: Any) {
    Glide.with(context).asFile().load(url).placeholder(R.drawable.ic_default_loading)
        .into(object : SimpleTarget<File>() {
            override fun onResourceReady(resource: File, transition: Transition<in File>?) {
                Glide.with(context).load(resource.absolutePath).placeholder(R.drawable.ic_default_loading)
                    .into(this@glideFile)
            }
        })
}

inline fun ImageView.centerCropGlide(url: Any) {
    scaleType = ImageView.ScaleType.CENTER_CROP
    Glide.with(context).load(url).placeholder(R.drawable.ic_default_loading).into(this)
}

inline fun ImageView.glide(url: Any) {
    Glide.with(context).load(url).placeholder(R.drawable.ic_default_loading).into(this)
}