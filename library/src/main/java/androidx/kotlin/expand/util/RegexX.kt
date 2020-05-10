@file:JvmName("RegexUtils")

package androidx.kotlin.expand.util

import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog

/**
 * 正则：必须包含字母,数字,特殊字符三种中的两种组合,并且长度在6-16位
 */
@VersionLog(version = Version.PEACHES, versionLog = "added in version 0.0.4")
const val PWD_REGEX =
    "(?!^d+$)(?!^[a-zA-Z]+$)(?!^[~!@#$%^&*()_+-=]+$).{6,16}"

/**
 * 正则：手机号（简单）
 */
@VersionLog(version = Version.PEACHES, versionLog = "added in version 0.0.4")
const val MOBILE_SIMPLE_REGEX =
    "^[1]\\d{10}$"

/**
 * 正则：手机号（精确）
 *
 * 移动：134(0-8)、135、136、137、138、139、147、150、151、152、157、158、159、178、182、183、184、187、188
 *
 * 联通：130、131、132、145、155、156、175、176、185、186
 *
 * 电信：133、153、173、177、180、181、189
 *
 * 全球星：1349
 *
 * 虚拟运营商：170
 */
@VersionLog(version = Version.PEACHES, versionLog = "added in version 0.0.4")
const val MOBILE_EXACT_REGEX =
    "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|(147))\\d{8}$"

/**
 * 正则：手机号
 */
@VersionLog(version = Version.PEACHES, versionLog = "added in version 0.0.4")
const val MOBILE2_EXACT_REGEX =
    "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}\$"

/**
 * 正则：电话号码
 */
@VersionLog(version = Version.PEACHES, versionLog = "added in version 0.0.4")
const val TE_REGEX =
    "^0\\d{2,3}[- ]?\\d{7,8}"

/**
 * 正则：身份证号码15位
 */
@VersionLog(version = Version.PEACHES, versionLog = "added in version 0.0.4")
const val ID_CARD15_REGEX =
    "^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$"

/**
 * 正则：身份证号码18位
 */
@VersionLog(version = Version.PEACHES, versionLog = "added in version 0.0.4")
const val ID_CARD18_REGEX =
    "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9Xx])$"

/**
 * 正则：邮箱
 */
@VersionLog(version = Version.PEACHES, versionLog = "added in version 0.0.4")
const val EMAIL_REGEX =
    "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$"

/**
 * 正则：邮箱
 */
@VersionLog(version = Version.PEACHES, versionLog = "added in version 0.0.4")
const val EMAIL2_REGEX =
    "^([a-zA-Z0-9_\\-.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(]?)$"

/**
 * 正则：邮箱
 */
@VersionLog(version = Version.PEACHES, versionLog = "added in version 0.0.4")
const val EMAIL3_REGEX =
    "^([a-z0-9A-Z]+[-|.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}\$"

/**
 * 正则：URL
 */
@VersionLog(version = Version.PEACHES, versionLog = "added in version 0.0.4")
const val URL_REGEX =
    "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?"

/**
 * 正则：URL
 */
@VersionLog(version = Version.PEACHES, versionLog = "added in version 0.0.4")
const val URL2_REGEX =
    "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]"

/**
 * 正则：用户名，取值范围为a-z,A-Z,0-9,"_",汉字，不能以"_"结尾,用户名必须是6-20位
 */
@VersionLog(version = Version.PEACHES, versionLog = "added in version 0.0.4")
const val USERNAME_REGEX =
    "^[\\w\\u4e00-\\u9fa5]{6,20}(?<!_)$"

/**
 * 正则：yyyy-MM-dd格式的日期校验，已考虑平闰年
 */
@VersionLog(version = Version.PEACHES, versionLog = "added in version 0.0.4")
const val DATE_REGEX =
    "^(?:(?!0000)[0-9]{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)-02-29)$"

/**
 * 正则：IP地址
 */
@VersionLog(version = Version.PEACHES, versionLog = "added in version 0.0.4")
const val IP_REGEX =
    "((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)"

/**
 * 正则：数字
 */
@VersionLog(version = Version.PEACHES, versionLog = "added in version 0.0.4")
const val NUM_REGEX =
    "^[0-9]+\$"

/**
 * 正则：中文
 */
@VersionLog(version = Version.PEACHES, versionLog = "added in version 0.0.4")
const val CHINESE_REGEX =
    "^[\u0391-\uFFE5]+$"

/**
 * 正则：汉字
 */
@VersionLog(version = Version.PEACHES, versionLog = "added in version 0.0.4")
const val CHINESE2_REGEX =
    "^[\\u4e00-\\u9fa5]+$"
