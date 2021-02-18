/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

import ec.edu.espe.filemanager.utils.Data;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author User
 */
public class Administrator {
    
    private String name;
    private Student student;
    private String saveData;
  
    public void addDatabase(String fileName, String record){
        try {
            Data.save(fileName, record);
        } catch (IOException ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public Administrator(String name) {
        this.name = name;
    }
    
    
    
    public Administrator(){
        
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
     * @return the student
     */
    public Student getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * @return the saveData
     */
    public String getSaveData() {
        return saveData;
    }

    /**
     * @param saveData the saveData to set
     */
    public void setSaveData(String saveData) {
        this.saveData = saveData;
    }
    
    
    
    
    
    

}
