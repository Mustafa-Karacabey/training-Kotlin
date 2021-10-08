package oop


class Student (var name : String, var surname : String, var age : Int) {

}

fun printStudents(students : Array<Student>) {

    var i : Int = 0
    for (item : Student in students) {
        i++
        println("$i. Student name is ${item.name} Student age is ${item.age} \n")
    }

}

fun main() {

    var student1 = Student("Mustafa", "Karacabey", 22)
    var student2 = Student("Kadir", "Karacabey", 16)

    var array : Array<Student> = arrayOf(student1, student2)

    printStudents(array)


}
