/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.model;

import ec.edu.espe.prototypevirtualid.model.Polyclinic;
import ec.edu.espe.prototypevirtualid.model.Polyclinic;
import ec.edu.espe.prototypevirtualid.model.Polyclinic;
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
        instance.setVirtualid(384524);
        int expResult = 384524;
        int result = instance.getVirtualid();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetVirtualid1() {
        System.out.println("getVirtualid");
        Polyclinic instance = new Polyclinic();
        instance.setVirtualid(38454);
        int expResult = 384524;
        int result = instance.getVirtualid();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetVirtualid2() {
        System.out.println("getVirtualid");
        Polyclinic instance = new Polyclinic();
        instance.setVirtualid(3845214);
        int expResult = 384524;
        int result = instance.getVirtualid();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetVirtualid3() {
        System.out.println("getVirtualid");
        Polyclinic instance = new Polyclinic();
        instance.setVirtualid(38524);
        int expResult = 3844524;
        int result = instance.getVirtualid();
        assertEquals(expResult, result);

    }

    /**
     * Test of isQrcode method, of class Polyclinic.
     */
    @Test
    public void testIsQrcode() {
        System.out.println("isQrcode");
        Polyclinic instance = new Polyclinic();
        instance.setQrcode(true);
        boolean expResult = true;
        boolean result = instance.isQrcode();
        assertEquals(expResult, result);

    }
    @Test
    public void testIsQrcode1() {
        System.out.println("isQrcode");
        Polyclinic instance = new Polyclinic();
        instance.setQrcode(true);
        boolean expResult = false;
        boolean result = instance.isQrcode();
        assertEquals(expResult, result);

    }
    @Test
    public void testIsQrcode2() {
        System.out.println("isQrcode");
        Polyclinic instance = new Polyclinic();
        instance.setQrcode(false);
        boolean expResult = true;
        boolean result = instance.isQrcode();
        assertEquals(expResult, result);

    }


    /**
     * Test of getTreatment method, of class Polyclinic.
     */
    @Test
    public void testGetTreatment() {
        System.out.println("getTreatment");
        Polyclinic instance = new Polyclinic();
        instance.setTreatment("tablet");
        String expResult = "tablet";
        String result = instance.getTreatment();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetTreatment1() {
        System.out.println("getTreatment");
        Polyclinic instance = new Polyclinic();
        instance.setTreatment("Tablet");
        String expResult = "tablet";
        String result = instance.getTreatment();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetTreatment2() {
        System.out.println("getTreatment");
        Polyclinic instance = new Polyclinic();
        instance.setTreatment("tablet");
        String expResult = "Tablet";
        String result = instance.getTreatment();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetTreatment3() {
        System.out.println("getTreatment");
        Polyclinic instance = new Polyclinic();
        instance.setTreatment("surgery");
        String expResult = "Surgery";
        String result = instance.getTreatment();
        assertEquals(expResult, result);

    }

    /**
     * Test of getInfection method, of class Polyclinic.
     */
    @Test
    public void testGetInfection() {
        System.out.println("getInfection");
        Polyclinic instance = new Polyclinic();
        instance.setInfection("cut");
        String expResult = "cut";
        String result = instance.getInfection();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetInfection1() {
        System.out.println("getInfection");
        Polyclinic instance = new Polyclinic();
        instance.setInfection("cut");
        String expResult = "cut ";
        String result = instance.getInfection();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetInfection2() {
        System.out.println("getInfection");
        Polyclinic instance = new Polyclinic();
        instance.setInfection("Cut");
        String expResult = "cut";
        String result = instance.getInfection();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetInfection3() {
        System.out.println("getInfection");
        Polyclinic instance = new Polyclinic();
        instance.setInfection("cut");
        String expResult = "Cut";
        String result = instance.getInfection();
        assertEquals(expResult, result);

    }

    
}
