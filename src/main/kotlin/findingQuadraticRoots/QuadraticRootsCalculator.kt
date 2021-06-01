package findingQuadraticRoots

import kotlin.math.pow
import kotlin.math.sqrt

class QuadraticRootsCalculator {
    fun findRoots(coefficientOf_A: Int, coefficientOf_B: Int, coefficientOf_C: Int): Array<Double> {
        val determinantOfQuadraticEquation : Double = coefficientOf_B.toDouble().pow(2.0) - (4 * coefficientOf_A *
                coefficientOf_C)

        if (determinantOfQuadraticEquation < 0.0){
            println("This quadratic equation has no real roots")
            return arrayOf(0.0, 0.0)
        }
        else{
            val firstRoot = Math.round((-(coefficientOf_B) + sqrt(determinantOfQuadraticEquation))/(2 * coefficientOf_A *
                    coefficientOf_C) * 1000.0) / 1000.0
            val secondRoot = Math.round((-(coefficientOf_B) - sqrt(determinantOfQuadraticEquation))/(2 * coefficientOf_A *
                    coefficientOf_C) * 1000.0) / 1000.0
            return arrayOf(firstRoot, secondRoot)
        }
    }
}
