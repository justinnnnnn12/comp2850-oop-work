import java.io.File

// constant for wordle settings
const val WORD_LENGTH = 5 
const val MAX_ATTEMPTS = 10

// check if the given word meets the game's length 
fun isValid(word: String): Boolean =
     word.length == WORD_LENGTH && word.all { it.isLetter() }

// reads the list of words from a file, convert to uppercases and filters out invalid entries
fun readWordList(filename: String): MutableList<String> = File(filename)
    .readLines()
    .map { it.trim().uppercase() }
    .filter { isValid(it) }
    .toMutableList()

// selects a random word from the list as a target word for wordle
fun pickRandomWord(words: MutableList<String>): String {
    val index = (0 until words.size).random()
    return words.removeAt(index) // remove the word from the list upon selection to avoid potential re-use
}

// gets the users guessed word
fun obtainGuess(attempt: Int): String {
    while (true) {
        print("Attempt $attempt\nEnter your guess: ")
        val guess = readln().trim().uppercase()

        if (isValid(guess)) { //ensure the input word is valid
            return guess
        } else {
            println("Invalid word! Please enter a word with exactly 5 letters.")
        }
    }
}

// compares the guess against the target word, then give results (1 for perfect match, 0 for other cases)
fun evaluateGuess(guess: String, target: String): List<Int> = guess.mapIndexed { i, c ->
    if (c == target[i]) 1 
        else 0 // logic to check if the character matches the target at the same index
}

// displays the result of the guess based on the given results from evaluateGuess
fun displayGuess(guess: String, matches: List<Int>) {
    for(i in guess.indices) {
        if(matches[i] == 1) {
            print(guess[i]) // prints the letter for perfect matches
        } else {
            print('?') // prints questionmark for all non-perfect matches
        }
    }
    println()
}
