fun main() {
    val immutableList = listOf("Kalyan", "Aneesh", "Mahipal")
    //immutableList[0] = "Ranjith"
    for (name in immutableList) {
        println(name)
    }

    println("----------MUTABLE LIST-----------")
    val mutableList = mutableListOf("Ranjith", "Rohith", "Kalyan")
    mutableList[2] = "Mahesh"
    for (name in mutableList) {
        println(name)
    }

    val cityList = mapOf(1 to "Hyderabad", 2 to "Ranchi") //Immutable
    val countryList = mutableMapOf(1 to "India", 2 to "USA") //Mutable

}