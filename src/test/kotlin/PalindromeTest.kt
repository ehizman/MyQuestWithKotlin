import isPalindromeApp.Palindrome
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class PalindromeTest {

    @Test
    fun testThatNumberIsPalindrome(){
        val palindromeApp = Palindrome()
        assertTrue(palindromeApp.isPalindrome(122122121))
    }

}