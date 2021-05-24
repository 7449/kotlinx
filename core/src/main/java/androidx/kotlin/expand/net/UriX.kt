@file:JvmName("UriUtils")

package androidx.kotlin.expand.net

import android.content.ContentResolver
import android.content.Context
import android.net.Uri
import android.util.Log
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import androidx.kotlin.expand.content.findPathByUriExpand

@JvmName("isFileExists")
@Version(VersionLog(Version.NONE))
fun Uri.isFileExistsExpand(context: Context): Boolean {
    return runCatching {
        context.contentResolver.openAssetFileDescriptor(this, "r")?.close()
    }.isSuccess
}

@JvmName("delete")
@Version(VersionLog(Version.NONE))
fun Uri.deleteExpand(context: Context) {
    runCatching {
        context.contentResolver.delete(this, null, null)
    }
        .onSuccess { Log.i("UriUtils", "delete uri success:$this") }
        .onFailure { Log.e("UriUtils", "delete uri failure:$this") }
}

@JvmName("getFilePath")
@Version(VersionLog(Version.NONE))
fun Uri.filePathExpand(context: Context): String {
    return when (scheme) {
        ContentResolver.SCHEME_CONTENT -> context.findPathByUriExpand(this).orEmpty()
        ContentResolver.SCHEME_FILE -> path.orEmpty()
        else -> throw RuntimeException("unsupported uri")
    }
}

@JvmName("getUriOrEmpty")
@Version(VersionLog(Version.NONE))
fun Uri?.orEmptyExpand(): Uri = this ?: Uri.EMPTY

@JvmName("getQueryParameter")
@Version(VersionLog(Version.NONE))
fun String.getQueryParameterExpand(key: String, defaultValue: String = ""): String =
    Uri.parse(this).getQueryParameter(key) ?: defaultValue

@JvmName("getBooleanQueryParameter")
@Version(VersionLog(Version.NONE))
fun String.getBooleanQueryParameterExpand(key: String, defaultValue: Boolean = false): Boolean =
    Uri.parse(this).getBooleanQueryParameter(key, defaultValue)

@JvmName("getListQueryParameter")
@Version(VersionLog(Version.NONE))
fun String.getListQueryParameterExpand(vararg key: String): ArrayList<String> {
    val parse = Uri.parse(this)
    val list = ArrayList<String>()
    key.forEach {
        list.add(parse.getQueryParameter(it) ?: "")
    }
    return list
}
