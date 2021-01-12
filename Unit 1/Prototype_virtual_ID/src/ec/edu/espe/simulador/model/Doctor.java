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
public class Doctor {
    private int id;
    private String name;
    private String area;
    private String address;
    private int phone;

    @Override
    public String toString() {
        return "Doctor{" + "id=" + id + ", name=" + name + ", area=" + area + ", address=" + address + ", phone=" + phone + '}';
    }

    public Doctor(int id, String name, String area, String address, int phone) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.address = address;
        this.phone = phone;
    }
    
    boolean addHistory(ClinicHistory clinicHistory){
        return true;
    }
    boolean removeHistory(ClinicHistory clinicHistory){
        return true;
               
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }
    
}
