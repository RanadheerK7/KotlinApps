fun main() {
    val sentence = " Welcome To My World"
    val message = "This is someone"

    val fullMessage = "$sentence,$message"
    println("Concatenated Message : $fullMessage")

    println("${sentence.trim()}")

    println("${sentence.toUpperCase()}")

    println("${sentence.toLowerCase()}")

    println("First letter: ${sentence[1]}")

    for (i in 0..sentence.length-1) {
        println("${sentence[i]}")
    }

    val words = message.split(" ")
    for (word in words) {
        if (word.contains("is") || word.contains("this")) {
            print("$word ")
        }
    }
}