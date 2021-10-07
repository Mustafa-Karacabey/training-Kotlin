package oop

class Person {
    var Name : String = "Mustafa"
    var Age : Int = 15


    fun HelloClass() {
        println("Hello Kotlin World")
    }

    fun Birthday() : Int {
        return 35
    }
}


fun main() {

    var Mustafa = Person()

    println(Mustafa.Age)
    println(Mustafa.Name)
    println(Mustafa.HelloClass())
    println(Mustafa.Birthday())


}