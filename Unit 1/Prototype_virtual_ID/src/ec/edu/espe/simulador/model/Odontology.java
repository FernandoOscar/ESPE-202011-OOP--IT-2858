/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

/**
 *
 * @author LENOVO
 */
public class Odontology {
    private String medicine;
    private boolean expiration;

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
}
