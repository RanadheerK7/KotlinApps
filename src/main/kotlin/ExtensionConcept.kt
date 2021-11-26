fun ArrayList<Int>.findMax():Int {
    var max = 0;
    for (number in this) {
        if (number > max) {
            max = number
        }
    }
    return max
}

fun main() {
    val numberList = ArrayList<Int>()
    numberList.add(40)
    numberList.add(50)
    numberList.add(20)
    numberList.add(10)
    numberList.add(30)
    for (number in numberList) {
        println("Number: $number")
    }

    println("Max Element: ${numberList.findMax()}")
}