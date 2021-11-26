package org.stackbiz.kotlin

class Car(val type:String, val model:String, val price:Double, val driverName:String) {
    init {
        println("Class Object Created")
    }

    fun getDiscountedPrice():Double {
        return this.price - (this.price * 0.1)
    }
}

fun main() {
    /*val car1 = Car("Toyota", "2021", 500000.0, "Uday")
    println(car1.type)
    println(car1.model)
    println(car1.driverName)
    println("Car Price : ${car1.getDiscountedPrice()}")

    val car2 = Car("Audi", "2021", 1000000.0, "Aneesh")
    println(car2.type)
    println(car2.model)
    println(car2.driverName)
    println("Car Price : ${car2.getDiscountedPrice()}")*/

    val listOfCars = arrayListOf<Car>()
    listOfCars.add(Car("Toyota", "2021", 500000.0, "Uday"))
    listOfCars.add(Car("Audi", "2021", 800000.0, "Aneesh"))
    for (car in listOfCars) {
        println("--------------")
        println(car.type)
        println(car.getDiscountedPrice())
    }


}