import java.util.*
import kotlin.collections.HashMap

fun main() {
    var listOfUsers = HashMap<String, LinkedList<String>>()

    while (true) {
        print("Enter your name or quit to exit: ")
        val name = readLine()!!.toString()

        if (name == "quit") {
            break
        }

        print("Where you live: ")
        val city = readLine()!!.toString()

        val petsList = LinkedList<String>()
        do {
            print("Enter pet name or next: ")
            var petName = readLine()!!.toString()
            if (petName != "next") {
                petsList.add(petName)
            }
        } while (petName != "next")

        listOfUsers["$name:$city"] = petsList
    }

    println("-----------Users Information----------")
    for (key in listOfUsers.keys) {
        println("User name and city: $key")
        val listOfPets = listOfUsers[key]!!
        for (pet in listOfPets) {
            println("PetName: $pet")
        }
    }
}