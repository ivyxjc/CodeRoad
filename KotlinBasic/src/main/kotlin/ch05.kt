package ch04

import java.math.BigDecimal


private data class Person(val name: String, val age: Int)

private class Book(val title: String, val authors: List<String>)

fun main(args: Array<String>) {
    val peoples = listOf(Person("Alice", 31), Person("Bob", 31), Person("Carol", 29))
    println(peoples.maxBy { it.age })
    val books = listOf(Book("Thursday Next", listOf("Jasper Fforde")),
        Book("Mort", listOf("Terry Pratchett")),
        Book("Good Omens", listOf("Terry Pratchett",
            "Neil Gaiman")))
    println(books.flatMap { it.authors }.toSet())

    peoples.asSequence()
        .map { it.name }
        .filter { it.startsWith("A") }
        .toList()
    val t = factorial(125)
    val tt = t % BigDecimal(10).pow(32)
    println(tt)
}

fun factorial(num: Int): BigDecimal {
    var res = BigDecimal.ONE
    var copy = num
    while (copy >= 1) {
        res *= BigDecimal(copy)
        copy--
    }

    return res
}


