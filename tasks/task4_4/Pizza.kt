fun main(){
    println("Pizza Menu\n")
    println("(a) Margherita")
    println("(b) Stagioni")
    println("(c) Seafood")
    println("(d) Hawaiian\n")

    var choice: String

    do {
        print("Choose your pizza (a-d): ")
        choice = readln().lowercase()

        if (choice.length == 1 && choice[0] in 'a'..'d'){
            println("order accepted")
        } else {
            println("Invalid choice! Please try again.")
        }
    } while (choice.length != 1 || choice[0] !in 'a'..'d')
}