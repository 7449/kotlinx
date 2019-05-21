@file:Suppress("NOTHING_TO_INLINE")

package com.kotlin.x

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Looper
import android.widget.ImageView
import androidx.annotation.NonNull
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.target.Target
import com.bumptech.glide.request.transition.Transition
import com.bumptech.glide.util.Util
import java.io.File
import java.math.BigDecimal

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
        .into(object : CustomTarget<File>() {

            override fun onLoadCleared(placeholder: Drawable?) {
            }

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

inline fun Context.clearMemory() {
    Glide.get(this).clearMemory()
}

inline fun Context.clearImageDiskCache() {
    try {
        if (Util.isOnMainThread()) {
            Thread { Glide.get(this).clearDiskCache() }.start()
        } else {
            Glide.get(this).clearDiskCache()
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

inline fun getDiskCacheSize(context: Context): String {
    try {
        return getFormatSize(File(context.cacheDir.toString() + "/" + InternalCacheDiskCacheFactory.DEFAULT_DISK_CACHE_DIR).getFolderSize().toDouble())
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return "0"
}

fun File.getFolderSize(): Long {
    var size: Long = 0
    try {
        val fileList = listFiles()
        for (aFileList in fileList) {
            size = if (aFileList.isDirectory) {
                size + aFileList.getFolderSize()
            } else {
                size + aFileList.length()
            }
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return size
}

inline fun getFormatSize(size: Double): String {
    val kiloByte = size / 1024
    if (kiloByte < 1) {
        return 0.toString()
    }
    val megaByte = kiloByte / 1024
    if (megaByte < 1) {
        val result1 = BigDecimal(java.lang.Double.toString(kiloByte))
        return result1.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString() + "KB"
    }
    val gigaByte = megaByte / 1024
    if (gigaByte < 1) {
        val result2 = BigDecimal(java.lang.Double.toString(megaByte))
        return result2.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString() + "MB"
    }
    val teraBytes = gigaByte / 1024
    if (teraBytes < 1) {
        val result3 = BigDecimal(java.lang.Double.toString(gigaByte))
        return result3.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString() + "GB"
    }
    val result4 = BigDecimal(teraBytes)
    return result4.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString() + "TB"
}