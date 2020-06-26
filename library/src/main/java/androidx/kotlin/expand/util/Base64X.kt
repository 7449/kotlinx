@file:JvmName("Base64Utils")

package androidx.kotlin.expand.util

import android.util.Base64
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog

@Version([VersionLog(Version.PEACHES)])
val ByteArray.encodeBase64Expand: ByteArray
    get() = Base64.encode(this, Base64.DEFAULT)

@Version([VersionLog(Version.PEACHES)])
val String.encodeBase64Expand: String
    get() = Base64.encodeToString(toByteArray(), Base64.DEFAULT)

@Version([VersionLog(Version.PEACHES)])
val ByteArray.decodeBase64Expand: ByteArray
    get() = Base64.decode(this, Base64.DEFAULT)

@Version([VersionLog(Version.PEACHES)])
val String.decodeBase64Expand: String
    get() = String(Base64.decode(this, Base64.DEFAULT))
