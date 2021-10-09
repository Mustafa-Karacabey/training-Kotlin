package functions

class Exo {
    fun sayHi() {
        println("Hi From EXO")
    }

}

//Companion objeleride aynı yöntemle extend edebilirsin

fun main(args: Array<String>) {

    var exo = Exo()

    println(5.sayHello())
    println(exo.sayExtendes())

}

fun Exo.sayExtendes() : String {
    return "yeap ı am extenden from Exo"
}

fun Int.sayHello() : String { //Extension Function

  return "Hello I am Extension Function"

}