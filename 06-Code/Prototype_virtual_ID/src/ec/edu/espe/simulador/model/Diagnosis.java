/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

import ec.edu.espe.filemanager.utils.Data;
import java.io.IOException;

/**
 *
 * @author LENOVO
 */
public class Diagnosis {

    private String name;
    private String reasonConsult;
    private String medicinePrescribe;
    
    
    public void saveClinicHistory(String fileName, String record) throws IOException{
        Data.save("fileName", record);
        
    }

    public Diagnosis(String name, String reason, String medicinePrescribe) {
        this.name = name;
        this.reasonConsult = reason;
        this.medicinePrescribe = medicinePrescribe;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the reason
     */
    public String getReason() {
        return reasonConsult;
    }

    /**
     * @param reason the reason to set
     */
    public void setReason(String reason) {
        this.reasonConsult = reason;
    }

    /**
     * @return the medicinePrescribe
     */
    public String getMedicinePrescribe() {
        return medicinePrescribe;
    }

    /**
     * @param medicinePrescribe the medicinePrescribe to set
     */
    public void setMedicinePrescribe(String medicinePrescribe) {
        this.medicinePrescribe = medicinePrescribe;
    }

   
    
    
    

    
}
