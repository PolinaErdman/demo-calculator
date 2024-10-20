package by.itacademy.polinaerdman.calculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd1() {
        Calculator calculator = new Calculator();
        int a = 23;
        int b = 55;
        int expected = 78;

        int actual = calculator.add(a, b);

        Assertions.assertEquals(expected, actual, String.format("Sum not equal %d!", expected));
    }

    @Test
    public void testSub1() {
        Calculator calculator = new Calculator();
        int a = 23;
        int b = 55;
        int expected = -32;

        int actual = calculator.subtract(a, b);

        Assertions.assertEquals(expected, actual, String.format("Subtract not equal %d!", expected));
    }

    @Test
    public void testMul1() {
        Calculator calculator = new Calculator();
        int a = 23;
        int b = 55;
        int expected = 1265;

        int actual = calculator.multiply(a, b);

        Assertions.assertEquals(expected, actual, String.format("Multiply not equal %d!", expected));
    }

    @Test
    public void testDiv1() throws Exception {
        Calculator calculator = new Calculator();
        int a = 23;
        int b = 55;
        int expected = 0;

        int actual = calculator.divide(a, b);

        Assertions.assertEquals(expected, actual, String.format("Divide not equal %d!", expected));
    }

    @Test
    public void testDiv2() throws Exception {
        Calculator calculator = new Calculator();
        int a = 55;
        int b = 23;
        int expected = 2;

        int actual = calculator.divide(a, b);

        Assertions.assertEquals(expected, actual, String.format("Divide not equal %d!", expected));
    }

    @Test
    public void testDiv3() {
        Calculator calculator = new Calculator();
        int a = 55;
        int b = 0;

        Assertions.assertThrowsExactly(ArithmeticException.class, () -> calculator.divide(a, b));
    }
}
