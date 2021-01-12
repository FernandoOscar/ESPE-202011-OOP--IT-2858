
package prototype_virtual_id;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prototype_virtual_ID {
    
    
    
    
    public static void main(String[] args) {
        
        
        System.out.println("================================");
        System.out.println("Welcome to the Virtual ID System");
        System.out.println("================================");
        
        
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
                        validation();
                        break;
                   
                    case 2:
                        attention();
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
    
    public static void attention(){
        Scanner sn2 = new Scanner(System.in);
        int option2;
        System.out.println("\n-----In what area should it be understood?---");
        System.out.println("(1) General Medice");
        System.out.println("(2) Odontology");
        System.out.println("(3) Clinical Laboratory");
        System.out.println("(4) Physiotherapy");
        option2 = sn2.nextInt();
    }
    private static void validation() {
        boolean temp = false;
        
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
            temp = true;
        }
    }
    
}
