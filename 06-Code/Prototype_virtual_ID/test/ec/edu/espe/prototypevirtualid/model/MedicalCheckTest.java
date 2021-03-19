/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.model;

import ec.edu.espe.prototypevirtualid.model.MedicalCheck;
import ec.edu.espe.prototypevirtualid.model.MedicalCheck;
import ec.edu.espe.prototypevirtualid.model.MedicalCheck;
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
        instance.setDate("01/07/2015");
        String expResult = "01/07/2015";
        String result = instance.getDate();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetDate1() {
        System.out.println("getDate");
        MedicalCheck instance = new MedicalCheck();
        instance.setDate("01/07/2015");
        String expResult = "01/07/2016";
        String result = instance.getDate();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetDate2() {
        System.out.println("getDate");
        MedicalCheck instance = new MedicalCheck();
        instance.setDate("01/07/2015");
        String expResult = "01-07-2015";
        String result = instance.getDate();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetDate3() {
        System.out.println("getDate");
        MedicalCheck instance = new MedicalCheck();
        instance.setDate("01/07/2015");
        String expResult = "01/7/2015";
        String result = instance.getDate();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetDate4() {
        System.out.println("getDate");
        MedicalCheck instance = new MedicalCheck();
        instance.setDate("01/07/2015");
        String expResult = "1/07/2015";
        String result = instance.getDate();
        assertEquals(expResult, result);

    }


    /**
     * Test of getTime method, of class MedicalCheck.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        MedicalCheck instance = new MedicalCheck();
        instance.setTime("14:40");
        String expResult = "14:40";
        String result = instance.getTime();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetTime1() {
        System.out.println("getTime");
        MedicalCheck instance = new MedicalCheck();
        instance.setTime("14:40");
        String expResult = "14 y 40";
        String result = instance.getTime();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetTime2() {
        System.out.println("getTime");
        MedicalCheck instance = new MedicalCheck();
        instance.setTime("14:40");
        String expResult = "14 and 40";
        String result = instance.getTime();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetTime3() {
        System.out.println("getTime");
        MedicalCheck instance = new MedicalCheck();
        instance.setTime("14:40");
        String expResult = "14;40";
        String result = instance.getTime();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetTime4() {
        System.out.println("getTime");
        MedicalCheck instance = new MedicalCheck();
        instance.setTime("14:40");
        String expResult = "14:4";
        String result = instance.getTime();
        assertEquals(expResult, result);

    }

    
}
