@file:JvmName("TimeUtils")

package androidx.kotlin.expand.util

import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.abs

@VersionLog(version = Version.PEACHES, versionLog = "added in version 0.0.4")
enum class TimeUnit {
    MSEC,
    SEC,
    MIN,
    HOUR,
    DAY
}

@VersionLog(version = Version.PEACHES, versionLog = "added in version 0.0.4")
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

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
const val GMT_8 = "GMT+8:00"

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val DEFAULT_WEEK: Array<String> = arrayOf("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六")

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val DEFAULT_WEEK_2: Array<String> = arrayOf("周日", "周一", "周二", "周三", "周四", "周五", "周六")

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
fun threadLocal(pattern: String): SimpleDateFormat = SimpleDateFormat(pattern, Locale.getDefault())

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val DEFAULT_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-MM-dd HH:mm:ss") }

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val CN_MM_DD_FORMAT: SimpleDateFormat by lazy { threadLocal("MM月dd日") }

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val CN_MM_DD_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("MM月dd日 HH:mm") }

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val CN_YYYY_MM_DD_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年MM月dd日") }

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val CN_YYYY_MM_DD_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年MM月dd日 HH:mm") }

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val CN_YYYY_M_D_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年M月d日") }

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val CN_YYYY_MM_DD_HH_MM_SS_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年MM月dd日HH时mm分ss秒") }

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val CN_YYYY_MM_DD_HH_MM_2_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年MM月dd日HH时mm分") }

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val CN_YYYY_MM_DD_HH_MM_3_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年M月d日H时m分") }

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val EN_YYYY_M_D_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-M-d HH:mm") }

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val EN_YYYY_MM_DD_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-MM-dd") }

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val EN_YYYY_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-MM") }

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val EN_YYYY_MM_DD_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-MM-dd HH:mm") }

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val EN_M_D_FORMAT: SimpleDateFormat by lazy { threadLocal("M/d") }

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val EN_MM_DD_FORMAT: SimpleDateFormat by lazy { threadLocal("MM-dd") }

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val EN_YYYY_MM_DD_HH_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-MM-dd HH") }

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val EN_YYYY_MM_DD_HH_FORMATS: SimpleDateFormat by lazy { threadLocal("yyyy.MM.dd") }

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val EN_BIAS_YYYY_MM_DD_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy/MM/dd") }

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val EN_BIAS_YYYY_MM_DD_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy/MM/dd HH:mm") }

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val EN_H_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("H:mm") }

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val EN_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("HH:mm") }

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val EN_YYYY_M_D_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-M-d") }

@VersionLog(versionLog = "added in version 0.0.4", version = Version.PEACHES)
val EN_MM_DD_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("MM-dd HH:mm") }

/**
 * 时间戳转为时间字符串
 */
fun Long.milliseconds2String(format: SimpleDateFormat = DEFAULT_FORMAT): String {
    return format.format(Date(this))
}

/**
 * 时间字符串转为时间戳
 */
fun String.string2Milliseconds(format: SimpleDateFormat = DEFAULT_FORMAT): Long {
    try {
        return format.parse(this)?.time ?: -1
    } catch (e: ParseException) {
        e.printStackTrace()
    }
    return -1
}

/**
 * 时间字符串转为Date类型
 */
fun String.string2Date(format: SimpleDateFormat = DEFAULT_FORMAT): Date {
    return Date(string2Milliseconds(format))
}

/**
 * 将时间戳转为Date类型
 */
fun Long.milliseconds2Date(): Date {
    return Date(this)
}

/**
 * 获取两个毫秒值之间的时间差(天数)
 * target 为较大的时间
 */
fun Long.getIntervalTime(target: Long): Int {
    return ((target - this) / (1000 * 3600 * 24)).toInt()
}

/**
 * 判断闰年
 * true: 闰年 false: 平年
 */
fun Int.isLeapYear(): Boolean {
    return this % 4 == 0 && this % 100 != 0 || this % 400 == 0
}

/**
 * 获取当前日期是星期几
 * [DEFAULT_WEEK]
 * [DEFAULT_WEEK_2]
 */
fun Array<String>.getWeek(): String {
    var w: Int = Calendar.getInstance().apply {
        time = Date()
    }[Calendar.DAY_OF_WEEK - 1]
    if (w < 0) {
        w = 0
    }
    return this[w]
}

