@file:Suppress("NOTHING_TO_INLINE")

package com.kotlin.x

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.text.TextUtils
import android.util.Base64
import java.io.ByteArrayOutputStream

/**
 * 获取Bitmap的宽高
 * 不进入内存
 * @return [0] 宽 [1]高
 */
inline fun String.getImageWidthHeight(): IntArray {
    val options = BitmapFactory.Options()
    options.inJustDecodeBounds = true
    BitmapFactory.decodeFile(this, options)
    return intArrayOf(options.outWidth, options.outHeight)
}

/**
 * 图片转 Base64 带头部
 */
inline fun String.bitmapToBase64HeaderPng(quality: Int = 100): String {
    val bitmap = BitmapFactory.decodeFile(this)
    val byteArrayOutputStream = ByteArrayOutputStream()
    bitmap.compress(Bitmap.CompressFormat.JPEG, quality, byteArrayOutputStream)
    return TextUtils.concat(
        "data:image/jpeg;base64,",
        Base64.encodeToString(byteArrayOutputStream.toByteArray(), Base64.NO_WRAP)
    ).toString()
}

/**
 * 图片转 Base64
 */
inline fun String.bitmapToBase64(quality: Int = 100): String {
    val bitmap = BitmapFactory.decodeFile(this)
    val byteArrayOutputStream = ByteArrayOutputStream()
    bitmap.compress(Bitmap.CompressFormat.JPEG, quality, byteArrayOutputStream)
    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), Base64.NO_WRAP)
}

/**
 * 图片转 Base64 png
 */
inline fun Bitmap.bitmapToBase64HeaderPng(quality: Int = 100): String {
    val byteArrayOutputStream = ByteArrayOutputStream()
    compress(Bitmap.CompressFormat.PNG, quality, byteArrayOutputStream)
    return TextUtils.concat(
        "data:image/png;base64,",
        Base64.encodeToString(byteArrayOutputStream.toByteArray(), Base64.NO_WRAP)
    ).toString()
}

/**
 * 图片转 Base64
 */
inline fun Bitmap.bitmapToBase64(quality: Int = 100): String {
    val byteArrayOutputStream = ByteArrayOutputStream()
    compress(Bitmap.CompressFormat.JPEG, quality, byteArrayOutputStream)
    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), Base64.NO_WRAP)
}