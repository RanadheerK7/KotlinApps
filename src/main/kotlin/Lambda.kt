val add = {num1:Int, num2:Int -> num1 + num2 }

fun main() {
    println("Sum : ${add(10, 20)}")

    val numberList = listOf(10, 20, 30, 40, 50)
    numberList.forEach {number -> println(number)}
}