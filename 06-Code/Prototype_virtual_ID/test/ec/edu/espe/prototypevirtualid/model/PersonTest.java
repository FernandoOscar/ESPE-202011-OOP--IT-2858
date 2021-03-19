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
public class PersonTest {
    
    public PersonTest() {
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
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Person instance = new PersonImpl();
        String expResult = null;
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setName method, of class Person.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Jared";
        Person instance = new PersonImpl();
        instance.setName(name);
 
    }

    /**
     * Test of getEmail method, of class Person.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Person instance = new PersonImpl();
        String expResult = null;
        String result = instance.getEmail();
        assertEquals(expResult, result);

    }

    /**
     * Test of setEmail method, of class Person.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "Jared@espe.edu.ec";
        Person instance = new PersonImpl();
        instance.setEmail(email);

    }

    /**
     * Test of getAddress method, of class Person.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Person instance = new PersonImpl();
        String expResult = null;
        String result = instance.getAddress();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAddress method, of class Person.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "Quito - Magdalena";
        Person instance = new PersonImpl();
        instance.setAddress(address);

    }

    /**
     * Test of getAge method, of class Person.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Person instance = new PersonImpl();
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAge method, of class Person.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 0;
        Person instance = new PersonImpl();
        instance.setAge(age);

    }

    /**
     * Test of getId method, of class Person.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Person instance = new PersonImpl();
        String expResult = null;
        String result = instance.getId();
        assertEquals(expResult, result);

    }

    /**
     * Test of setId method, of class Person.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "L00384621";
        Person instance = new PersonImpl();
        instance.setId(id);

    }

    /**
     * Test of getGender method, of class Person.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Person instance = new PersonImpl();
        String expResult = null;
        String result = instance.getGender();
        assertEquals(expResult, result);

    }

    /**
     * Test of setGender method, of class Person.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "male";
        Person instance = new PersonImpl();
        instance.setGender(gender);

    }

    public class PersonImpl extends Person {
    }
    
}
