package com.example.a2021_01_kt_example.sample

/**
 * Created by ymKwon on 2021-01-30 오후 2:09.
 */

// 1. Lambda
// 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수
// 1) 메소드의 파라미터로 넘겨줄 수 있다 fun maxBy(a : Int)
// 2) return 값으로 사용할 수 있음

// 람다의 기본 정의
// val lambdaName : Type = {argumentList -> codeBody}

val square : (Int) -> (Int) = {number -> number * number} // 앞에 적혀있기 때문에 타입추론이 가능함 혹은
val square2 = {number : Int -> number * number}

val nameAge = {name: String, age: Int -> "My name is $name and I'm $age"}

fun main(){
    println(square(3))
    println(nameAge("alan",23))
    var a = "Smith said "
    var b = "Windows said "
    println(pizzaIsGreat(a))
    println(b.pizzaIsGreat())
    println(extendString("Smith",34))
    println(calculateGrade(43))





    // lambda 표현식 1
    val lambda = {number : Double ->
        number == 4.3213
    }

    println(invokeLambda(lambda))


    // lambda 표현식 2 : lambda literal
    println(invokeLambda({it > 3.23}))

    // 다음과 같이 표현도 가능함
    // - lambda식의 특징
    //  * function 의 마지막 parameter 가 lambda 식인 경우 소괄호 생략 가능
    println(invokeLambda{it > 3.22})

}

// 확장함수 -> 있는 클래스를 확장
val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name:String, age:Int) : String {
    // 파라미터가 1개 일때는 it이라는 예약어 사용할 수 있음
    val introduceMyself : String.(Int) -> String = {
        "I'm $this and $it years old"
    }
    // this 가 가르키는 것: object
    // it 이 가르키는 것: 하나 들어가는 파라미터
    return name.introduceMyself(age)
}

// lambda 의 리턴
val calculateGrade : (Int) -> String? = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "wrong range of score"
    }
}

// lambda 를 표현하는 두 가지 방법
fun invokeLambda(lambda : (Double) -> Boolean) : Boolean {
    return lambda(5.2343)
}

// lambda 에서 마지막으로 배울 부분: 익명 내부 함수

// 조건
// 1. Kotlin interface가 아닌 Java 인터페이스여야 함
// 2. 그 인터페이스는 딱 하나의 메소드만 가져야 함
/* -- exmaple --
* button.setOnClickListener{
*   // to do..
* }
* */
// 다음과 같이 표현이 가능함 -> setOnClickListener는 Java 인터페이스이고, 메소드는 단 하나만 가지기 때문