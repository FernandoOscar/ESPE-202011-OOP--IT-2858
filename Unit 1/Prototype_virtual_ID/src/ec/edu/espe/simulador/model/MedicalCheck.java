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
public class MedicalCheck {

    String date;
    String time;

    public void addAppointment() throws IOException {

        File file = new File("MedicalCheck.csv");
        Scanner as = new Scanner(System.in);
        Scanner mc = new Scanner(System.in);
        FileWriter write = new FileWriter(file, true);
        PrintWriter line = new PrintWriter(write);
        
        System.out.println("Would you like to make an appointment?");
        System.out.println("Yes(Y) or No(N)");
        char elect = as.next().charAt(0);
        as.nextLine();

        if (elect == 'Y' || elect == 'y') {
            if (!file.exists()) {
                try {
                    file.createNewFile();
                    
                    System.out.println("For what day do you need the appointment?");
                    System.out.println("Enter date in format dd/mm/yyyy: ");
                    date = mc.nextLine();
                    System.out.println("What time do you need the appointment?");
                    System.out.println("Enter time in format hh:mm: ");
                    time = mc.nextLine();
                    line.println(date + "," + time + ",");
                    System.out.println("Your appointment was added");
                    line.close();
                    write.close();

                } catch (IOException e) {
                }
            } else {
                try {
                    System.out.println(" ");
                    System.out.println("For what day do you need the appointment?");
                    System.out.println("Enter date in format dd/mm/yyyy: ");
                    date = mc.nextLine();
                    System.out.println("What time do you need the appointment?");
                    System.out.println("Enter time in format hh:mm: ");
                    time = mc.nextLine();
                    line.println(date + "," + time + ",");
                    System.out.println("Your appointment was added");
                    line.close();
                    write.close();
                } catch (IOException e) {
                    System.out.println("Error");
                }
            }
        }
        if (elect == 'N' || elect == 'n') {
            System.out.println("Thanks");
        }
    }

    

    }


