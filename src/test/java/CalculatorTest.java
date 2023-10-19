import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lukaswais.Calculator;

public class CalculatorTest {
    @Test
    void testAdd() {
        double result = Calculator.add(2.5, 3.7);
        Assertions.assertEquals(6.2, result, 0.0001);
    }

    @Test
    void testSubtract() {
        double result = Calculator.subtract(5.8, 3.2);
        Assertions.assertEquals(2.6, result, 0.0001);
    }

    @Test
    void testMultiply() {
        double result = Calculator.multiply(4.6, 2.3);
        Assertions.assertEquals(10.58, result, 0.0001);
    }

    @Test
    void testDivide() {
        double result = Calculator.divide(7.2, 2.4);
        Assertions.assertEquals(3.0, result, 0.0001);
    }

    /**
     * checks if the correct exception is thrown.
     */
    @Test
    void testDivideByZeroException() {
        Assertions.assertThrows(ArithmeticException.class, () -> Calculator.divide(5.0, 0.0));
    }

    /**
     * checks if the correct error message is thrown
     */
    @Test
    void testDivideByZeroExceptionMessage() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(5.0, 0.0);
        });
    }
}