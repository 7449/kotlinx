@file:JvmName("TimeUtils")

package androidx.kotlin.expand.util

import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.abs

@Version([VersionLog(Version.PEACHES)])
enum class TimeUnit {
    MSEC,
    SEC,
    MIN,
    HOUR,
    DAY
}

@Version([VersionLog(Version.PEACHES)])
object TimeMultiple {
    /**
     * 毫秒与毫秒的倍数
     */
    const val MSEC = 1

    /**
     * 秒与毫秒的倍数
     */
    const val SEC = 1000

    /**
     * 分与毫秒的倍数
     */
    const val MIN = 60000

    /**
     * 时与毫秒的倍数
     */
    const val HOUR = 3600000

    /**
     * 天与毫秒的倍数
     */
    const val DAY = 86400000
}

@Version([VersionLog(Version.PEACHES)])
const val GMT_8 = "GMT+8:00"

@Version([VersionLog(Version.PEACHES)])
val DEFAULT_WEEK: Array<String> = arrayOf("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六")

@Version([VersionLog(Version.PEACHES)])
val DEFAULT_WEEK_2: Array<String> = arrayOf("周日", "周一", "周二", "周三", "周四", "周五", "周六")

@Version([VersionLog(Version.PEACHES)])
fun threadLocal(pattern: String): SimpleDateFormat = SimpleDateFormat(pattern, Locale.getDefault())

@Version([VersionLog(Version.PEACHES)])
val DEFAULT_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-MM-dd HH:mm:ss") }

@Version([VersionLog(Version.PEACHES)])
val CN_MM_DD_FORMAT: SimpleDateFormat by lazy { threadLocal("MM月dd日") }

@Version([VersionLog(Version.PEACHES)])
val CN_MM_DD_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("MM月dd日 HH:mm") }

@Version([VersionLog(Version.PEACHES)])
val CN_YYYY_MM_DD_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年MM月dd日") }

@Version([VersionLog(Version.PEACHES)])
val CN_YYYY_MM_DD_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年MM月dd日 HH:mm") }

@Version([VersionLog(Version.PEACHES)])
val CN_YYYY_M_D_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年M月d日") }

@Version([VersionLog(Version.PEACHES)])
val CN_YYYY_MM_DD_HH_MM_SS_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年MM月dd日HH时mm分ss秒") }

@Version([VersionLog(Version.PEACHES)])
val CN_YYYY_MM_DD_HH_MM_2_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年MM月dd日HH时mm分") }

@Version([VersionLog(Version.PEACHES)])
val CN_YYYY_MM_DD_HH_MM_3_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年M月d日H时m分") }

@Version([VersionLog(Version.PEACHES)])
val EN_YYYY_M_D_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-M-d HH:mm") }

@Version([VersionLog(Version.PEACHES)])
val EN_YYYY_MM_DD_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-MM-dd") }

@Version([VersionLog(Version.PEACHES)])
val EN_YYYY_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-MM") }

@Version([VersionLog(Version.PEACHES)])
val EN_YYYY_MM_DD_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-MM-dd HH:mm") }

@Version([VersionLog(Version.PEACHES)])
val EN_M_D_FORMAT: SimpleDateFormat by lazy { threadLocal("M/d") }

@Version([VersionLog(Version.PEACHES)])
val EN_MM_DD_FORMAT: SimpleDateFormat by lazy { threadLocal("MM-dd") }

@Version([VersionLog(Version.PEACHES)])
val EN_YYYY_MM_DD_HH_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-MM-dd HH") }

@Version([VersionLog(Version.PEACHES)])
val EN_YYYY_MM_DD_HH_FORMATS: SimpleDateFormat by lazy { threadLocal("yyyy.MM.dd") }

@Version([VersionLog(Version.PEACHES)])
val EN_BIAS_YYYY_MM_DD_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy/MM/dd") }

@Version([VersionLog(Version.PEACHES)])
val EN_BIAS_YYYY_MM_DD_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy/MM/dd HH:mm") }

@Version([VersionLog(Version.PEACHES)])
val EN_H_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("H:mm") }

@Version([VersionLog(Version.PEACHES)])
val EN_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("HH:mm") }

@Version([VersionLog(Version.PEACHES)])
val EN_YYYY_M_D_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-M-d") }

