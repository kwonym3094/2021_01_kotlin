package com.example.a2021_01_kt_example.sample

/**
 * Created by ymKwon on 2021-01-30 오후 3:33.
 */

// Object class
// 다른클래스와 다른점 : 모든 앱을 실행할 때 한번만 만들어짐 => Singleton pattern
// - CarFactory 객체는 Car를 만들 때 계속 사용하게 되는데, class 파일이 한번 실행 될때 객체를 한번 만들어지고 그 이후엔 만들어지지 않음
// => 불필요한 메모리 사용을 막을 수 있음
object CarFactory{
    val cars = mutableListOf<Car>()
    fun makeCar(hp : Int) : Car {
        val car = Car(hp)
        cars.add(car)
        return car
    }
}


data class Car(val hp : Int)

fun main(){
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}