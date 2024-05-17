package org.example

fun main(args: Array<String>) {

    println("-----16.1-----")
    val a: IntArray = intArrayOf(1000, 1200, 1500, 1800, 2400)
    println("1年目の時給は ${a[0]}円です")
    println("2年目の時給は ${a[1]}円です")
    println("3年目の時給は ${a[2]}円です")
    println("4年目の時給は ${a[3]}円です")
    println("5年目の時給は ${a[4]}円です")

    println("-----16.3-----")
    for (i in 0 .. 4) {
        println("${i + 1} 年目の時給は ${a[i]}円です。")
    }

    println("-----16.3-----")
    val a4: IntArray = intArrayOf(
        1000, 1200, 1500, 1800, 2400, 3000, 3800
    )
    for (i in 0 .. 4) {
        println("${i + 1} 年目の時給は ${a4[i]} 円です")
    }

    println("-----16.5-----")
    for(i in 0 .. a.count()) {
        println("${i + 1} 年目の時給は ${a4[i]} 円です")
    }
}