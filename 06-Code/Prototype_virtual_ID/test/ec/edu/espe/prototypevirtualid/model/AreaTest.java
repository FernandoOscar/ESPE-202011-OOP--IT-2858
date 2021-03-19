/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.model;

import ec.edu.espe.prototypevirtualid.model.Area;
import ec.edu.espe.prototypevirtualid.model.Area;
import ec.edu.espe.prototypevirtualid.model.Area;
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
     * Test of isAvailability method, of class Area.
     */
    @Test
    public void testIsAvailability() {
        System.out.println("isAvailability");
        Area instance = new Area();
        boolean availability = true;
        boolean expResult = availability;
        boolean result = instance.isAvailability();
        assertEquals(expResult, result);
 
    }
    @Test
    public void testIsAvailability1() {
        System.out.println("isAvailability");
        Area instance = new Area();
        boolean availability = false;
        boolean expResult = availability;
        boolean result = instance.isAvailability();
        assertEquals(expResult, result);
 
    }


    /**
     * Test of getArea method, of class Area.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Area instance = new Area();
        instance.setArea("general medicine");
        String expResult = "general medicine";
        String result = instance.getArea();
        assertEquals(expResult, result);
  
    }
    @Test
    public void testGetArea1() {
        System.out.println("getArea");
        Area instance = new Area();
        instance.setArea("General medicine");
        String expResult = "general medicine";
        String result = instance.getArea();
        assertEquals(expResult, result);
  
    }
    @Test
    public void testGetArea2() {
        System.out.println("getArea");
        Area instance = new Area();
        instance.setArea("general medicine");
        String expResult = "general Medicine";
        String result = instance.getArea();
        assertEquals(expResult, result);
  
    }
    @Test
    public void testGetArea3() {
        System.out.println("getArea");
        Area instance = new Area();
        instance.setArea("general medicine");
        String expResult = "generalMedicine";
        String result = instance.getArea();
        assertEquals(expResult, result);
  
    }
    @Test
    public void testGetArea4() {
        System.out.println("getArea");
        Area instance = new Area();
        instance.setArea("generalmedicine");
        String expResult = "general medicine";
        String result = instance.getArea();
        assertEquals(expResult, result);
  
    }
    @Test
    public void testGetArea5() {
        System.out.println("getArea");
        Area instance = new Area();
        instance.setArea("General Medicine");
        String expResult = "general medicine";
        String result = instance.getArea();
        assertEquals(expResult, result);
  
    }
    @Test
    public void testGetArea6() {
        System.out.println("getArea");
        Area instance = new Area();
        instance.setArea("General Medicine");
        String expResult = "general Medicine";
        String result = instance.getArea();
        assertEquals(expResult, result);
  
    }
    @Test
    public void testGetArea7() {
        System.out.println("getArea");
        Area instance = new Area();
        instance.setArea("GENERAL MEDICINE");
        String expResult = "general medicine";
        String result = instance.getArea();
        assertEquals(expResult, result);
  
    }
    @Test
    public void testGetArea8() {
        System.out.println("getArea");
        Area instance = new Area();
        instance.setArea("general medicine");
        String expResult = "GENERAL MEDICINE";
        String result = instance.getArea();
        assertEquals(expResult, result);
  
    }


    
}
