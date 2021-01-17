/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class GeneralMedicine {
    private String medicine;
    private boolean expiration;
    private String sympton;
    
    
        
    
    public void genmed(){
        try{
            Scanner generalmed = new Scanner(System.in);
            System.out.println("What medicine do you need? ");
            setSympton(generalmed.nextLine());
        
            Scanner sc3 = new Scanner(System.in);
            File file = new File("GeneralMedicine.csv");
     
            String Generalmedicine;
            file.createNewFile();
            FileWriter write = new FileWriter(file, true);
            PrintWriter line = new PrintWriter(write);
            System.out.print("Enter your name of medicament: ");
            Generalmedicine = sc3.nextLine();
            System.out.println("Your medication was added correctly!!");
        
            line.println(getMedicine());
            line.close();
            write.close();
        }catch(IOException e){
            }
    }

    @Override
    public String toString() {
        return "GeneralMedicine{" + "medicine=" + medicine + ", expiration=" + expiration + ", sympton=" + sympton + '}';
    }
    

    public GeneralMedicine(String medicine, boolean expiration, String sympton) {
        this.medicine = medicine;
        this.expiration = expiration;
        this.sympton = sympton;
    }

    /**
     * @return the medicine
     */
    public String getMedicine() {
        return medicine;
    }

    /**
     * @param medicine the medicine to set
     */
    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    /**
     * @return the expiration
     */
    public boolean isExpiration() {
        return expiration;
    }

    /**
     * @param expiration the expiration to set
     */
    public void setExpiration(boolean expiration) {
        this.expiration = expiration;
    }

    /**
     * @return the sympton
     */
    public String getSympton() {
        return sympton;
    }

    /**
     * @param sympton the sympton to set
     */
    public void setSympton(String sympton) {
        this.sympton = sympton;
    }

        
    

    


    
}
