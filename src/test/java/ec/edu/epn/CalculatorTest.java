package ec.edu.epn;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    // Method - case - expected result
    @Test
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
}