package com.github.lsj8367.section1

fun main() {
//    val number1 = 4
//    val number2: Long = number1.toLong(); // 코틀린의 형변환은 명시적으로 형변환 해주어야한다.
    // toXXX 함수를 이용해서 형변환을 해주어야한다.
    // 자바는 자동형변환 or (long)등등을 이용해서 해주었었던것.

    //Nullable에서는 적절한 방법이 필요함 Safecall, elvis
//    val number1: Int? = 4
//    val number2: Long = number1?.toLong() ?: 0L

//    printType(null)
    printType(ClassCasting.Person("name", 100))
}

fun printType(obj: Any?) {
//    if (obj is ClassCasting.Person) {
//        val person = obj as ClassCasting.Person
//        println(person.age)
//    }

//    if (obj !is ClassCasting.Person) {
//        val person = obj as ClassCasting.Person
//        println(person.age)
//    }

//     as? 는 null이면 null반환, null이 아니면 할당
    //안전한 타입 형변환
    val person = obj as? ClassCasting.Person
    println(person?.age)
}
