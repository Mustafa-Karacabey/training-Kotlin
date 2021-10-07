package workflows

fun main(args: Array<String>) {

    //When is jsut switch case :)

    val myAge : Int = 25


    when(myAge) {
        1 ->
            println("Your age is 1")
        2 ->
            println("Your age is 2")
        25 ->
            println("Your age is 25")
        else -> {
            println("Your age is higher than 25")
        }
    }



}