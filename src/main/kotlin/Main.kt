

fun main() {


   var myArray = arrayOf(2,3,5,2,9)
    var max :Int = 0
    for(item in myArray){

            max += item
        }
    var average = max / myArray.size

    println("Maximum Value is:  $max")
    println("Average value is: $average")
}