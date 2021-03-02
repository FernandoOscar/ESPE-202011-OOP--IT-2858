package ec.edu.espe.simulador.model;

import ec.edu.espe.verify.security;
import java.util.Scanner;


public class Director extends Administrator{

    private String career;


    public Director() {
    }

    
    public boolean approveMotion(char answer){
        if (answer == 'Y' || answer == 'y') {
            return true;
        }

        else if (answer == 'N' || answer == 'n') {
            return false;
        }
        return false;
        
    }

    @Override
    public void addDatabase() {
   }

    @Override
    public void createId() {
        
    }

    @Override
    public void removeStudent() {
    }

    @Override
    public boolean validId() {
        Scanner valid = new Scanner(System.in);
        System.out.println("Enter your number of cedula: ");
        String id = valid.nextLine();
        return security.validId(id);
   }

    public Director(String career, String deparment, String name, String email, String address, int age, String id) {
        super(deparment, name, email, address, age, id);
        this.career = career;
    }


    public String getCareer() {
        return career;
    }
    
    public void setCareer(String career) {
        this.career = career;
    }

    
    

    
    
    
    
    

}
