/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jhonn_000
 */
public class MedicalCheckTest {
    
    public MedicalCheckTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDate method, of class MedicalCheck.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        MedicalCheck instance = new MedicalCheck();
        String expResult = null;
        String result = instance.getDate();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDate method, of class MedicalCheck.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "March, 15th";
        MedicalCheck instance = new MedicalCheck();
        instance.setDate(date);

    }

    /**
     * Test of getTime method, of class MedicalCheck.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        MedicalCheck instance = new MedicalCheck();
        String expResult = null;
        String result = instance.getTime();
        assertEquals(expResult, result);

    }

    /**
     * Test of setTime method, of class MedicalCheck.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        String time = "February 15";
        MedicalCheck instance = new MedicalCheck();
        instance.setTime(time);

    }
    
}
