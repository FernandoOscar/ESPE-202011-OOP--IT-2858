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
public class VirtualCard {

    private String department;
    private int id;
    private String name;
    private int QrCode;

    
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
     * @return the QrCode
     */
    public int getQrCode() {
        return QrCode;
    }

    /**
     * @param QrCode the QrCode to set
     */
    public void setQrCode(int QrCode) {
        this.QrCode = QrCode;
    }
    
    

}
