package org.example

fun main(args: Array<String>) {
    run {
        val answer: Int = getThreeTimes(5)
        println(answer)
    }
    run {
        val answer: Int = getTimes(2, 3)
        println(answer)
    }
    run {
        val answer = getTimes(2, 3,  4)
        println("変数 answer の値$answer")
    }
    run {
        val answer = printTimes(2, 3,  4)
        println("変数 answer の値$answer")
    }
    run {
        println("-----21.14-----")
        printTimes(2,3 )
        printTimes(5, 10, 20)
        printTimes(1, 10, 100, 1000)
        printTimes(2, 2, 2, 2, 2, 2, 2, 2)
    }
}


fun getThreeTimes(value: Int) = value * 3

fun getTimes(x: Int, y: Int) = x * y

fun getTimes(x: Int, y: Int, z: Int) {
    println("-------------------------------------------------")
    println("パラメーターとして$x と $y と $z　を受け取りました")
    println("これらのあたいを全部掛け算した答えは ${x * y *z}です")
    println("-------------------------------------------------")
}

fun printTimes(x: Int, y: Int, z: Int) {
    println("-------------------------------------------------")
    println("パラメーターとして$x と $y と $z　を受け取りました")
    println("これらのあたいを全部掛け算した答えは ${x * y *z}です")
    println("-------------------------------------------------")
}

fun printTimes(vararg numbers: Int) {
    var result = 1
    for (x in numbers) {
        result *= x
    }
    println("すべての数値を掛け算した結果:$result")
}