/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Physiotherapy {
    private String medicine;
    private Boolean expiration;
    private String sympton;
    
    public void genmed(){
        Scanner gen = new Scanner(System.in);
        System.out.println("What medicine do you need? ");
        setSympton(gen.nextLine());
        
        
    }

    @Override
    public String toString() {
        return "Physiotherapy{" + "medicine=" + medicine + ", expiration=" + expiration + '}';
    }

    
    public Physiotherapy(String medicine, Boolean expiration) {
        this.medicine = medicine;
        this.expiration = expiration;
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

    /**
     * @return the expiration
     */
    public Boolean getExpiration() {
        return expiration;
    }

    /**
     * @param expiration the expiration to set
     */
    public void setExpiration(Boolean expiration) {
        this.expiration = expiration;
    }

    /**
     * @return the sympton
     */
    public String getSympton() {
        return sympton;
    }

    /**
     * @param sympton the sympton to set
     */
    public void setSympton(String sympton) {
        this.sympton = sympton;
    }
    
}
