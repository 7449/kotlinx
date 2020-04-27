@file:JvmName("MatcherUtils")

package com.kotlin.x

import java.util.regex.Pattern

/**
 * 获取String里面的所有数字
 */
fun String.getInt(): Int =
    Integer.valueOf(Pattern.compile("[^0-9]").matcher(this).replaceAll("").trim { it <= ' ' })
