import kotlin.random.Random

fun rollDie(sides: Int = 6): Int {
    return Random.nextInt(1, sides + 1)
}

fun main() {
    println("Rolling without arguments (default d6): ${rollDie()}")
    println("Rolling a d6 explicitly: ${rollDie(6)}")
    println("Rolling a d10: ${rollDie(10)}")
    println("Rolling a d20: ${rollDie(20)}")
}
