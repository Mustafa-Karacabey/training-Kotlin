package generics

class Box<T>(var t : T) {//Basic Generic Class
    fun showProp() {
        println(t)
    }
}

fun <T>  showValue(t : T) : List<T> {//Generic Function Example

    return emptyList()

}

fun main(args: Array<String>) {
    var box : Box<Int> = Box<Int>(25)
    var box2 : Box<String> = Box<String>("KARACABEY")

    val l = showValue<Int>(1)

    box.showProp()
    box2.showProp()


}