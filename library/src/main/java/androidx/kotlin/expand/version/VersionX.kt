@file:JvmName("VersionUtils")

package androidx.kotlin.expand.version

import android.os.Build
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog

@JvmName("isMinVersion")
@Version([VersionLog(Version.BANANA)])
fun Int.minVersionExpand(): Boolean =
    Build.VERSION.SDK_INT >= this

@JvmName("isMaxVersion")
@Version([VersionLog(Version.BANANA)])
fun Int.maxVersionExpand(): Boolean =
    Build.VERSION.SDK_INT <= this

@JvmName("getCurrentVersion")
@Version([VersionLog(Version.BANANA)])
fun Int.currentVersionExpand(): Boolean =
    Build.VERSION.SDK_INT == this

@JvmName("isLollipop")
@Version([VersionLog(Version.BANANA)])
fun hasLExpand(): Boolean =
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP

@JvmName("isM")
@Version([VersionLog(Version.BANANA)])
fun hasMExpand(): Boolean =
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.M

@JvmName("isN")
@Version([VersionLog(Version.BANANA)])
fun hasNExpand(): Boolean =
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.N

@JvmName("isQ")
@Version([VersionLog(Version.BANANA)])
fun hasQExpand(): Boolean =
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q

@Version([VersionLog(Version.BANANA)])
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

    override fun hashCode(): Int {
        return version.hashCode()
    }

}
