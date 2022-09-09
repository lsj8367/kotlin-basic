package com.github.lsj8367.section2

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatExceptionOfType
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MoneyTest {

    @Test
    @DisplayName("정상 시나리오")
    fun minusValidationSuccess() {
        val money1 = Money(1000)
        val money2 = Money(1000)

        val actual = money1 - money2

        assertThat(actual.value).isEqualTo(0)
    }

    @Test
    @DisplayName("현재 돈보다 빼려고자 하는 돈이 더 많은 경우")
    fun minusValidationFailure() {
        val money1 = Money(1000)
        val money2 = Money(2000)

        assertThatExceptionOfType(IllegalStateException::class.java)
            .isThrownBy { money1 - money2 }
            .withMessage("소비하고자 하는 돈이 더 클 수 없습니다.");
    }

}
