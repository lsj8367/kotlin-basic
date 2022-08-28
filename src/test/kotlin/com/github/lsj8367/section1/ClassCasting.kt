package com.github.lsj8367.section1

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ClassCasting {

    @Test
    fun castingTest() {
        //instanceOf 대신 is를 사용한다.
        // 캐스팅은 as를 사용한다.
        val person = Person("name", 26)
        assertThat(person).isInstanceOf(Person::class.java)
    }

    class Person(val name: String, val age: Int) {
    }
}
