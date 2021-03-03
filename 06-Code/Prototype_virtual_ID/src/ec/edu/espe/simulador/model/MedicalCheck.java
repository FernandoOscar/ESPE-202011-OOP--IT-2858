/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

import ec.edu.espe.filemanager.utils.Data;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class MedicalCheck {

    private String dateAppoinment;
    private String timeAppoinment;
    
    
    public void addAppoinment(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the day medical appointment: ");
        setTime(scan.nextLine());
        System.out.print("Enter the time medical appointment: ");
        setDate(scan.nextLine());
    }

    

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
