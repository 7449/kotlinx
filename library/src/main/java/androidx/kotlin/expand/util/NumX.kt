@file:JvmName("NumUtils")

package androidx.kotlin.expand.util

import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,保留一位小数")
    ]
)
val Float.formatOneDecimalExpand: String
    get() = DecimalFormat("##0.0").format(toDouble())

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,保留两位小数")
    ]
)
val Float.formatTwoDecimalExpand: String
    get() = DecimalFormat("##0.00").format(toDouble())

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,保留两位小数百分比")
    ]
)
val Float.formatTwoDecimalPercentExpand: String
    get() = "$formatTwoDecimalExpand%"

@JvmName("roundingNumber")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,四舍五入")
    ]
)
fun Float.roundingNumberExpand(scale: Int): Double =
    roundingNumberExpand(scale, RoundingMode.HALF_UP)

@JvmName("roundingNumber")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,四舍五入")
    ]
)
fun Float.roundingNumberExpand(scale: Int, mode: RoundingMode): Double =
    BigDecimal(toDouble()).setScale(scale, mode).toDouble()
