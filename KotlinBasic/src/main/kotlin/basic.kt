package basic

private data class Person(val name: String, val age: Int? = null)
//
//fun main(args: Array<String>) {
//    val persons= listOf(Person("Alice"),Person("Bob",age = 20))
//    val oldest=persons.maxBy { it.age?:0 }
//    println("The oldest is: $oldest")
//}

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }

    var hint: Boolean
        get() {
            return height == width
        }
        set(value) {
            hint = value
        }
}

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e
        return n.value
    }
    if (e is Sum) {
        return eval(e.left) + eval(e.right)
    }
    throw  IllegalArgumentException("Unknown expression")
}

fun main(args: Array<String>) {
    eval(Sum(Sum(Num(1), Num(2)), Num(4)))
    var sets = listOf<String>("hello", "bbb")
    sets.last()
}





