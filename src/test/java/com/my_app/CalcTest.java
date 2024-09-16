/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.my_app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import com.my_app.learning.Calc;

/**
 *
 * @author codespace
 */
public class CalcTest {

    Calc c = new Calc();

    @Test
    void mathTest() {
        // calc test
        assertEquals(2, c.add(1, 1), "Addition is not correct");
        assertEquals(0, c.subtract(1, 1), "Subtraction is not correct");
        assertEquals(1, c.multiply(1, 1), "Multiplication is not correct");
        assertEquals(1, c.divide(1, 1), "Division is not correct");

    }

    @Test
    void zeroDivisionTest() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> c.divide(0, 0), "Division by zero is not correct");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(exception.getMessage());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // Now you can assert something about the exception, like its message
        // assertEquals("Division by zero is not correct", exception.getMessage());
    }

}
