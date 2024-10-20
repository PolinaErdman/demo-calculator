package by.itacademy.polinaerdman.calculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd1() {
        Calculator calculator = new Calculator();
        int a = 23;
        int b = 55;

        int actual = calculator.add(a, b);

        int expected = 78;
        Assertions.assertEquals(expected, actual);
    }
}
