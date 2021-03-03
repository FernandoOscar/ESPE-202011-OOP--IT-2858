/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FRANCISCO
 */
public class StudentTest {
    
    public StudentTest() {
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
     * Test of validUser method, of class Student.
     */
    @Test
    public void testValidUser() {
        System.out.println("validUser");
        String user = "";
        String password = "";
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of requestId method, of class Student.
     */
    @Test
    public void testRequestId() {
        System.out.println("requestId");
        Student instance = new Student();
        instance.requestId();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCareer method, of class Student.
     */
    @Test
    public void testGetCareer() {
        System.out.println("getCareer");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getCareer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCareer method, of class Student.
     */
    @Test
    public void testSetCareer() {
        System.out.println("setCareer");
        String career = "";
        Student instance = new Student();
        instance.setCareer(career);
       
    }
    
}
