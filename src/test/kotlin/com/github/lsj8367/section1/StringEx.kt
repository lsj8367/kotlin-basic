package com.github.lsj8367.section1

fun main() {

    extracted()

    val str = "abcde"

    // String.charAt() 대신 배열로 바로 출력해낼 수 있다.
    println(str[0])
}

private fun extracted() {
    val person = ClassCasting.Person("name", 222)

    println("이름은 ${person.name}, 나이는 ${person.age}")
}
