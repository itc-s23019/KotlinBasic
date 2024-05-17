package org.example

fun main(args: Array<String>) {
    if (args.size == 0) {
        println("Please provide aname as a command-line argument")
        return
    }
    println("Hello, ${args[0]}!")
}