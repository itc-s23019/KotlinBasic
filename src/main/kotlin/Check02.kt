package org.example

import kotlin.random.Random
import kotlin.random.nextUInt

fun main(args: Array<String>) {
    print("1:グー、2:チョキ、3:パーを選んでください")
    //入力は1,2,3ですが、0,1,2となるように工夫してください
    // CPUの手をランダムで決める
    //0.1.2のどれかになる
    //勝敗判定
     //勝敗の結果表示(プレイヤー視点)
    //勝ち
    //負け
    //あいこ
    val player = readln().toInt()
    val cpu = Random.nextInt(0, 3)



    val diff = (player - cpu + 3) % 3
    val judge = when (diff) {
        0 -> "あいこ"
        1 -> "まけ"
        2 -> "かち"
        else -> "?"
    }

    println("CPU: ${cpu + 1} ---$judge")
}