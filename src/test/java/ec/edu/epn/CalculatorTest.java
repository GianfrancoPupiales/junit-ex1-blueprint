package ec.edu.epn;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    // Method - case - expected result
    @Test
    @DisplayName("Addition of two positive numbers should return correct sum")
    void add_TwoPositiveNumbers_ReturnCorrectSum() {
        // Arrange - Prepare
        int a = 3;
        int b = 4;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assert result == 7;
    }

    // Method - case - expected result
    @Test
    void subtract_TwoPositiveNumbers_ReturnCorrectDifference() {
        // Arrange - Prepare
        int a = 10;
        int b = 4;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assert result == 6;
    }

    // Method - case - expected result
    @Test
    void multiply_TwoPositiveNumbers_ReturnCorrectProduct() {
        // Arrange - Prepare
        int a = 5;
        int b = 3;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assert result == 15;
    }

    // Method - case - expected result
    @Test
    void add_NegativeNumbers_ReturnCorrectSum() {
        // Arrange - Prepare
        int a = -5;
        int b = -3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assert result == -8;
    }

    // Method - case - expected result
    @Test
    void add_WithZero_ReturnCorrectSum() {
        // Arrange - Prepare
        int a = 10;
        int b = 0;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assert result == 10;
    }

    // Method - case - expected result
    @Test
    void subtract_NegativeNumbers_ReturnCorrectDifference() {
        // Arrange - Prepare
        int a = -5;
        int b = -3;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assert result == -2;
    }

    // Method - case - expected result
    @Test
    void subtract_WithZero_ReturnCorrectDifference() {
        // Arrange - Prepare
        int a = 15;
        int b = 0;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assert result == 15;
    }

    // Method - case - expected result
    @Test
    void multiply_NegativeNumbers_ReturnCorrectProduct() {
        // Arrange - Prepare
        int a = -4;
        int b = -2;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assert result == 8;
    }

    // Method - case - expected result
    @Test
    void multiply_WithZero_ReturnCorrectProduct() {
        // Arrange - Prepare
        int a = 10;
        int b = 0;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assert result == 0;
    }

    // Method - case - expected result
    @Test
    void divide_TwoPositiveNumbers_ReturnCorrectQuotient() {
        // Arrange - Prepare
        int a = 10;
        int b = 2;

        // Act
        double result = calculator.divide(a, b);

        // Assert
        assert result == 5.0;
    }

    // Method - case - expected result
    @Test
    void divide_NegativeNumbers_ReturnCorrectQuotient() {
        // Arrange - Prepare
        int a = -10;
        int b = -2;

        // Act
        double result = calculator.divide(a, b);

        // Assert
        assert result == 5.0;
    }

    // Method - case - expected result
    @Test
    void divide_WithDecimalResult_ReturnCorrectQuotient() {
        // Arrange - Prepare
        int a = 10;
        int b = 4;

        // Act
        double result = calculator.divide(a, b);

        // Assert
        assert result == 2.5;
    }

    // Method - case - expected result
    @Test
    void isEven_EvenNumber_ReturnTrue() {
        // Arrange - Prepare
        int number = 4;

        // Act
        boolean result = calculator.isEven(number);

        // Assert
        assert result == true;
    }

    @ParameterizedTest
    @ValueSource(ints = {2,30,-6,0})
    void isEven_MultipleNumbers_ShouldReturnTrue(int number) {
        assertTrue(calculator.isEven(number));

    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "5, 7, 12",
            "1, -2, -1"
    })
    void add_MultipleValues_ReturnsCorrectSum(int a, int b, int expectedSum) {
        assertEquals(expectedSum, calculator.add(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "10, 4, 6",
            "5, 3, 2",
            "-5, -3, -2"
    })
    void subtract_MultipleValues_ReturnsCorrectDifference(int a, int b, int expectedDifference) {
        assertEquals(expectedDifference, calculator.subtract(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "5, 3, 15",
            "4, -2, -8",
            "10, 0, 0"
    })
    void multiply_MultipleValues_ReturnsCorrectProduct(int a, int b, int expectedProduct) {
        assertEquals(expectedProduct, calculator.multiply(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "10, 2, 5.0",
            "-10, -2, 5.0",
            "10, 4, 2.5"
    })
    void divide_MultipleValues_ReturnsCorrectQuotient(int a, int b, double expectedQuotient) {
        assertEquals(expectedQuotient, calculator.divide(a, b), 0.0001);
    }

    // Method - case - expected result
    @Test
    void isEven_OddNumber_ReturnFalse() {
        // Arrange - Prepare
        int number = 5;

        // Act
        boolean result = calculator.isEven(number);

        // Assert
        assert result == false;
    }

    // Method - case - expected result
    @Test
    void isEven_Zero_ReturnTrue() {
        // Arrange - Prepare
        int number = 0;

        // Act
        boolean result = calculator.isEven(number);

        // Assert
        assert result == true;
    }

    @Test
    void divide_PositiveNumbers_ReturnCorrectQuotient() {
        double result = calculator.divide(10, 4);
        assertEquals(2.5, result, 0.0001, "10 dividido entre 4 debe ser 2.5");
    }

    @Test
    void divide_ByZero_ThrowsIllegalArgumentException() {
        // Arrange
        int a = 3;
        int b = 0;

        // Act
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(a, b),
                "Dividir por cero debe lanzar IllegalArgumentException");
    }

    @Test
    void divide_ByZero_ThrowsExceptionMessage() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(5, 0);
        });
        assertEquals("The divisor cannot be zero.", exception.getMessage());
    }
}