package oop

abstract class Persone(name: String) { //You can not create an object with abstract class
    init {
        println("I am Persone Abstract Class")
    }

    fun helloSSN(number : Int) { //If you inherit this abstract class you can use this function method
        println("Number is $number")
    }

    abstract fun nameClass(name : String) //You have to override derived class
}

class Studentxx(name: String) : Persone(name) {
    override fun nameClass(name: String) {
        println("My Name is $name")
    }
}

fun main() {
    var person = Studentxx("Mustafa")
    person.helloSSN(65)
    person.nameClass("KADİR")
}