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
public class VirtualCard {

    private String department;
    private int id;
    private String name;
    private int[] numID = new int[8];

    VirtualCard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean giveWay() {
        return true;
    }

    public boolean showIdentification(int dataID) {
        int x;

        if (dataID != 8) {
            System.out.println("\tWrong ID!!");
            return true;
        }
        return false;
    }

    public VirtualCard(String department, int id, String name) {
        this.department = department;
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "VirtualCard{" + "department=" + getDepartment() + ", id=" + getId() + ", name=" + getName() + ", numID=" + getNumID() + '}';
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the numID
     */
    public int[] getNumID() {
        return numID;
    }

    /**
     * @param numID the numID to set
     */
    public void setNumID(int[] numID) {
        this.numID = numID;
    }
    

}
