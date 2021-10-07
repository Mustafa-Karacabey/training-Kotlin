package arrays

fun main() {

    var myArray = 1..20
    var charArray = 'a'..'z'

    //Not Necesarry I Think :) Redundant
    var oneToTwenty = 1.rangeTo(20)
    var oneToHundread = 1.rangeTo(100).step(5)

    var TwentyToOne = 20.downTo(1)

    println(oneToTwenty.last)

}