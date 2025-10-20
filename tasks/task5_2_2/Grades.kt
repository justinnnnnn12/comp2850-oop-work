fun grade(mark: Int): String =
    if (mark <40) "Fail"
    else if (mark <70) "Pass"
    else "Distinction"

fun main(args: Array<String>){
    for (arg in args){
        val mark = arg.toInt()
        println("$mark is a ${grade(mark)}")
    }
}
