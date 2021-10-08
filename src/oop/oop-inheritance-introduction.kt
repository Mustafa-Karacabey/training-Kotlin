package oop

//All Classes is default public and final in kotlin


open class Shape {

    open fun showMyName() {
        println("My Name is Shape")
    }
}

class Rectanglex : Shape() {

    override fun showMyName() {
        println("my name is Rectangle") //Super() is Referring Base Class
    }

}

fun main() {

    var rectangle = Rectanglex()
    rectangle.showMyName()

}