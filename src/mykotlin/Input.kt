package mykotlin

import java.io.BufferedInputStream
import java.io.InputStream
import java.lang.StringBuilder

fun main() {
    val reader = Reader(System.`in`);

    println(reader.readLine())
    println(reader.readInt())
    reader.close()
}

class Reader(private val stream: InputStream) {
    val reader = BufferedInputStream(stream)

    fun readLine(): String {
        val line = StringBuilder()
        var readChar: Int? = null
        do {
            readChar = reader.read()
            line.append(Character.toChars(readChar))
        } while(readChar != 10)

        return line.toString()
    }

    fun readInt(): Int {
        val line = StringBuilder()
        var readChar: Int? = null

        var found = false
        var end = false

        do {
            readChar = reader.read()

            if (Character.isDigit(readChar.toChar())) {
                found = true
                line.append(readChar.toChar())
            } else if (!Character.isDigit(readChar.toChar()) && found) {
                end = true
            }

        } while(readChar != 10 && !end)

        return Integer.parseInt(line.toString())
    }

    fun close() {
        reader.close()
    }
}