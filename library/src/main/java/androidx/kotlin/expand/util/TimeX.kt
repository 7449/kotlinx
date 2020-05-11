@file:JvmName("TimeUtils")

package androidx.kotlin.expand.util

import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.abs

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
enum class TimeUnit {
    MSEC,
    SEC,
    MIN,
    HOUR,
    DAY
}

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
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

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
const val GMT_8 = "GMT+8:00"

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val DEFAULT_WEEK: Array<String> = arrayOf("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六")

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val DEFAULT_WEEK_2: Array<String> = arrayOf("周日", "周一", "周二", "周三", "周四", "周五", "周六")

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
fun threadLocal(pattern: String): SimpleDateFormat = SimpleDateFormat(pattern, Locale.getDefault())

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val DEFAULT_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-MM-dd HH:mm:ss") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val CN_MM_DD_FORMAT: SimpleDateFormat by lazy { threadLocal("MM月dd日") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val CN_MM_DD_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("MM月dd日 HH:mm") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val CN_YYYY_MM_DD_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年MM月dd日") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val CN_YYYY_MM_DD_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年MM月dd日 HH:mm") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val CN_YYYY_M_D_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年M月d日") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val CN_YYYY_MM_DD_HH_MM_SS_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年MM月dd日HH时mm分ss秒") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val CN_YYYY_MM_DD_HH_MM_2_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年MM月dd日HH时mm分") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val CN_YYYY_MM_DD_HH_MM_3_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年M月d日H时m分") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val EN_YYYY_M_D_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-M-d HH:mm") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val EN_YYYY_MM_DD_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-MM-dd") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val EN_YYYY_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-MM") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val EN_YYYY_MM_DD_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-MM-dd HH:mm") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val EN_M_D_FORMAT: SimpleDateFormat by lazy { threadLocal("M/d") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val EN_MM_DD_FORMAT: SimpleDateFormat by lazy { threadLocal("MM-dd") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val EN_YYYY_MM_DD_HH_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-MM-dd HH") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val EN_YYYY_MM_DD_HH_FORMATS: SimpleDateFormat by lazy { threadLocal("yyyy.MM.dd") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val EN_BIAS_YYYY_MM_DD_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy/MM/dd") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val EN_BIAS_YYYY_MM_DD_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy/MM/dd HH:mm") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val EN_H_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("H:mm") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val EN_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("HH:mm") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val EN_YYYY_M_D_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-M-d") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4")
    ]
)
val EN_MM_DD_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("MM-dd HH:mm") }

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,时间戳转为时间字符串")
    ]
)
fun Long.milliseconds2StringExpand(format: SimpleDateFormat = DEFAULT_FORMAT): String {
    return format.format(Date(this))
}

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,时间字符串转为时间戳")
    ]
)
fun String.string2MillisecondsExpand(format: SimpleDateFormat = DEFAULT_FORMAT): Long {
    try {
        return format.parse(this)?.time ?: -1
    } catch (e: ParseException) {
        e.printStackTrace()
    }
    return -1
}

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,时间字符串转为Date类型")
    ]
)
fun String.string2DateExpand(format: SimpleDateFormat = DEFAULT_FORMAT): Date {
    return Date(string2MillisecondsExpand(format))
}

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,将时间戳转为Date类型")
    ]
)
fun Long.milliseconds2DateExpand(): Date {
    return Date(this)
}

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取两个毫秒值之间的时间差(天数) target 为较大的时间")
    ]
)
fun Long.getIntervalTimeExpand(target: Long): Int {
    return ((target - this) / (1000 * 3600 * 24)).toInt()
}

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,判断闰年 true: 闰年 false: 平年")
    ]
)
fun Int.isLeapYearExpand(): Boolean {
    return this % 4 == 0 && this % 100 != 0 || this % 400 == 0
}

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取当前日期是星期几")
    ]
)
fun Array<String>.getWeekExpand(): String {
    var w: Int = Calendar.getInstance().apply {
        time = Date()
    }[Calendar.DAY_OF_WEEK - 1]
    if (w < 0) {
        w = 0
    }
    return this[w]
}

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取当前日期的下一天是星期几")
    ]
)
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

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取当前时间")
    ]
)
fun getCurTimeStringExpand(format: SimpleDateFormat = DEFAULT_FORMAT): String {
    return Date().date2StringExpand(format)
}

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,将Date类型转为时间字符串")
    ]
)
fun Date.date2StringExpand(format: SimpleDateFormat = DEFAULT_FORMAT): String {
    return format.format(this)
}

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取当前是年内的第几周")
    ]
)
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

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取当前月份是几月,月份从0开始计算")
    ]
)
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

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取当前月份")
    ]
)
fun Calendar.getCurMonthExpand(id: String = GMT_8): Int {
    return try {
        timeZone = TimeZone.getTimeZone(id)
        this[Calendar.MONTH] + 1
    } catch (e: java.lang.Exception) {
        e.printStackTrace()
        0
    }
}

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取上个月月份")
    ]
)
fun Calendar.getLastMonthExpand(): Int {
    var last: Int = getCurMonthExpand() - 1
    if (last == 0) {
        last = 12
    }
    return last
}

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取当前时")
    ]
)
fun Calendar.getHourExpand(id: String = GMT_8): Int {
    timeZone = TimeZone.getTimeZone(id)
    return this[Calendar.HOUR_OF_DAY]
}

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取指定时间的小时")
    ]
)
fun Long.getHourExpand(id: String = GMT_8): Int {
    val c: Calendar = Calendar.getInstance()
    c.timeInMillis = this
    return getHourExpand()
}

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取年份")
    ]
)
fun Long.getYearExpand(): Int {
    val c: Calendar = Calendar.getInstance()
    c.timeInMillis = this
    return c[Calendar.YEAR]
}

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取当前月的天数")
    ]
)
fun Calendar.getCurMonthLengthExpand(): Int {
    this[Calendar.DATE] = 1
    roll(Calendar.DATE, -1)
    return this[Calendar.DATE]
}

