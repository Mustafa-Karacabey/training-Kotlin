package loops

fun main(args: Array<String>) {

    var myArray : Array<Int> = arrayOf(1,2,3,4,5)

    for(item : Int in myArray) {
        println(item)
    }
    println("***********")
    for(i in 6 downTo 0 step 2) {
        println(i)
    }
    println("*****")

    for (i in 1..8 step 2) {
        println(i)
    }
    println("*****")

    for (i in 0..10) {
        println(i)
    }

    println("******")
}