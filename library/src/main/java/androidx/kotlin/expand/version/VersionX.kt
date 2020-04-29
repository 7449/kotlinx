@file:JvmName("VersionUtils")

package androidx.kotlin.expand.version

import android.os.Build

@JvmName("isMinVersion")
fun Int.minVersionExpand(): Boolean =
    Build.VERSION.SDK_INT >= this

@JvmName("isMaxVersion")
fun Int.maxVersionExpand(): Boolean =
    Build.VERSION.SDK_INT <= this

@JvmName("getCurrentVersion")
fun Int.currentVersionExpand(): Boolean =
    Build.VERSION.SDK_INT == this

@JvmName("isLollipop")
fun hasLExpand(): Boolean =
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP

@JvmName("isM")
fun hasMExpand(): Boolean =
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.M

@JvmName("isN")
fun hasNExpand(): Boolean =
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.N

@JvmName("isQ")
fun hasQExpand(): Boolean =
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q

class CheckVersion(private val version: String) : Comparable<CheckVersion> {

    init {
        require(version.matches(Regex("[0-9]+(\\.[0-9]+)*"))) { "Invalid version format" }
    }

    override fun compareTo(other: CheckVersion): Int {
        val thisParts = version.split("\\.").toTypedArray()
        val thatParts = other.version.split("\\.").toTypedArray()
        val length = thisParts.size.coerceAtLeast(thatParts.size)
        for (i in 0 until length) {
            val thisPart = if (i < thisParts.size) thisParts[i].toInt() else 0
            val thatPart = if (i < thatParts.size) thatParts[i].toInt() else 0
            if (thisPart < thatPart) return -1
            if (thisPart > thatPart) return 1
        }
        return 0
    }

    override fun equals(other: Any?): Boolean {
        return this === other || other != null
                && this.javaClass == other.javaClass
                && this.compareTo(other as CheckVersion) == 0
    }

}
