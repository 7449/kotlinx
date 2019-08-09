@file:Suppress("NOTHING_TO_INLINE")

package com.kotlin.x

import java.util.regex.Pattern

/**
 * 获取String里面的所有数字
 */
inline fun String.getInt(): Int {
    return Integer.valueOf(Pattern.compile("[^0-9]").matcher(this).replaceAll("").trim { it <= ' ' })
}