package com.expand.test

import android.database.Cursor
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.kotlin.expand.database.getStringOrDefault
import androidx.kotlin.expand.os.permission.permissionStorageExpand
import androidx.loader.app.LoaderManager
import androidx.loader.content.CursorLoader
import androidx.loader.content.Loader
import java.io.Serializable

class Test : Serializable

object TestApp {
    fun testCursor(context: AppCompatActivity) {
        if (!context.permissionStorageExpand()) {
            return
        }
        LoaderManager.getInstance(context)
            .restartLoader(-1, null, object : LoaderManager.LoaderCallbacks<Cursor> {

                override fun onLoadFinished(loader: Loader<Cursor>, data: Cursor?) {
                    val cursor = data ?: return
                    while (cursor.moveToNext()) {
                        Log.i(
                            "TestApp",
                            cursor.getStringOrDefault(MediaStore.Files.FileColumns._ID) + "\n"
                                    + cursor.getStringOrDefault(cursor.getColumnIndex(MediaStore.Files.FileColumns._ID))
                        )
                    }
                }

                override fun onLoaderReset(loader: Loader<Cursor>) {
                }

                override fun onCreateLoader(id: Int, args: Bundle?): Loader<Cursor> {
                    return CursorLoader(
                        context,
                        MediaStore.Files.getContentUri("external"),
                        null,
                        null,
                        null,
                        null
                    )
                }
            })
    }
}