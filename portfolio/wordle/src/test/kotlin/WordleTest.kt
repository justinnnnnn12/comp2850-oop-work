import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class WordleTest : StringSpec(
    {

        // test cases for isValid()

        "words that are valid should be 5 letters long" {
            isValid("APPLE") shouldBe (true)
            isValid("DOG") shouldBe (false)
            isValid("HELLO!") shouldBe (false)
        }

        // test cases for readWordList()
        //proving the filtering logic within readWordList works correctly
        
        "should read words from file and only keep valid ones" {
            val words = readWordList("data/words.txt")
            words.all { it.length == 5 } shouldBe true 
        }

        // test cases for the pickRandomWord()
        "should pick a random word and remove it from the list" {
            val list = mutableListOf("APPLE", "BERRY", "CHAIR") //creates a mutable list for testing
            val word = pickRandomWord(list) // calls the function to select and remove a word
            list.contains(word) shouldBe false
        }

        // test cases for the evaluateGuess()
        "should give correct letters 1 and others 0" {
            val result = evaluateGuess("APPLE", "APRON") // Evaluates the guess "APPLE" against the target "APRON"
            result shouldBe listOf(1, 1, 0, 0, 0)
        }
    },
)