@Throws(ParseException::class)
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取两个月份差值")
    ]
)
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

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取距离指定日期指定天数的日期")
    ]
)
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

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,将毫秒值转化为友好的时间表达格式")
    ]
)
fun Long.milliseconds2FriendlyStringExpand(): String {
    return Date(this).date2FriendlyStringExpand()
}

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,将Date类型转化为友好的时间表达格式")
    ]
)
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

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,毫秒时间戳单位转换（单位：unit）")
    ]
)
fun Long.milliseconds2UnitExpand(unit: TimeUnit): Long {
    return when (unit) {
        TimeUnit.MSEC -> this / TimeMultiple.MSEC
        TimeUnit.SEC -> this / TimeMultiple.SEC
        TimeUnit.MIN -> this / TimeMultiple.MIN
        TimeUnit.HOUR -> this / TimeMultiple.HOUR
        TimeUnit.DAY -> this / TimeMultiple.DAY
    }
}

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,三天后的凌晨")
    ]
)
fun getThreeDaysLaterExpand(): Long {
    return getTodayZeroExpand() + 3 * 24 * 60 * 60 * 1000L
}

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,明天零点")
    ]
)
fun getTomorrowZeroExpand(): Long {
    return getTodayZeroExpand() + 24 * 60 * 60 * 1000L
}

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,今天零点")
    ]
)
fun getTodayZeroExpand(): Long {
    return getCurTimeStringExpand(EN_YYYY_MM_DD_FORMAT).string2DateExpand(EN_YYYY_MM_DD_FORMAT).time
}

@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(
            Version.PEACHES,
            "added in version 0.0.4,判断旧日期和新日期【新旧根据获取先后而定】的先后关系，如果新日期大于旧日期则返回true"
        )
    ]
)
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