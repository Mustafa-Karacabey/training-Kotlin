package helloWorld

fun main() {

    println("Please Enter ur Name ")
    val myName = readLine()
    println("Your Name is $myName")

    println("Please Enter Your age ")

    val myAge = readLine()!!.toInt()

    println("your age is $myAge ")

}