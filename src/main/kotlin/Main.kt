

fun main() {

    println("Please enter your Country name: ")

    val origin = readLine()?.toString()?.uppercase()
    if (origin != null) {
        when (origin) {
        "INDIA" -> println("YOU ARE 'INDIAN'")
            "USA" -> println("You are from the 'USA'")
            "ENGLAND" -> println("You are from the 'ENGLISH'")
            else  -> println("You are not in listed")
        }
    }
}