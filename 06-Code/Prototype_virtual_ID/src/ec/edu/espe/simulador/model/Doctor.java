
package ec.edu.espe.simulador.model;

import ec.edu.espe.verify.security;
import java.util.Scanner;

public class Doctor extends Person{
    
    private String specialty;
    private String schedule;

    public Doctor() {
    }

   

    public void addHistory(){
        
    }
    
    public void removeHistory(){
        
    }
    
    @Override
    public boolean validId() {
        Scanner valid = new Scanner(System.in);
        System.out.println("Enter your number of cedula: ");
        String id = valid.nextLine();
        return security.validId(id);        
    }

    public Doctor(String specialty, String schedule, String name, String email, String address, int age, String id) {
        super(name, email, address, age, id);
        this.specialty = specialty;
        this.schedule = schedule;
    }
     

    
    public String getSpecialty() {
        return specialty;
    }

    
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    
    public String getSchedule() {
        return schedule;
    }


    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
    
}