package org.stackbiz.kotlin

fun main() {
    try {
        print("Enter Number: ")
        var number = readLine()!!.toInt()
        val quotient = 100 / number
        println("100/$number = $quotient")
    } catch (e:ArithmeticException) {
        println(e.message)
    }

}