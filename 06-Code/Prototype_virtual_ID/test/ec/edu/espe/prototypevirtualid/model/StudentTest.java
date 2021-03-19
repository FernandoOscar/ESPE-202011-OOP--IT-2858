/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.model;

import ec.edu.espe.prototypevirtualid.model.Student;
import ec.edu.espe.prototypevirtualid.model.Student;
import ec.edu.espe.prototypevirtualid.model.Student;
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
        instance.setCareer("Software");
        String expResult = "Software";
        String result = instance.getCareer();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetCareer1() {
        System.out.println("getCareer");
        Student instance = new Student();
        instance.setCareer("Software");
        String expResult = "software";
        String result = instance.getCareer();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetCareer2() {
        System.out.println("getCareer");
        Student instance = new Student();
        instance.setCareer("Software");
        String expResult = "Software ";
        String result = instance.getCareer();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetCareer3() {
        System.out.println("getCareer");
        Student instance = new Student();
        instance.setCareer("software");
        String expResult = "Software";
        String result = instance.getCareer();
        assertEquals(expResult, result);

    }

    
}
