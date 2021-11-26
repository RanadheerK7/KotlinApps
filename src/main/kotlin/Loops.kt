fun main() {

    for (i in 0..10 step 2) {
        println("number: $i")
    }

    println("-------------------------")

    for (i in 10 downTo 0 step 2) {
        println("number: $i")
    }

    println("-------------While loop--------------")
    var i = 1
    while (i <= 10) {
        println("number: $i")
        i++
    }

    println("-------------Do While loop--------------")
    var j = 1
    do {
        println("number: $j") 
        j++
    } while (j <= 10)
}