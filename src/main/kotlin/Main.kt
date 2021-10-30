

fun main() {

// print a range of number in reverse order
   var myList = mutableListOf<Int>()
    println("Please enter 5 numbers")
    for(i in 1..5){

        var x = readLine()?.toInt()
        if (x != null){
            myList.add(x)
        }
    }
    println("The 5 numbers in reverse order")
        for(i in myList.size - 1 downTo 0)

    println(myList[i])
}