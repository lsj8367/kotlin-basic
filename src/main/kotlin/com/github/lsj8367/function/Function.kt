package com.github.lsj8367.function

fun main() {
    //named Argument 변수를 지정해서 값을 넣어줌
    // 자바에서는 자료형이 같을때 순서가 뒤바뀌면 컴파일에 잡히지 않는 오류가 있다.
    // 코틀린에서는 이 문법을 사용하게 되면 값을 맞춰서 넣어줄 수 있다
    repeat2("Hello World!!!", 2, useNewLine = false)
}

// {}를 사용한 경우엔 반환 타입이 Unit이 아니면 명시해줘야 한다.
// 선언형 함수는 반환타입을 타입추론해주기에 생략이 가능하다.
//fun max(a: Int, b: Int) =
//    if (a > b) {
//        a
//    } else {
//        b
//    }

fun repeat(str: String, num: Int, useNewLine: Boolean) {
    for (i in 0..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}


// 기본값을 넣어줄 수 있고, 값이 있는경우는 default에서 변경된다
fun repeat2(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 0..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}
