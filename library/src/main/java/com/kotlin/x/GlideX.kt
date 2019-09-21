package com.kotlin.x

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import com.bumptech.glide.util.Util
import java.io.File
import java.math.BigDecimal

fun ImageView.centerCropGlideFile(url: Any, placeHolder: Int = R.drawable.ic_default_loading) {
    scaleType = ImageView.ScaleType.CENTER_CROP
    Glide
            .with(context)
            .asFile()
            .load(url)
            .into(object : CustomTarget<File>() {
                override fun onLoadCleared(placeholder: Drawable?) {
                }

                override fun onResourceReady(resource: File, transition: Transition<in File>?) {
                    Glide
                            .with(context)
                            .load(resource.absolutePath)
                            .placeholder(placeHolder)
                            .into(this@centerCropGlideFile)
                }
            })
}

fun ImageView.glideFile(url: Any, placeHolder: Int = R.drawable.ic_default_loading) {
    Glide
            .with(context)
            .asFile()
            .load(url)
            .into(object : CustomTarget<File>() {
                override fun onLoadCleared(placeholder: Drawable?) {
                }

                override fun onResourceReady(resource: File, transition: Transition<in File>?) {
                    Glide
                            .with(context)
                            .load(resource.absolutePath)
                            .placeholder(placeHolder)
                            .into(this@glideFile)
                }
            })
}

fun ImageView.centerCropGlide(url: Any, placeHolder: Int = R.drawable.ic_default_loading) {
    scaleType = ImageView.ScaleType.CENTER_CROP
    Glide.with(context).load(url).placeholder(placeHolder).into(this)
}

fun ImageView.glide(url: Any, placeHolder: Int = R.drawable.ic_default_loading) {
    Glide.with(context).load(url).placeholder(placeHolder).into(this)
}

fun Context.clearMemory() {
    Glide.get(this).clearMemory()
}

fun Context.clearImageDiskCache() {
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

fun Context.getDiskCacheSize(): String {
    try {
        return getFormatSize(File(cacheDir.toString() + "/" + InternalCacheDiskCacheFactory.DEFAULT_DISK_CACHE_DIR).getFolderSize().toDouble())
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return "0"
}

fun File.getFolderSize(): Long {
    var size: Long = 0
    try {
        val fileList = listFiles() ?: return size
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

fun getFormatSize(size: Double): String {
    val kiloByte = size / 1024
    if (kiloByte < 1) {
        return 0.toString()
    }
    val megaByte = kiloByte / 1024
    if (megaByte < 1) {
        val result1 = BigDecimal(kiloByte.toString())
        return result1.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString() + "KB"
    }
    val gigaByte = megaByte / 1024
    if (gigaByte < 1) {
        val result2 = BigDecimal(megaByte.toString())
        return result2.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString() + "MB"
    }
    val teraBytes = gigaByte / 1024
    if (teraBytes < 1) {
        val result3 = BigDecimal(gigaByte.toString())
        return result3.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString() + "GB"
    }
    val result4 = BigDecimal(teraBytes)
    return result4.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString() + "TB"
}