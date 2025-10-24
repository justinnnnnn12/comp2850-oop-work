// this function runs the entire game by connecting with wordle.kt 
import java.io.File

fun main() {
    val words = readWordList("data/words.txt") // load the possible list of words for Wordle
    val target = pickRandomWord(words) // select the secret word 
    var success = false // track is the player correctly guessed the word

    print("The word to guess is: $target\n") // for testing, displaying the targeted word
    println("Welcome to Wordle!")
    println("Guess the 5 letter word! You have 10 attempts\n")

    for(attempt in 1..MAX_ATTEMPTS) { // for loop to control the max number of attempts allowed
        val guess = obtainGuess(attempt)

        if (!isValid(guess)) {
            println("not a valid 5 letter word. Try again pls\n")
        }
        val result = evaluateGuess(guess, target)
        displayGuess(guess, result) //displays the guess and players guessed word

        if (result.all { it == 1 }) { // guessed the word
            println("Congratulations, you guessed it!\nThe word was $target")
            success = true
            break
        }
    }
    if (!success) { // ran out of attempts
        println("Great try! The word was $target")
    }
}
