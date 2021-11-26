package org.stackbiz.kotlin

import java.util.*
import kotlin.collections.ArrayList

class Person(val name:String, val age:Int):Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return this.age - other.age
    }
}

fun main() {
    val listOfPersons = ArrayList<Person>()
    listOfPersons.add(Person("Aneesh", 27))
    listOfPersons.add(Person("Mahipal", 26))
    listOfPersons.add(Person("Kalyan", 28))
    listOfPersons.add(Person("Rohith", 25))
    listOfPersons.add(Person("Ranjith", 29))

    println("----------Before Sort---------")
    for (person in listOfPersons) {
        println(person.name)
        println(person.age)
    }

    listOfPersons.sort()

    println("----------After Sort---------")
    for (person in listOfPersons) {
        println(person.name)
        println(person.age)
    }

}