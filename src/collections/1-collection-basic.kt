package collections

fun main(args: Array<String>) {

    //U can check details later
    var numbers = listOf<Int>(1,2,3)//ImMutable

    var names = ArrayList<String>()//Mutable

    names.add("Mustafa")

    var myMap = mapOf<Int,String>(1 to "mustafa", 2 to "Karacabey")//Maps like dictionary

    var mySet = setOf<String>("mustafa","kadir","mustafa") //Tekrar edilenler otomatik kaldırılır

    for (item in numbers) { //Range li For :)
        println(item)
    }
}