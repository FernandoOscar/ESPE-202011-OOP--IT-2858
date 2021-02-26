/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;


public abstract class  Administrator extends Person{
    
    private String deparment;

    public Administrator(String deparment, String name, String email, String address, int age, String id) {
        super(name, email, address, age, id);
        this.deparment = deparment;
    }  

    public Administrator() {
    }
    
    
     
    public abstract void addDatabase();
    public abstract void createId();
    public abstract void removeStudent();

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }
            
    

}
