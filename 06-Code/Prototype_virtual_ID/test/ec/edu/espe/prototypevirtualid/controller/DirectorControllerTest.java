/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.controller;

import ec.edu.espe.prototypevirtualid.model.Director;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BryanPC
 */
public class DirectorControllerTest {

    public DirectorControllerTest() {
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
     * Test of validUser method, of class Director.
     */
    @Test
    public void testValidUser() {
        System.out.println("validUser");
        String user = "MAJOF";
        String password = "12345";
        DirectorController instance = new DirectorController();
        boolean expResult = true;        
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);

    }

    @Test
    public void testValidUser1() {
        System.out.println("validUser");
        String user = "MAJOF";
        String password = "123457";
        DirectorController instance = new DirectorController();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);

    }

    @Test
    public void testValidUser2() {
        System.out.println("validUser");
        String user = "MAJO";
        String password = "12345";
       DirectorController instance = new DirectorController();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);

    }

    @Test
    public void testValidUser3() {
        System.out.println("validUser");
        String user = "MAJO";
        String password = "123457";
        DirectorController instance = new DirectorController();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);

    }

    @Test
    public void testValidUser4() {
        System.out.println("validUser");
        String user = "Pedro";
        String password = "Pedro";
        DirectorController instance = new DirectorController();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);

    }

    @Test
    public void testValidUser5() {
        System.out.println("validUser");
        String user = "12345";
        String password = "12345";
        DirectorController instance = new DirectorController();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);

    }

    @Test
    public void testValidUser6() {
        System.out.println("validUser");
        String user = "MAJOFF";
        String password = "123455";
        DirectorController instance = new DirectorController();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);

    }

    @Test
    public void testValidUser7() {
        System.out.println("validUser");
        String user = "MAJOF ";
        String password = "12345";
        DirectorController instance = new DirectorController();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);

    }

    /**
     * Test of approveMotion method, of class Director.
     */
    @Test
    public void testApproveMotion() {
        System.out.println("approveMotion");
        char answer = ' ';
        DirectorController instance = new DirectorController();
        boolean expResult = false;
        boolean result = instance.approveMotion(answer);
        assertEquals(expResult, result);

    }

    @Test
    public void testApproveMotion1() {
        System.out.println("approveMotion");
        char answer = ' ';
        DirectorController instance = new DirectorController();
        boolean expResult = true;
        boolean result = instance.approveMotion(answer);
        assertEquals(expResult, result);

    }

}
