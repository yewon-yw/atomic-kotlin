package chapter_01

fun inInt() {
    val percent = 35
    println(percent in 1..100)
}

fun inString() {
    println('t' in "Kotlin")
    println('a' in "Kotlin")
}

fun isDigit(c: Char) = c in '0'..'9'

fun inStringRanges() {
    println("ab" in "aa".."az")
    println("ba" in "aa".."az")
}

fun main() {
    inInt()
    inString()
    println(isDigit('a'))
    println(isDigit('5'))
    inStringRanges()
}