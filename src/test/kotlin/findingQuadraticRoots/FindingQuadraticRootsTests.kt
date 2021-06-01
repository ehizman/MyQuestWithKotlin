package findingQuadraticRoots

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertEquals

class FindingQuadraticRootsTests {

    @Test
    fun testThatRootsCanBeFoundGivenTheCoefficientsOfTheTermsInAQuadraticEquation(){
        val quadraticRootsCalculator = QuadraticRootsCalculator()
        val division =Math.round(-(1.0/ 6.0) * 1000.0)/1000.0
        assertEquals(arrayOf(division, division)[0], quadraticRootsCalculator.findRoots(-4, +12, -9)[0])
        assertEquals(arrayOf(division, division)[1], quadraticRootsCalculator.findRoots(-4, +12, -9)[1])

    }
}