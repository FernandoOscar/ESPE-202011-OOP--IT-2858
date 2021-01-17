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
public class Odontology {
    private String medicine;
    private boolean expiration;
    private String sympton;
    
    
    public void odmed(){
        Scanner gen = new Scanner(System.in);
        System.out.println("What medicine do you need? ");
        setSympton(gen.nextLine());
          
    }

    @Override
    public String toString() {
        return "Odontology{" + "medicine=" + medicine + ", expiration=" + expiration + '}';
    }

    public Odontology(String medicine, boolean expiration) {
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
    public boolean isExpiration() {
        return expiration;
    }

    /**
     * @param expiration the expiration to set
     */
    public void setExpiration(boolean expiration) {
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
