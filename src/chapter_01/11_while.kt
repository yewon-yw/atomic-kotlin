package chapter_01

fun main() {
    print("while: ")
    whileLoop()
    println()
    print("do-while: ")
    doWhileLoop()
}

fun whileLoop() {
    var i = 0
    while (i < 100) {
        print('.')
        i += 10
    }
}

fun doWhileLoop() {
    var i = 0
    do {
        print('.')
        i += 10
    } while (i < 100)
}

