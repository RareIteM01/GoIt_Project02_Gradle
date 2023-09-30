package org.example.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void subtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void multiply() {
        assertEquals(10, calculator.multiply(2, 5));
    }

    @Test
    public void divide() {
        assertEquals(3, calculator.divide(9, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        calculator.divide(5, 0);
    }
}