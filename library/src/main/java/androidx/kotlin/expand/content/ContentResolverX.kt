@file:JvmName("ContentResolverUtils")

package androidx.kotlin.expand.content

import android.content.ContentResolver
import android.database.Cursor
import android.net.Uri
import android.provider.MediaStore

@JvmName("query")
fun ContentResolver.queryExpand(uri: Uri, name: String): Cursor? =
    query(uri, arrayOf(name), null, null, null)

@JvmName("moveToNextToId")
fun ContentResolver.moveToNextToIdExpand(uri: Uri): Boolean =
    moveToNextExpand(uri, MediaStore.Files.FileColumns._ID)

@JvmName("moveToNext")
fun ContentResolver.moveToNextExpand(uri: Uri, name: String): Boolean =
    queryExpand(uri, name).use { it?.moveToNext() ?: false }

@JvmName("queryData")
fun ContentResolver.queryDataExpand(uri: Uri): String? =
    queryExpand(uri, MediaStore.MediaColumns.DATA).use {
        val cursor = it ?: return null
        while (cursor.moveToNext()) {
            return cursor.getString(cursor.getColumnIndex(MediaStore.MediaColumns.DATA))
        }
        return null
    }

@JvmName("queryId")
fun ContentResolver.queryIdExpand(uri: Uri): Long {
    val split = uri.toString().split("/")
    var id = -1L
    try {
        id = split[split.size - 1].toLong()
    } catch (e: Exception) {
        queryExpand(uri, MediaStore.Files.FileColumns._ID).use {
            val cursor = it ?: return@use -1L
            while (cursor.moveToNext()) {
                id = cursor.getLong(cursor.getColumnIndex(MediaStore.Files.FileColumns._ID))
            }
        }
    }
    return id
}