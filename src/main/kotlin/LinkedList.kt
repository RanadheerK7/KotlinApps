import java.util.*

fun main() {
    var listOfPets = LinkedList<String>()

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

    if (listOfPets.contains("cat")) {
        print("You are eligible for best discount because you have a cat in your list")
    }
}