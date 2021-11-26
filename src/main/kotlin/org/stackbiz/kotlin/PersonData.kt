package org.stackbiz.kotlin

data class PersonData(val name:String, val age:Int, val gender:String)

fun main() {
    val person = PersonData("Aneesh", 27, "Male")
    println("Person Name: ${person.name}")
    println("Age: ${person.name}")
    println("Gender: ${person.gender}")
}