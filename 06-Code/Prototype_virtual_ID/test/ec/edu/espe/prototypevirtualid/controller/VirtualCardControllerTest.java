/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.controller;

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
public class VirtualCardControllerTest {
    
    public VirtualCardControllerTest() {
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
     * Test of giveWay method, of class VirtualCardController.
     */
    @Test
    public void testGiveWay() {
        System.out.println("giveWay");
        int dataID = 9;
        VirtualCardController instance = new VirtualCardController();
        boolean expResult = false;
        boolean result = instance.giveWay(dataID);
        assertEquals(expResult, result);

    }  
    
}
