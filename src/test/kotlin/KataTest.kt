import kata.Kata
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class KataTest {
    @Test
    fun testThatStringCanBeReversed(){
        assertEquals("54321", Kata.reverseNumber(12345))
    }
}