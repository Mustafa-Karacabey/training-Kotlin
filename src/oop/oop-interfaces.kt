package oop

//İnterface inheritance is valid

interface Named {
    val name: String
}

interface Personez : Named {
    val firstName: String
    val lastName: String

    override val name: String get() = "$firstName $lastName"
}

interface A {
    fun foo() { print("A") }
    fun bar()
}

interface B {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class C : A {
    override fun bar() { print("bar") }
}

class D : A, B { //Multiple interface inheritance
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}