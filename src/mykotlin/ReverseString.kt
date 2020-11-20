package mykotlin

fun main() {
    println(reverseString("apple"))
}

fun reverseString(s: String): String {
    if(s.length <= 1) return s
    return reverseString(s.substring(1, s.length)) + s[0]
}


// Nullable version of reverse string
fun reverseStringNullable(s: String?): String? {
    if(s.isNullOrBlank()) return null
    else {
        if(s.length <= 1) return s
        return reverseString(s.substring(1, s.length)) + s[0]
    }
}