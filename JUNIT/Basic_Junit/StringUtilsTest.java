import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void testReverse() {
        assertEquals("dcba", StringUtils.reverse("abcd"));
        assertEquals("madam", StringUtils.reverse("madam"));
        assertEquals("", StringUtils.reverse(""));
        assertNull(StringUtils.reverse(null));  // Handling null input
    }

    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"));
        assertTrue(StringUtils.isPalindrome("RaceCar")); // Case-insensitive
        assertFalse(StringUtils.isPalindrome("hello"));
        assertFalse(StringUtils.isPalindrome(null)); // Null input should return false
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", StringUtils.toUpperCase("hello"));
        assertEquals("JAVA", StringUtils.toUpperCase("Java"));
        assertEquals("", StringUtils.toUpperCase("")); // Empty string case
        assertNull(StringUtils.toUpperCase(null));  // Handling null input
    }
}
