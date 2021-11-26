package org.stackbiz.kotlin

class MotoX:Moto {
    var displayType:String? = null

    constructor(name:String, color:String, price:Double, displayType:String):super(name, color, price) {
        this.displayType = displayType
    }

    override fun makeCall() {
        println("Video call")
    }

    fun getMotoPrice():Double {
        return super.getPrice()
    }
}

fun main() {
    val motoX = MotoX("MotoX-V1", "Blue", 20000.0, "gorilla")
    motoX.setPrice(25000.0);
    println("Mobile name: ${motoX.name}")
    println("Color: ${motoX.getColor()}")
    println("Price: ${motoX.price}")
    println("Call type: ${motoX.makeCall()}")

    println("Moto Price: ${motoX.getMotoPrice()}")
}

