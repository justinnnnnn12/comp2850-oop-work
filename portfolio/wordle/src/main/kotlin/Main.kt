fun main() {
    val words = readWordList("data/words.txt")
    val target = pickRandomWord(words)
    var success = false

    println("Welcome to Wordle!")
    println("Try to guess the 5-letter word!")

    for(attempt in 1..10) {
        val guess = obtainGuess(attempt)
        val result = evaluateGuess(guess, target)
        displayGuess(guess, result)

        if (result.all { it == 1}) {
            println("you guesses it! The word was $target")
            success = true
            break
        }
    }
}
if (!sucess) println("Out of attempts! The word was $target")
