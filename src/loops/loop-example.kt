package loops


fun main() {

    var myArray : Array<String> = arrayOf("mustafa","kadir","zeynep")


    for(item in myArray) { // := range array
        println(item)
    }

    for( i : Int in 0..5) {
        println(i)
    }

    for(i : Int in 0..10 step 2) {
        println(i)
    }

    for (i in 6 downTo 0 step 2) {
        println(i)
    }

}