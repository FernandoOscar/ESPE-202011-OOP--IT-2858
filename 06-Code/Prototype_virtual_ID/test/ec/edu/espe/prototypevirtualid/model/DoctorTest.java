/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.model;

import ec.edu.espe.prototypevirtualid.model.Doctor;
import ec.edu.espe.prototypevirtualid.model.Doctor;
import ec.edu.espe.prototypevirtualid.model.Doctor;
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
public class DoctorTest {
    
    public DoctorTest() {
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
     * Test of getSpecialty method, of class Doctor.
     */
    @Test
    public void testGetSpecialty() {
        System.out.println("getSpecialty");
        Doctor instance = new Doctor();
        instance.setSpecialty("Medicine");
        String expResult = "Medicine";
        String result = instance.getSpecialty();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetSpecialty1() {
        System.out.println("getSpecialty");
        Doctor instance = new Doctor();
        instance.setSpecialty("Medicine");
        String expResult = "medicine";
        String result = instance.getSpecialty();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetSpecialty2() {
        System.out.println("getSpecialty");
        Doctor instance = new Doctor();
        instance.setSpecialty("medicine");
        String expResult = "Medicine";
        String result = instance.getSpecialty();
        assertEquals(expResult, result);

    }

    /**
     * Test of getNameDoctor method, of class Doctor.
     */
    @Test
    public void testGetNameDoctor() {
        System.out.println("getNameDoctor");
        Doctor instance = new Doctor();
        instance.setNameDoctor("Pedro");
        String expResult = "Pedro";
        String result = instance.getNameDoctor();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetNameDoctor1() {
        System.out.println("getNameDoctor");
        Doctor instance = new Doctor();
        instance.setNameDoctor("Calos");
        String expResult = "carlos";
        String result = instance.getNameDoctor();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetNameDoctor2() {
        System.out.println("getNameDoctor");
        Doctor instance = new Doctor();
        instance.setNameDoctor("juan");
        String expResult = "Juan";
        String result = instance.getNameDoctor();
        assertEquals(expResult, result);

    }


    /**
     * Test of getWorkingHour method, of class Doctor.
     */
    @Test
    public void testGetWorkingHour() {
        System.out.println("getWorkingHour");
        Doctor instance = new Doctor();
        instance.setWorkingHour("6 Hours");
        String expResult = "6 Hours";
        String result = instance.getWorkingHour();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetWorkingHour1() {
        System.out.println("getWorkingHour");
        Doctor instance = new Doctor();
        instance.setWorkingHour("6 Hours");
        String expResult = "5 Hours";
        String result = instance.getWorkingHour();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetWorkingHour2() {
        System.out.println("getWorkingHour");
        Doctor instance = new Doctor();
        instance.setWorkingHour("6 Hours");
        String expResult = "6 hours";
        String result = instance.getWorkingHour();
        assertEquals(expResult, result);

    }

    
}
