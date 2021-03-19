/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.model;

/**
 *
 * @author LENOVO
 */
public class MedicalCheck {

    private String dateAppoinment;
    private String timeAppoinment;
    
    public MedicalCheck(String date, String time) {
        this.dateAppoinment = date;
        this.timeAppoinment = time;
    }

    public MedicalCheck() {
    }

    /**
     * @return the date
     */
    public String getDate() {
        return dateAppoinment;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.dateAppoinment = date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return timeAppoinment;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.timeAppoinment = time;
    }

    
}
