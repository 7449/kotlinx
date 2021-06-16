@file:JvmName("Base64Utils")

package androidx.kotlin.expand.util

import android.util.Base64

val ByteArray.encodeBase64Expand: ByteArray
    get() = Base64.encode(this, Base64.DEFAULT)

val String.encodeBase64Expand: String
    get() = Base64.encodeToString(toByteArray(), Base64.DEFAULT)

val ByteArray.decodeBase64Expand: ByteArray
    get() = Base64.decode(this, Base64.DEFAULT)

val String.decodeBase64Expand: String
    get() = String(Base64.decode(this, Base64.DEFAULT))