import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DateFormatterTest {

    @Test
    void testValidDateFormat() {
        assertEquals("25-02-2025", DateFormatter.formatDate("2025-02-25"), "2025-02-25 should be formatted as 25-02-2025");
        assertEquals("01-01-2000", DateFormatter.formatDate("2000-01-01"), "2000-01-01 should be formatted as 01-01-2000");
    }

    @Test
    void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("25-02-2025"), "Should throw exception for incorrect format dd-MM-yyyy");
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("02/25/2025"), "Should throw exception for incorrect format MM/dd/yyyy");
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("abcd-ef-gh"), "Should throw exception for non-date values");
    }

    @Test
    void testNullDate() {
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate(null), "Should throw exception for null input");
    }
}
