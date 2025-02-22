import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {

    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValidPassword("StrongP@ss1"), "Valid password should return true");
    }

    @Test
    void testPasswordTooShort() {
        assertFalse(PasswordValidator.isValidPassword("Short1"), "Password shorter than 8 characters should return false");
    }

    @Test
    void testPasswordWithoutUpperCase() {
        assertFalse(PasswordValidator.isValidPassword("password1"), "Password without an uppercase letter should return false");
    }

    @Test
    void testPasswordWithoutDigit() {
        assertFalse(PasswordValidator.isValidPassword("Password"), "Password without a digit should return false");
    }

    @Test
    void testPasswordNull() {
        assertFalse(PasswordValidator.isValidPassword(null), "Null password should return false");
    }

    @Test
    void testPasswordWithSpecialCharacters() {
        assertTrue(PasswordValidator.isValidPassword("Valid@123"), "Valid password with special characters should pass");
    }
}
