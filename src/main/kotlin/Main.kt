

fun main() {
    // Call the function
printPow(2, 3)

}
// This function can calculate power of any number
fun printPow(base : Int, exponent : Int){
    var result = 1
    for(i in 1.. exponent){
        result *= base
    }
    println("$base to the power of $exponent is $result" )
}