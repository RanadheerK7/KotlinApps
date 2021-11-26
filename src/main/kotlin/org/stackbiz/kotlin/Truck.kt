package org.stackbiz.kotlin

class Truck:CarConstructor {
    var subType:String? = null

    constructor(type:String, model:String, color:String, price:Double, gearPattern:String, subType:String):
            super(type, model, color, price, gearPattern) {
                this.subType = subType
            }

    fun getTruckGearPattern():String {
        return super.gearPattern!!
    }
}

fun main() {
    val truck = Truck("Audi", "2021", "Blue", 800000.0, "Automatic", "Dump")
    println("Truck Type : ${truck.subType}")
}