import kotlin.math.roundToInt

fun main(args: Array<String>) {
    // Check for exactly 3 command line arguments
    if (args.size != 3) {
        println("Error: Please provide exactly three marks as command line arguments.")
        return
    }

    try {
        // Convert arguments to integers
        val marks = args.map { it.toInt() }

        // Validate marks are between 0 and 100
        if (marks.any { it !in 0..100 }) {
            println("Error: Each mark must be between 0 and 100.")
            return
        }

        // Calculate average (equally weighted), round to nearest integer
        val average = marks.average().roundToInt()

        // Determine grade using when expression
        val grade = when (average) {
            in 70..100 -> "Distinction"
            in 40..69 -> "Pass"
            in 0..39 -> "Fail"
            else -> "Invalid" // Should never happen if marks are 0–100
        }

        // Print result
        println("Average mark: $average")
        println("Grade: $grade")

    } catch (e: NumberFormatException) {
        println("Error: All arguments must be valid integers.")
    }
}