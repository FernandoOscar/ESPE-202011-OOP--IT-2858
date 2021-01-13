/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;


import ec.edu.espe.filemanager.utils.Data;
import java.io.File;
import java.util.Scanner;


/**
 *
 * @author Developers
 */
public class Director {
    String career;
    String name;
    String faculty;
    int password = 1234;
    
    
    public void security(){
        
        Scanner ans1 = new Scanner(System.in);
        System.out.println("Are you a career Director?");
        System.out.print("Yes(Y) or No(N): ");
        char answer1 = ans1.next().charAt(0);
        ans1.nextLine();
              
        if(answer1 == 'Y'){
            try{
                System.out.println("Give me your name: ");
                name = ans1.nextLine();
                System.out.print("What career are you director of?: ");
                career = ans1.nextLine();
                System.out.print("Enter your password: ");
                password = ans1.nextInt();
                
                if(password==1234){
                    File file = new File("StudentData.csv"); 
                    System.out.println("======================");
                    System.out.println("Search Student Request");
                    System.out.println("======================");
                    Scanner keyboard = new Scanner(System.in);
                    System.out.print("Write the request to search in the file: ");
                    String data = keyboard.nextLine();
                    Data.find(file, data);
                    System.out.println("");
                }
                
                else{
                    System.out.println("Incorrect password");
                    System.out.println(" ");
                } 
            }catch(Exception e){
                
            }
            
        }
            
        if(answer1 == 'N'){
            System.out.println("Only career directors can use this field!!");
            System.out.println(" ");
            
        }
        
        
        
    }

}