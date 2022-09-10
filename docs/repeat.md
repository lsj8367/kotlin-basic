# 반복문

반복문은 기본 문법

```java
class Demo {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            
        }
    }
}
```

```kotlin
fun repeat() {
    for (i in 0..5) {
        
    }

    for (i in 0..10 step 2) {
        // 반복문 변수 i를 2씩증가
    }

    for (i in 10 downTo 2) {
        // 10에서 2씩 뺌
    }
}

fun foreach() {
    val list = listOf(1, 2, 3)

    for (i in list) {
        
    }
}

fun whileFunction() {
    //변수기에 var사용
    var i = 1
    while (i <= 5) {
        
    }
    
    //같은 방식으로 do-while문도 가능
}
```
