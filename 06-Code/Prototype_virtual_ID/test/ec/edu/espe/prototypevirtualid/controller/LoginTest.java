/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.controller;

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
public class LoginTest {
    
    public LoginTest() {
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
     * Test of validate method, of class Login.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        String user = "MAJOF";
        String password = "12345";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);
      
    }
    
    @Test
    public void testValidate1() {
        System.out.println("validate");
        String user = "MAJO";
        String password = "24865";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);
      
    }
    
    @Test
    public void testValidate2() {
        System.out.println("validate");
        String user = "MAJOF1";
        String password = "123456";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testValidate3() {
        System.out.println("validate");
        String user = "MJF";
        String password = "268";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testValidate4() {
        System.out.println("validate");
        String user = "PANCHO";
        String password = "268";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testValidate5() {
        System.out.println("validate");
        String user = "PNH";
        String password = "001";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testValidate6() {
        System.out.println("validate");
        String user = "PACH";
        String password = "8203";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testValidate7() {
        System.out.println("validate");
        String user = "PO";
        String password = "9242";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testValidate8() {
        System.out.println("validate");
        String user = "Majol";
        String password = "0001";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testValidate9() {
        System.out.println("validate");
        String user = "Family";
        String password = "333";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testValidate10() {
        System.out.println("validate");
        String user = "Fam";
        String password = "985";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testValidate11() {
        System.out.println("validate");
        String user = "Fernand";
        String password = "645";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testValidate12() {
        System.out.println("validate");
        String user = "Bry";
        String password = "632";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testValidate13() {
        System.out.println("validate");
        String user = "Jhon";
        String password = "092";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testValidate14() {
        System.out.println("validate");
        String user = "Valorant";
        String password = "2582";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testValidate15() {
        System.out.println("validate");
        String user = "Respet";
        String password = "7531";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);  
    }
        
    @Test
    public void testValidate16() {
        System.out.println("validate");
        String user = "PANCHO";
        String password = "268";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testValidate17() {
        System.out.println("validate");
        String user = "Servi";
        String password = "649";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testValidate18() {
        System.out.println("validate");
        String user = "Banck";
        String password = "6319";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testValidate19() {
        System.out.println("validate");
        String user = "Scatch";
        String password = "9435";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testValidate20() {
        System.out.println("validate");
        String user = "Lili";
        String password = "0082";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);  
    }
}
