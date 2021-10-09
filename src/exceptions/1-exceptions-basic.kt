package exceptions

fun main(args: Array<String>) {
    try { //Classic Exceptions :)
        // some code
    } catch (e : Exception) {
        println(e.message)
    } finally {
        // optional finally block
    }

    //throw Exception("Hi There!") U can do like this
}