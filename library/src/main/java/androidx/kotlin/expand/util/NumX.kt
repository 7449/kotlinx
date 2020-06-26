@file:JvmName("NumUtils")

package androidx.kotlin.expand.util

import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat

@Version([VersionLog(Version.PEACHES)])
val Float.formatOneDecimalExpand: String
    get() = DecimalFormat("##0.0").format(toDouble())

@Version([VersionLog(Version.PEACHES)])
val Float.formatTwoDecimalExpand: String
    get() = DecimalFormat("##0.00").format(toDouble())

@Version([VersionLog(Version.PEACHES)])
val Float.formatTwoDecimalPercentExpand: String
    get() = "$formatTwoDecimalExpand%"

@JvmName("roundingNumber")
@Version([VersionLog(Version.PEACHES)])
fun Float.roundingNumberExpand(scale: Int): Double =
    roundingNumberExpand(scale, RoundingMode.HALF_UP)

@JvmName("roundingNumber")
@Version([VersionLog(Version.PEACHES)])
fun Float.roundingNumberExpand(scale: Int, mode: RoundingMode): Double =
    BigDecimal(toDouble()).setScale(scale, mode).toDouble()
