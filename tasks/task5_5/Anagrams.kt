infix fun String.anagramOf(other: String): Boolean{

    val firstClean = this.replace(" ", ""). lowercase()
    val secondClean = other.replace(" ","").lowercase()

    return firstClean.toCharArray().sorted() == secondClean.toCharArray().sorted()
}

fun main(){
    println("Let's check if two words or phrases are anagrams!")

    print("Enter the first word or phrase: ")
    val first = readln()

    print("Enter the second word or phrase: ")
    val second = readln()

    if (second anagramOf first) {
        println("✅ \"$first\" and \"$second\" are anagrams!")
    } else {
        println("❌ \"$first\" and \"$second\" are not anagrams.")
    }
}