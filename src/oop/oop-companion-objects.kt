package oop

//In Kotlin,
// if you want to write a function or any member of the class that can be called without having the instance of the class
// then you can write the same as a member of a companion object inside the class.

object Mustafa {//Again companion object this is :) singleton
    var name : String = "KARACABEYEEEASD"
}

class TobeCalled{
    companion object Test {//Static just create 1 instance
        var name : String = "KARACABEY"
        fun callMe() {
            println("Call me Without instance")
        }
    }
}

fun main(args: Array<String>) {
    TobeCalled.Test.callMe()
    println(TobeCalled.name)
    println(Mustafa.name)
}