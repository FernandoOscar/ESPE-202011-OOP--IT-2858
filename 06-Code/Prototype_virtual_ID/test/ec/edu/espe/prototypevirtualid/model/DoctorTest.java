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
     * Test of validUser method, of class Doctor.
     */
    @Test
    public void testValidUser() {
        System.out.println("validUser");
        String user = "user";
        String password = "password";
        Doctor instance = new Doctor();
        boolean expResult = false;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);

    }

    /**
     * Test of getSpecialty method, of class Doctor.
     */
    @Test
    public void testGetSpecialty() {
        System.out.println("getSpecialty");
        Doctor instance = new Doctor();
        String expResult = null;
        String result = instance.getSpecialty();
        assertEquals(expResult, result);

    }

    /**
     * Test of setSpecialty method, of class Doctor.
     */
    @Test
    public void testSetSpecialty() {
        System.out.println("setSpecialty");
        String specialty = "Dentist";
        Doctor instance = new Doctor();
        instance.setSpecialty(specialty);

    }

    /**
     * Test of getNameDoctor method, of class Doctor.
     */
    @Test
    public void testGetNameDoctor() {
        System.out.println("getNameDoctor");
        Doctor instance = new Doctor();
        String expResult = null;
        String result = instance.getNameDoctor();
        assertEquals(expResult, result);

    }

    /**
     * Test of setNameDoctor method, of class Doctor.
     */
    @Test
    public void testSetNameDoctor() {
        System.out.println("setNameDoctor");
        String nameDoctor = "Hector";
        Doctor instance = new Doctor();
        instance.setNameDoctor(nameDoctor);

    }

    /**
     * Test of getWorkingHour method, of class Doctor.
     */
    @Test
    public void testGetWorkingHour() {
        System.out.println("getWorkingHour");
        Doctor instance = new Doctor();
        String expResult = null;
        String result = instance.getWorkingHour();
        assertEquals(expResult, result);

    }

    /**
     * Test of setWorkingHour method, of class Doctor.
     */
    @Test
    public void testSetWorkingHour() {
        System.out.println("setWorkingHour");
        String workingHour = "wetw";
        Doctor instance = new Doctor();
        instance.setWorkingHour(workingHour);

    }
    
}
