// Implement the six required functions here

// constant for wordle settings
const val WORD_LENGTH = 5
const val MAX_ATTEMPTS = 10

fun isValid(word: String): Boolean = word.length == WORD_LENGTH && word.all { it.isLetter() }

fun readWordList(filename: String): MutableList<String> = File(filename)
    .readLines()
    .map { it.trim().uppercase() }
    .filter { isValid(it) }
    .toMutableList()

fun pickRandomWord(words: MutableList<String>): String {
    val index = (0 until words.size).random()
    return words.removeAt(index)
}

fun obtainGuess(attempt: Int): String {
    while (true) {
        print("Attempt $attempt\nEnter your guess: ")
        val guess = readln().trim().uppercase()

        if (isValid(guess)) {
            return guess
        } else {
            println("Invalid word! Please enter a word with exactly 5 letters.")
        }
    }
}

fun evaluateGuess(guess: String, target: String): List<Int> = guess.mapIndexed { i, c ->
    if (c == target[i]) 1 else 0
}

fun displayGuess(guess: String, matches: List<Int>) {
    for(i in guess.indices) {
        if(matches[i] == 1) {
            print(guess[i])
        } else {
            print('?')
        }
    }
    println()
}