/**
 * 获取当前日期的下一天是星期几
 * [DEFAULT_WEEK]
 * [DEFAULT_WEEK_2]
 */
fun Array<String>.getWeekOfNextDate(): String {
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

/**
 * 获取当前时间
 */
fun getCurTimeString(format: SimpleDateFormat = DEFAULT_FORMAT): String {
    return Date().date2String(format)
}

/**
 * 将Date类型转为时间字符串
 */
fun Date.date2String(format: SimpleDateFormat = DEFAULT_FORMAT): String {
    return format.format(this)
}

/**
 * 获取当前是年内的第几周
 */
fun Calendar.getWeekOfYear(id: String = GMT_8): Int {
    return try {
        timeZone = TimeZone.getTimeZone(id)
        firstDayOfWeek = Calendar.MONDAY
        this[Calendar.WEEK_OF_YEAR]
    } catch (e: Exception) {
        e.printStackTrace()
        0
    }
}

/**
 * 获取当前月份是几月
 * 月份从0开始计算
 */
fun Calendar.getCurMonthStr(prefix: Boolean = true): String {
    val year: Int = this[Calendar.YEAR]
    val month: Int = this[Calendar.MONTH] + 1
    val monthString: String = if (month < 10) {
        "${if (prefix) "0$month" else month}"
    } else {
        month.toString()
    }
    return "$year-$monthString"
}

/**
 * 获取当前月份
 */
fun Calendar.getCurMonth(id: String = GMT_8): Int {
    return try {
        timeZone = TimeZone.getTimeZone(id)
        this[Calendar.MONTH] + 1
    } catch (e: java.lang.Exception) {
        e.printStackTrace()
        0
    }
}

/**
 * 获取上个月月份
 */
fun Calendar.getLastMonth(): Int {
    var last: Int = getCurMonth() - 1
    if (last == 0) {
        last = 12
    }
    return last
}

/**
 * 获取当前时
 */
fun Calendar.getHour(id: String = GMT_8): Int {
    timeZone = TimeZone.getTimeZone(id)
    return this[Calendar.HOUR_OF_DAY]
}

/**
 * 获取指定时间的小时
 */
fun Long.getHour(id: String = GMT_8): Int {
    val c: Calendar = Calendar.getInstance()
    c.timeInMillis = this
    return getHour()
}

/**
 * 获取年份
 */
fun Long.getYear(): Int {
    val c: Calendar = Calendar.getInstance()
    c.timeInMillis = this
    return c[Calendar.YEAR]
}

/**
 * 获取当前月的天数
 */
fun Calendar.getCurMonthLength(): Int {
    this[Calendar.DATE] = 1
    roll(Calendar.DATE, -1)
    return this[Calendar.DATE]
}

/**
 * 获取两个月份差值
 */
@Throws(ParseException::class)
fun String.getDistanceOfTwoMonth(target: String): Int {
    val sdf = EN_YYYY_MM_FORMAT
    val bef = Calendar.getInstance()
    val aft = Calendar.getInstance()
    sdf.parse(this)?.let { bef.time = it }
    sdf.parse(this)?.let { aft.time = it }
    val result = aft[Calendar.MONTH] - bef[Calendar.MONTH]
    val month = (aft[Calendar.YEAR] - bef[Calendar.YEAR]) * 12
    return abs(month + result)
}

/**
 * 获取距离指定日期指定天数的日期
 */
fun String.getDayByDiff(diff: Int): String {
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


/**
 * 将毫秒值转化为友好的时间表达格式
 * 今天 14:52
 * 明天 14:52
 * 昨天 14:52
 * 年一样，日期非今天昨天明天，返回08-12 14:52
 * 年不一样，返回2018-08-12 14:52
 */
fun Long.milliseconds2FriendlyStringCN(): String {
    return Date(this).date2FriendlyStringCN()
}

/**
 * 将Date类型转化为友好的时间表达格式
 * 今天 14:52
 * 明天 14:52
 * 昨天 14:52
 * 年一样，日期非今天昨天明天，返回08-12 14:52
 * 年不一样，返回2018-08-12 14:52
 */
fun Date.date2FriendlyStringCN(): String {
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
            else -> CN_MM_DD_HH_MM_FORMAT.format(this)
        }
    }
}

