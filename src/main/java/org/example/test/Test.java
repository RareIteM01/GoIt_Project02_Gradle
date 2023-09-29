package org.example.test;

import org.example.calculator.Calculator;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class Test {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @org.junit.Test
    public void testAddition() {
        assertEquals(10, calculator.add(6, 4));
    }

    @org.junit.Test
    public void testSubtraction() {
        assertEquals(87, calculator.subtract(90, 3));
    }

    @org.junit.Test
    public void testMultiplication() {
        assertEquals(30, calculator.multiply(6, 5));
    }

    @org.junit.Test
    public void testDivision() {
        assertEquals(9, calculator.divide(18, 2));
    }
}