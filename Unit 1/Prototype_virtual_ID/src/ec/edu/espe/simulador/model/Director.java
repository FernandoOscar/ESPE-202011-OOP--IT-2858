/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;


import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import prototype_virtual_id.Prototype_virtual_ID;

/**
 *
 * @author JOHNY
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
                    System.out.println("======================");
                    System.out.println("Search Student Request");
                    System.out.println("======================");
                }
                
                else{
                    System.out.println("Incorrect password");
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