/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espol.SeccionB;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jarec
 */
public class EmployeeTest {
    private Employee workerUSD, supervisorOther, managerUSD;

    @BeforeEach
    void setUp() {
        workerUSD = new Employee(500, "USD", 0, EmployeeType.Worker);
        supervisorOther = new Employee(700, "EUR", 0, EmployeeType.Supervisor);
        managerUSD = new Employee(1000, "USD", 0.2F, EmployeeType.Manager);
    }

    @Test
    void testCalculateSalaryWorkerUSD() {
        assertEquals(500 +(386.0F / 12 * 2), workerUSD.cs());
    }

    @Test
    void testCalculateSalarySupervisorOther() {
        float expected = ((700 * 0.95F)+(0*0.35F))+ (386.0F / 12 * 2);
        assertEquals(expected, supervisorOther.cs());
    }

    @Test
    void testCalculateSalaryManager() {
        float expected = (1000 + (0.2F *0.35F))+ (386.0F / 12 * 2);
        assertEquals(expected, managerUSD.cs());
    }
    
    @Test
    void testCalculateYearBonusManagerUSD() {
        float expected = 1000 + 386 * 1.0F;
        assertEquals(expected, managerUSD.CalculateYearBonus());
    }
    

    @Test
    void testCalculateYearBonusWorker() {
        assertEquals(386, workerUSD.CalculateYearBonus());
    }
    
   @Test
    void testCalculateYearBonusSupervisor(){
        float expected = (700*0.95F) + (386 * 0.5F);
         assertEquals(expected, supervisorOther.CalculateYearBonus());
    }
}
