package org.example.chap26

import java.time.LocalDate
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val book = Book(
        "やさしい Kotlin 入門", "野崎 英一",
        LocalDate.of(2018, 5, 10),
        RentalInfo(
            "たけし", LocalDateTime.now(),
            LocalDateTime.of(2024, 5, 31, 0, 0)
        )
    )
}

class Book(
    val title: String,
    val author: String,
    val releaseDate: LocalDate,
    val rentalInfo: RentalInfo
) {
    fun printInfo() {
        println("""
            ---------------------
            $title
            $releaseDate 初版
            著者 $author
            ----------------------
            貸出情報
            ----------------------
            借りてるユーザー:${rentalInfo}
            借りた日:${rentalInfo.rentalDate}
            返却期限:${rentalInfo.returnDeadline}
        """.trimIndent())
    }
}
class RentalInfo(
    val userName: String,
    val rentalDate: LocalDateTime,
    val returnDeadline: LocalDateTime
)