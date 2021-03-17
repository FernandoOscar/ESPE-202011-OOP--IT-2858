/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.model;

import javax.swing.event.TableModelListener;
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
public class TMStudentTest {
    
    public TMStudentTest() {
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
     * Test of getRowCount method, of class TMStudent.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        TMStudent instance = null;
        int expResult = 0;
        int result = instance.getRowCount();
        assertEquals(expResult, result);

    }

    /**
     * Test of getColumnCount method, of class TMStudent.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        TMStudent instance = null;
        int expResult = 0;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);

    }

    /**
     * Test of getColumnName method, of class TMStudent.
     */
    @Test
    public void testGetColumnName() {
        System.out.println("getColumnName");
        int columnIndex = 0;
        TMStudent instance = null;
        String expResult = null;
        String result = instance.getColumnName(columnIndex);
        assertEquals(expResult, result);

    }

    /**
     * Test of getColumnClass method, of class TMStudent.
     */
    @Test
    public void testGetColumnClass() {
        System.out.println("getColumnClass");
        int columnIndex = 0;
        TMStudent instance = null;
        Class expResult = null;
        Class result = instance.getColumnClass(columnIndex);
        assertEquals(expResult, result);

    }

    /**
     * Test of isCellEditable method, of class TMStudent.
     */
    @Test
    public void testIsCellEditable() {
        System.out.println("isCellEditable");
        int rowIndex = 0;
        int columnIndex = 0;
        TMStudent instance = null;
        boolean expResult = false;
        boolean result = instance.isCellEditable(rowIndex, columnIndex);
        assertEquals(expResult, result);

    }

    /**
     * Test of getValueAt method, of class TMStudent.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int rowIndex = 0;
        int columnIndex = 0;
        TMStudent instance = null;
        Object expResult = null;
        Object result = instance.getValueAt(rowIndex, columnIndex);
        assertEquals(expResult, result);

    }

    /**
     * Test of setValueAt method, of class TMStudent.
     */
    @Test
    public void testSetValueAt() {
        System.out.println("setValueAt");
        Object aValue = null;
        int rowIndex = 0;
        int columnIndex = 0;
        TMStudent instance = null;
        instance.setValueAt(aValue, rowIndex, columnIndex);

    }

    /**
     * Test of addTableModelListener method, of class TMStudent.
     */
    @Test
    public void testAddTableModelListener() {
        System.out.println("addTableModelListener");
        TableModelListener l = null;
        TMStudent instance = null;
        instance.addTableModelListener(l);

    }

    /**
     * Test of removeTableModelListener method, of class TMStudent.
     */
    @Test
    public void testRemoveTableModelListener() {
        System.out.println("removeTableModelListener");
        TableModelListener l = null;
        TMStudent instance = null;
        instance.removeTableModelListener(l);

    }
    
}
