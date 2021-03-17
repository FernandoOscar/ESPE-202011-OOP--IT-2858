/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.controller;

import java.io.File;
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
public class PolyclinicControllerTest {
    
    public PolyclinicControllerTest() {
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
     * Test of showMedicaments method, of class PolyclinicController.
     */
    @Test
    public void testShowMedicaments() {
        System.out.println("showMedicaments");
        File fileName = null;
        String record = "General medicine";
        PolyclinicController instance = new PolyclinicController();
        instance.showMedicaments(fileName, record);
    }
    
}
