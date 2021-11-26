fun main() {
    print("Pick your menu: ")
    val foodId = readLine()!!.toInt()

    when (foodId) {
        1 -> {
            print("You got Sandwich")
        }
        10 -> {
            print("You got burger")
        }
        else -> {
            print("You did not order anything")
        }
    }

}