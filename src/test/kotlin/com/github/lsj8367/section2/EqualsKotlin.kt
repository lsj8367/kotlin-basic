package com.github.lsj8367.section2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EqualsKotlin {

    @Test
    fun test() {
        val money1 = Money(1000)
        val money2 = money1
        val money3 = Money(1000)

        assertThat(money1 === money2).isTrue
        assertThat(money1 === money3).isFalse
        assertThat(money1 == money3).isTrue
    }
}
