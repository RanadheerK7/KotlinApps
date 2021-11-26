fun main() {
    println("PETS APP")

    print("Enter number of Pets: ")
    val maxSize = readLine()!!.toInt()

    var listOfPets:Array<String> = Array(maxSize) {""}
    for (i in 0 until maxSize) {
        print("Enter Pet $i: ")
        listOfPets[i] = readLine()!!.toString()
    }

    println("Your Pets List: ")
    for (i in 0 until maxSize) {
        println("Pet $i : ${listOfPets[i]}")
    }
}