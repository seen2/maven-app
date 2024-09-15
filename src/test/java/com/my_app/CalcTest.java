/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package com.my_app;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.my_app.learning.Calc;

/**
 *
 * @author codespace
 */
public class CalcTest {

     public CalcTest() {
        // fail("Failed");
    }
    
    @Test
    public void test(){
        Calc calc = new Calc();
        int actualResult = calc.divide(2, 2);
        assertEquals(1, actualResult);
        
        actualResult= calc.multiply(2, 2);
        assertEquals(4, actualResult);
        
        actualResult= calc.add(2, 2);
        assertEquals(4, actualResult);

        actualResult= calc.subtract(2, 2);
        assertEquals(0, actualResult);

    }

}