package chapter_01

fun oneOrTheOther(exp: Boolean): String =
    if (exp) "true" else "false"

fun main() {
    val x = 1
    println(oneOrTheOther(x == 1))
    println(oneOrTheOther(x != 1))
}