package com.example.a2021_01_kt_example.sample

/**
 * Created by ymKwon on 2021-01-30 오전 10:41.
 */

fun main(){
    helloWorld()
    println(add(34,35))

    // 3. string template
    // $표시로 변수를 사용
    val name = "Alan"
    val lastname = "smith"
    println("my name is $name")

    // 주의 사항
    // - 뒤에 붙여서 더쓰고 싶을때는 괄호
    println("my name is ${name + lastname}. I'm 23")

    // 달러표시 사용하고 싶을때는 백스케이프
    println("this is 2\$s")

}

// 1. 함수
// 리턴형 없을때 Unit : void
//  - redundant(회색으로 표시) : Unit
fun helloWorld() {
    println("hello world!")
}

// 리턴형 있을때
//  - 변수이름 : 변수타입
//  - Int 대문자임
fun add(a : Int, b : Int) : Int{
    return a+b
}

// 2. val, var
// - val : constant
// - var : variable
fun hi() {
    val a : Int = 10
    var b = 10

//    a = 100
    b = 20
}


