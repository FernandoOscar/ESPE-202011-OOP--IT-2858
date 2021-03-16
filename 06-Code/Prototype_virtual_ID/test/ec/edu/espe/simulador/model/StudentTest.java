/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

import ec.edu.espe.prototypevirtualid.model.Student;
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
    
    }
    
    @Test
    public void testValidUser1() {
        System.out.println("validUser");
        String user = "fds";
        String password = "****";
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser2() {
        System.out.println("validUser");
        String user = "qwer";
        String password = "12345";
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    
    @Test
    public void testValidUser3() {
        System.out.println("validUser");
        String user = "frf";
        String password = "@@@@";
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser4() {
        System.out.println("validUser");
        String user = "deded";
        String password = "1111";
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser5() {
        System.out.println("validUser");
        String user = "MAJOF";
        String password = "3454";
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser6() {
        System.out.println("validUser");
        String user = "12345";
        String password = "MAJOF";
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser7() {
        System.out.println("validUser");
        String user = "sssss";
        String password = "1111";
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser8() {
        System.out.println("validUser");
        String user = ",,,,,";
        String password = ".....";
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser9() {
        System.out.println("validUser");
        String user = "azsx";
        String password = "qaws";
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser10() {
        System.out.println("validUser");
        String user = "ww";
        String password = "";
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser11() {
        System.out.println("validUser");
        String user = "";
        String password = "12";
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser12() {
        System.out.println("validUser");
        String user = "06";
        String password = "rk";
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser13() {
        System.out.println("validUser");
        String user = "rmc";
        String password = ",,,";
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser14() {
        System.out.println("validUser");
        String user = "vrv";
        String password = "094";
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser15() {
        System.out.println("validUser");
        String user = "11";
        String password = "";
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser16() {
        System.out.println("validUser");
        String user = "";
        String password = "";
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser17() {
        System.out.println("validUser");
        String user = "oorr";
        String password = "oorr";
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser18() {
        System.out.println("validUser");
        String user = "MAJOF";
        String password = "MAJOF";
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser19() {
        System.out.println("validUser");
        String user = "12345";
        String password = "12345";
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser20() {
        System.out.println("validUser");
        String user = ".";
        String password = ".";
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of requestId method, of class Student.
     */
    

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
