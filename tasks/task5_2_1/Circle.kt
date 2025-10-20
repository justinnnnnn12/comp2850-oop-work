fun circleArea(radius: Double): Double = Math.PI * radius * radius

fun circlePerimeter(radius: Double): Double = 2 * Math.PI * radius

fun readDouble(prompt: String): Double{
    print(prompt)
    return readln().toDouble()
}
fun main(){
    val radius = readDouble("Enter the circle radius: ")

    val area = circleArea(radius)
    val perimeter = circlePerimeter(radius)

    println("Area = %.4f".format(area))
    println("Perimeter = %.4f".format(perimeter))


}