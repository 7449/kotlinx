@file:JvmName("Md5Utils")

package androidx.kotlin.expand.util

import java.security.MessageDigest
import kotlin.experimental.and

@JvmName("encodeMD5")
fun String.encodeMD5Expand(): String {
    return runCatching {
        val digest: MessageDigest = MessageDigest.getInstance("MD5")
        digest.update(toByteArray())
        digest.digest().toHexStringExpand()
    }.getOrElse { "" }
}

@JvmName("toHexString")
fun ByteArray.toHexStringExpand(): String {
    val expectedStringLen: Int = size * 2
    val sb = StringBuilder(expectedStringLen)
    for (i: Int in indices) {
        var hexStr: String = (this[i] and 0x00FF.toByte()).toString(16)
        if (hexStr.length == 1) {
            hexStr = "0$hexStr"
        }
        sb.append(hexStr)
    }
    return sb.toString()
}