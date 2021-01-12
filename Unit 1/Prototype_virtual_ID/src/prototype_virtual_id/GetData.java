/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype_virtual_id;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class GetData {
    
    
    
    public static void enterData(){
        
        
        
        Scanner input = new Scanner(System.in);        
        System.out.print("Are you a student of the Universiad de las Fuerzas Armadas: ");
        System.out.println(" ");
        System.out.print("Yes(Y) or No(N): ");
        char answer1 = input.next().charAt(0);
        
        if(answer1 == 'Y'){
            System.out.println("Give me your ID: ");
            String id = input.next();
            input.nextLine();
            System.out.print("Give me your name: ");
            String name = input.next();
            input.nextLine();
            System.out.println("Give your career: ");
            String career = input.next();
            input.nextLine();
            System.out.println("");            
            System.out.println("Your request has to be read by the director of your career");
               
        } 
        if(answer1 == 'N'){
            System.out.println("You cannot access this benefit");
           
        }
    }
        
        
        
        
    
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void save(String fileName, String record){
        //TODO code to save data in a file
        System.out.println("Calling save method, with parameters: "+fileName+" and "+record);   
    }
    
    public static String find(File file, String data){
        
        try {
            if(file.exists()) {
                BufferedReader readFile = new BufferedReader(new FileReader(file));
                String readLine;
                while((readLine = readFile.readLine()) != null) {
                    //totalLines=totalLines+1;
                    String[] words = readLine.split(" ");
                    for (String word : words) {
                        if (word.equals(data)) {                            
                            //totalCoincidence = totalCoincidence +1;
                            System.out.println(readLine);                            
                        }
                    }
                }
            }
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        return data;
    }
    
    
    
}



