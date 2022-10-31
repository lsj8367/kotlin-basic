package com.github.lsj8367.exception

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는(은) 숫자가 아닙니다.")
    }
}

fun parseIntOrThrowV2(str: String): Int? {
    // 함수기때문에 바로 반환이 가능
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        return null
    }
}
