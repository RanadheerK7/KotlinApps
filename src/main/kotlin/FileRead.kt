import java.io.FileReader
import java.io.FileWriter

fun main() {
    print("Choose an option 1.Write 2.Read: ")
    val choice = readLine()!!.toInt()
    when(choice) {
        1 -> {
            print("Enter text here: ")
            val str = readLine()!!.toString()
            writeToFile(str)
        }
        2 -> {
            readFromFile()
        }
    }
}

fun writeToFile(str:String) {
    try {
        val file1 = FileWriter("file.txt",true)
        file1.write(str +"\n")
        println("Text is written to the file")
        file1.close()
    } catch (ex:Exception) {
        println(ex.message)
    }
}

fun readFromFile() {
    try {
        val file1 = FileReader("file.txt")
        var c:Int?
        do {
            c = file1.read()
            print(c.toChar())
        } while (c != -1)
    } catch (ex:Exception) {
        println(ex.message)
    }

}