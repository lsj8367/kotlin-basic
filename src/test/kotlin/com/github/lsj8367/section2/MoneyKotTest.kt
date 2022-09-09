package com.github.lsj8367.section2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MoneyKotTest {

    @Test
    fun plus() {
        val money1 = MoneyKot(1000)
        val money2 = MoneyKot(1000)

        val plusMoney = money1 + money2
        assertThat(plusMoney.value).isEqualTo(2000)
    }

    @Test
    fun minus() {
        val money1 = MoneyKot(1000)
        val money2 = MoneyKot(1000)
        assertThat((money1 - money2).value).isEqualTo(0)
    }

}
