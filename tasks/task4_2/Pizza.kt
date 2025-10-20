fun main(){
    println("Pizza Menu\n")
    println("(a) Margherita")
    println("(b) Quattro Stagioni")
    println("(c) Seafood")
    println("(d) Hawaiian\n")

    print("Choose your pizza (a-d): ")
    val choice = readln().lowercase()

    val result = if (choice.length == 1 && choice[0] in 'a'..'d'){
        "order accepted"
    } else{
        "Invalid choice!"
    }

    println(result)
}