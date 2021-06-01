class LargestAndSmallest {

}
fun main(){
    var largest : Int = 0
    var smallest : Int = 0
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