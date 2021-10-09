package oop

class Company {
    // each mutable (i.e., var) property has a getter and setter automatically created for it. No need Extra actually
    var name : String = "default Value"
        get() = field
        set(value) {
            field = value
        }

}