
package prototype_virtual_id;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prototype_virtual_ID {
    
    public static void main(String[] args) {
        System.out.println("Welcome to the Virtual ID System");
        
        Scanner sn = new Scanner(System.in);
       boolean exit = false;
       int option; 
       
       while(!exit){
           
           System.out.println("1. Request VirtualID");
           System.out.println("2. Request Attention Polyclinic");          
           System.out.println("3. Exit");
           
           try{
           
           System.out.println("Write one of the options: ");
           option = sn.nextInt();

           switch(option){
               
               case 1:
                   
                                    
                   break;
                   
               case 2:
                   
                   break;
                   
               case 3:
                   System.out.println("Thanks!!!");
                   exit=true;
                   System.out.println(" ");
                   break;
                       
               default:
                   System.out.println("Only numbers between  1 - 3");
                   System.out.println(" ");
                   }
            } catch (InputMismatchException e) {
                System.out.println("You must insert a number!!");
                System.out.println(" ");
                sn.next();
                
           } 
       }
        
    }
    
}
