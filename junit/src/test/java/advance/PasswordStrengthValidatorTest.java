package java_collections_streams.junit.src.test.java.advance;
import advance.PasswordStrengthValidator;
import java_collections_streams.junit.src.main.java.advance.PasswordStrengthValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthValidatorTest {
    @Test
    public void testRightPassword(){
        assertTrue(PasswordStrengthValidator.checkPassword("ABCdef123"));
        assertTrue(PasswordStrengthValidator.checkPassword("AMANabc123@"));
    }

    @Test
    public void testWrongPassword(){
        assertFalse(PasswordStrengthValidator.checkPassword("Abc123"));
        assertFalse(PasswordStrengthValidator.checkPassword("Amanabc"));
    }
}