/**
 * Input a number, If the number is in the list show it with index number
 */
fun main() {

    val list = listOf(1,3,4,6,88,6)
    println("The list looks like as following $list")
    println("Search for the number : ")
    val userInput = readLine()?.toInt()

    if (userInput != null){
        // call the function
        println("The index of $userInput is ${indexof(list,userInput)}")
    }
}

/**
 * This function return the index of the list
 */
fun indexof(list : List<Int>, value : Int) : Int {

    for (i in 0 until list.size -1){
        if(list[i] == value){
            return i
        }
    }
    return -1
}