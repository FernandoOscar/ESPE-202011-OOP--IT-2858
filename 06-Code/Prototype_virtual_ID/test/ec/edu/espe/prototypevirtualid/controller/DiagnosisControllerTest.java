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
public class DiagnosisControllerTest {
    
    public DiagnosisControllerTest() {
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
     * Test of saveClinicHistory method, of class DiagnosisController.
     */
    @Test
    public void testSaveClinicHistory() throws Exception {
        System.out.println("saveClinicHistory");
        String fileName = "Hector";
        String record = "Psychology";
        DiagnosisController instance = new DiagnosisController();
        instance.saveClinicHistory(fileName, record);    
    }
    
}
