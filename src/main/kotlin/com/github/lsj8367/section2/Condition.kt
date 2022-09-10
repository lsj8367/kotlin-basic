package com.github.lsj8367.section2

import java.lang.IllegalArgumentException

fun validateIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}의 범위는 음수여서는 안됩니다.")
    }
}

fun validateIsNotNegativeRange(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("${score}의 범위는 0부터 100이하입니다.")
    }
}

fun getPassOrFail(score: Int): String {
    // 자바와 다르게 변수로 할당해서 반환하는게 아니라
    // Expression을 바로 return이 가능하다.
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int) : String {
    return when {
        score >= 90 -> "A"
        score >= 80 -> "B"
        score >= 70 -> "C"
        else ->  "D"
    }
}
