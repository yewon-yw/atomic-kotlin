package chapter_01

fun main() {
    val i = Int.MAX_VALUE
    // Long 타입을 이용해서 overflow 방지
    println(0L + i + i)
    println(i + i + 0L) // overflow 발생
    println(1_000_000 * 1_000_000L)
}