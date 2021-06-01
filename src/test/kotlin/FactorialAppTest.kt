import classwork.FactorialApp
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FactorialAppTest {

    @Test
    fun canFindFactorial(){
        val factorialApp = FactorialApp()
        assertEquals(120, factorialApp.findFactorialOf(5))
    }
}