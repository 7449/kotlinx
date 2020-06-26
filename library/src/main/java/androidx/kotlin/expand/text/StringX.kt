@file:JvmName("StringUtils")

package androidx.kotlin.expand.text

import android.content.Context
import android.widget.Toast
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import androidx.kotlin.expand.util.*
import java.util.regex.Pattern

@Version([VersionLog(Version.PEACHES)])
val String.checkPhoneSimpleExpand: Boolean
    get() = matches(Regex(MOBILE_SIMPLE_REGEX))

@Version([VersionLog(Version.PEACHES)])
val String.checkPhoneExactExpand: Boolean
    get() = matches(Regex(MOBILE_EXACT_REGEX))

@Version([VersionLog(Version.PEACHES)])
val String.checkPhoneExact2Expand: Boolean
    get() = matches(Regex(MOBILE2_EXACT_REGEX))

@Version([VersionLog(Version.PEACHES)])
val String.checkTeExpand: Boolean
    get() = matches(Regex(TE_REGEX))

@Version([VersionLog(Version.PEACHES)])
val String.checkIdCard15Expand: Boolean
    get() = matches(Regex(ID_CARD15_REGEX))

@Version([VersionLog(Version.PEACHES)])
val String.checkIdCard18Expand: Boolean
    get() = matches(Regex(ID_CARD18_REGEX))

@Version([VersionLog(Version.PEACHES)])
val String.checkEmailExpand: Boolean
    get() = matches(Regex(EMAIL_REGEX))

@Version([VersionLog(Version.PEACHES)])
val String.checkEmail2Expand: Boolean
    get() = matches(Regex(EMAIL2_REGEX))

@Version([VersionLog(Version.PEACHES)])
val String.checkEmail3Expand: Boolean
    get() = matches(Regex(EMAIL3_REGEX))

@Version([VersionLog(Version.PEACHES)])
val String.checkUrlExpand: Boolean
    get() = matches(Regex(URL_REGEX))

@Version([VersionLog(Version.PEACHES)])
val String.checkUrl2Expand: Boolean
    get() = matches(Regex(URL2_REGEX))

@Version([VersionLog(Version.PEACHES)])
val String.checkChineseExpand: Boolean
    get() = matches(Regex(CHINESE2_REGEX))

@Version([VersionLog(Version.PEACHES)])
val String.checkChinese2Expand: Boolean
    get() = matches(Regex(CHINESE_REGEX))

@Version([VersionLog(Version.PEACHES)])
val String.checkUserNameExpand: Boolean
    get() = matches(Regex(USERNAME_REGEX))

@Version([VersionLog(Version.PEACHES)])
val String.checkDateExpand: Boolean
    get() = matches(Regex(DATE_REGEX))

@Version([VersionLog(Version.PEACHES)])
val String.checkIpExpand: Boolean
    get() = matches(Regex(IP_REGEX))

@Version([VersionLog(Version.PEACHES)])
val String.checkNumExpand: Boolean
    get() = matches(Regex(NUM_REGEX))

@Version([VersionLog(Version.PEACHES)])
val String.checkPwdRegexExpand: Boolean
    get() = matches(Regex(PWD_REGEX))

@Version([VersionLog(Version.BANANA)])
val utf8CodingExpand: String
    get() = "utf-8"

@Version([VersionLog(Version.BANANA)])
val textHtmlMimeTypeExpand: String
    get() = "text/html"

@Version([VersionLog(Version.BANANA)])
val String.intExpand: Int
    get() = Pattern.compile("[^0-9]").matcher(this).replaceAll("").trim { it <= ' ' }.toInt()

@JvmName("toast")
@Version([VersionLog(Version.BANANA)])
fun String.toastExpand(context: Context): Unit =
    Toast.makeText(context, this, Toast.LENGTH_SHORT).show()
