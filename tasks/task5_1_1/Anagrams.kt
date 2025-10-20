fun anagrams(str1: String, str2: String): Boolean {
    val s1 = str1.lowercase().filter { it.isLetterOrDigit() }.toCharArray().sorted()
    val s2 = str2.lowercase().filter { it.isLetterOrDigit() }.toCharArray().sorted()
    return s1 == s2
}

fun main() {
    print("Enter first string: ")
    val first = readln()
    print("Enter second string: ")
    val second = readln()

    if (anagrams(first, second)) {
        println("The strings are anagrams.")
    } else {
        println("The strings are NOT anagrams.")
    }
}