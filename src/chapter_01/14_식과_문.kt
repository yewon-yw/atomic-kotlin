package chapter_01

fun main() {
    var i = 1
    println(i++ + ++i) // 1 + 3
    println(i++ + 10) // 3 + 10
    println(20 * ++i) // 20 * 5
}