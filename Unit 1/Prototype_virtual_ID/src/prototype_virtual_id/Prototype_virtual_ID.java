
package prototype_virtual_id;


import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.simulador.model.Director;
import ec.edu.espe.simulador.model.InformationStudent;
import ec.edu.espe.simulador.model.Polyclinic;
import java.io.File;
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
            System.out.println("2. Accept Request");
            System.out.println("3. Request Attention Polyclinic");
            System.out.println("4. Exit");
           
            try{
                
                System.out.println("Write one of the options: ");
                option = sn.nextInt();
                
                switch(option){
                    
                    
                    case 1:
                        InformationStudent obj1 = new InformationStudent();
                        obj1.enterData();
                                           
                        obj1.getName();
                        obj1.getId();
                        obj1.getCareer();
                        String dataToSave = obj1.getName()+","+obj1.getId()+","
                                            +obj1.getCareer();
                        Data.save("StudentData.csv", dataToSave);
                        break;
                        
                    case 2:
                        
                        Director obj2 = new Director();
                        obj2.security();
                     
                        break;
                        
                    case 3:
                        Polyclinic.attention();
                        break;
                   
                    case 4:
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
   