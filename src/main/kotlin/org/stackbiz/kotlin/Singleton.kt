package org.stackbiz.kotlin

class Singleton {
    var name: String? = null

    private constructor() {
        println("Instance is created")
    }

    companion object {
        val instance : Singleton by lazy { Singleton() }
    }

}

fun main() {
    var s1 = Singleton.instance
    s1.name = "Kalyan"
    println("Name: ${s1.name}")

    var s2 = Singleton.instance
    println("Name: ${s2.name}")

    var s3 = Singleton.instance
    println("Name: ${s3.name}")
}