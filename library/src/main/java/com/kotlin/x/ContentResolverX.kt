@file:JvmName("ContentResolverUtils")

package com.kotlin.x

import android.content.ContentResolver
import android.database.Cursor
import android.net.Uri
import android.provider.MediaStore

fun ContentResolver.query(uri: Uri, name: String): Cursor? =
    query(uri, arrayOf(name), null, null, null)

fun ContentResolver.moveToNextToId(uri: Uri): Boolean =
    moveToNext(uri, MediaStore.Files.FileColumns._ID)

fun ContentResolver.moveToNext(uri: Uri, name: String): Boolean =
    query(uri, name).use { it?.moveToNext() ?: false }

fun ContentResolver.queryData(uri: Uri): String? = query(uri, MediaStore.MediaColumns.DATA).use {
    val cursor = it ?: return null
    while (cursor.moveToNext()) {
        return cursor.getString(cursor.getColumnIndex(MediaStore.MediaColumns.DATA))
    }
    return null
}

fun ContentResolver.queryId(uri: Uri): Long {
    val split = uri.toString().split("/")
    var id = -1L
    try {
        id = split[split.size - 1].toLong()
    } catch (e: Exception) {
        query(uri, MediaStore.Files.FileColumns._ID).use {
            val cursor = it ?: return@use -1L
            while (cursor.moveToNext()) {
                id = cursor.getLong(cursor.getColumnIndex(MediaStore.Files.FileColumns._ID))
            }
        }
    }
    return id
}