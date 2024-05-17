package org.example

fun main(args: Array<String>) {
    // 横は 9 ⇢　1、　横は 1 ⇢ 9 の掛け算表を表示してください。
    val x = 9 downTo 1
    val y = 1 .. 9

    print("  ")
    for (xi in x) {
        print("$xi ")
    }
    println()
    //掛け算をだす
    for (yi in y) {
        print("$yi ")

    }

}