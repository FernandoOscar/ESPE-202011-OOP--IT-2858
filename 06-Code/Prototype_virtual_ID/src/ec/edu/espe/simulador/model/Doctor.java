/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

import ec.edu.espe.filemanager.utils.Data;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class Doctor {
    
    private String name;
    private String id;
    private String area;
    private String address;
    private String phone;
    
    public void doctorData() {

        Scanner input = new Scanner(System.in);
        File file = new File("DoctorData.csv");
        System.out.print("Are you available for today? : ");
        System.out.println(" ");
        System.out.print("Yes(Y) or No(N): ");
        char answer1 = input.next().charAt(0);
        input.nextLine();

        if (answer1 == 'Y') {
            try {

                file.createNewFile();
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);

                System.out.print("Enter your name: ");
                setName(input.nextLine());
                System.out.print("Enter your id: ");
                setId(input.nextLine());
                System.out.print("Enter your area: ");
                setArea(input.nextLine());
                System.out.print("Enter your address: ");
                setAddress(input.nextLine());
                System.out.print("Enter your phone: ");
                setPhone(input.nextLine());

                System.out.println(" ");            
                System.out.println("Your data has been saved correctly");
                System.out.println("Your can attend today");
               
                String dataToSave = getName() + "," + getId() + "," + getArea() + "," + getAddress() + "," + getPhone();
                Data.save("DoctorData.csv", dataToSave);
                System.out.println(" ");

                line.println(getName() + "," + getId() + "," + getArea() + "," + getAddress() + "," + getPhone());
                line.close();
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (answer1 == 'N') {
            System.out.println("You can not access!!");
            System.out.println(" ");
        }
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
