@file:JvmName("TimeUtils")

package androidx.kotlin.expand.util

import java.text.SimpleDateFormat
import java.util.*

const val GMT_8 = "GMT+8:00"

fun threadLocal(pattern: String): SimpleDateFormat = SimpleDateFormat(pattern, Locale.getDefault())

val DEFAULT_WEEK: Array<String> = arrayOf("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六")

val DEFAULT_WEEK_2: Array<String> = arrayOf("周日", "周一", "周二", "周三", "周四", "周五", "周六")

val DEFAULT_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-MM-dd HH:mm:ss") }

val CN_MM_DD_FORMAT: SimpleDateFormat by lazy { threadLocal("MM月dd日") }

val CN_MM_DD_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("MM月dd日 HH:mm") }

val CN_YYYY_MM_DD_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年MM月dd日") }

val CN_YYYY_MM_DD_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年MM月dd日 HH:mm") }

val CN_YYYY_M_D_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年M月d日") }

val CN_YYYY_MM_DD_HH_MM_SS_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年MM月dd日HH时mm分ss秒") }

val CN_YYYY_MM_DD_HH_MM_2_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年MM月dd日HH时mm分") }

val CN_YYYY_MM_DD_HH_MM_3_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy年M月d日H时m分") }

val EN_YYYY_M_D_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-M-d HH:mm") }

val EN_YYYY_MM_DD_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-MM-dd") }

val EN_YYYY_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-MM") }

val EN_YYYY_MM_DD_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-MM-dd HH:mm") }

val EN_M_D_FORMAT: SimpleDateFormat by lazy { threadLocal("M/d") }

val EN_MM_DD_FORMAT: SimpleDateFormat by lazy { threadLocal("MM-dd") }

val EN_YYYY_MM_DD_HH_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-MM-dd HH") }

val EN_YYYY_MM_DD_HH_FORMATS: SimpleDateFormat by lazy { threadLocal("yyyy.MM.dd") }

val EN_BIAS_YYYY_MM_DD_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy/MM/dd") }

val EN_BIAS_YYYY_MM_DD_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy/MM/dd HH:mm") }

val EN_H_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("H:mm") }

val EN_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("HH:mm") }

val EN_YYYY_M_D_FORMAT: SimpleDateFormat by lazy { threadLocal("yyyy-M-d") }

val EN_MM_DD_HH_MM_FORMAT: SimpleDateFormat by lazy { threadLocal("MM-dd HH:mm") }

fun Long.milliseconds2StringExpand(format: SimpleDateFormat = DEFAULT_FORMAT): String {
    return format.format(Date(this))
}

fun String.string2MillisecondsExpand(format: SimpleDateFormat = DEFAULT_FORMAT): Long {
    return runCatching { format.parse(this)?.time ?: -1 }.getOrElse { -1 }
}

fun String.string2DateExpand(format: SimpleDateFormat = DEFAULT_FORMAT): Date {
    return Date(string2MillisecondsExpand(format))
}

fun Long.milliseconds2DateExpand(): Date {
    return Date(this)
}