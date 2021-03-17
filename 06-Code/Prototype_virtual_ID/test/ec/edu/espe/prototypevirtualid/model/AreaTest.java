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
public class AreaTest {
    
    public AreaTest() {
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
     * Test of setLocation method, of class Area.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        String location = "Hall 1";
        Area instance = new Area();
        instance.setLocation(location);
        
    }

    /**
     * Test of isAvailability method, of class Area.
     */
    @Test
    public void testIsAvailability() {
        System.out.println("isAvailability");
        Area instance = new Area();
        boolean expResult = false;
        boolean result = instance.isAvailability();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAvailability method, of class Area.
     */
    @Test
    public void testSetAvailability() {
        System.out.println("setAvailability");
        boolean availability = false;
        Area instance = new Area();
        instance.setAvailability(availability);

    }

    /**
     * Test of getArea method, of class Area.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Area instance = new Area();
        String expResult = null;
        String result = instance.getArea();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setArea method, of class Area.
     */
    @Test
    public void testSetArea() {
        System.out.println("setArea");
        String area = "";
        Area instance = new Area();
        instance.setArea(area);
 
    }
    
}
