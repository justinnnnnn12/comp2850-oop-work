import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class WordleTest : StringSpec(
    {

        // for isValid()
        "words that are valid should be 5 letters long" {
            isValid("APPLE") shouldBe (true)
            isValid("DOG") shouldBe (false)
            isValid("HELLO!") shouldBe (false)
        }

        "should read words from file and only keep valid ones" {
            val words = readWordList("data/words.txt")
            words.all { it.length == 5 } shouldBe true
        }

        "should pick a random word and remove it from the list" {
            val list = mutableListOf("APPLE", "BERRY", "CHAIR")
            val word = pickRandomWord(list)
            list.contains(word) shouldBe false
        }

        "should give correct letters 1 and others 0" {
            val result = evaluateGuess("APPLE", "APRON")
            result shouldBe listOf(1, 1, 0, 0, 0)
        }
    },
)
