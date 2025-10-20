fun main(){
    val fruits = mutableListOf("apple", "banana", "cherry")
    println("Initial list: $fruits")

    fruits.add("date")
    println("after add(): $fruits")

    fruits.add(1, "blueberry")
    println("after add(index, element): $fruits")

    fruits.addAll(listOf("elderberry", "fig"))
    println("after addAll(): $fruits")

    fruits.remove("banana")
    println("after remove: $fruits")

    fruits.removeAt(0)
    println("after reoveAt(): $fruits")

    fruits[0] = "blueberry"
    println("after replacing an element: $fruits")

    fruits.clear()
    println("after clear(): $fruits")
}