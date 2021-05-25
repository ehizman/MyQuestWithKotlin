package isPalindromeApp
import kotlin.math.pow

class Palindrome {
    fun isPalindrome(number: Int ):Boolean{
        val powerOfTen = 1
        var unitDigit  = number % 10
        var restOfNumber = number / 10
        var reversedNumber: Int = unitDigit

        while (restOfNumber != 0) {
            unitDigit = restOfNumber % 10
            println(restOfNumber)
            reversedNumber = (reversedNumber * (10.0.pow(powerOfTen))).toInt()
            reversedNumber += unitDigit
            restOfNumber /= 10
        }
        println(reversedNumber)
        return reversedNumber == number
    }
}
