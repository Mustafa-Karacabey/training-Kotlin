package oop

//It is not unusual to create classes whose main purpose is to hold data.
// In such classes, some standard functionality and some utility functions are often mechanically derivable from the data.
// In Kotlin, these are called data classes and are marked with


// You can use 'data class' for the same.
// in data class, you don't need to make the Getter-Setter method. data class automatically create for you
data class Persona(val name: String) {
    var age: Int = 0
}

//Dataları oluşturuken bu classı kullan klasik toString, equals, hashCode ve copy imlemepntastonları farklıdır