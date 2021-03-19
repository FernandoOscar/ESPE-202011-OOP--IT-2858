/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.controller;

import ec.edu.espe.prototypevirtualid.controller.Login;
import ec.edu.espe.prototypevirtualid.controller.Login;
import ec.edu.espe.prototypevirtualid.controller.Login;
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
        String user = "Hector";
        String password = "12345";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidate2() {
        System.out.println("validate");
        String user = "MAJOF";
        String password = "7568";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidate3() {
        System.out.println("validate");
        String user = "Carlos";
        String password = "76214";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidate4() {
        System.out.println("validate");
        String user = "MAJOF";
        String password = "12345";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidate5() {
        System.out.println("validate");
        String user = "Majof";
        String password = "123457";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidate6() {
        System.out.println("validate");
        String user = "user";
        String password = "password";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidate7() {
        System.out.println("validate");
        String user = "Rick";
        String password = "rick";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidate8() {
        System.out.println("validate");
        String user = "Juan";
        String password = "4814162342";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidate9() {
        System.out.println("validate");
        String user = "MAJOF7";
        String password = "42";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidate10() {
        System.out.println("validate");
        String user = "Majof";
        String password = "456373434834835438763534";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidate11() {
        System.out.println("validate");
        String user = "Melissa";
        String password = "12345";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidate12() {
        System.out.println("validate");
        String user = "MAJF";
        String password = "122345";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidate13() {
        System.out.println("validate");
        String user = "Edison";
        String password = "123455";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidate14() {
        System.out.println("validate");
        String user = "Cesar";
        String password = "012345";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidate15() {
        System.out.println("validate");
        String user = "Majof";
        String password = "012345";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validate(user, password);
        assertEquals(expResult, result);
    }
}
