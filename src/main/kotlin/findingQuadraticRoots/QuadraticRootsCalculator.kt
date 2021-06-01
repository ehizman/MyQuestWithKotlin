package findingQuadraticRoots

import kotlin.math.pow
import kotlin.math.sqrt

class QuadraticRootsCalculator {
    fun findRoots(coefficientOf_A: Int, coefficientOf_B: Int, coefficientOf_C: Int): Array<Double> {

        val determinantOfQuadraticEquation = coefficientOf_B.toDouble().pow(2.0) - (4 * coefficientOf_A *
                coefficientOf_C)

        if (determinantOfQuadraticEquation < 0.0){
            println("This quadratic equation has no real roots")
            return arrayOf(0.0, 0.0)
        }
        else{
            val numeratorOfEquationForFindingFirstRoot = (-(coefficientOf_B)) - sqrt (determinantOfQuadraticEquation)
            val firstRoot = (numeratorOfEquationForFindingFirstRoot/(2 * coefficientOf_A * coefficientOf_C))
            val firstRootToThreeDecimalPlaces = Math.round(firstRoot * 1000.0)/ 1000.0

            val numeratorOfEquationForFindingSecondRoot = (-(coefficientOf_B)) + sqrt(determinantOfQuadraticEquation)
            val secondRoot = (numeratorOfEquationForFindingSecondRoot/(2 * coefficientOf_A * coefficientOf_C))
            val secondRootToThreeDecimalPlaces = Math.round(secondRoot * 1000.0)/ 1000.0

            return arrayOf(firstRootToThreeDecimalPlaces, secondRootToThreeDecimalPlaces)
        }
    }
}
