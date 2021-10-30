

fun main() {
    // call the function
sumUpToN(6)

}

/**
 * This function can sum up to the given number
 */
fun sumUpToN(n : Int){
    var result = 0
    for (i in 1..n){
        result += i
    }
    println("The sum of the value of 1 to $n is : $result")
}