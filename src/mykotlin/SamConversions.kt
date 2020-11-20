// Type aliases and lambda expressions using sams conversion in Kotlin


package mykotlin

typealias i = Int

fun main() {
    println(m.moreThanFive(7))
    val five: i = 5
    println(five)
}

// lambda expression using functional interfaces
val m = more {it > 5}

fun interface more {
    fun moreThanFive(i: Int): Boolean
}