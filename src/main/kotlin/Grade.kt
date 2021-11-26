fun main() {
    print("Enter your marks: ")
    val marks = readLine()!!.toInt()

    when {
        marks > 90 -> println("Grade A")
        marks in 80..89 -> println("Grade B")
        marks in 70..79 -> println("Grade C")
        else -> println("Grade D")
    }
}