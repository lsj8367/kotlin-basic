# Section1 정리

코틀린은 기본적으로 정적 타입 도구이다.

코틀린의 변수 선언은 아래 두가지로 나뉜다.

- var
  - 한번 할당해도 계속해서 재할당이 가능한 변수이다. 
- val
  - Java기준 `final` 을 변수에 붙여 한번 할당하면 재할당 하지 못하는 변수이다.
  - val로 선언하는 경우에는 처음에 선언해주지 않는 경우라면 그 변수형을 선언 해주어야 한다.

> val을 우선적으로 사용하는게 좋다.
```kotlin
    var aa: Long = 10L //코틀린은 boxing unboxing을 고려하지 않아도됨 < 알아서 처리해줌 (정말 좋은 언어다)
```

> 코틀린은 null을 넣을 수 없음 타입+?를 사용해야 null을 넣을 수 있다.

```kotlin
    var b: Long? = 1_000L
    b = null
```

코틀린은 객체 인스턴스를 생성할 때 자바처럼 `new` 연산자를 사용하지 않음.

`val person = Person("name", 26)` 이렇게 인스턴스를 생성한다!

### SafeCall

?를 변수형 뒤에 붙여주게 되면 Nullable 객체가 된다.

개인적으로는 이 때부터 좀 복잡하게 되는 느낌이 있다.

Null인 경우엔 safe call 이 아니면 호출할 수 없음.

?.을 사용한다. null 이 아니면 실행하고 null 이면 실행하지 않는다.

null이어도 NPE를 던져주지 않고 null을 출력해줌

**변수형 뒤에 ? 가 없는 상태에서 null을 명시적으로 넣는 순간 컴파일 에러를 띄워준다.**

> 예시

```kotlin
@Test
fun safeCall() {
    val str: String? = null
    println(str?.length)
}
```

자잘한 것인데, Intellij 에서는 null체크를 하게 되면 초록색 테두리가 생기면서 null이 아님을 알고있다.

이를 처리하는 것으로 Elvis 가 있는데

### Elvis

```kotlin
// 기존 null 처리방식
if (obj == null) {
}

// Elvis
obj ?: throw NullPointerException()
```
삼항연산자에서 앞부분만 떼고 ?와 :을 합친? ㅋㅋㅋㅋㅋ

아무튼 앞부분이 null이라면? 뒷부분을 수행해준다.

### null 아님 단언
null 을 허용 하지만 아무리 생각해도 null 일 수 없는 경우


## Kotlin의 특이 타입

### Any

Java의 Object 역할 (모든 객체의 최상위 타입)

모든 기본 타입의 최상위 타입도 Any이다.

Any 자체로는 null을 포함할 수 없어 null을 포함하고 싶다면 `Any?`로 표현한다.

Any 에도 Java와 마찬가지로 `equals()`, `hashCode()`, `toString()`이 존재한다.

### Unit

Java의 void와 동일한 역할을 수행한다.

void와 다르게 Unit은 그 자체로 타입 인자로 사용이 가능하다.

함수형 프로그래밍에서 Unit은 단 하나의 인스턴스를 갖는 타입을 의미함.

### Nothing

Nothing 은 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할

무조건 예외를 반환하는 함수, 무한루프 함수 등등...

```kotlin
fun fail(message: String): Nothing {
    throw IllegalArgumentException()
}
```

### String interpolation / String indexing 

문자열 사이에 객체라면 `${}`를 이용해서 변수 값을 사용할 수 있다.

그냥 일반 변수라면 `$`를 이용해 사용할 수 있지만, `${}`를 습관화 하는게 좋을듯 하다.

자바처럼 `"""` 사용 가능하다.

