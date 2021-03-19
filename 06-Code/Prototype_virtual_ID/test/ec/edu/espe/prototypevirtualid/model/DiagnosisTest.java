/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.model;

import ec.edu.espe.prototypevirtualid.model.Diagnosis;
import ec.edu.espe.prototypevirtualid.model.Diagnosis;
import ec.edu.espe.prototypevirtualid.model.Diagnosis;
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
        instance.setPatientName("Juan Castillo");
        String expResult = "Juan Castillo";
        String result = instance.getPatientName();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetPatientName1() {
        System.out.println("getPatientName");
        Diagnosis instance = new Diagnosis();
        instance.setPatientName("juan Castillo");
        String expResult = "Juan Castillo";
        String result = instance.getPatientName();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetPatientName2() {
        System.out.println("getPatientName");
        Diagnosis instance = new Diagnosis();
        instance.setPatientName("Melissa Peralta");
        String expResult = "Melisa Peralta";
        String result = instance.getPatientName();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetPatientName3() {
        System.out.println("getPatientName");
        Diagnosis instance = new Diagnosis();
        instance.setPatientName("Pedro Castillo");
        String expResult = "pedro Castillo";
        String result = instance.getPatientName();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetPatientName4() {
        System.out.println("getPatientName");
        Diagnosis instance = new Diagnosis();
        instance.setPatientName("Juan Castillo");
        String expResult = "Juan";
        String result = instance.getPatientName();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetPatientName5() {
        System.out.println("getPatientName");
        Diagnosis instance = new Diagnosis();
        instance.setPatientName("Juan Castillo");
        String expResult = "";
        String result = instance.getPatientName();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetPatientName6() {
        System.out.println("getPatientName");
        Diagnosis instance = new Diagnosis();
        instance.setPatientName("Juan Peralta");
        String expResult = "Juan Perlta";
        String result = instance.getPatientName();
        assertEquals(expResult, result);

    }

  
    /**
     * Test of getSymptom method, of class Diagnosis.
     */
    @Test
    public void testGetSymptom() {
        System.out.println("getSymptom");
        Diagnosis instance = new Diagnosis();
        instance.setSymptom("");
        String expResult = "Headache";
        String result = instance.getSymptom();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetSymptom1() {
        System.out.println("getSymptom");
        Diagnosis instance = new Diagnosis();
        instance.setSymptom("Dizziness");
        String expResult = "Headache";
        String result = instance.getSymptom();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetSymptom2() {
        System.out.println("getSymptom");
        Diagnosis instance = new Diagnosis();
        instance.setSymptom("dizziness");
        String expResult = "Dizziness";
        String result = instance.getSymptom();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetSymptom3() {
        System.out.println("getSymptom");
        Diagnosis instance = new Diagnosis();
        instance.setSymptom(" Dizziness");
        String expResult = "Dizziness";
        String result = instance.getSymptom();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetSymptom4() {
        System.out.println("getSymptom");
        Diagnosis instance = new Diagnosis();
        instance.setSymptom("headache");
        String expResult = "Headache";
        String result = instance.getSymptom();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetSymptom5() {
        System.out.println("getSymptom");
        Diagnosis instance = new Diagnosis();
        instance.setSymptom("fracture");
        String expResult = "fracture";
        String result = instance.getSymptom();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetSymptom6() {
        System.out.println("getSymptom");
        Diagnosis instance = new Diagnosis();
        instance.setSymptom("Fracture");
        String expResult = "fracture";
        String result = instance.getSymptom();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetSymptom7() {
        System.out.println("getSymptom");
        Diagnosis instance = new Diagnosis();
        instance.setSymptom("fracture");
        String expResult = "fracture ";
        String result = instance.getSymptom();
        assertEquals(expResult, result);

    }

    /**
     * Test of getMedicine method, of class Diagnosis.
     */
    @Test
    public void testGetMedicine() {
        System.out.println("getMedicine");
        Diagnosis instance = new Diagnosis();
        instance.setMedicine("Paracetamol");
        String expResult = "Paracetamol";
        String result = instance.getMedicine();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetMedicine1() {
        System.out.println("getMedicine");
        Diagnosis instance = new Diagnosis();
        instance.setMedicine("aracetamol");
        String expResult = "Paracetamol";
        String result = instance.getMedicine();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetMedicine2() {
        System.out.println("getMedicine");
        Diagnosis instance = new Diagnosis();
        instance.setMedicine("Paracetamol");
        String expResult = "aracetamol";
        String result = instance.getMedicine();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetMedicine3() {
        System.out.println("getMedicine");
        Diagnosis instance = new Diagnosis();
        instance.setMedicine("Band-Aid");
        String expResult = "Band-Aid";
        String result = instance.getMedicine();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetMedicine4() {
       System.out.println("getMedicine");
        Diagnosis instance = new Diagnosis();
        instance.setMedicine("Band Aid");
        String expResult = "Band-Aid";
        String result = instance.getMedicine();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetMedicine5() {
        System.out.println("getMedicine");
        Diagnosis instance = new Diagnosis();
        instance.setMedicine("Band - Aid");
        String expResult = "Band-Aid";
        String result = instance.getMedicine();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetMedicine6() {
        System.out.println("getMedicine");
        Diagnosis instance = new Diagnosis();
        instance.setMedicine("Band - Aid");
        String expResult = "Paracetamol";
        String result = instance.getMedicine();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetMedicine7() {
        System.out.println("getMedicine");
        Diagnosis instance = new Diagnosis();
        instance.setMedicine("Band-Aid");
        String expResult = "Band-aid";
        String result = instance.getMedicine();
        assertEquals(expResult, result);

    }

    
}
