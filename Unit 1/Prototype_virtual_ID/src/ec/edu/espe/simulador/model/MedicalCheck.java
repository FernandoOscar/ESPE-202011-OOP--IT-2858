/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

import ec.edu.espe.filemanager.utils.Data;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class MedicalCheck {

    String date;
    String time;

    public void addAppointment(Student student) {

        Scanner as = new Scanner(System.in);
        Scanner mc = new Scanner(System.in);
        File file = new File("MedicalCheck.csv");
        System.out.println("would you like to make an appintment?");
        System.out.println("Yes(Y) or No(N)");
        char elect = as.next().charAt(0);
        as.nextLine();

        if (elect == 'Y') {
            if (!file.exists()) {
                try {
                    file.createNewFile();
                    FileWriter write = new FileWriter(file, true);
                    PrintWriter line = new PrintWriter(write);
                    System.out.println(" ");
                    System.out.println("Agree on the date");
                    date = mc.nextLine();
                    System.out.println("Agree the time");
                    time = mc.nextLine();

                    line.println();

                    line.close();
                    write.close();

                } catch (Exception e) {
                }
            } else {
                try {
                    file.createNewFile();
                    
                    FileWriter write = new FileWriter(file, true);
                    PrintWriter line = new PrintWriter(write);
                    System.out.println(" ");
                    System.out.println("Agree on the date");
                    date = mc.nextLine();
                    System.out.println("Agree the time");
                    time = mc.nextLine();

                    line.println();

                    line.close();
                    write.close();
                } catch (Exception e) {
                    System.out.println("Error");
                }
            }
        }
        if (elect == 'N') {
            System.out.println("Thanks");
        }
    }

    

    }


