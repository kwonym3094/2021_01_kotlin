package com.example.a2021_01_kt_example.sample

/**
 * Created by ymKwon on 2021-01-30 오전 10:59.
 */

fun main(){
    checkNum(1)
    forNWhile()
    nullCheck()
    ignoreNull("not null!")
}

// 4. 조건식
fun compare(a : Int, b: Int) : Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

// 간단하게 변경
// kotlin에서는 삼항 연산자가 없어서 이렇게 사용
fun compare2(a: Int, b: Int) = if(a>b) a else b

// 4-2 if 만큼 when 많이 쓰임 : switch 인듯
fun checkNum(score : Int) {

    // statement 로 사용함
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2 -> println("this is 2")
        3,4 -> println("this is 3,4")
        else -> println("this is else")
    }

    // 혹은 이런 방법 사용가능
    // expression 으로 사용
    var b : Int = when(score) {
        1 -> 1
        2 -> 2
        // 하지만 else 꼭 써야함
        else -> 3
    }

    println("b : ${b}")

    when(score) {
        in 90..100 -> println("You are genius")
        in 10..80 -> println("I'm testing")
        else -> println("okay")
    }

}

// 5. Expression vs Statement
// - 값을 만들면 표현식 expression
// - 값을 만들지 않으면 statement
// - 위로 돌아가보자
// - 코틀린의 모든 함수는 expression (Unit 역시 Unit을 반환하는 것이어서 expression <-> 자바는 void와 다름 )
// - 조건문(if, when 둘다) 자바에서는 statement로 밖에 사용할 수 없었지만, kotlin에서는 expression으로도 사용할 수 있게 됨


// 6. Array vs List
// - Array는 정해진 사이즈가 있어서 처음부터 정해줘야함
// - List
//  * (Immutable) List : R 가능
//  * Mutable List : R&W 가능 => 대표적인 것이 ArrayList

fun array(){
    // array 초기화
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"d",3.4f)
    val list2 = listOf(1,"d",11L)

    array[0] = 3 // 가능
//    list[0] = 1 // 불가능
    // immutable list는 interface라 가져오는것만 가능
    var result = list.get(0)

    var arrList = arrayListOf<Int>(1,2)
    arrList.add(10)
    arrList.add(20)
    // 즉, 위에서 array list를 초기화 할 때
    // val arrList = arrayListOf<Int>(1,2,3) << 이것도 문제가 없다
    // 하지만 새로 정의할 때는 문제가 생긴다(주소값이 바뀌기 때문에)

}

// 6. 반복문
// for / while
fun forNWhile(){
    val students = arrayListOf("joyce","jennifer","jenny","james")

    for (name in students) {
        println(name)
    }

    var sum : Int = 0
    for (i in 1..10 step 2) {
        sum += i
    }
    println(sum)

    for (i in 10 downTo 1 step 2){
        println(i)
    }

    for (i in 1 until 10) { // 마지막 숫자 포함하지 않음
        println(i)
    }

    // for enumerate
    for ((index, name) in students.withIndex()){
        println("${index+1} : ${name}")
    }

    // while
    var index = 0
    while (index < 10) {
        println("current index : ${index}")
        index++
    }
}

// NonNull / Nullable

fun nullCheck(){
    //NPE : Null Point Exception Java 런타임 시점에서만 잡혀서 불편함

    var name : String = "Java"
    var nullname : String? = null


    var nameInUpperCase = name.toUpperCase()
    // null인지 아닌지 몰라서 오류가 뜸
//    var nullNameUnUpperCase = nullname.toUpperCase()
    var nullNameUnUpperCase = nullname?.toUpperCase()

    // elvis연산자 : ?:
    // ?으로 null값이 반환될 때 default 값을 주고 싶다면 사용

    val lastName : String? = null
    val fullName = name + " " + (lastName?:"No Last Name")
    println(fullName)

    // !! : 컴파일러한테 null이 아니라고 알려주는 것: nullable으로 타입이 지정되어 있으나 null이 아닌 것을 보증해주는 것
    // 정말로 확실하지 않은 이상 사용하는 것 지향

}

fun ignoreNull(str : String?) {
    val mNotNull : String = str!!
    val upper = mNotNull.toUpperCase()

    // let 연산자
    // null이 아니면 다음 문장을 수행하라
    // 자신의 receiver 객체를 람다식 내부로 옮겨서 실행하는 구문
    var email : String? = "alan123@gmail.com"
//    email = null
    email?.let {
        println("it is ${it}")
        println("my email is ${email}")
    }
}