package kata

class Kata {
    companion object{
        fun reverseNumber(number: Int): String {
            val numberToReverse : String = number.toString()
            var lastDigit : String = ""

            for (i in (numberToReverse.length-1) downTo 0){
                lastDigit = lastDigit +  numberToReverse[i]
            }
            return lastDigit
        }
    }
}

fun main(){
    print("Enter a number and get the reverse: ")
    val number : Int = readLine()!!.toInt()
    println("The reverse of $number is ${Kata.reverseNumber(number)}")
}
