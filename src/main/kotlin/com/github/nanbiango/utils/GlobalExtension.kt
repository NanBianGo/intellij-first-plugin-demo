package com.github.nanbiango.utils

import com.intellij.openapi.ui.Messages
import java.util.regex.Pattern

/**
 * 函数的扩展
 */
class FunExtension

/**
 * 基于正则表达式的校验扩展,函数本身为正则表达式
 *
 * @param value 需要匹配的值
 */
fun String.regularMatch(value: String): Boolean {
    return Pattern.compile(this).matcher(value).matches()
}

fun String.showInfoMessage() {
    Messages.showInfoMessage(this, "提示")
}

fun String.showErrorMessage() {
    Messages.showInfoMessage(this, "错误")
}

