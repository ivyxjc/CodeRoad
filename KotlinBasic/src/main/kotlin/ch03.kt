@file:JvmName("StringFunctions")

package strings

fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = " ",
    postfix: String = " "
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0)
            result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun String.lastttChar(): Char =
    this.get(length - 1)


data class Dataa(var a: Int, val b: Int)


class DelegatingCollection<T>(innerList: Collection<T> = ArrayList<T>()) : Collection<T> by innerList


interface JsonFactory<T> {
    fun fromJson(jsonText: String): T
}


private class Person(val name: String) {
    companion object : JsonFactory<Person> {
        override fun fromJson(jsonText: String): Person {
            return Person(jsonText)
        }
    }
}


fun main(args: Array<String>) {
//    println("Kotlin".lastttChar())
    val map = mutableMapOf<Dataa, String>()
    val data1 = Dataa(1, 2)
    map.set(data1, "123")
    println(map.get(data1))
    val data2 = data1.copy(5, 6)
    println(map.get(data1))
    val list = ArrayList<String>()
}
