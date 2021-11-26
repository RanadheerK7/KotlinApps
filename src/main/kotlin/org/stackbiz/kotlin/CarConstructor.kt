package org.stackbiz.kotlin

open class CarConstructor() {
    var type:String? = null
    var model:String? = null
    var color:String? = null
    var price:Double? = null
    var gearPattern:String? = null

    constructor(type:String, model:String, color:String, price:Double, gearPattern:String):this() {
        this.type = type
        this.model = model
        this.color = color
        this.price = price
        this.gearPattern = gearPattern
    }

    constructor(type:String, model:String, color:String, price:Double):this() {
        this.type = type
        this.model = model
        this.color = color
        this.price = price
    }

    fun getDiscountedPrice():Double {
        return this.price!! - (this.price!! * 0.1)
    }
}

fun main() {
    val car1 = CarConstructor("Audi", "2021", "Blue", 800000.0, "Automatic")
    println("Car type : ${car1.type}")
    println("Gear Pattern : ${car1.gearPattern}")
    println("Price : ${car1.getDiscountedPrice()}")

    val car2 = CarConstructor("Benz", "2021", "Blue", 1000000.0)
    println("Car type : ${car2.type}")
    println("Price : ${car2.getDiscountedPrice()}")
}