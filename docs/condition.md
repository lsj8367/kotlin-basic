# 분기문

분기문은 일반적으로 자바에서 생긴 구조와 같다.

조건식을 바로 반환하는게 가능하고

자바와 다르게 삼항연산자는 존재하지 않는다

> 왜? 그냥 바로 조건문을 반환하기 때문

범위로 
`in x..y` x부터 y까지 범위를 명시하는것이 가능하고

switch 문이 when 문으로 변경되어 구현된다.

```kotlin
when(조건) {
    조건 -> 실행문
}

when {
    조건 -> 실행
}
```

조건없이 바로 when만 구성도 가능하다.
