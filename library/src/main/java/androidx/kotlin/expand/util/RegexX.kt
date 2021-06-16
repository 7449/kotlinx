@file:JvmName("RegexUtils")

package androidx.kotlin.expand.util

const val PWD_REGEX =
    "(?!^d+$)(?!^[a-zA-Z]+$)(?!^[~!@#$%^&*()_+-=]+$).{6,16}"

const val MOBILE_SIMPLE_REGEX =
    "^[1]\\d{10}$"

const val MOBILE_EXACT_REGEX =
    "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|(147))\\d{8}$"

const val MOBILE2_EXACT_REGEX =
    "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}\$"

const val TE_REGEX =
    "^0\\d{2,3}[- ]?\\d{7,8}"

const val ID_CARD15_REGEX =
    "^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$"

const val ID_CARD18_REGEX =
    "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9Xx])$"

const val EMAIL_REGEX =
    "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$"

const val EMAIL2_REGEX =
    "^([a-zA-Z0-9_\\-.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(]?)$"

const val EMAIL3_REGEX =
    "^([a-z0-9A-Z]+[-|.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}\$"

const val URL_REGEX =
    "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?"

const val URL2_REGEX =
    "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]"

const val USERNAME_REGEX =
    "^[\\w\\u4e00-\\u9fa5]{6,20}(?<!_)$"

const val DATE_REGEX =
    "^(?:(?!0000)[0-9]{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)-02-29)$"

const val IP_REGEX =
    "((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)"

const val NUM_REGEX =
    "^[0-9]+\$"

const val CHINESE_REGEX =
    "^[\u0391-\uFFE5]+$"

const val CHINESE2_REGEX =
    "^[\\u4e00-\\u9fa5]+$"