/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

import ec.edu.espe.prototypevirtualid.model.Doctor;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LENOVO
 */
public class DoctorTest {
    
    public DoctorTest() {
    }

    /**
     * Test of validUser method, of class Doctor.
     */
    @org.junit.Test
    public void testValidUser() {
        System.out.println("validUser");
        String user = "";
        String password = "";
        Doctor instance = new Doctor();
        boolean expResult = false;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
     
    }
    
    @Test
    public void testValidUser1() {
        System.out.println("validUser");
        String user = "Mlb";
        String password = "125";
        Doctor instance = new Doctor();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser2() {
        System.out.println("validUser");
        String user = "M....OF";
        String password = "¿¿¿45";
        Doctor instance = new Doctor();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser3() {
        System.out.println("validUser");
        String user = "MIIF";
        String password = "145";
        Doctor instance = new Doctor();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser4() {
        System.out.println("validUser");
        String user = "MAJOoooF";
        String password = "56uf5";
        Doctor instance = new Doctor();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser5() {
        System.out.println("validUser");
        String user = "MAJOFFF";
        String password = "12345";
        Doctor instance = new Doctor();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser6() {
        System.out.println("validUser");
        String user = "MAAAJOF";
        String password = "8345";
        Doctor instance = new Doctor();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser7() {
        System.out.println("validUser");
        String user = "MAJOmkjF";
        String password = "1234$5";
        Doctor instance = new Doctor();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser8() {
        System.out.println("validUser");
        String user = "MAJO##F";
        String password = "123hi45";
        Doctor instance = new Doctor();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser9() {
        System.out.println("validUser");
        String user = "MJIOP";
        String password = "###";
        Doctor instance = new Doctor();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser10() {
        System.out.println("validUser");
        String user = "M";
        String password = "45";
        Doctor instance = new Doctor();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser11() {
        System.out.println("validUser");
        String user = "MAbhhh";
        String password = "098";
        Doctor instance = new Doctor();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser12() {
        System.out.println("validUser");
        String user = "MQWR";
        String password = "12m945";
        Doctor instance = new Doctor();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser13() {
        System.out.println("validUser");
        String user = "MAJPP";
        String password = "12#%5";
        Doctor instance = new Doctor();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser14() {
        System.out.println("validUser");
        String user = "M";
        String password = "1#5";
        Doctor instance = new Doctor();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser15() {
        System.out.println("validUser");
        String user = "M&&F";
        String password = "";
        Doctor instance = new Doctor();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser16() {
        System.out.println("validUser");
        String user = "MMM";
        String password = "1234";
        Doctor instance = new Doctor();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser17() {
        System.out.println("validUser");
        String user = "POLK";
        String password = "098";
        Doctor instance = new Doctor();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser18() {
        System.out.println("validUser");
        String user = "QAZ";
        String password = "1****";
        Doctor instance = new Doctor();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser19() {
        System.out.println("validUser");
        String user = "";
        String password = "****";
        Doctor instance = new Doctor();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testValidUser20() {
        System.out.println("validUser");
        String user = "MAF";
        String password = "####";
        Doctor instance = new Doctor();
        boolean expResult = true;
        boolean result = instance.validUser(user, password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addDoctor method, of class Doctor.
     */
    @org.junit.Test
    public void testAddDoctor() {
        System.out.println("addDoctor");
        Doctor instance = new Doctor();
        instance.addDoctor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpecialty method, of class Doctor.
     */
    @org.junit.Test
    public void testGetSpecialty() {
        System.out.println("getSpecialty");
        Doctor instance = new Doctor();
        String expResult = "";
        String result = instance.getSpecialty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpecialty method, of class Doctor.
     */
    @org.junit.Test
    public void testSetSpecialty() {
        System.out.println("setSpecialty");
        String specialty = "";
        Doctor instance = new Doctor();
        instance.setSpecialty(specialty);
    }
    
    

    /**
     * Test of getNameDoctor method, of class Doctor.
     */
    @org.junit.Test
    public void testGetNameDoctor() {
        System.out.println("getNameDoctor");
        Doctor instance = new Doctor();
        String expResult = "";
        String result = instance.getNameDoctor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNameDoctor method, of class Doctor.
     */
    @org.junit.Test
    public void testSetNameDoctor() {
        System.out.println("setNameDoctor");
        String nameDoctor = "";
        Doctor instance = new Doctor();
        instance.setNameDoctor(nameDoctor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWorkingHour method, of class Doctor.
     */
    @org.junit.Test
    public void testGetWorkingHour() {
        System.out.println("getWorkingHour");
        Doctor instance = new Doctor();
        String expResult = "";
        String result = instance.getWorkingHour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWorkingHour method, of class Doctor.
     */
    @org.junit.Test
    public void testSetWorkingHour() {
        System.out.println("setWorkingHour");
        String workingHour = "";
        Doctor instance = new Doctor();
        instance.setWorkingHour(workingHour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