/**
 * 将毫秒值转化为友好的时间表达格式
 * 今天 14:52
 * 明天 14:52
 * 昨天 14:52
 * 年一样，日期非今天昨天明天，返回08-12 14:52
 * 年不一样，返回2018-08-12 14:52
 */
fun Long.milliseconds2FriendlyString(): String {
    return Date(this).date2FriendlyString()
}

/**
 * 将Date类型转化为友好的时间表达格式
 * 今天 14:52
 * 明天 14:52
 * 昨天 14:52
 * 年一样，日期非今天昨天明天，返回08-12 14:52
 * 年不一样，返回2018-08-12 14:52
 */
fun Date.date2FriendlyString(): String {
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

/**
 * 毫秒时间戳单位转换（单位：unit）
 *  [TimeUnit.MSEC]: 毫秒
 *  [TimeUnit.SEC]: 秒
 *  [TimeUnit.MIN]: 分
 *  [TimeUnit.HOUR]: 小时
 *  [TimeUnit.DAY]: 天
 */
fun Long.milliseconds2Unit(unit: TimeUnit): Long {
    return when (unit) {
        TimeUnit.MSEC -> this / TimeMultiple.MSEC
        TimeUnit.SEC -> this / TimeMultiple.SEC
        TimeUnit.MIN -> this / TimeMultiple.MIN
        TimeUnit.HOUR -> this / TimeMultiple.HOUR
        TimeUnit.DAY -> this / TimeMultiple.DAY
    }
}

/**
 * 获取当前日期
 */
fun getCurDayOFMonth(): String {
    return getCurDayOFMonthInt().toString()
}

/**
 * 获取当前日期
 */
fun getCurDayOFMonthInt(): Int {
    return Calendar.getInstance()[Calendar.DAY_OF_MONTH]
}

/**
 * 获取当前年份
 */
fun getCurYear(): String {
    return getCurYearInt().toString()
}

/**
 * 获取当前年份
 */
fun getCurYearInt(): Int {
    return Calendar.getInstance()[Calendar.YEAR]
}

/**
 * 三天后的凌晨
 */
fun getThreeDaysLater(): Long {
    return getTodayZero() + 3 * 24 * 60 * 60 * 1000L
}

/**
 * 明天零点
 */
fun getTomorrowZero(): Long {
    return getTodayZero() + 24 * 60 * 60 * 1000L
}

/**
 * 今天零点
 */
fun getTodayZero(): Long {
    return getCurTimeString(EN_YYYY_MM_DD_FORMAT).string2Date(EN_YYYY_MM_DD_FORMAT).time
}

/**
 * 判断旧日期和新日期【新旧根据获取先后而定】的先后关系，如果新日期大于旧日期则返回true
 */
fun compareDates(
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


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
 * 获取最近一个周末的日期
 * @param style 返回结果样式 0 day/month   1 month.day
 */
fun getLatestSunday(style: Int): String {
    return try {
        val c = Calendar.getInstance()
        c.timeZone = TimeZone.getTimeZone(GMT_8)
        val mDayOfWeek = c[Calendar.DAY_OF_WEEK]
        var diff = 0 - (mDayOfWeek - 1)
        if (diff == 0) {
            diff = -7
        }
        c.time = Date(System.currentTimeMillis())
        c.add(Calendar.DAY_OF_MONTH, diff)
        val mDay = c[Calendar.DAY_OF_MONTH].toString()
        val mMonth = c[Calendar.MONTH] + 1
        return when (style) {
            0 -> "$mDay/$mMonth"
            1 -> "$mMonth.$mDay"
            else -> ""
        }
    } catch (e: java.lang.Exception) {
        e.printStackTrace()
        ""
    }
}

/**
 * 获取最近一个周末的日期
 * @param diffWeek -1：上一周的周一  -2：上两周的周一 。。。
 */
fun getLatestSundayDiff(diffWeek: Int): String {
    return try {
        val c = Calendar.getInstance()
        c.timeZone = TimeZone.getTimeZone(GMT_8)
        val mDayOfWeek = c[Calendar.DAY_OF_WEEK]
        var diff = 0 - (mDayOfWeek - 1)
        if (diff == 0) {
            diff = -7
        }
        diff += (diffWeek * 7 + 1)
        c.time = Date(System.currentTimeMillis())
        c.add(Calendar.DAY_OF_MONTH, diff)
        val mDay = c[Calendar.DAY_OF_MONTH].toString()
        val mMonth = c[Calendar.MONTH] + 1
        "$mMonth.$mDay"
    } catch (e: java.lang.Exception) {
        e.printStackTrace()
        ""
    }
}

/**
 * 获取最近一个周末的日期
 * @return [20170605, 20170610]
 */
fun getLatestWeekSpan(diffWeek: Int): Array<String?> {
    val result = arrayOfNulls<String>(2)
    try {
        val c = Calendar.getInstance()
        c.timeZone = TimeZone.getTimeZone("GMT+8:00")
        val mDayOfWeek = c[Calendar.DAY_OF_WEEK]
        var diff = 0 - (mDayOfWeek - 1)
        if (diff == 0) {
            diff = -7
        }
        for (i in 0..1) {
            diff = if (i == 0) {
                diff + (diffWeek * 7 + 1)
            } else {
                diff + 6
            }
            c.time = Date(System.currentTimeMillis())
            c.add(Calendar.DAY_OF_MONTH, diff)
            val day = c[Calendar.DAY_OF_MONTH]
            var mDay = day.toString() + ""
            if (day < 10) {
                mDay = "0$day"
            }
            // 获取mDay所在月份
            val month = c[Calendar.MONTH] + 1
            var mMonth = month.toString() + ""
            if (month < 10) {
                mMonth = "0$month"
            }
            val mYear = c[Calendar.YEAR]
            result[i] = mYear.toString() + "" + mMonth + "" + mDay
        }
    } catch (e: java.lang.Exception) {
        e.printStackTrace()
    }
    return result
}


/**
 * 获取上周周几的日期,默认一周从周一开始
 *
 * @param dayOfWeek
 * @param weekOffset
 * @return
 */
fun getDayOfWeek(dayOfWeek: Int, weekOffset: Int): Date? {
    return getDayOfWeek(Calendar.MONDAY, dayOfWeek, weekOffset)
}

/**
 * 获取上(下)周周几的日期
 *
 * @param firstDayOfWeek [Calendar]
 * 值范围 `SUNDAY`,
 * `MONDAY`, `TUESDAY`, `WEDNESDAY`,
 * `THURSDAY`, `FRIDAY`, and `SATURDAY`
 * @param dayOfWeek      [Calendar]
 * @param weekOffset     周偏移，上周为-1，本周为0，下周为1，以此类推
 * @return
 */
fun getDayOfWeek(firstDayOfWeek: Int, dayOfWeek: Int, weekOffset: Int): Date? {
    if (dayOfWeek > Calendar.SATURDAY || dayOfWeek < Calendar.SUNDAY) {
        return null
    }
    if (firstDayOfWeek > Calendar.SATURDAY || firstDayOfWeek < Calendar.SUNDAY) {
        return null
    }
    val date = Calendar.getInstance(Locale.CHINA)
    date.firstDayOfWeek = firstDayOfWeek
    //周数减一，即上周
    date.add(Calendar.WEEK_OF_MONTH, weekOffset)
    //日子设为周几
    date[Calendar.DAY_OF_WEEK] = dayOfWeek
    //时分秒全部置0
    date[Calendar.HOUR_OF_DAY] = 0
    date[Calendar.MINUTE] = 0
    date[Calendar.SECOND] = 0
    date[Calendar.MILLISECOND] = 0
    return date.time
}

fun getLastMonthRecord(interval: Int): Array<String> {
    val result = arrayOf("2017", "1")
    try {
        val c = Calendar.getInstance()
        c.timeZone = TimeZone.getTimeZone(GMT_8)
        c.time = Date(System.currentTimeMillis())
        c.add(Calendar.MONTH, interval)
        val mMonth = (c[Calendar.MONTH] + 1).toString() + ""
        val mYear = c[Calendar.YEAR].toString() + ""
        result[0] = mYear
        result[1] = mMonth
    } catch (e: java.lang.Exception) {
        e.printStackTrace()
    }
    return result
}

/**
 * 根据日期获取周几
 *
 * @param date：2017-06-04
 */
fun getDayOfWeekByDate(date: String): String {
    val dayOfWeek: Array<String>
    val calendar: Calendar
    var result: String
    try {
        dayOfWeek = arrayOf("default", "周日", "周一", "周二", "周三", "周四", "周五", "周六")
        val sdf = SimpleDateFormat("yyyy-MM-dd")
        val date1 = sdf.parse(date)
        calendar = Calendar.getInstance()
        calendar.time = date1
        result = dayOfWeek[calendar[Calendar.DAY_OF_WEEK]]
    } catch (e: ParseException) {
        result = date
        e.printStackTrace()
    }
    return result
}

/**
 * 根据日期获取周几
 *
 * @param :geshi：2017-06-04
 * @param date              预报中第一天的日期
 * @param index             第几天
 */
fun getDayOfWeekByDate(date: Long, index: Int): String {
    val dayOfWeek: Array<String>
    var calendar: Calendar
    var result: String
    try {
        dayOfWeek = arrayOf("default", "周日", "周一", "周二", "周三", "周四", "周五", "周六")
        val date1 = Date(date)
        calendar = Calendar.getInstance()
        calendar.time = date1
        calendar.add(Calendar.DATE, index)
        result = dayOfWeek[calendar[Calendar.DAY_OF_WEEK]]
    } catch (e: java.lang.Exception) {
        val sdf = SimpleDateFormat("MM/dd")
        calendar = Calendar.getInstance()
        calendar.time = Date(date)
        calendar.add(Calendar.DATE, index)
        result = sdf.format(calendar.time)
        e.printStackTrace()
    }
    return result
}

/**
 * 获取上一月的日期---年、月[0-11]
 *
 * @param interval -1:之前1个月 -2之前两个月 -3：之前三个月。。。以此类推
 * @return
 */
fun getLastMonthYear(interval: Int): Array<String> {
    val result = arrayOf("2017", "1")
    try {
        val c = Calendar.getInstance()
        c.timeZone = TimeZone.getTimeZone(GMT_8)
        c.time = Date(System.currentTimeMillis())
        c.add(Calendar.MONTH, interval)
        val mMonth = c[Calendar.MONTH].toString() + ""
        val mYear = c[Calendar.YEAR].toString() + ""
        result[0] = mYear
        result[1] = mMonth
    } catch (e: java.lang.Exception) {
        e.printStackTrace()
    }
    return result
}


/**
 * 获取最近一月的日期---空格分式-月报页面
 *
 * @return
 */
fun getLastMonthDot(): String {
    var result = ""
    try {
        val c = Calendar.getInstance()
        c.timeZone = TimeZone.getTimeZone(GMT_8)
        c.time = Date(System.currentTimeMillis())
        c.add(Calendar.MONTH, -1)
        // 获取mDay所在月份
        var mMonth: String = (c[Calendar.MONTH] + 1).toString()
        val mYear: String = c[Calendar.YEAR].toString()
        if (mMonth.length == 1) {
            mMonth = "0$mMonth"
        }
        result = mYear + "年" + mMonth + "月"
    } catch (e: java.lang.Exception) {
        e.printStackTrace()
    }
    return result
}


/**
 * 获取最近一周的日期---点分式-周报页面
 *
 * @return
 */
fun getLatestSundayDot(): String {
    var result = ""
    try {
        val c = Calendar.getInstance()
        c.timeZone = TimeZone.getTimeZone(GMT_8)
        val mDayOfWeek = c[Calendar.DAY_OF_WEEK]
        //           0 1 2 3 4 5 6
        var diff = 0 - (mDayOfWeek - 1)
        if (diff == 0) {
            diff = -7
        }
        c.time = Date(System.currentTimeMillis())
        c.add(Calendar.DAY_OF_MONTH, diff)
        var mDay = c[Calendar.DAY_OF_MONTH].toString()
        // 获取mDay所在月份
        var mMonth: String = (c[Calendar.MONTH] + 1).toString()
        if (mMonth.length == 1) {
            mMonth = "0$mMonth"
        }
        if (mDay.length == 1) {
            mDay = "0$mDay"
        }
        result = "$mMonth.$mDay"
    } catch (e: java.lang.Exception) {
        e.printStackTrace()
    }
    return result
}

/**
 * 获取两个时间差（单位：unit）
 *
 * time1和time2格式都为format
 *
 * @param time0  时间字符串1
 * @param time1  时间字符串2
 * @param unit
 *  * [TimeUnit.MSEC]: 毫秒
 *  * [TimeUnit.SEC]: 秒
 *  * [TimeUnit.MIN]: 分
 *  * [TimeUnit.HOUR]: 小时
 *  * [TimeUnit.DAY]: 天
 *
 * @param format 时间格式
 * @return unit时间戳
 */
fun getIntervalTime(
    time0: String,
    time1: String,
    unit: TimeUnit,
    format: SimpleDateFormat
): Long {
    return abs(
        time0.string2Milliseconds(format) - time1.string2Milliseconds(format)
            .milliseconds2Unit(unit)
    )
}

/**
 * 获取两个时间差（单位：unit）
 *
 * time1和time2格式都为yyyy-MM-dd HH:mm:ss
 *
 * @param time0 时间字符串1
 * @param time1 时间字符串2
 * @param unit
 *  * [TimeUnit.MSEC]: 毫秒
 *  * [TimeUnit.SEC]: 秒
 *  * [TimeUnit.MIN]: 分
 *  * [TimeUnit.HOUR]: 小时
 *  * [TimeUnit.DAY]: 天
 *
 * @return unit时间戳
 */
fun getIntervalTime(
    time0: String,
    time1: String,
    unit: TimeUnit
): Long {
    return getIntervalTime(
        time0,
        time1,
        unit,
        DEFAULT_FORMAT
    )
}

/**
 * 获取两个时间差（单位：unit）
 *
 * time1和time2都为Date类型
 *
 * @param time0 Date类型时间1
 * @param time1 Date类型时间2
 * @param unit
 *  * [TimeUnit.MSEC]: 毫秒
 *  * [TimeUnit.SEC]: 秒
 *  * [TimeUnit.MIN]: 分
 *  * [TimeUnit.HOUR]: 小时
 *  * [TimeUnit.DAY]: 天
 *
 * @return unit时间戳
 */
fun getIntervalTime(
    time0: Date,
    time1: Date,
    unit: TimeUnit
): Long {
    return abs((time1.time - time0.time).milliseconds2Unit(unit))
}

/**
 * 获取与当前时间的差（单位：unit）
 *
 * time格式为yyyy-MM-dd HH:mm:ss
 *
 * @param time 时间字符串
 * @param unit
 *  * [TimeUnit.MSEC]:毫秒
 *  * [TimeUnit.SEC]:秒
 *  * [TimeUnit.MIN]:分
 *  * [TimeUnit.HOUR]:小时
 *  * [TimeUnit.DAY]:天
 *
 * @return unit时间戳
 */
fun getIntervalByNow(
    time: String,
    unit: TimeUnit
): Long {
    return getIntervalByNow(
        time,
        unit,
        DEFAULT_FORMAT
    )
}

/**
 * 获取与当前时间的差（单位：unit）
 *
 * time格式为format
 *
 * @param time   时间字符串
 * @param unit
 *  * [TimeUnit.MSEC]: 毫秒
 *  * [TimeUnit.SEC]: 秒
 *  * [TimeUnit.MIN]: 分
 *  * [TimeUnit.HOUR]: 小时
 *  * [TimeUnit.DAY]: 天
 *
 * @param format 时间格式
 * @return unit时间戳
 */
fun getIntervalByNow(
    time: String,
    unit: TimeUnit,
    format: SimpleDateFormat
): Long {
    return getIntervalTime(
        getCurTimeString(),
        time,
        unit,
        format
    )
}

/**
 * 获取与当前时间的差（单位：unit）
 *
 * time为Date类型
 *
 * @param time Date类型时间
 * @param unit
 *  * [TimeUnit.MSEC]: 毫秒
 *  * [TimeUnit.SEC]: 秒
 *  * [TimeUnit.MIN]: 分
 *  * [TimeUnit.HOUR]: 小时
 *  * [TimeUnit.DAY]: 天
 *
 * @return unit时间戳
 */
fun getIntervalByNow(
    time: Date,
    unit: TimeUnit
): Long {
    return getIntervalTime(Date(), time, unit)
}

