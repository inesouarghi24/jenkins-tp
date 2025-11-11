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
        // Ce test réussit maintenant car le bug est corrigé
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
        // On vérifie que le code lève bien l'exception attendue
        assertThrows(IllegalArgumentException.class, () -> calc.divide(4, 0));
    }
}
