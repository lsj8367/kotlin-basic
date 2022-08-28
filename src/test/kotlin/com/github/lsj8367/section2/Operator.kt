package com.github.lsj8367.section2

import org.assertj.core.api.Assertions.assertThat

fun main() {
    val money1 = Money(1000)
    val money2 = Money(1000)

    val plusMoney = money1 + money2

    assertThat(plusMoney.value).isEqualTo(2000)
}
