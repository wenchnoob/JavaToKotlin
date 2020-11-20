package mykotlin

import java.io.BufferedOutputStream
import java.lang.System.out

fun main() {
    SysPrint().print()
    BufferedPrint().print()
}



interface Print {
    fun print(i : Int = 10000)
}

class SysPrint: Print {
    override fun print(i : Int) {
        for(j in 0..i) {
            println(j)
        }
    }
}

class BufferedPrint: Print {
    override  fun print(i: Int) {
        val bo = BufferedOutputStream(out)
        for(j in 0..i) bo.write(j)
    }
}

