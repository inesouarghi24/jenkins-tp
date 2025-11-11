package com.inesouarghi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows; 

class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.subtract(3, 2)); 
    }

    @Test
    void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.divide(4, 2));
    }

    @Test
    void testDivideByZero() {
        Calculator calc = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calc.divide(4, 0));
    }

    
    @Test
    void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiply(2, 3));
    }
}
