package mykotlin


fun main() {
    val binary10 = "1010" // should be ten
    val binary5 = "101" // should be five
    val binary12 = "1100" // should be 12
    val binaryBig = "111111010101010101111111"

    println(binaryToDecimal(binaryBig, 0))

}

fun binaryToDecimal(bin: String, depth: Int): Int {
    if (bin.isEmpty()) return 0
    return (Math.pow(2.0, depth.toDouble()) * Integer.parseInt(bin.last().toString()) + binaryToDecimal(bin.dropLast(1), depth + 1)).toInt()
}