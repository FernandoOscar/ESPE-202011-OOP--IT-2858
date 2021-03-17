/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.controller;

import javax.swing.table.DefaultTableModel;
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
public class TablesControllerTest {
    
    public TablesControllerTest() {
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
     * Test of tableStudent method, of class TablesController.
     */
    @Test
    public void testTableStudent() {
        System.out.println("tableStudent");
        TablesController instance = new TablesController();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.tableStudent();
        assertEquals(expResult, result);
        
    }
    
}
