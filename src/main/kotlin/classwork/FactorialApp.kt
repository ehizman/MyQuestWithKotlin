package classwork

class FactorialApp {
    private var factorial : Int = 1
    fun findFactorialOf(number: Int): Int {

        for (i in number downTo 1){
            factorial = factorial * i
        }
        return (factorial)
    }
}
