package functions


fun showName() {
    println("Hello Mustafa")
}

fun showParameter(name : String) {
    println("Your name is $name")
}

fun sumTwoNumbers(number1 : Int, number2 : Int) : Int {
    return number1 + number2
}

fun main() {
    showName()
    showParameter("KARACABEY")

    var sum = sumTwoNumbers(1, 2)
    println(sum)
}