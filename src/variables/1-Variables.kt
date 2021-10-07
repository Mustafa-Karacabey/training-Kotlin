package variables

fun main() {

    //val == const in go :)
    //Read-only local variables are defined using the keyword val. They can be assigned a value only once.
    //Value is something like constant

    val myNumber : Int = 25 //If val has number Int Type is redundant
    val myThirdNumber : Int
    val mySecondNumber = 35

    myThirdNumber = 30

    //Variables that can be reassigned use the var keyword.
    var isTrue : Boolean = false  //You can do Like This

    var myName = "Mustafa"
    myName = "Kadir"

    println("My name is : $myName and Total Length is ${myName.length}")


    println("myNumber is : $myNumber")
    println("MySecondNumber + myThirdNumber is : ${myNumber + myThirdNumber}")
    print("Myname is $myName")
    println(isTrue)

    //you can use java libraries in kotlin

}