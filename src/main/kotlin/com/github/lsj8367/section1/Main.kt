package com.github.lsj8367.section1

fun main() {

    // 코틀린은 기본적으로 정적타입 도구
    var number1 = 10L //var는 변수라서 값을 계속 변경할 수 있음
    number1 = 1
    val number2 = 20L
//    number2 = 5L // val 은 자바로 쳤을때 final변수이다.

    val number3: Int //초기값을 지정하지 않으면 변수형을 선언해주어야 한다.

    //val을 우선적으로 사용하는게 좋다.
    var aa: Long = 10L //코틀린은 boxing unboxing을 고려하지 않아도됨 < 알아서 처리해줌

    // 코틀린은 null을 넣을 수 없음 타입+?를 사용해야 null을 넣을 수 있다.
    var b: Long? = 1_000L
    b = null

    // 코틀린은 객체 인스턴스화를 할 때 new 연산자를 사용하지 않음.
    val person = Person("name", 26)
}
