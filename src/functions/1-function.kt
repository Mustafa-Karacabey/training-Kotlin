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

fun nullableFunction(number1 : Int, number2: Int) : Int? { //Nulable
    return null
}

fun main() {
    showName()
    showParameter("KARACABEY")

    println(nullableFunction(5, 8))

    var sum = sumTwoNumbers(1, 2)
    println(sum)
}