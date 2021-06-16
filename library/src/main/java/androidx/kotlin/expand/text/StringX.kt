@file:JvmName("StringUtils")

package androidx.kotlin.expand.text

import android.content.Context
import android.widget.Toast


import androidx.kotlin.expand.util.*
import java.util.regex.Pattern

val String.checkPhoneSimpleExpand: Boolean
    get() = matches(Regex(MOBILE_SIMPLE_REGEX))

val String.checkPhoneExactExpand: Boolean
    get() = matches(Regex(MOBILE_EXACT_REGEX))

val String.checkPhoneExact2Expand: Boolean
    get() = matches(Regex(MOBILE2_EXACT_REGEX))

val String.checkTeExpand: Boolean
    get() = matches(Regex(TE_REGEX))

val String.checkIdCard15Expand: Boolean
    get() = matches(Regex(ID_CARD15_REGEX))

val String.checkIdCard18Expand: Boolean
    get() = matches(Regex(ID_CARD18_REGEX))

val String.checkEmailExpand: Boolean
    get() = matches(Regex(EMAIL_REGEX))

val String.checkEmail2Expand: Boolean
    get() = matches(Regex(EMAIL2_REGEX))

val String.checkEmail3Expand: Boolean
    get() = matches(Regex(EMAIL3_REGEX))

val String.checkUrlExpand: Boolean
    get() = matches(Regex(URL_REGEX))

val String.checkUrl2Expand: Boolean
    get() = matches(Regex(URL2_REGEX))

val String.checkChineseExpand: Boolean
    get() = matches(Regex(CHINESE2_REGEX))

val String.checkChinese2Expand: Boolean
    get() = matches(Regex(CHINESE_REGEX))

val String.checkUserNameExpand: Boolean
    get() = matches(Regex(USERNAME_REGEX))

val String.checkDateExpand: Boolean
    get() = matches(Regex(DATE_REGEX))

val String.checkIpExpand: Boolean
    get() = matches(Regex(IP_REGEX))

val String.checkNumExpand: Boolean
    get() = matches(Regex(NUM_REGEX))

val String.checkPwdRegexExpand: Boolean
    get() = matches(Regex(PWD_REGEX))

val utf8CodingExpand: String
    get() = "utf-8"

val textHtmlMimeTypeExpand: String
    get() = "text/html"

val String.intExpand: Int
    get() = Pattern.compile("[^0-9]").matcher(this).replaceAll("").trim { it <= ' ' }.toInt()

@JvmName("toast")
fun String.toastExpand(context: Context): Unit =
    Toast.makeText(context, this, Toast.LENGTH_SHORT).show()

@JvmName("safeToast")
fun String?.safeToastExpand(context: Context?) {
    if (!isNullOrEmpty()) {
        context?.let { toastExpand(it) }
    }
}