/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

import ec.edu.espe.filemanager.utils.Data;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import prototype_virtual_id.Prototype_virtual_ID;



/**
 *
 * @author User
 */
public class InformationStudent {
    
    private String name = "";
    private String id = "";
    private String career = "";
    
    
    
    public void enterData() {
        
        Scanner input = new Scanner(System.in);
        File file = new File("StudentData.csv");      
        System.out.print("Are you a student of the Universidad de las Fuerzas Armadas: ");
        System.out.println(" ");
        System.out.print("Yes(Y) or No(N): ");
        char answer1 = input.next().charAt(0);
        input.nextLine();
              
        if(answer1 == 'Y'){
            try{
                
                file.createNewFile();
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);

                System.out.print("Enter your name: ");
                setName(input.nextLine());
                System.out.print("Enter your id in format LXXXXXXXX: ");
                setId(input.nextLine());
                System.out.print("Enter your career: ");
                setCareer(input.nextLine());                
                
                System.out.println(" ");            
                System.out.println("Your data has been saved correctly!!");
                System.out.println("Your request has to be read by the director of your career");
                System.out.println("  BE PATTIENT ;) ");
                String dataToSave = getName()+","+getId()+","
                                     +getCareer();
                Data.save("StudentData.csv", dataToSave);
                System.out.println(" ");
                
                
                line.println(getName()+","+getId()+","+getCareer());
                line.close();
                write.close();
                
            }catch (IOException ex) {
                Logger.getLogger(Prototype_virtual_ID.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
        if(answer1 == 'N'){
            System.out.println("You cannot access this benefit!!");
            System.out.println(" ");
        }
        
           
        
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
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the career
     */
    public String getCareer() {
        return career;
    }

    /**
     * @param career the career to set
     */
    public void setCareer(String career) {
        this.career = career;
    }
}