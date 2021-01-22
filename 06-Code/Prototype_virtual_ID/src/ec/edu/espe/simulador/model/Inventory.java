package ec.edu.espe.simulador.model;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author group2
 */
public class Inventory {
    
    
    String location;
    boolean availability;
    String area;
    private ClinicalLaboratory ClinicalLaboratory;
    private GeneralMedicine GeneralMedicine;
    private Odontology Odontology;
    ArrayList<ClinicalLaboratory> cLaboratory = new ArrayList();
    ArrayList<GeneralMedicine> gMedicines = new ArrayList();
    ArrayList<Odontology> Odont = new ArrayList();
    
    public void samples(){
        ClinicalLaboratory = new ClinicalLaboratory();
        Scanner read = new Scanner(System.in);
        String sample;
        int n;
        do{
            System.out.println("How many samples do you need to enter? :");
            n = read.nextInt();
            
        }while(n<0);
        
        read.nextLine();
        for ( int i=0; i < n; i++){
            System.out.println("What kind of sample do you need?:");
            sample = read.nextLine();       
            ClinicalLaboratory.setSample(sample);
            cLaboratory.add(ClinicalLaboratory);
            System.out.println("The clinical laboratory received a sample of: " 
                                + ClinicalLaboratory.getSample()); 
        }
        
    }
    
    
    public void medicines(){
        GeneralMedicine = new GeneralMedicine();
        Scanner read = new Scanner(System.in);
        String medicine;        
        String expiration;
        int n;
        do{
            System.out.println("How much medication do you need: ");
            n = read.nextInt();
        }while(n<0);
        
        read.nextLine();
        for ( int i=0; i < n; i++){
            System.out.println("Enter the medicine you need: ");
            medicine = read.nextLine();           
            GeneralMedicine.setMedicine(medicine);
            gMedicines.add(GeneralMedicine);
            System.out.println("Enter the expiration date: ");
            expiration = read.nextLine();           
            GeneralMedicine.setExpiration(expiration);
            System.out.println("The medicine you admitted is: " + GeneralMedicine.getMedicine() +
                    " and should be taken before "+ GeneralMedicine.isExpiration()); 
        }
    }
    
    
    public void tools(){
       Odontology = new Odontology();
       Scanner read = new Scanner(System.in);
       String dentalTools;
       int n;
       do{
            System.out.println("How many treatments does it require? :");
            n = read.nextInt();
        }while(n<0);
       
       read.nextLine();
       for(int i=0; i<n ; i++){
          System.out.println("What treatment does it require? :");
          dentalTools = read.nextLine();          
          Odontology.setDentalTools(dentalTools);
          Odont.add(Odontology);
          System.out.println("The treatment to be carried out is: " + Odontology.getDentalTools()); 
       }
       
    }
   

}
    
    

