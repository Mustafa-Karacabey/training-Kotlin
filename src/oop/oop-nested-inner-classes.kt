package oop

//A nested class marked as inner
// can access the members of its outer class. Inner classes carry a reference to an object of an outer class:
class Outer {
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar
    }
}

val demo = Outer().Inner().foo() // == 1