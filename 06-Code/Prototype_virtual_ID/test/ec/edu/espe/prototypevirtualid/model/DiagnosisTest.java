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
public class DiagnosisTest {
    
    public DiagnosisTest() {
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
     * Test of getPatientName method, of class Diagnosis.
     */
    @Test
    public void testGetPatientName() {
        System.out.println("getPatientName");
        Diagnosis instance = new Diagnosis();
        String expResult = null;
        String result = instance.getPatientName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setPatientName method, of class Diagnosis.
     */
    @Test
    public void testSetPatientName() {
        System.out.println("setPatientName");
        String patientName = "";
        Diagnosis instance = new Diagnosis();
        instance.setPatientName(patientName);

    }

    /**
     * Test of getSymptom method, of class Diagnosis.
     */
    @Test
    public void testGetSymptom() {
        System.out.println("getSymptom");
        Diagnosis instance = new Diagnosis();
        String expResult = null;
        String result = instance.getSymptom();
        assertEquals(expResult, result);

    }

    /**
     * Test of setSymptom method, of class Diagnosis.
     */
    @Test
    public void testSetSymptom() {
        System.out.println("setSymptom");
        String symptom = "";
        Diagnosis instance = new Diagnosis();
        instance.setSymptom(symptom);

    }

    /**
     * Test of getMedicine method, of class Diagnosis.
     */
    @Test
    public void testGetMedicine() {
        System.out.println("getMedicine");
        Diagnosis instance = new Diagnosis();
        String expResult = null;
        String result = instance.getMedicine();
        assertEquals(expResult, result);

    }

    /**
     * Test of setMedicine method, of class Diagnosis.
     */
    @Test
    public void testSetMedicine() {
        System.out.println("setMedicine");
        String medicine = "";
        Diagnosis instance = new Diagnosis();
        instance.setMedicine(medicine);
        
    }
    
}
