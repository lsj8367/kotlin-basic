package com.github.lsj8367.function

fun main() {
    printAll("A", "B", "C") // 자바와 동일한 방법
    val arr = arrayOf("A", "B", "C")
    printAll(*arr) //spread 연산자
}


// 자바에선 ...이었지만 코틀린은 vararg
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}
