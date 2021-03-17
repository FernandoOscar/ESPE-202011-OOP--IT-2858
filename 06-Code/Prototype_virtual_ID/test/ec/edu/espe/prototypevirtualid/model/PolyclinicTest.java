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
public class PolyclinicTest {
    
    public PolyclinicTest() {
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
     * Test of getVirtualid method, of class Polyclinic.
     */
    @Test
    public void testGetVirtualid() {
        System.out.println("getVirtualid");
        Polyclinic instance = new Polyclinic();
        int expResult = 0;
        int result = instance.getVirtualid();
        assertEquals(expResult, result);

    }

    /**
     * Test of setVirtualid method, of class Polyclinic.
     */
    @Test
    public void testSetVirtualid() {
        System.out.println("setVirtualid");
        int virtualid = 0;
        Polyclinic instance = new Polyclinic();
        instance.setVirtualid(virtualid);

    }

    /**
     * Test of isQrcode method, of class Polyclinic.
     */
    @Test
    public void testIsQrcode() {
        System.out.println("isQrcode");
        Polyclinic instance = new Polyclinic();
        boolean expResult = false;
        boolean result = instance.isQrcode();
        assertEquals(expResult, result);

    }

    /**
     * Test of setQrcode method, of class Polyclinic.
     */
    @Test
    public void testSetQrcode() {
        System.out.println("setQrcode");
        boolean qrcode = false;
        Polyclinic instance = new Polyclinic();
        instance.setQrcode(qrcode);

    }

    /**
     * Test of getTreatment method, of class Polyclinic.
     */
    @Test
    public void testGetTreatment() {
        System.out.println("getTreatment");
        Polyclinic instance = new Polyclinic();
        String expResult = null;
        String result = instance.getTreatment();
        assertEquals(expResult, result);

    }

    /**
     * Test of setTreatment method, of class Polyclinic.
     */
    @Test
    public void testSetTreatment() {
        System.out.println("setTreatment");
        String treatment = "";
        Polyclinic instance = new Polyclinic();
        instance.setTreatment(treatment);

    }

    /**
     * Test of getInfection method, of class Polyclinic.
     */
    @Test
    public void testGetInfection() {
        System.out.println("getInfection");
        Polyclinic instance = new Polyclinic();
        String expResult = null;
        String result = instance.getInfection();
        assertEquals(expResult, result);

    }

    /**
     * Test of setInfection method, of class Polyclinic.
     */
    @Test
    public void testSetInfection() {
        System.out.println("setInfection");
        String infection = "Cut";
        Polyclinic instance = new Polyclinic();
        instance.setInfection(infection);

    }
    
}
