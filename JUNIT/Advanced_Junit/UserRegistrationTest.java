import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() -> UserRegistration.registerUser("JohnDoe", "john.doe@example.com", "Password1"));
    }

    @Test
    void testEmptyUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("", "john.doe@example.com", "Password1"));
        assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("JohnDoe", "invalid-email", "Password1"));
        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    void testWeakPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("JohnDoe", "john.doe@example.com", "pass"));
        assertEquals("Password must be at least 8 characters, contain an uppercase letter, and a digit", exception.getMessage());
    }
}
