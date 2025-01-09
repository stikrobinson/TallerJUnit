/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import ec.edu.espol.SeccionA.Calculation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author steve
 */
public class CalculationTest {
    
    private final Calculation calculation = new Calculation();

    @Test
    public void testFindMaxPositives() {
        assertEquals(4, calculation.findMax(new int[]{4, 3, 1, 2}));
    }
    
    @Test
    public void testFindMaxNegatives(){
        assertEquals(-1, calculation.findMax(new int[]{-9, -2, -6, -5, -1}));
    }
    
    @Test
    public void testFindMaxMixed(){
        assertEquals(2, calculation.findMax(new int[]{2, 0, -3, 1, -4}));
    }
    
}

