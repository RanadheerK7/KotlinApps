fun main() {
    var listOfPets = ArrayList<String>()

    do {
        print("Enter pet name or quit to exit: ")
        val petName = readLine()!!.toString()
        if (petName != "quit") {
            listOfPets.add(petName)
        }
    } while (petName != "quit")

    println("Your pets are:")
    for (pet in listOfPets) {
        println("Pet: $pet")
    }
}