import printHelloWorldApp.PrintHelloWorldApp
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PrintHelloWorldTest {
    @Test
    fun testThatAppCanPrintHelloWorldFiveTimes(){
        val printHelloWorldApp = PrintHelloWorldApp()
        assertEquals("Hello World\nHello World\nHello World\nHello World\nHello World\n", printHelloWorldApp
            .display())
    }
}