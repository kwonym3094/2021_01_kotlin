package com.example.a2021_01_kt_example.sample

/**
 * Created by ymKwon on 2021-01-30 오후 3:24.
 */

// companion object: java 의 static 대신 사용됨

class Book private constructor (val id: Int, val name : String){

    companion object BookFactory : IdProvider {

        override fun getId(): Int {
            return 444
        }

        val myBook = "name"

        fun create() = Book(getId(), myBook)
    }

}

interface IdProvider {
    fun getId() : Int
}

fun main(){
    val book = Book.create()

    val bookId = Book.BookFactory.getId()
    println("${book.id} ${book.name} ${bookId}")
}