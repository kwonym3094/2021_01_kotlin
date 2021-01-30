package com.example.a2021_01_kt_example.sample

/**
 * Created by ymKwon on 2021-01-30 오후 1:49.
 */

fun main(){
    val person = Person("Alan")
    person.cakeEating()

    val person2 = Person("Smith",2)
}

class Person constructor(name : String) {

    init {
        println("New person has benn entered!")
    }

    constructor(name:String,age:Int):this(name){
        println("The name is ${name} and ${age} years old")
    }

    fun cakeEating(){
        println("this is soooooo goood")
    }
}