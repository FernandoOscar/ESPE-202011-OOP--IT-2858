/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

/**
 *
 * @author JOHNY
 */
public class ControlBooth {
    private String name;
    private int id;

    @Override
    public String toString() {
        return "ControlBooth{" + "name=" + name + ", id=" + id + '}';
    }

    public ControlBooth(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    
    boolean checkID(VirtualCard virtualCard){
        return true;
        
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
    
}
