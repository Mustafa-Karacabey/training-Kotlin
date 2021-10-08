package oop

class Rectangle (var width : Int = 0 , var height : Int = 0) { //I can assign default value

    fun getArea() : Int {
        return this.width * this.height
    }

}

class Square {
    var edge : Int

    constructor() { //Secondary Constructor
        this.edge = 1
    }

    constructor(edge : Int) {
        this.edge = edge
    }

    fun calculateArea() : Int {
        return this.edge * this.edge
    }
}

fun main(args: Array<String>) {

    var rectangle = Rectangle(10, 20)
    var secondRectangle = Rectangle(height = 15, width = 25) //You can figure as a name

    println(rectangle.getArea())
    println(secondRectangle.getArea())

}