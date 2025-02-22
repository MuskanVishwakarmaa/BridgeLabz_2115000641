import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

    @Test
    void testDivide() {
        assertEquals(5, MathUtils.divide(10, 2));
        assertEquals(-2, MathUtils.divide(10, -5));
    }

    @Test
    void testDivideByZeroException() {
        Exception exception = assertThrows(ArithmeticException.class, () -> MathUtils.divide(10, 0));
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
