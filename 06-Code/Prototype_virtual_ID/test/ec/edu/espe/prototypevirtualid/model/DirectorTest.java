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
public class DirectorTest {
    
    public DirectorTest() {
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
        String user = "user";
        String password = "password";
        Director instance = new Director();
        boolean expResult = false;
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
        Director instance = new Director();
        boolean expResult = false;
        boolean result = instance.approveMotion(answer);
        assertEquals(expResult, result);

    }

    /**
     * Test of addDatabase method, of class Director.
     */
    @Test
    public void testAddDatabase() {
        System.out.println("addDatabase");
        Director instance = new Director();
        instance.addDatabase();

    }

    /**
     * Test of createId method, of class Director.
     */
    @Test
    public void testCreateId() {
        System.out.println("createId");
        Director instance = new Director();
        instance.createId();

    }

    /**
     * Test of removeStudent method, of class Director.
     */
    @Test
    public void testRemoveStudent() {
        System.out.println("removeStudent");
        Director instance = new Director();
        instance.removeStudent();

    }

    /**
     * Test of getCareer method, of class Director.
     */
    @Test
    public void testGetCareer() {
        System.out.println("getCareer");
        Director instance = new Director();
        String expResult = null;
        String result = instance.getCareer();
        assertEquals(expResult, result);

    }

    /**
     * Test of setCareer method, of class Director.
     */
    @Test
    public void testSetCareer() {
        System.out.println("setCareer");
        String career = "Information technology";
        Director instance = new Director();
        instance.setCareer(career);

    }
    
}
