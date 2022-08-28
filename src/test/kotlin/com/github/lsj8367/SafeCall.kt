package com.github.lsj8367

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SafeCall {

    @Test
    fun safeCall() {
        val str: String? = null //Null인 경우엔 safe call 이 아니면 호출할 수 없음.
        //safe call
        // ?.을 사용한다.
        // null 이 아니면 실행하고
        // null 이면 실행하지 않는다.
        println(str?.length) // null이어도 NPE를 던져주지 않고 null을 출력해줌
    }

    @Test
    fun elvis() {
        //앞의 연산결과가 null이면 뒷값을 사용
        val str: String? = null
        assertThat(str?.length ?: 0).isEqualTo(0)
    }

    // null 아님 단언
    // null 을 허용 하지만 아무리 생각해도 null 일 수 없는 경우
    fun str(str: String?) : Boolean {
        //혹시나 들어오면 NPE 발생함
        return str!!.isNotBlank()
    }

    //플랫폼 타입 (null 인지 알 수 없는 경우 어노테이션 명시)


}
