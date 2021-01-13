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
     
    public static void enterData() throws IOException{
        
        Scanner input = new Scanner(System.in);
        File file = new File("StudentData.csv");      
        System.out.print("Are you a student of the Universidad de las Fuerzas Armadas: ");
        System.out.println(" ");
        System.out.print("Yes(Y) or No(N): ");
        char answer1 = input.next().charAt(0);
        
        if(answer1 == 'Y'){
            
            file.createNewFile();
            FileWriter write = new FileWriter(file, true);
            PrintWriter line = new PrintWriter(write);
            System.out.println("Give me your ID");
            System.out.println("Format LXXXXXXXX: ");
            String id = input.next();
            input.nextLine();
            System.out.print("Give me your name: ");
            String name = input.next();
            input.nextLine();
            System.out.print("Give me your surname: ");
            String surname = input.next();
            input.nextLine();
            System.out.println("Give your career: ");
            String career = input.next();
            input.nextLine();
            System.out.println(" ");            
            System.out.println("Your data has been saved correctly!!");
            System.out.println("Your request has to be read by the director of your career");
            System.out.println(" ");
            line.print(id);
            line.print(name);
            line.print(career);
            line.close();
            write.close();
                      
        } 
        
        if(answer1 == 'N'){
            System.out.println("You cannot access this benefit!!");
            System.out.println(" ");
           
        }

    }
        
        
        
        
    
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void save(String fileName, String record){
        //TODO code to save data in a file
        System.out.println("Calling save method, with parameters: "+fileName+" and "+record);   
    }
    
    /*public static String find(File file, String data){
        
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
    }*/
    
    
    
}



