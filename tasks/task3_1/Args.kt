import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size < 2) {
        println("Error: PLease supply at least 2 arguements")
        exitProcess(status = 1)
    }
    println(args[0])
    println(args[1])
    println(args[2])
}