@Version([VersionLog(Version.PEACHES)])
val EN_MM_DD_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("MM-dd HH:mm") }

@Version([VersionLog(Version.PEACHES)])
fun Long.milliseconds2StringExpand(format: SimpleDateFormat = DEFAULT_FORMAT): String {
    return format.format(Date(this))
}

@Version([VersionLog(Version.PEACHES)])
fun String.string2MillisecondsExpand(format: SimpleDateFormat = DEFAULT_FORMAT): Long {
    try {
        return format.parse(this)?.time ?: -1
    } catch (e: ParseException) {
        e.printStackTrace()
    }
    return -1
}

@Version([VersionLog(Version.PEACHES)])
fun String.string2DateExpand(format: SimpleDateFormat = DEFAULT_FORMAT): Date {
    return Date(string2MillisecondsExpand(format))
}

@Version([VersionLog(Version.PEACHES)])
fun Long.milliseconds2DateExpand(): Date {
    return Date(this)
}

@Version([VersionLog(Version.PEACHES)])
fun Long.getIntervalTimeExpand(target: Long): Int {
    return ((target - this) / (1000 * 3600 * 24)).toInt()
}

@Version([VersionLog(Version.PEACHES)])
fun Int.isLeapYearExpand(): Boolean {
    return this % 4 == 0 && this % 100 != 0 || this % 400 == 0
}

@Version([VersionLog(Version.PEACHES)])
fun Array<String>.getWeekExpand(): String {
    var w: Int = Calendar.getInstance().apply {
        time = Date()
    }[Calendar.DAY_OF_WEEK - 1]
    if (w < 0) {
        w = 0
    }
    return this[w]
}

@Version([VersionLog(Version.PEACHES)])
fun Array<String>.getWeekOfNextDateExpand(): String {
    var w: Int = Calendar.getInstance().apply {
        time = Date()
    }[Calendar.DAY_OF_WEEK]
    if (w == 0) {
        w = 1
    }
    if (w > 6) {
        w = 0
    }
    return this[w]
}

@Version([VersionLog(Version.PEACHES)])
fun getCurTimeStringExpand(format: SimpleDateFormat = DEFAULT_FORMAT): String {
    return Date().date2StringExpand(format)
}

@Version([VersionLog(Version.PEACHES)])
fun Date.date2StringExpand(format: SimpleDateFormat = DEFAULT_FORMAT): String {
    return format.format(this)
}

@Version([VersionLog(Version.PEACHES)])
fun Calendar.getWeekOfYearExpand(id: String = GMT_8): Int {
    return try {
        timeZone = TimeZone.getTimeZone(id)
        firstDayOfWeek = Calendar.MONDAY
        this[Calendar.WEEK_OF_YEAR]
    } catch (e: Exception) {
        e.printStackTrace()
        0
    }
}

@Version([VersionLog(Version.PEACHES)])
fun Calendar.getCurMonthStrExpand(prefix: Boolean = true): String {
    val year: Int = this[Calendar.YEAR]
    val month: Int = this[Calendar.MONTH] + 1
    val monthString: String = if (month < 10) {
        "${if (prefix) "0$month" else month}"
    } else {
        month.toString()
    }
    return "$year-$monthString"
}

@Version([VersionLog(Version.PEACHES)])
fun Calendar.getCurMonthExpand(id: String = GMT_8): Int {
    return try {
        timeZone = TimeZone.getTimeZone(id)
        this[Calendar.MONTH] + 1
    } catch (e: java.lang.Exception) {
        e.printStackTrace()
        0
    }
}

@Version([VersionLog(Version.PEACHES)])
fun Calendar.getLastMonthExpand(): Int {
    var last: Int = getCurMonthExpand() - 1
    if (last == 0) {
        last = 12
    }
    return last
}

@Version([VersionLog(Version.PEACHES)])
fun Calendar.getHourExpand(id: String = GMT_8): Int {
    timeZone = TimeZone.getTimeZone(id)
    return this[Calendar.HOUR_OF_DAY]
}

@Version([VersionLog(Version.PEACHES)])
fun Long.getHourExpand(id: String = GMT_8): Int {
    val c: Calendar = Calendar.getInstance()
    c.timeInMillis = this
    return getHourExpand()
}

