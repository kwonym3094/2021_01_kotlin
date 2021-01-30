package com.example.a2021_01_kt_example.sample

/**
 * Created by ymKwon on 2021-01-30 오후 3:09.
 */

// data class: 데이터를 담는 그릇이 되는 클래스
// pojo class : 모델이 되는 클래스 -> 안에서 메소드가 작동하는 것이 아니라 틀 역할을 하는 클래스
//  - java 에서는 일일이 하나하나 다 써줘야 했었음
//  - kotlin 에서는 이처럼 필요 없는 코드를 줄이기 위해서 사용

data class Ticket(val compNm : String, val custNm: String, var date: String, var seatNum : Int, var planeCd : String)

// 이게 끝임
// 이렇게 만들어주므로서 constructor, property, toString(), HashCode(), copy() 메소드를 자동으로 만들어줌
// 한 파일 안에서 여러가지 데이터 클래스를 만들 수 있음

fun main() {
    val ticketA = Ticket("KAL","Alan Smith","2021-12-31",23,"A2031")
    val ticketB = TicketNormal("KAL","Alan Smith","2021-12-31",23,"A2031")

    println(ticketA)
    println(ticketB)

// 프린트 결과
//    Ticket(compNm=KAL, custNm=Alan Smith, date=2021-12-31, seatNum=23, planeCd=A2031) << data class는 사용자가 보기 쉽게 객체 정보를 보여줌
//    com.example.a2021_01_kt_example.sample.TicketNormal@511d50c0 << class는 주소값을 알려줌

}

// 그냥 클래스랑 한번 비교해보기
class TicketNormal(val compNm : String, val custNm: String, var date: String, var seatNum : Int, var planeCd : String)