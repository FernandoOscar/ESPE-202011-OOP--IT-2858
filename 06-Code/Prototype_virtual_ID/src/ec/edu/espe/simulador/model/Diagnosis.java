/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

import ec.edu.espe.filemanager.utils.Data;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Diagnosis {

    private String patientName;
    private String symptom;
    private String medicine;
    
    
    public void saveClinicHistory(String fileName, String record) throws IOException{
        Data.save("fileName", record);
        
    }
    public Diagnosis(){
    
    }
    
    public void addHistory() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name patient: ");
        setPatientName(scan.nextLine());
        System.out.print("Enter your symptom: ");
        setSymptom(scan.nextLine());
        System.out.print("Enter the needs medicine: ");
        setMedicine(scan.nextLine());
    }
    

    public Diagnosis(String patientName, String symptom, String medicine) {
        this.patientName = patientName;
        this.symptom = symptom;
        this.medicine = medicine;
    }
    

    /**
     * @return the patientName
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * @param patientName the patientName to set
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * @return the symptom
     */
    public String getSymptom() {
        return symptom;
    }

    /**
     * @param symptom the symptom to set
     */
    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    /**
     * @return the medicine
     */
    public String getMedicine() {
        return medicine;
    }

    /**
     * @param medicine the medicine to set
     */
    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

  
}
