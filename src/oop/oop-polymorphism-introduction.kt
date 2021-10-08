package oop

open class Asker {
    open fun selamVer() {
        println("Asker Selam verdi")
    }
}

class Er : Asker() {

    override fun selamVer() {
        println("Er Selam Verdi")
    }

}

class Yuzbası : Asker() {
    override fun selamVer() {
        println("Yüzbası Selam verdi")
    }
}

fun hazirOl(asker : Asker) {

    asker.selamVer()

}


fun main() {

    var asker = Asker()
    var er = Er()
    var yuzbasi = Yuzbası()

    hazirOl(asker)
    hazirOl(er)
    hazirOl(yuzbasi)


}