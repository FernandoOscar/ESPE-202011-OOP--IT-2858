
package prototype_virtual_id;


import ec.edu.espe.filemanager.utils.Data;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prototype_virtual_ID {
    
    
    
    
    public static void main(String[] args) throws IOException {
        
        
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
                        GetData obj1 = new GetData();
                        obj1.enterData();
                        //obj1.getId();                   
                        //obj1.getName();
                        //obj1.getCareer();
                        //String dataToSave = obj1.getId()+","+obj1.getName()+","
                          //                  +obj1.getCareer();
                        //System.out.println(" ");
                        //Data.save("StudentData.csv", dataToSave);
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
}
   