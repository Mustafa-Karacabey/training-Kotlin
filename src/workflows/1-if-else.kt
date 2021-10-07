package workflows

fun main() {

    var myAge = 20

    if (myAge < 18) {
        println("You are child still")
    }

    //Learn Lambda Expression :)
    var result = {
        if (myAge < 20) {
            1
        }
        else {
            0
        }
    }

}