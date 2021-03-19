/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.model;

import ec.edu.espe.prototypevirtualid.model.Person;
import ec.edu.espe.prototypevirtualid.model.Person;
import ec.edu.espe.prototypevirtualid.model.Person;
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
        instance.setName("Johny Navarro");
        String expResult = "Johny Navarro";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetName1() {
        System.out.println("getName");
        Person instance = new PersonImpl();
        instance.setName("Johny Navarro");
        String expResult = "JohnyNavarro";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetName2() {
        System.out.println("getName");
        Person instance = new PersonImpl();
        instance.setName("Johny Navarro");
        String expResult = "Jhony Navarro";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetName3() {
        System.out.println("getName");
        Person instance = new PersonImpl();
        instance.setName("Johny Navarro");
        String expResult = "Johny Nabarro";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetName4() {
        System.out.println("getName");
        Person instance = new PersonImpl();
        instance.setName("Carlos Tevez");
        String expResult = "Carlos Tevez";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetName5() {
        System.out.println("getName");
        Person instance = new PersonImpl();
        instance.setName("Carlos Tevez");
        String expResult = "carlos Tevez";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getEmail method, of class Person.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Person instance = new PersonImpl();
        instance.setEmail("juan@espe.edu.ec");
        String expResult = "juan@espe.edu.ec";
        String result = instance.getEmail();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetEmail1() {
        System.out.println("getEmail");
        Person instance = new PersonImpl();
        instance.setEmail("Juan@espe.edu.ec");
        String expResult = "juan@espe.edu.ec";
        String result = instance.getEmail();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetEmail2() {
        System.out.println("getEmail");
        Person instance = new PersonImpl();
        instance.setEmail("juan@espe.edu.ec");
        String expResult = "juan14@espe.edu.ec";
        String result = instance.getEmail();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetEmail3() {
        System.out.println("getEmail");
        Person instance = new PersonImpl();
        instance.setEmail("Pedro@espe.edu.ec");
        String expResult = "pedro@espe.edu.ec";
        String result = instance.getEmail();
        assertEquals(expResult, result);

    }

    /**
     * Test of getAddress method, of class Person.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Person instance = new PersonImpl();
        instance.setAddress("Quito - Magdalena");
        String expResult = "Quito - Magdalena";
        String result = instance.getAddress();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetAddress1() {
        System.out.println("getAddress");
        Person instance = new PersonImpl();
        instance.setAddress("Quito - Magdalena");
        String expResult = "Quito Magdalena";
        String result = instance.getAddress();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetAddress2() {
        System.out.println("getAddress");
        Person instance = new PersonImpl();
        instance.setAddress("Quito - Magdalena");
        String expResult = "quito - magdalena";
        String result = instance.getAddress();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetAddress3() {
        System.out.println("getAddress");
        Person instance = new PersonImpl();
        instance.setAddress("Quito  Magdalena");
        String expResult = "Quito Magdalena";
        String result = instance.getAddress();
        assertEquals(expResult, result);

    }

    /**
     * Test of getAge method, of class Person.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Person instance = new PersonImpl();
        instance.setAge(21);
        int expResult = 21;
        int result = instance.getAge();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetAge1() {
        System.out.println("getAge");
        Person instance = new PersonImpl();
        instance.setAge(21);
        int expResult = 22;
        int result = instance.getAge();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetAge2() {
        System.out.println("getAge");
        Person instance = new PersonImpl();
        instance.setAge(22);
        int expResult = 21;
        int result = instance.getAge();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetAge3() {
        System.out.println("getAge");
        Person instance = new PersonImpl();
        instance.setAge(20);
        int expResult = 19;
        int result = instance.getAge();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetAge4() {
        System.out.println("getAge");
        Person instance = new PersonImpl();
        instance.setAge(25);
        int expResult = 30;
        int result = instance.getAge();
        assertEquals(expResult, result);

    }

    /**
     * Test of getId method, of class Person.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Person instance = new PersonImpl();
        instance.setId("L00378963");
        String expResult = "L00378963";
        String result = instance.getId();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetId1() {
        System.out.println("getId");
        Person instance = new PersonImpl();
        instance.setId("L00378963");
        String expResult = "L0037896";
        String result = instance.getId();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetId2() {
        System.out.println("getId");
        Person instance = new PersonImpl();
        instance.setId("L00378963");
        String expResult = "L00378967";
        String result = instance.getId();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetId3() {
        System.out.println("getId");
        Person instance = new PersonImpl();
        instance.setId("L00378963");
        String expResult = "L00373963";
        String result = instance.getId();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetId4() {
        System.out.println("getId");
        Person instance = new PersonImpl();
        instance.setId("L00378969");
        String expResult = "L00378963";
        String result = instance.getId();
        assertEquals(expResult, result);

    }

    /**
     * Test of getGender method, of class Person.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Person instance = new PersonImpl();
        instance.setGender("Male");
        String expResult = "Male";
        String result = instance.getGender();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetGender1() {
        System.out.println("getGender");
        Person instance = new PersonImpl();
        instance.setGender("Male");
        String expResult = "Male";
        String result = instance.getGender();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetGender2() {
        System.out.println("getGender");
        Person instance = new PersonImpl();
        instance.setGender("Feminine");
        String expResult = "feminine";
        String result = instance.getGender();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetGender3() {
        System.out.println("getGender");
        Person instance = new PersonImpl();
        instance.setGender("Other");
        String expResult = "other";
        String result = instance.getGender();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetGender4() {
        System.out.println("getGender");
        Person instance = new PersonImpl();
        instance.setGender("Feminine");
        String expResult = "feminine";
        String result = instance.getGender();
        assertEquals(expResult, result);

    }

    public class PersonImpl extends Person {
    }

}
