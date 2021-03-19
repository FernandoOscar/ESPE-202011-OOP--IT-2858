/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.model;

import ec.edu.espe.prototypevirtualid.model.VirtualCard;
import ec.edu.espe.prototypevirtualid.model.VirtualCard;
import ec.edu.espe.prototypevirtualid.model.VirtualCard;
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
        instance.setDepartment("Computer's science");
        String expResult = "Computer's science";
        String result = instance.getDepartment();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetDepartment1() {
        System.out.println("getDepartment");
        VirtualCard instance = new VirtualCard();
        instance.setDepartment("Computer's science");
        String expResult = "Computer's Science";
        String result = instance.getDepartment();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetDepartment2() {
        System.out.println("getDepartment");
        VirtualCard instance = new VirtualCard();
        instance.setDepartment("Computer's Science");
        String expResult = "Computer's science";
        String result = instance.getDepartment();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetDepartment3() {
        System.out.println("getDepartment");
        VirtualCard instance = new VirtualCard();
        instance.setDepartment("Computer's science");
        String expResult = "Computer's cience";
        String result = instance.getDepartment();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetDepartment4() {
        System.out.println("getDepartment");
        VirtualCard instance = new VirtualCard();
        instance.setDepartment("Computer's science");
        String expResult = "Computer's cience";
        String result = instance.getDepartment();
        assertEquals(expResult, result);

    }


    /**
     * Test of getId method, of class VirtualCard.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        VirtualCard instance = new VirtualCard();
        instance.setId(374568);
        int expResult = 374568;
        int result = instance.getId();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetId1() {
        System.out.println("getId");
        VirtualCard instance = new VirtualCard();
        instance.setId(3745678);
        int expResult = 374568;
        int result = instance.getId();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetId2() {
        System.out.println("getId");
        VirtualCard instance = new VirtualCard();
        instance.setId(374568);
        int expResult = 3747568;
        int result = instance.getId();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetId3() {
        System.out.println("getId");
        VirtualCard instance = new VirtualCard();
        instance.setId(37411568);
        int expResult = 374568;
        int result = instance.getId();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetId4() {
        System.out.println("getId");
        VirtualCard instance = new VirtualCard();
        instance.setId(37454268);
        int expResult = 37456228;
        int result = instance.getId();
        assertEquals(expResult, result);

    }


    /**
     * Test of getName method, of class VirtualCard.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        VirtualCard instance = new VirtualCard();
        instance.setName("Carlos Peralta");
        String expResult = "Carlos Peralta";
        String result = instance.getName();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetName1() {
        System.out.println("getName");
        VirtualCard instance = new VirtualCard();
        instance.setName("Carlos Peralta");
        String expResult = "Carlos peralta";
        String result = instance.getName();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetName2() {
        System.out.println("getName");
        VirtualCard instance = new VirtualCard();
        instance.setName("Alison Paez");
        String expResult = "Alison Paez";
        String result = instance.getName();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetName3() {
        System.out.println("getName");
        VirtualCard instance = new VirtualCard();
        instance.setName("Carlos Peralta");
        String expResult = "Carlos";
        String result = instance.getName();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetName4() {
        System.out.println("getName");
        VirtualCard instance = new VirtualCard();
        instance.setName("Alison Paez");
        String expResult = "AlisonPaez";
        String result = instance.getName();
        assertEquals(expResult, result);

    }
    

    /**
     * Test of getQrCode method, of class VirtualCard.
     */
    @Test
    public void testGetQrCode() {
        System.out.println("getQrCode");
        VirtualCard instance = new VirtualCard();
        instance.setQrCode(47247334);
        int expResult = 47247334;
        int result = instance.getQrCode();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetQrCode1() {
        System.out.println("getQrCode");
        VirtualCard instance = new VirtualCard();
        instance.setQrCode(47247334);
        int expResult = 4724334;
        int result = instance.getQrCode();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetQrCode2() {
        System.out.println("getQrCode");
        VirtualCard instance = new VirtualCard();
        instance.setQrCode(4727334);
        int expResult = 47247334;
        int result = instance.getQrCode();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetQrCode3() {
        System.out.println("getQrCode");
        VirtualCard instance = new VirtualCard();
        instance.setQrCode(47247334);
        int expResult = 472457334;
        int result = instance.getQrCode();
        assertEquals(expResult, result);

    }

    
}
