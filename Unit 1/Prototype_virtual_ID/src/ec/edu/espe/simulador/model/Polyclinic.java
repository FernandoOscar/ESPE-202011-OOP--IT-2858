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
 * @author JOHNY
 */
public class Polyclinic {
    private int virtualid;
    private boolean qrcode;
    
    
    public static void attention(){
        Scanner sn2 = new Scanner(System.in);
        int option2;
        System.out.println("\n-----In what area should it be understood?---");
        System.out.println("(1) General Medice");
        System.out.println("(2) Odontology");
        System.out.println("(3) Clinical Laboratory");
        System.out.println("(4) Physiotherapy");
        
        try {
            System.out.println("Write on of the options: ");
            option2 = sn2.nextInt();
            if(option2==1){
                Inventory.Medicines();
            }if(option2==2){
                
            }if(option2==3){
                
            }
        }catch(Exception e){
            
        }
        
        
      }
    }
    
   