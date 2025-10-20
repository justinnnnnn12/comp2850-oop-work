fun main(){
    print("Enter the upper limit: ")
    val limit = readln().toInt()

    var sum: Long = 0
    for (n in 1..limit step 2){
        sum += n
    }

    println("The sum of all odd integers between 1 and $limit is: $sum")
}