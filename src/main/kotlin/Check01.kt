package org.example

fun main(args: Array<String>) {
    val score = readln().toInt()
    //　成績判定
    //　0  ~ 59  は D
    //　60 ~ 69  は C
    //　70 ~ 79  は B
    //  80 ~ 89  は A
    //  90 ~ 100 は S
    //　それ以外は「エラー」と出力
println("-----パターン１-----")
    val yourscore = when (score){
        in  0 .. 59 -> "D"
        in 60 .. 69 -> "C"
        in 70 .. 79  -> "B"
        in 80 .. 89  -> "A"
        in 90 .. 100 -> "S"
        else -> "エラーです"
    }
    println(yourscore)



println("-----パターン２-----")
    if (score < 0 || score > 100) {
        println("エラー")
    } else if (score < 60) {
        println("D")
    } else if (score <70) {
        println("C")
    } else if (score <80) {
        println("B")
    } else if (score <90) {
        println("A")
    } else {
        println("S")
    }


println("-----パターン３-----")



//
//    if (score in 0 .. 59) {
//        println("Dです")
//    }else if (score in 60 .. 69) {
//        println("Cです")
//    }else if (score in 70 .. 79 ) {
//        println("Bです")
//    }else if (score in 80 .. 89) {
//        println("Aです")
//    }else if (score in 90 .. 100) {
//        println("Sです")
//    }else {
//        println("エラーです")
//    }
}