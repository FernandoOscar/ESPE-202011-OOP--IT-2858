/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

import ec.edu.espe.filemanager.utils.Data;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Group4
 */
public class Polyclinic {

    int virtualid;
    boolean qrcode;
    Scanner vr = new Scanner(System.in);

    public void attendeStudent() throws IOException {

        System.out.println("\n");
        System.out.println("========================");
        System.out.println("WELCOME AT POLYCLINIC");
        System.out.println("========================");
        System.out.println("\n");

        File file = new File("StudentData.csv");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your ID: ");
        String data1 = input.nextLine();
        System.out.println(" ");
        Data.find(file, data1);

        if (data1.isEmpty()) {

            MedicalCheck turn = new MedicalCheck();
            turn.addAppointment();

            Scanner ans = new Scanner(System.in);
            int option2 = 0;
            System.out.println("\n");
            System.out.println("==========================================");
            System.out.println("-------What are should it be understood?");
            System.out.println("1. General Medice");
            System.out.println("2. Odontology");
            System.out.println("3. Clinical Laboratory");
            System.out.println("4. Physiotherapy");
            System.out.println("===========================================");
            option2 = ans.nextInt();

            switch (option2) {
                case 1:
                    Inventory turn1 = new Inventory();
                    turn1.medicines();
                    break;
                case 2:
                    //Odontology od = new Odontology();
                    break;
                case 3:
                    Inventory turn3 = new Inventory();
                    turn3.samples();
                    break;
                case 4:
                    //Physiotherapy phy = new Physiotherapy();
                    break;

            }

        }

        if (data1.contentEquals(data1)) {
            System.out.println("The name does not exist !!!");
            System.out.println(" ");
        }

    }

}
