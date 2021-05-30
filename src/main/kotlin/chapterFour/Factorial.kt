package chapterFour
import java.util.*

class Factorial {
    private var factorial : Int = 1
    fun calculateFactorial(number: Int) : Int{
        var number: Int = number
        this.factorial = 1
        while (number >= 1){
            factorial = factorial * number
            number--
        }
        return factorial
    }
}

fun main (){
    val number: Int
    val collector = Scanner(System.`in`)
    val calculator = Factorial()

    print("Enter number to calculate factorial: ")
    number = collector.nextInt()

    println("The factorial of $number is ${calculator.calculateFactorial(number)}")
}