package functions


fun sumTwoNumber(number1 : Int, number2 : Int)  : Int {
    return number1 + number2
}

fun sumTwoNumber(number1 : Double, number2 : Double) : Double { //Method Overloading
    return  number1 + number2
}

fun sumThreeNumber(number1 : Int, number2 : Int, number3 : Int) : Int {
    return  number1 + number2 + number3
}

fun sumEveryThing(vararg numbers: Int) : Int {

    var sum = 0

    for (i : Int in numbers) {
        sum += i
    }

    return sum
}


fun main() {

    var sumNumbers = sumTwoNumber(5, 10)
    var sumTwoNumbers = sumTwoNumber(3.2, 5.4)
    var sumThreeNumbers = sumThreeNumber(4, 5, 6 )
    var sumEveryThing = sumEveryThing(1, 2, 3, 4, 5)

    println(sumNumbers)
    println(sumTwoNumbers)
    println(sumThreeNumbers)
    println(sumEveryThing)
}