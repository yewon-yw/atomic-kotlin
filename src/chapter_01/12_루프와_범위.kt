package chapter_01

fun showRange(r: IntProgression) {
    for (i in r) {
        print("$i ")
    }
    print(" // $r")
    println()
}

fun numberRanges() {
    val range1 = 1..10
    val range2 = 0 until 10
    val range3 = 5 downTo 1
    val range4 = 0..10 step 2
    showRange(range1)
    showRange(range2)
    showRange(range3)
    showRange(range4)
}

fun charRanges() {
    for (c in 'a'..'z') {
        print(c)
    }
    println()
}

fun stringRanges() {
    val s = "abc"
    for (i in 0..s.lastIndex) {
        print(s[i])
    }
    println()
}

fun repeatExample() {
    repeat(3) {
        println("repeat test $it")
    }
    println()
}

fun main() {
    numberRanges()
    charRanges()
    stringRanges()
    repeatExample()
}