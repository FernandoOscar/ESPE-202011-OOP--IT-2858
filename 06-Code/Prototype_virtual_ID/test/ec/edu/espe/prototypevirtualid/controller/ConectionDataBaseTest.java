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
 * @author FRANCISCO
 */
public class ConectionDataBaseTest {
    
    public ConectionDataBaseTest() {
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
     * Test of ConectionDataBase method, of class ConectionDataBase.
     */
    @Test
    public void testConectionDataBase() {
        System.out.println("ConectionDataBase");
        String collection = "bry";
        ConectionDataBase instance = new ConectionDataBase();
        instance.ConectionDataBase(collection);
        
    }
    
     @Test
    public void testConectionDataBase1() {
        System.out.println("ConectionDataBase");
        String collection = "Majof";
        ConectionDataBase instance = new ConectionDataBase();
        instance.ConectionDataBase(collection);
        
    }
     @Test
    public void testConectionDataBase2() {
        System.out.println("ConectionDataBase");
        String collection = "Mjf";
        ConectionDataBase instance = new ConectionDataBase();
        instance.ConectionDataBase(collection);
        
    }
     @Test
    public void testConectionDataBase3() {
        System.out.println("ConectionDataBase");
        String collection = "FJOC1";
        ConectionDataBase instance = new ConectionDataBase();
        instance.ConectionDataBase(collection);
        
    }

    /**
     * Test of ConectionDataBaseDoctor method, of class ConectionDataBase.
     */
    @Test
    public void testConectionDataBaseDoctor() {
        System.out.println("ConectionDataBaseDoctor");
        String collection = "Lili";
        ConectionDataBase instance = new ConectionDataBase();
        instance.ConectionDataBaseDoctor(collection);
        
    }

    /**
     * Test of ConectionDataBaseDiagnosis method, of class ConectionDataBase.
     */
    @Test
    public void testConectionDataBaseDiagnosis() {
        System.out.println("ConectionDataBaseDiagnosis");
        String collection = "";
        ConectionDataBase instance = new ConectionDataBase();
        instance.ConectionDataBaseDiagnosis(collection);
        
    }

    /**
     * Test of ConectionDataBaseAppointment method, of class ConectionDataBase.
     */
    @Test
    public void testConectionDataBaseAppointment() {
        System.out.println("ConectionDataBaseAppointment");
        String collection = "Mishu";
        ConectionDataBase instance = new ConectionDataBase();
        instance.ConectionDataBaseAppointment(collection);
        
    }

    /**
     * Test of create method, of class ConectionDataBase.
     */
    @Test
    public void testCreate_7args() {
        System.out.println("create");
        String name = "Bryan Pazmino";
        String id = "L00354835";
        String career = "TI";
        String email = "bapazmino@espe.edu.ec";
        String address = "Conocoto";
        int age = 28;
        String gender = "male";
        ConectionDataBase instance = new ConectionDataBase();
        boolean expResult = false;
        boolean result = instance.create(name, id, career, email, address, age, gender);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class ConectionDataBase.
     */
    @Test
    public void testCreate_3args() {
        System.out.println("create");
        String nameDoctor = "";
        String workingHour = "";
        String specialty = "";
        ConectionDataBase instance = new ConectionDataBase();
        boolean expResult = false;
        boolean result = instance.create(nameDoctor, workingHour, specialty);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testCreate_3args1() {
        System.out.println("create");
        String nameDoctor = "";
        String workingHour = "";
        String specialty = "";
        ConectionDataBase instance = new ConectionDataBase();
        boolean expResult = false;
        boolean result = instance.create(nameDoctor, workingHour, specialty);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testCreate_3args2() {
        System.out.println("create");
        String nameDoctor = "256.2";
        String workingHour = "9,6";
        String specialty = "Frak";
        ConectionDataBase instance = new ConectionDataBase();
        boolean expResult = false;
        boolean result = instance.create(nameDoctor, workingHour, specialty);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    /**
     * Test of create method, of class ConectionDataBase.
     */
    @Test
    public void testCreate_String_String() {
        System.out.println("create");
        String data = "29/09/2021";
        String time = "09:30";
        ConectionDataBase instance = new ConectionDataBase();
        boolean expResult = false;
        boolean result = instance.create(data, time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ConectionDataBase.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String name = "";
        ConectionDataBase instance = new ConectionDataBase();
        boolean expResult = false;
        boolean result = instance.delete(name);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testDelete7() {
        System.out.println("delete");
        String name = "Frank";
        ConectionDataBase instance = new ConectionDataBase();
        boolean expResult = false;
        boolean result = instance.delete(name);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testDelete1() {
        System.out.println("delete");
        String name = "1593";
        ConectionDataBase instance = new ConectionDataBase();
        boolean expResult = false;
        boolean result = instance.delete(name);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testDelet2() {
        System.out.println("delete");
        String name = "Majof56";
        ConectionDataBase instance = new ConectionDataBase();
        boolean expResult = false;
        boolean result = instance.delete(name);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testDelete3() {
        System.out.println("delete");
        String name = "Brake6";
        ConectionDataBase instance = new ConectionDataBase();
        boolean expResult = false;
        boolean result = instance.delete(name);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testDelete4() {
        System.out.println("delete");
        String name = "Jhanny";
        ConectionDataBase instance = new ConectionDataBase();
        boolean expResult = false;
        boolean result = instance.delete(name);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testDelete5() {
        System.out.println("delete");
        String name = "juan89";
        ConectionDataBase instance = new ConectionDataBase();
        boolean expResult = false;
        boolean result = instance.delete(name);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of read method, of class ConectionDataBase.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        ConectionDataBase instance = new ConectionDataBase();
        instance.read();        
    }
    
}
