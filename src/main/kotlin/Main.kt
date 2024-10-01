package kotlin

import java.sql.DriverManager.println

class Main {
    fun main(args: Array<String>) {
        println("Hello World!")
        println("Program arguments: ${args.joinToString()}")
    }
}

private fun Array.joinToString(): String {
    TODO("Not yet implemented")
}
