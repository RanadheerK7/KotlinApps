import java.util.*

fun main() {
   /* print("Enter Year of birth: ")
    val yearOfBirth:Int = readLine()!!.toInt()
    val yearInDevice = Calendar.getInstance().get(Calendar.YEAR)

    val currentAge = yearInDevice - yearOfBirth
    println("Your age is $currentAge years")*/

    val name:String? = null
    println("${name?.length}")

    name?.let {
        println("${name.length}")
    }

    val len = name?.length?:-1
    println(len)

    println("${name!!.length}")

}