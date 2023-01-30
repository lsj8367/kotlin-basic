package com.github.lsj8367.`class`

import java.lang.IllegalArgumentException

fun main() {
    val person = Person("이승재", 10)
    person.age // getter
    person.age = 20 // setter
    println(person)
}

class Person(val name: String, var age: Int) {
    // constructor 수정이 가능함.
    // 기본 생성자는 무조건 생성된다.
    // 바로 변수들의 타입을 선언해줄 수 있다.

    init {
        // init은 자바의 생성자에서 유효성 검증등등 로직을 수행하고 싶을 때 사용하는 블록
        if (age <= 0) {
            throw IllegalArgumentException(
                String.format("나이는 ${age}일 수 없습니다.")
            )
        }
    }

    // 아래 3개가 전부 같은 메소드

//    val adult: Boolean
//        get() = this.age >= 20

//    val adult: Boolean
//        get() {
//            return this.age >= 20
//        }

    fun isAdult(): Boolean {
        return this.age >= 20
    }

    // field라는 내부 키워드를 이용하여 무한반복하지 않게 호출해주는방법이 존재한다.
    // this를 사용하여 해소할 수도 있다.

    override fun toString(): String {
        return "name : $name, age: $age"
    }

}