@Version([VersionLog(Version.PEACHES)])
fun Long.getYearExpand(): Int {
    val c: Calendar = Calendar.getInstance()
    c.timeInMillis = this
    return c[Calendar.YEAR]
}

@Version([VersionLog(Version.PEACHES)])
fun Calendar.getCurMonthLengthExpand(): Int {
    this[Calendar.DATE] = 1
    roll(Calendar.DATE, -1)
    return this[Calendar.DATE]
}

@Throws(ParseException::class)
@Version([VersionLog(Version.PEACHES)])
fun String.getDistanceOfTwoMonthExpand(target: String): Int {
    val sdf = EN_YYYY_MM_FORMAT
    val bef = Calendar.getInstance()
    val aft = Calendar.getInstance()
    sdf.parse(this)?.let { bef.time = it }
    sdf.parse(this)?.let { aft.time = it }
    val result = aft[Calendar.MONTH] - bef[Calendar.MONTH]
    val month = (aft[Calendar.YEAR] - bef[Calendar.YEAR]) * 12
    return abs(month + result)
}

@Version([VersionLog(Version.PEACHES)])
fun String.getDayByDiffExpand(diff: Int): String {
    val calendar: Calendar = Calendar.getInstance()
    val format: SimpleDateFormat = EN_YYYY_MM_DD_FORMAT
    return try {
        format.parse(this)?.let { calendar.time = it }
        calendar[Calendar.DAY_OF_YEAR] = calendar[Calendar.DAY_OF_YEAR] + diff
        format.format(calendar.time)
    } catch (e: ParseException) {
        e.printStackTrace()
        ""
    }
}

@Version([VersionLog(Version.PEACHES)])
fun Long.milliseconds2FriendlyStringExpand(): String {
    return Date(this).date2FriendlyStringExpand()
}

@Version([VersionLog(Version.PEACHES)])
fun Date.date2FriendlyStringExpand(): String {
    val targetCalendar = Calendar.getInstance()
    targetCalendar.time = this
    val currentCalendar = Calendar.getInstance()
    return if (currentCalendar[Calendar.YEAR] != targetCalendar[Calendar.YEAR]) {
        EN_YYYY_MM_DD_HH_MM_FORMAT.format(this)
    } else {
        when (currentCalendar[Calendar.DAY_OF_YEAR] - targetCalendar[Calendar.DAY_OF_YEAR]) {
            1 -> "昨天 " + EN_HH_MM_FORMAT.format(this)
            0 -> "今天 " + EN_HH_MM_FORMAT.format(this)
            -1 -> "明天 " + EN_HH_MM_FORMAT.format(this)
            else -> EN_MM_DD_HH_MM_FORMAT.format(this)
        }
    }
}

@Version([VersionLog(Version.PEACHES)])
fun Long.milliseconds2UnitExpand(unit: TimeUnit): Long {
    return when (unit) {
        TimeUnit.MSEC -> this / TimeMultiple.MSEC
        TimeUnit.SEC -> this / TimeMultiple.SEC
        TimeUnit.MIN -> this / TimeMultiple.MIN
        TimeUnit.HOUR -> this / TimeMultiple.HOUR
        TimeUnit.DAY -> this / TimeMultiple.DAY
    }
}

@Version([VersionLog(Version.PEACHES)])
fun getThreeDaysLaterExpand(): Long {
    return getTodayZeroExpand() + 3 * 24 * 60 * 60 * 1000L
}

@Version([VersionLog(Version.PEACHES)])
fun getTomorrowZeroExpand(): Long {
    return getTodayZeroExpand() + 24 * 60 * 60 * 1000L
}

@Version([VersionLog(Version.PEACHES)])
fun getTodayZeroExpand(): Long {
    return getCurTimeStringExpand(EN_YYYY_MM_DD_FORMAT).string2DateExpand(EN_YYYY_MM_DD_FORMAT).time
}

@Version([VersionLog(Version.PEACHES)])
fun compareDatesExpand(
    oldYear: Int, oldMonth: Int, oldDay: Int,
    newYear: Int, newMonth: Int, newDay: Int
): Boolean {
    if (newYear != oldYear) {
        return newYear >= oldYear
    }
    if (newMonth != oldMonth) {
        return newMonth >= oldMonth
    }
    return if (newDay != oldDay) {
        newDay >= oldDay
    } else false
}