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
     * Test of getCareer method, of class Student.
     */
    @Test
    public void testGetCareer() {
        System.out.println("getCareer");
        Student instance = new Student();
        String expResult = null;
        String result = instance.getCareer();
        assertEquals(expResult, result);

    }

    /**
     * Test of setCareer method, of class Student.
     */
    @Test
    public void testSetCareer() {
        System.out.println("setCareer");
        String career = "Information technology";
        Student instance = new Student();
        instance.setCareer(career);

    }
    
}
