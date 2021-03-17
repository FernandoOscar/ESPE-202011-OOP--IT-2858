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

    /**
     * Test of removeStudent method, of class Administrator.
     */
    @Test
    public void testRemoveStudent() {
        System.out.println("removeStudent");
        Administrator instance = new AdministratorImpl();
        instance.removeStudent();
        
    }

    /**
     * Test of getDeparment method, of class Administrator.
     */
    @Test
    public void testGetDeparment() {
        System.out.println("getDeparment");
        Administrator instance = new AdministratorImpl();
        String expResult = null;
        String result = instance.getDeparment();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDeparment method, of class Administrator.
     */
    @Test
    public void testSetDeparment() {
        System.out.println("setDeparment");
        String deparment = "General medicine";
        Administrator instance = new AdministratorImpl();
        instance.setDeparment(deparment);
        
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
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
