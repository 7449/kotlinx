package com.kotlin.x

import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.widget.Toast
import androidx.annotation.*
import androidx.core.content.ContextCompat
import java.io.File

fun Context.insertImage(contentValues: ContentValues) =
        if (Environment.getExternalStorageState() == Environment.MEDIA_MOUNTED) {
            contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues)
                    ?: throw KotlinNullPointerException()
        } else {
            contentResolver.insert(MediaStore.Images.Media.INTERNAL_CONTENT_URI, contentValues)
                    ?: throw KotlinNullPointerException()
        }

fun Context.startActivity(clazz: Class<*>, bundle: Bundle = Bundle.EMPTY) {
    val intent = Intent(this, clazz)
    intent.putExtras(bundle)
    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
    startActivity(intent)
}

fun Context.appIntent(packageName: String): Intent? =
        packageManager.getLaunchIntentForPackage(packageName)

fun Context.toast(any: Any) = Toast.makeText(this, any.toString(), Toast.LENGTH_SHORT).show()

fun Context.color(@ColorRes id: Int) = ContextCompat.getColor(this, id)

fun Context.drawable(@DrawableRes id: Int) = ContextCompat.getDrawable(this, id)

fun Context.string(@StringRes id: Int): String = this.resources.getString(id)

fun Context.stringArray(@ArrayRes id: Int): Array<String> = this.resources.getStringArray(id)

fun Context.intArray(@ArrayRes id: Int): IntArray = this.resources.getIntArray(id)

fun Context.dimension(@DimenRes id: Int): Float = this.resources.getDimension(id)

fun Context.isLandscape(): Boolean =
        resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE

fun Context.minimumDrawable(@DrawableRes id: Int, @ColorInt color: Int): Drawable {
    val drawable = drawable(id) ?: throw KotlinNullPointerException()
    drawable.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP)
    drawable.setBounds(0, 0, drawable.minimumWidth, drawable.minimumHeight)
    return drawable
}

fun Context.uriExists(uri: Uri) = uriExists(uri, MediaStore.Files.FileColumns._ID)

fun Context.uriExists(uri: Uri, name: String) = contentResolver.query(uri, name).use {
    it?.moveToNext() ?: false
}

fun Context.findIdByUri(uri: Uri): Long {
    val split = uri.toString().split("/")
    var id = 0L
    try {
        id = split[split.size - 1].toLong()
    } catch (e: Exception) {
        contentResolver.query(uri, arrayOf(MediaStore.Files.FileColumns._ID), null, null, null)
                .use {
                    val cursor = it ?: return 0L
                    while (cursor.moveToNext()) {
                        id = cursor.getLong(cursor.getColumnIndex(MediaStore.Files.FileColumns._ID))
                    }
                }
    }
    return id
}

fun Context.findUriByFile(file: File) = insertImage(ContentValues().apply {
    if (hasQ()) {
        put(MediaStore.MediaColumns.DISPLAY_NAME, file.name)
        put(MediaStore.MediaColumns.RELATIVE_PATH, Environment.DIRECTORY_DCIM)
    } else {
        put(MediaStore.MediaColumns.DATA, file.path)
    }
})

fun Context.findFilePathToUri(uri: Uri): String? {
    contentResolver.query(uri, arrayOf(MediaStore.MediaColumns.DATA), null, null, null).use {
        val cursor = it ?: return null
        val dataColumnIndex = cursor.getColumnIndex(MediaStore.MediaColumns.DATA)
        while (cursor.moveToNext()) {
            return cursor.getString(dataColumnIndex)
        }
    }
    return null
}

fun Context.openVideo(uri: Uri, error: () -> Unit) {
    try {
        val openVideo = Intent(Intent.ACTION_VIEW)
        openVideo.setDataAndType(uri, "video/*")
        startActivity(openVideo)
    } catch (e: Exception) {
        error.invoke()
    }
}

fun Context.gotoStore(error: () -> Unit) {
    val goToMarket = Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=$packageName"))
    try {
        goToMarket.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(goToMarket)
    } catch (ignored: Exception) {
        error.invoke()
    }
}