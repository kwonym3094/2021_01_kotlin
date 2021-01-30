package com.example.a2021_01_kt_example.sample

/**
 * Created by ymKwon on 2021-01-30 오후 12:37.
 */

// 자바와 다른점
// - 파일 이름과 class 이름이 일치하지 않아도 됨
// - 한 파일에 여러 클래스 넣을 수 있음

open class Human constructor(val name : String = "Anonymous") {

    // constructor 사용 -> 방법 약간 다름
    //  - 클래스 정의할때 constructor 라고 정의해서 사용
    //  - 위 확인

    // 주 생성자: 클래스 처음 정의할때 사용할 것들
    init {
        println("New human has been born !")
    }

    // 부 생성자: 여러개 만들 수 있음 java의 overloading 방식처럼
    /*
    * class Person {
    *   public Person(String name) {
    *   }
    *
    *   public Person(String name, int age){
    *       this(name);
    *   }
    *
    * */
    // 부 생성자는 항상 주생성자의 위임을 받아야함
    // 주 생성자는 무조건 주 생성자 먼저 실행되고 실행된다
    constructor(name:String, age:Int):this(name){
        println("my name is $name, and $age years old")
    }


   fun eatingCake(){
        println("This is sooooooo gross")
    }

    open fun singASong(){
        println("lalala")
    }
}

// class 상속
/*class Korean : Human() {
}*/
// 에러가 뜸 -> kotlin 클래스는 file 클래스여서 아무리 같은 파일내에 있더라도 접근을 못함 => 상속할 클래스를 open 예약어를 넣어야함

class Korean : Human() {

    // overriding 사용하기
    // 역시 메소드에 open 사용하기
    override fun singASong() {
        // 부모 class의 메소드도 동시에 사용하고 싶을 때?
        super.singASong()
        println("라랄라")
        println("my name is $name")
    }
}

fun main(){
    val human = Human("smith")
    val stranger = Human()
    human.eatingCake()

    println("this human's name is ${human.name}")
    println("this human's name is ${stranger.name}")

    val human2 = Human("Kuri",23)

    val korean = Korean()
    korean.singASong()
}