/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype_virtual_id;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



/**
 *
 * @author User
 */
public class GetData {
    
    private String id = "";
    private String name = "";
    private String career = "";
    

    
     
    public void enterData() {
        
        Scanner input = new Scanner(System.in);
        File file = new File("StudentData.csv");      
        System.out.print("Are you a student of the Universidad de las Fuerzas Armadas: ");
        System.out.println(" ");
        System.out.print("Yes(Y) or No(N): ");
        char answer1 = input.next().charAt(0);
        
        try{
            if(answer1 == 'Y'){
            
            file.createNewFile();
            FileWriter write = new FileWriter(file, true);
            PrintWriter line = new PrintWriter(write);
            
            System.out.print("Give me your name: ");
            setName(input.nextLine());
            input.nextLine();

            System.out.println("Give me your ID");
            System.out.println("Format LXXXXXXXX: ");
            setId(input.next());
            

            System.out.print("Give me your surname: ");
            String surname = input.next();
            input.nextLine();

            System.out.println("Give your career: ");
            setCareer(input.next());
            
            System.out.println(" ");            
            System.out.println("Your data has been saved correctly!!");
            System.out.println("Your request has to be read by the director of your career");
            System.out.println("  BE PATTIENT ;) ");
            System.out.println(" ");
            
            
            line.println(getId()+","+getName()+","+getCareer());
            line.close();
            write.close();
                      
        } 
        
        if(answer1 == 'N'){
            System.out.println("You cannot access this benefit!!");
            System.out.println(" ");
        }
           
        }catch(IOException e){
                
                }
            
        
        

    }
    public GetData() {
        this.career = "";
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

