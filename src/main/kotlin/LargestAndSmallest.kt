class LargestAndSmallest {

}
fun main(){
    var largest : Int = Int.MIN_VALUE
    var smallest : Int = Int.MAX_VALUE
    var currentInput : Int = 0
    println("This application takes in 10 numbers as input and then displays the largest and smallest")

    for (i in 1 .. 10){
        print("Enter number $i: ")
        currentInput = readLine()!!.toInt()
        largest = currentInput.coerceAtLeast(largest)
        smallest = currentInput.coerceAtMost(smallest)
    }

    println("The largest is $largest and the smallest is $smallest")
}