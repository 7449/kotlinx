@file:JvmName("BitmapUtils")

package androidx.kotlin.expand.graphics

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Base64
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import java.io.ByteArrayOutputStream

/**
 * 获取Bitmap的宽高
 * 不进入内存
 * @return [0] 宽 [1]高
 */
@JvmName("getImageWidthHeight")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun String.imageWidthHeightExpand(): IntArray {
    val options = BitmapFactory.Options()
    options.inJustDecodeBounds = true
    BitmapFactory.decodeFile(this, options)
    return intArrayOf(options.outWidth, options.outHeight)
}

/**
 * 图片转 Base64 带头部
 */
@JvmName("getBitmapToBase64HeaderPng")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun String.bitmapToBase64HeaderPngExpand(quality: Int = 100): String {
    val bitmap = BitmapFactory.decodeFile(this)
    val byteArrayOutputStream = ByteArrayOutputStream()
    bitmap.compress(Bitmap.CompressFormat.JPEG, quality, byteArrayOutputStream)
    return "data:image/jpeg;base64," + Base64.encodeToString(
        byteArrayOutputStream.toByteArray(),
        Base64.NO_WRAP
    )
}

/**
 * 图片转 Base64
 */
@JvmName("getBitmapToBase64")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun String.bitmapToBase64Expand(quality: Int = 100): String {
    val bitmap = BitmapFactory.decodeFile(this)
    val byteArrayOutputStream = ByteArrayOutputStream()
    bitmap.compress(Bitmap.CompressFormat.JPEG, quality, byteArrayOutputStream)
    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), Base64.NO_WRAP)
}

/**
 * 图片转 Base64 png
 */
@JvmName("getBitmapToBase64HeaderPng")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Bitmap.bitmapToBase64HeaderPngExpand(quality: Int = 100): String {
    val byteArrayOutputStream = ByteArrayOutputStream()
    compress(Bitmap.CompressFormat.PNG, quality, byteArrayOutputStream)
    return "data:image/png;base64," + Base64.encodeToString(
        byteArrayOutputStream.toByteArray(),
        Base64.NO_WRAP
    )
}

/**
 * 图片转 Base64
 */
@JvmName("getBitmapToBase64")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun Bitmap.bitmapToBase64Expand(quality: Int = 100): String {
    val byteArrayOutputStream = ByteArrayOutputStream()
    compress(Bitmap.CompressFormat.JPEG, quality, byteArrayOutputStream)
    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), Base64.NO_WRAP)
}