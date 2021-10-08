package oop

open class Human(name : String, age : Int) { //Primary Constructor Exampel

    var name : String
    var age : Int

    init {
        println("Human Classed Started")
        this.name = name
        this.age = age
    }

}

open class Insan {
    var name : String

    constructor(name: String) {
        this.name = name
    }
}

//If the derived class has a primary constructor, the base class can (and must) be
// initialized in that primary constructor according to its parameters

class Teacher(name: String, age: Int, money : Int) : Human(name, age){

    var money : Int

    init {
        println("Teacher Classed Started ")
        this.money = money
    }

}

class Studentx : Insan {//Secondary Constructor Example
    var isLive : Boolean
    constructor(name : String, isLive : Boolean ) : super(name) {
        this.isLive = isLive
    }

}


fun main() {

    var teacher = Teacher("Mustafa", 22, 5000)
    println(teacher.name)

}