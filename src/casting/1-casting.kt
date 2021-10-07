package casting


fun main() {

    var myNumber = 25

    if (myNumber is Int) { //You can learn your value type
        println("My Number is INT")
    }

    println("Your value is $myNumber")
    println("After changes")

    var newNumber = myNumber.toFloat()

    println("After Casting your number is $newNumber")
}