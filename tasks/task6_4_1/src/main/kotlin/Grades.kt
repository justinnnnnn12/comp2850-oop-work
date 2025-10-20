fun grades(mark: Int) = when (mark) {
    in 71..100 -> "Distinction"
    in 40..69  -> "Pass"
    in 0..39   -> "Fail"
    else       -> "Invalid"
}

fun displayGrades(marks: Map<String,Int>) {
    if (marks.isEmpty()) {
        println("No marks available")
    }
    else {
        for ((name, mark) in marks) {
            println("$name: ${grade(mark)}")
        }
    }
}
