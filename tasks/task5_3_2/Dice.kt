import kotlin.random.Random

fun rollDice(sides: Int = 6, dice: Int = 1): Int {
    var total = 0
    for (i in 1..dice) {
        total += Random.nextInt(1, sides + 1)
    }
    return total
}

fun main() {
    // Using defaults
    println("Default roll (1d6): ${rollDice()}")

    // Positional arguments
    println("Roll a d10 (1d10): ${rollDice(10)}")
    println("Roll 3d6: ${rollDice(6, 3)}")

    // Named arguments
    println("Roll 5d8: ${rollDice(sides=8, dice=5)}")
    println("Roll 2d20: ${rollDice(dice=2, sides=20)}")

    // Mixing defaults + named
    println("Roll 4d6 with default sides: ${rollDice(dice=4)}")
}
