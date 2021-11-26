fun addNumbers(a:Double, b:Double) {
    val sum = a + b
    println("Sum: $sum")
}

fun sumNumbers(a:Double, b:Double):Double {
    return a + b
}

fun listOfWords(vararg names:String) {
    for (name in names) {
        println("name: $name")
    }
}

fun main() {
    addNumbers(10.0, 20.0)
    println("Sum: ${sumNumbers(30.0, 40.0)}")
    listOfWords(*arrayOf("Rohith", "Ranjith", "Mahesh"))
}