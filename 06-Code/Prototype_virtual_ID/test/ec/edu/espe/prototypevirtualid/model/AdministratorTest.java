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
public class AdministratorTest {
    
    public AdministratorTest() {
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
     * Test of addDatabase method, of class Administrator.
     */
    @Test
    public void testAddDatabase() {
        System.out.println("addDatabase");
        Administrator instance = new AdministratorImpl();
        instance.addDatabase();

    }

    /**
     * Test of createId method, of class Administrator.
     */
    @Test
    public void testCreateId() {
        System.out.println("createId");
        Administrator instance = new AdministratorImpl();
        instance.createId();

    }

    @Test
    public void testValidUser() {
        System.out.println("validUser");
        String user = "Hector";
        String password = "12345";
        Administrator instance = new AdministratorImpl();
        boolean expResult = false;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);

    }

    /**
     * Test of getDeparment method, of class Administrator.
     */
    @Test
    public void testGetDeparment() {
        System.out.println("getDeparment");
        Administrator instance = new AdministratorImpl();
        instance.setDeparment("Computer's science");
        String expResult = "Computer's science";
        String result = instance.getDeparment();
        assertEquals(expResult, result);

    }


    public class AdministratorImpl extends Administrator {

        public void addDatabase() {
        }

        public void createId() {
        }

        public void removeStudent() {
        }

        @Override
        public boolean validUser(String user, String password) {
            return false;
        }
    }
    
}
