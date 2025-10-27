fun readData(): List<Double> = buildList {
    println("Enter numbers one by one (type 'done' when finished):")
    while (true) {
        print("> ")
        val input = readln().trim()
        if (input.lowercase() == "done") break
        val number = input.toDoubleOrNull()
        if (number != null) add(number)
        else println("⚠️ Please enter a valid number or 'done'.")
    }
}

fun computeMedian(data: List<Double>): Double {
    if (data.isEmpty()) return Double.NaN
    val sorted = data.sorted()
    val mid = sorted.size / 2
    return if (sorted.size % 2 == 0)
        (sorted[mid - 1] + sorted[mid]) / 2.0
    else
        sorted[mid]
}

fun displayStats(data: List<Double>) {
    if (data.isEmpty()) {
        println("No data to analyze.")
        return
    }

    println("\n📊 Statistics:")
    println("Minimum: ${data.minOrNull()}")
    println("Maximum: ${data.maxOrNull()}")
    println("Mean: ${"%.2f".format(data.average())}")
    println("Median: ${"%.2f".format(computeMedian(data))}")
}

fun main() {
    val data = readData()
    displayStats(data)
}
