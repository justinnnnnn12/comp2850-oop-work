fun main() {
    val words = readWordList("data/words.txt")
    val target = pickRandomWord(words)
    var success = false

    print("The word to guess is: $target\n")
    println("Welcome to Wordle!")
    println("Guess the 5 letter word!")

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
if (!success) {
    println("Great try! The word was $target")
} 
}


