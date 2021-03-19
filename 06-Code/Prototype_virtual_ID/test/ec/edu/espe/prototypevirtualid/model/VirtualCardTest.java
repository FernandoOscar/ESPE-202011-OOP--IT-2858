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
public class VirtualCardTest {
    
    public VirtualCardTest() {
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
     * Test of getDepartment method, of class VirtualCard.
     */
    @Test
    public void testGetDepartment() {
        System.out.println("getDepartment");
        VirtualCard instance = new VirtualCard();
        String expResult = null;
        String result = instance.getDepartment();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDepartment method, of class VirtualCard.
     */
    @Test
    public void testSetDepartment() {
        System.out.println("setDepartment");
        String department = "computer's science";
        VirtualCard instance = new VirtualCard();
        instance.setDepartment(department);

    }

    /**
     * Test of getId method, of class VirtualCard.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        VirtualCard instance = new VirtualCard();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);

    }

    /**
     * Test of setId method, of class VirtualCard.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        VirtualCard instance = new VirtualCard();
        instance.setId(id);

    }

    /**
     * Test of getName method, of class VirtualCard.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        VirtualCard instance = new VirtualCard();
        String expResult = null;
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setName method, of class VirtualCard.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Melissa";
        VirtualCard instance = new VirtualCard();
        instance.setName(name);

    }

    /**
     * Test of getQrCode method, of class VirtualCard.
     */
    @Test
    public void testGetQrCode() {
        System.out.println("getQrCode");
        VirtualCard instance = new VirtualCard();
        int expResult = 0;
        int result = instance.getQrCode();
        assertEquals(expResult, result);

    }

    /**
     * Test of setQrCode method, of class VirtualCard.
     */
    @Test
    public void testSetQrCode() {
        System.out.println("setQrCode");
        int QrCode = 0;
        VirtualCard instance = new VirtualCard();
        instance.setQrCode(QrCode);

    }
    
}
