package chapterFour

import kotlin.math.pow

fun main(args: Array<String>){
    print("Enter a binary number: ")
    val binaryNumber = readLine()!!
    var decimalNumber : Int = 0;
    var binaryNumber_Mirror =  binaryNumber.toInt()
    var lastDigit : Int

    for (i in binaryNumber.indices){
        lastDigit = binaryNumber_Mirror % 10
        binaryNumber_Mirror = binaryNumber_Mirror / 10

        decimalNumber = decimalNumber + (lastDigit * 2.0.pow(i.toDouble()).toInt())
    }

    println("The decimal equivalent of $binaryNumber is $decimalNumber")

}