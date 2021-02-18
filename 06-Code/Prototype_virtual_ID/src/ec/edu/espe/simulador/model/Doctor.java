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
public class Doctor {
    
    private String name;
    private String area;
    private String schedule;
    
    
    public void addHistory(String ClinicHistory, String reason) throws IOException{
        Data.save(ClinicHistory, reason);
    }
    

    public Doctor(String name, String area, String schedule) {
        this.name = name;
        this.area = area;
        this.schedule = schedule;
    }

    public Doctor() {
    }
    
    
    
    
    public void checkHistory(){
        Data.findAll("", name);
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
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the schedule
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * @param schedule the schedule to set
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
    
    
}