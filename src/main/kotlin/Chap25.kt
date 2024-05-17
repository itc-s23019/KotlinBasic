package org.example.chap25

fun main(args: Array<String>) {
    run {
        println("-----25.2-----")
        val p = Person("きいち", 19 /*"ドライブ", "Mr'sGreenAppleのMagic"*/)
        p.greet()
    }
//    run {
//    val p2 = Person2("ドライブ", "Mr'sGreenAppleのmagic")
//    p2.greet2()
//    }
    run {
        println("-----25.5-----")
        val p = Person2(name = "たけし", age = 5)
        p.greet()
    }
    run {
        println("-----25.6-----")
        val p = Person2(age = 19, name = "きいち")
        p.greet()
    }
    run {
        println("-----25.6.1-----")
        val p = Person2(name = "たけし")
    }
    run {
        println("-----25.6.2-----")
        val p = Person2(age = 20)
    }
    run {
        println("-----25.7--------")
        val p1 = Person7()
        val p2 = Person7("たけし")
        val p3 = Person7(age = 20)
        p1.greet()
        p2.greet()
        p3.greet()
    }
    run {
        println("-----25.8--------")
        val p1 = Person8("たけし",7)
        val p2 = Person8(name = "たけし", age = 7)
        val p3 = Person8(age = 7, name = "たけし")
        p1.greet()
        p2.greet()
        p3.greet()
    }
    run {
        println("-----25.9----")
        val p1 = Person9("たけし", 7)
    }
}

class Person(var name: String = "", var age: Int = 0, /*var syumi: String = "", var music: String = "" */) {
    fun greet() {
        println("私の名前は${name}です。${age}歳です。")
//        println("最近の趣味は${syumi}です。よく${music}を聞きます")
    }
}
//class Person2(var syumi: String = "", var music: String = "") {
//    fun greet2() {
//        println("私の趣味は${syumi}です, 最近の好きな曲は${music}です。")
//    }
//}
class Person2(var name: String = "", var age: Int = 0) {
    fun greet() {
        println("私の名前は${name}です。${age}歳です。")
    }
}
class Person7(var name: String = "名無しさん", var age: Int = 20) {
    fun greet() {
        println("${name}です。${age}です。")
    }
}
class Person8(val name: String, var age: Int) {
    fun greet() {
        println("${name}です。${age}歳です。")
    }
}
class Person9(val name: String, var age: Int) {
    init {
        println("コンストラクタのイニシャライザが呼ばれました。")
        greet()
    }
    fun greet() {
        println("${name}です。${age}歳です")
    }
}
