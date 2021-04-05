/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.model;

import com.mongodb.DBObject;
import ec.edu.espe.prototypevirtualid.model.Administrator;
import ec.edu.espe.prototypevirtualid.model.Administrator;
import ec.edu.espe.prototypevirtualid.model.Administrator;
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
    
    @Test
    public void testGetDeparment1() {
        System.out.println("getDeparment");
        Administrator instance = new AdministratorImpl();
        instance.setDeparment("Computer's science");
        String expResult = "Computer's scienc";
        String result = instance.getDeparment();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetDeparment2() {
        System.out.println("getDeparment");
        Administrator instance = new AdministratorImpl();
        instance.setDeparment("Computer's science");
        String expResult = "Computer'sscience";
        String result = instance.getDeparment();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetDeparment3() {
        System.out.println("getDeparment");
        Administrator instance = new AdministratorImpl();
        instance.setDeparment("exact Sciences");
        String expResult = "exact Sciences";
        String result = instance.getDeparment();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetDeparment4() {
        System.out.println("getDeparment");
        Administrator instance = new AdministratorImpl();
        instance.setDeparment("exact Sciences");
        String expResult = "exactSciences";
        String result = instance.getDeparment();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetDeparment5() {
        System.out.println("getDeparment");
        Administrator instance = new AdministratorImpl();
        instance.setDeparment("Computer's science");
        String expResult = "computer's science";
        String result = instance.getDeparment();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetDeparment6() {
        System.out.println("getDeparment");
        Administrator instance = new AdministratorImpl();
        instance.setDeparment("Computer's Science");
        String expResult = "computer's science";
        String result = instance.getDeparment();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetDeparment7() {
        System.out.println("getDeparment");
        Administrator instance = new AdministratorImpl();
        instance.setDeparment("exact Sciences");
        String expResult = "exactSciences";
        String result = instance.getDeparment();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetDeparment8() {
        System.out.println("getDeparment");
        Administrator instance = new AdministratorImpl();
        instance.setDeparment("exact sciences");
        String expResult = "exact Sciences";
        String result = instance.getDeparment();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetDeparment9() {
        System.out.println("getDeparment");
        Administrator instance = new AdministratorImpl();
        instance.setDeparment("exact sciences");
        String expResult = "exact science";
        String result = instance.getDeparment();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetDeparment10() {
        System.out.println("getDeparment");
        Administrator instance = new AdministratorImpl();
        instance.setDeparment("exact sciences");
        String expResult = "exactSciences";
        String result = instance.getDeparment();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetDeparment11() {
        System.out.println("getDeparment");
        Administrator instance = new AdministratorImpl();
        instance.setDeparment("Sxact Sciences");
        String expResult = "Exact Sciences";
        String result = instance.getDeparment();
        assertEquals(expResult, result);
    }


    public class AdministratorImpl extends Administrator {

        public void addDatabase(DBObject object) {
        }

        public void createId() {
        }

        public void removeStudent(String dataToDelete) {
        }

        @Override
        public boolean validUser(String user, String password) {
            return false;
        }
    }
    
}
