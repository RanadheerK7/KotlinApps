package org.stackbiz.kotlin

/*
* This program involves
* Class and Object
* Constructor
* Access modifiers
* Setters and Getters
* Runtime polymorphism(Overriding concept)
* */
open class Moto {
    var name:String? = null
    private var color:String? = null
    var price:Double? = null

    constructor(name:String, color:String, price:Double) {
        this.name = name
        this.color = color
        this.price = price
    }

    fun setPrice(price:Double) {
        this.price = price
    }

    fun getPrice():Double {
        return this.price!!
    }

    fun getColor():String {
        return this.color!!
    }

    open fun makeCall() {
        println("Audio call")
    }

    fun playGame() {
        println("Game mode!")
    }
}