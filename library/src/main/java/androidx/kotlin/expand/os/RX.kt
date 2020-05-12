@file:JvmName("RUtils")

package androidx.kotlin.expand.os

import android.content.Context
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog

//fun Context.getIdentifierByType(resourceName: String, defType: String): Int {
//    return resources.getIdentifier(resourceName, defType, packageName)
//}

const val POINT = "."
const val R = "R"
const val JOIN = "$"
const val ANIM = "anim"
const val ATTR = "attr"
const val COLOR = "color"
const val DIMEN = "dimen"
const val DRAWABLE = "drawable"
const val ID = "id"
const val LAYOUT = "layout"
const val MENU = "menu"
const val RAW = "raw"
const val STRING = "string"
const val STYLE = "style"
const val STYLEABLE = "styleable"
const val DEFAULT_VALUE = -1

@JvmName("getAnimId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取动画ID")
    ]
)
fun Context.animIdExpand(name: String, defaultValue: Int = DEFAULT_VALUE): Int =
    animIdOrDefault(name) { defaultValue }

@JvmName("getAttrId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取属性ID")
    ]
)
fun Context.attrIdExpand(name: String, defaultValue: Int = DEFAULT_VALUE): Int =
    attrIdOrDefault(name) { defaultValue }

@JvmName("getColorId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取颜色ID")
    ]
)
fun Context.colorIdExpand(name: String, defaultValue: Int = DEFAULT_VALUE): Int =
    colorIdOrDefault(name) { defaultValue }

@JvmName("getDimenId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取尺寸ID")
    ]
)
fun Context.dimenIdExpand(name: String, defaultValue: Int = DEFAULT_VALUE): Int =
    dimenIdOrDefault(name) { defaultValue }

@JvmName("getDrawableId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取图片ID")
    ]
)
fun Context.drawableIdExpand(name: String, defaultValue: Int = DEFAULT_VALUE): Int =
    drawableIdOrDefault(name) { defaultValue }

@JvmName("getId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取ID")
    ]
)
fun Context.idExpand(name: String, defaultValue: Int = DEFAULT_VALUE): Int =
    idOrDefault(name) { defaultValue }

@JvmName("getLayoutId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取布局ID")
    ]
)
fun Context.layoutIdExpand(name: String, defaultValue: Int = DEFAULT_VALUE): Int =
    layoutIdOrDefault(name) { defaultValue }

@JvmName("getMenuId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取菜单ID")
    ]
)
fun Context.menuIdExpand(name: String, defaultValue: Int = DEFAULT_VALUE): Int =
    menuIdOrDefault(name) { defaultValue }

@JvmName("getRawId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取RAW ID")
    ]
)
fun Context.rawIdExpand(name: String, defaultValue: Int = DEFAULT_VALUE): Int =
    rawIdOrDefault(name) { defaultValue }

@JvmName("getStringId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取字符串ID")
    ]
)
fun Context.stringIdExpand(name: String, defaultValue: Int = DEFAULT_VALUE): Int =
    stringIdOrDefault(name) { defaultValue }

@JvmName("getStyleId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取样式ID")
    ]
)
fun Context.styleIdExpand(name: String, defaultValue: Int = DEFAULT_VALUE): Int =
    styleIdOrDefault(name) { defaultValue }

@JvmName("getStyleableId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取自定义属性组")
    ]
)
fun Context.styleableIdExpand(name: String, defaultValue: IntArray = intArrayOf()): IntArray =
    styleableIdOrDefault(name) { defaultValue }

@JvmName("getStyleableAttributeId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取自定义属性")
    ]
)
fun Context.styleableAttributeIdExpand(
    styleable: String,
    attr: String,
    defaultValue: Int = DEFAULT_VALUE
): Int = styleableAttributeIdOrDefault(styleable, attr) { defaultValue }

@JvmName("getAnimId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取动画ID")
    ]
)
fun Context.animIdOrDefault(name: String, action: ActionInt): Int =
    findRId(packageName + POINT + R + JOIN + ANIM, name) { action.invoke() }

@JvmName("getAttrId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取属性ID")
    ]
)
fun Context.attrIdOrDefault(name: String, action: ActionInt): Int =
    findRId(packageName + POINT + R + JOIN + ATTR, name) { action.invoke() }

@JvmName("getColorId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取颜色ID")
    ]
)
fun Context.colorIdOrDefault(name: String, action: ActionInt): Int =
    findRId(packageName + POINT + R + JOIN + COLOR, name) { action.invoke() }

@JvmName("getDimenId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取尺寸ID")
    ]
)
fun Context.dimenIdOrDefault(name: String, action: ActionInt): Int =
    findRId(packageName + POINT + R + JOIN + DIMEN, name) { action.invoke() }

@JvmName("getDrawableId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取图片ID")
    ]
)
fun Context.drawableIdOrDefault(name: String, action: ActionInt): Int =
    findRId(packageName + POINT + R + JOIN + DRAWABLE, name) { action.invoke() }

@JvmName("getId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取ID")
    ]
)
fun Context.idOrDefault(name: String, action: ActionInt): Int =
    findRId(packageName + POINT + R + JOIN + ID, name) { action.invoke() }

@JvmName("getLayoutId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取布局ID")
    ]
)
fun Context.layoutIdOrDefault(name: String, action: ActionInt): Int =
    findRId(packageName + POINT + R + JOIN + LAYOUT, name) { action.invoke() }

@JvmName("getMenuId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取菜单ID")
    ]
)
fun Context.menuIdOrDefault(name: String, action: ActionInt): Int =
    findRId(packageName + POINT + R + JOIN + MENU, name) { action.invoke() }

@JvmName("getRawId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取RAW ID")
    ]
)
fun Context.rawIdOrDefault(name: String, action: ActionInt): Int =
    findRId(packageName + POINT + R + JOIN + RAW, name) { action.invoke() }

@JvmName("getStringId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取字符串ID")
    ]
)
fun Context.stringIdOrDefault(name: String, action: ActionInt): Int =
    findRId(packageName + POINT + R + JOIN + STRING, name) { action.invoke() }

@JvmName("getStyleId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取样式ID")
    ]
)
fun Context.styleIdOrDefault(name: String, action: ActionInt): Int =
    findRId(packageName + POINT + R + JOIN + STYLE, name) { action.invoke() }

@JvmName("getStyleableId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取自定义属性组")
    ]
)
fun Context.styleableIdOrDefault(name: String, action: ActionIntArray): IntArray =
    findRId(packageName + POINT + R + JOIN + STYLEABLE, name) { action.invoke() }

@JvmName("getStyleableAttributeId")
@Version(
    version = [Version.PEACHES],
    log = [
        VersionLog(Version.PEACHES, "added in version 0.0.4,获取自定义属性")
    ]
)
fun Context.styleableAttributeIdOrDefault(styleable: String, attr: String, action: ActionInt): Int =
    findRId(packageName + POINT + R + JOIN + STYLEABLE, styleable + "_" + attr) { action.invoke() }

// findRIdResources
internal fun <T> findRId(claName: String, name: String, action: Action<T>): T =
    try {
        @Suppress("UNCHECKED_CAST")
        Class
            .forName(claName)
            .getDeclaredField(name)[null] as T
    } catch (e: Exception) {
        e.printStackTrace()
        action.invoke()
    }
