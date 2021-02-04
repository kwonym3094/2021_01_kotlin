package com.example.a2021_01_kt_example.sample

import android.icu.text.AlphabeticIndex

/**
 * Created by ymKwon on 2021-02-01 오후 1:37.
 */

fun main(){
//    checkNo(null)
//    checkScore(23)
//
//    var b = 30
//    var a : String = when(b){
//        30 -> "ok"
//        else -> "ng"
//    }
//    println(a)
//
//    forAndWhile()
//
//    nullCheckPoint()
//
//    ignoreNa("Not null")
//
//    println(nmAg("Smith",23))
//
//    var name = "Alan said"
//    println(name.kimchiIsGreat())
//    name = "Tommy said"
//    println(kimchiIsGreat(name))
//
//    println(extendStr("Kimmi",23))
//
//    val lambda = {number: Double ->
//        number == 5.3232
//    }
//
//    println(lambda(2.15))
//
//    println(invokeLam ( lambda ))
//
//
//
//
//    println(invokeLam { it > 3.22 })
//
//
//    val coff = Coffee()
//    coff.drinkCoffee()
//
//    val arabica = Coffee("Columbia",23)
//    coff.drinkCoffee()
//
//
//    val yirga = Yirgacheff()
//    yirga.grindCoffee()
//
//    val coffee1 = CoffeeWarehouse.stockCoffee("Antigua")
//    val coffee2 = CoffeeWarehouse.stockCoffee("Yirgacheff")
//
//    println(CoffeeWarehouse.coffees.toList())
    /*val strRaw = "[)>\u001E06\u001DVD003\u001DP55210F2BA0\u001DSB120\u001DEHB1F0613\u001DT20122441SAA0000008\u001D\u001E\u0004"

    println(strRaw)

    val asciiEot: Int = 4
    val asciiGs: Int = 29
    val asciiRs: Int = 30

    val chEot = asciiEot.toChar().toString().toRegex()
    val chGs = asciiGs.toChar().toString().toRegex()
    val chRs = asciiRs.toChar().toString().toRegex()

    println("$chEot, $chGs, $chRs")

    val strEot = "@@@"
    val strGs = "@@@"
    val strRs = "@@@"
    val strOk = "@@@"
    val strNg = "@@@"

    println(strRaw.replace(chEot,strEot).replace(chGs,strGs).replace(chRs,strRs))
*/

    val arr = arrayOf(1,2,3,4,5,6,7,8,9)

    for (i in arr.indices) {
        println(i)
    }

}

fun checkNum(no1 : Int, no2 : Int) = if (no1 > no2) no1 else no2

fun checkNo(score : Int?) = when (score) {
    0 -> println("this is 0")
    1 -> println("this is 1")
    2 -> println("this is 2")
    3 -> println("this is 3")
    4 -> println("this is 4")
    5 -> println("this is 5")
    else -> println("this is else")
}

fun checkScore(score: Int) = when (score) {
    in 90..100 -> println("You are genius")
    in 80..90 -> println("great")
    in 70..80 -> println("good")
    else -> println("?")
}

fun array1(){
    // array 와 arraylist 차이 이해하기

    val arr1 = arrayOf(1,2,3)
    val list1 = listOf(1,2,3)

    val arr2 = arrayOf(1,"2",3)
    val list2 = listOf(1,"2",3)

    arr1[1] = 2
//    list1[1] = 1

    var result = list1.get(0)

    val arrlist1 = arrayListOf(1,2,3)
    arrlist1.add(1)
    arrlist1.drop(0)

}

fun forAndWhile(){
    val students = arrayListOf("joyce","jennifer","jenny","james")

    for(name in students){
        println(name)
    }

    var sum = 0
    for (idx in 1..10) {
        sum+=idx
    }
    println(sum)

    sum = 0
    for (idx in 1..10 step 2) {
        sum+=idx
    }
    println(sum)

    sum = 0
    for (idx in 10 downTo 1 step 2) {
        sum+=idx
    }
    println(sum)

    sum = 0
    for (idx in 1 until 10) {
        sum += idx
    }
    println(sum)

    for ((idx,name) in students.withIndex()){
        println("${idx} : ${name}")
    }

}

// 전체 같은 이름의 메소드가 있으면 안된다?
fun nullCheckPoint(){

    var name = "Java"
    var nullname : String? = null

    println(name.toUpperCase())
    println(nullname?:"this is null".toUpperCase())

    val lastName : String? = null
    val fullName = "${name} ${lastName?:"No Last Name"}"
    println(fullName)

}

fun ignoreNa(str : String?){

    // let연산자
    // null이 아니면 다음 문장을 수행하라
    // 자신의 receiver 객체를 람다식 내부로 옮겨서 실행하는 구문
    var email : String? = "alan123@gmail.com"
//    var email = null

    email?.let {
        println("it is ${it}")
        println("my name is ${str}")
    }

}

val square3 : (Int) -> (Int) = {number -> number*number*number}

val square4 = {number:Int -> number*number}
val square5 : (Int) -> (Int) = {number -> number*number}

val nmAg = {name:String,age:Int -> "my name is $name and i'm $age years old"}

// 확장함수
val pizzaIsGood : String.() -> String = {
    "${this} pizza is great!"
}

val sq1 = {number:Int -> number*number}
val sq2 : (Int) -> Int = {number -> number*number}
val nmAg1 = {name:String, age:Int -> "${name} : ${age}"}

val kimchiIsGreat : String.() -> String = {
    "${this} kimchi is great !"
}

fun extendStr(name : String, age : Int) : String {
    val introduceMyself : String.(Int) -> String = {
        "I'm ${this} and ${it} years old"
    }
    return introduceMyself(name,age)

}

fun invokeLam(lambda : (Double) -> Boolean) : Boolean {
    return lambda(5.3232)
}


open class Coffee constructor(val name : String = "Anonymous") {

    init {
        println("beverage ready")
    }

    constructor(name:String, age:Int):this(name) {
        println("this bean is from $name $age ago")
    }

    fun drinkCoffee() {
        println("nice coffee")
    }

    open fun grindCoffee(){
        println("Zzzzzzzzzz..")
    }

}

class Yirgacheff : Coffee() {

    override fun grindCoffee() {
        super.grindCoffee()
        println("Taadaaa ! African Flavor")
    }

}


object CoffeeWarehouse{
    val coffees = mutableListOf<Coffees>()
    fun stockCoffee(from:String) : Coffees{
        val coffee = Coffees(from)
        coffees.add(coffee)
        return coffee
    }
}

data class Coffees(val from:String)