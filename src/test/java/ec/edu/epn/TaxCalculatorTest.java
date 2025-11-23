package ec.edu.epn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TaxCalculatorTest {
    private TaxCalculator taxCalculator;

    static Stream<Arguments> taxCalculatorData() {
        return Stream.of(
                Arguments.of(100.0, 12.0, 112.0),
                Arguments.of(200.0, 15.0, 230.0),
                Arguments.of(150.0, 10.0, 165.0),
                Arguments.of(0.0, 20.0, 0.0),
                Arguments.of(100.0, 0.0, 100.0)
        );
    }

    @BeforeEach
    void setUp() {
        taxCalculator = new TaxCalculator();
    }

    @ParameterizedTest
    @MethodSource("taxCalculatorData")
    void calculateTax_MultipleValues_ShouldReturnCorrectTax(double valor, double impuesto, double expected) {
        // Arrange - Act
        double result = taxCalculator.calculateTax(valor, impuesto);

        // Assert
        assert result == expected;
    }
}
