 import kotlin.random.Random

fun rollDie(sides: Int): Int {
    return Random.nextInt(1, sides + 1)
}

fun readInt(prompt: String): Int{
    print(prompt)
    return readln().toInt()
}

fun main(){
    val sides = readInt("Enter the number of sides for the die: ")
    println("Rolling a die with $sides sides...")

    println("Roll 1: ${rollDie(sides)}")
    println("Roll 2: ${rollDie(sides)}")
    println("Roll 3: ${rollDie(sides)}")
}