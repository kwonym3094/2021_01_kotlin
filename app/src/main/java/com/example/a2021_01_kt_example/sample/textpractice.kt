package com.example.a2021_01_kt_example.sample

/**
 * Created by ymKwon on 2021-02-01 오전 11:26.
 */

fun main() {
    val border = "`-._,-'"
    printBorder(border, 4)
    println("Happy Birthday, Joen")
    printBorder(border, 4)

    buildCake(24,5)

}

fun printBorder(str : String) {
    repeat(23) {
        print(str)
    }
    println()
}

fun printBorder(str : String?, repeat : Int) {
    repeat(repeat) {
        print(str?:"-")
    }
    println()
}

fun buildCake(age : Int, layer : Int){
    print(" ")
    buildCakeComponent("`", age)

    print(" ")
    buildCakeComponent("|", age)

    buildCakeComponent("=", age+2)

    repeat(layer) {
        buildCakeComponent("@", age+2)
    }

}

fun buildCakeComponent(comp : String, age: Int){
    repeat(age) {
        print(comp)
    }
    println()
}