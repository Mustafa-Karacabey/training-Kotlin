package oop

class Kisi (var name : String, var age : Int) {//Primary Constructor

     var addres : String = ""

     init {//nesne üretildiği zaman ilk olarak bu çalışır
          println("Init function is just started")
          println("Your name is $name andddd  age is $age") // Constructurdaki değişkenlere sadece initten ulaşabiliriz

     }

     constructor(name : String, age : Int, _adres : String) : this(name, age){//SecondaryConstructor
          this.addres = _adres
     }


     fun showInformation() { // var şeklinde constructurda tanımlarsak normal fonksiyonlarda da kullanabilir otherwise sadece init fonksiyonda kullanırız
          println("Your name is : $name and your age is :$age")
     }

}

class Personx constructor(name : String) {
     //This kelimesi o an oluşturulan  nesneyi refere eder
     var isim : String //This ile buna erişebiliriz ve init fonksyionunda değerlere atama yapabiliriz

     init {
          this.isim =name

     }

     fun showInfo() {
          println("Your name is $isim")
     }
}


fun main() {

     var person = Kisi("Mustafa", 22)
     var kadirPerson = Personx("Kadir")
     var personx = Kisi("kadir", 22, "address")

     kadirPerson.showInfo()
     person.showInformation()

}