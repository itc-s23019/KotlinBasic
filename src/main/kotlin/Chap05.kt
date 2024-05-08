package org.example

fun main(args: Array<String>) {
    val a : Char = 'き'
    val b : Char = 'い'
    val c : Char = 'ち'
    val message : String = "こんにちは, \n世界!"
    println(a)
    println(b)
    println(c)
    println(message)
    println("-----5.5-----")
    val a5 = "こんにちは"
    val b5 = "世界！"
    val message5 = a5 + b5
    println(message5)
    println("こんにちは, $b5")
    println("-----5.8-----")
    val h = '8'
    println("本日働いた時間は、${h}hours")
    val message3 = "このペースで一ヶ月働くと、${h}hours の労働になります"
    println(message3)

    println("-----5.9-----")
    val message12 = """|
    |こんにちは、世界！
    |私はKotlinに関して勉強しています。
    |Kotlinでは、とても簡潔なプログラムを書くことができます。
    |皆さん、一緒に楽しくプログラミングしましょう。
    """.trimMargin()
    println(message12)
}