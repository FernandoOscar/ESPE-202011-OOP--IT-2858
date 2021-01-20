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
public class Odontology {
    private String medicine;
    private boolean expiration;
    private String sympton;
    
    
    private Scanner sc1 = new Scanner(System.in);
    private File file = new File("Odontology.csv");
    
    
    
    public void genmed(){
        
        
        try{
            getFile().createNewFile();
            FileWriter write = new FileWriter(getFile(), true);
            PrintWriter line = new PrintWriter(write);
            System.out.print("Enter your name of medicament: ");
            setMedicine(getSc1().nextLine());
            System.out.println("Your medication was added correctly!!");
        
            line.println(getMedicine());
            line.close();
            write.close();
        }catch(IOException e){
            }
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

    /**
     * @return the sc1
     */
    public Scanner getSc1() {
        return sc1;
    }

    /**
     * @param sc1 the sc1 to set
     */
    public void setSc1(Scanner sc1) {
        this.sc1 = sc1;
    }

    /**
     * @return the file
     */
    public File getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(File file) {
        this.file = file;
    }

    
  
}
