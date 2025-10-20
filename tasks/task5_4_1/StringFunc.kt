fun String.tooLong(): Boolean {
    return this.length > 20
}

fun main() {
    print("Enter a String: ")
    val input = readln()
    if(input.tooLong()) {
        println("The String is too long.")
    } else{
        println("The stirng length is acceptable.")
    }
}