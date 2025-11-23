package ec.edu.epn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class EmailValidatorTest {
    private EmailValidator emailValidator;

    static Stream<Arguments> emailValidatorData() {
        return Stream.of(
                Arguments.of("gianfranco@example.com", true),
                Arguments.of("paula@example.com", true),
                Arguments.of("invalid-email", false),
                Arguments.of("user@domain", false),
                Arguments.of("", false),
                Arguments.of(null, false)
        );
    }

    @BeforeEach
    void setUp() {
        emailValidator = new EmailValidator();
    }

    @ParameterizedTest
    @MethodSource("emailValidatorData")
    void isValid_MultipleEmails_ShouldReturnTrue(String email, boolean expected) {
        // Arrange - Act
        boolean result = emailValidator.isValid(email);

        // Assert
        assert result == expected;
    }
}
