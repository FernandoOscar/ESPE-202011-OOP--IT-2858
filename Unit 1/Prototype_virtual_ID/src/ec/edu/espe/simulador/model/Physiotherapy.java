/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Physiotherapy {
    
    Scanner sc1 = new Scanner(System.in);
    File file = new File("PhysMedicine.csv");
    
    private String medicine;
    
    public void genmed(){
        
        
        try{
            file.createNewFile();
            FileWriter write = new FileWriter(file, true);
            PrintWriter line = new PrintWriter(write);
            System.out.print("Enter your name of medicament: ");
            medicine = sc1.nextLine();
            System.out.println("Your medication was added correctly!!");
        
            line.println(medicine);
            line.close();
            write.close();
        }catch(IOException e){
            }
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
    

   
