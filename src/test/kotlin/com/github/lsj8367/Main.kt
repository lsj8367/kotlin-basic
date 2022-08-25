package com.github.lsj8367

import org.assertj.core.api.Assertions.assertThatExceptionOfType
import org.junit.jupiter.api.Test

class Main {

    @Test fun test() {
        assertThatExceptionOfType(IllegalArgumentException::class.java)
            .isThrownBy { startsWithA(null) }
            .withMessage("null일 수 없습니다.")
    }

    // ?를 붙여주게되면 null이 할당 가능하다.
    // ?를 떼게되면 null넣을때 컴파일에러 띄운다.
    fun startsWithA(str: String?): Boolean {
        if (str == null) {
            throw IllegalArgumentException("null일 수 없습니다.")
        }
        //null체크를 하게 되면 초록색 테두리가 생기면서 null이 아님을 알고있다.
        return str.startsWith("A")
    }

    fun refactorStartsWith(str: String?): Boolean {
        return str?.startsWith("A") ?: throw IllegalArgumentException("null일 수 없습니다.")
    }
}
