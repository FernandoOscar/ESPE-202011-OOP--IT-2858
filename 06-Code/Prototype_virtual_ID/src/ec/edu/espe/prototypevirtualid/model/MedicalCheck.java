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

    private String Name;
    private String Id;
    private String dateAppoinment;
    private String timeAppoinment;
    
    public MedicalCheck(String name, String id, String date, String time) {
        this.Name = name;
        this.Id = id;
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

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    
}
