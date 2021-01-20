package ec.edu.espe.simulador.model;

import ec.edu.espe.filemanager.utils.Data;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author MAJOF_Developers
 */
public class Student {

    int id;
    String name;
    String career;

    public void enterData() throws IOException {

        Scanner input = new Scanner(System.in);
        File file = new File("StudentData.csv");
        System.out.print("Are you a student of the Universidad de las Fuerzas Armadas: ");
        System.out.println(" ");
        System.out.print("Yes(Y) or No(N): ");
        char answer1 = input.next().charAt(0);
        input.nextLine();

        Scanner valid = new Scanner(System.in);
        int answer2;

        if (answer1 == 'Y') {

            System.out.println("1) Request VirtualID");
            System.out.println("2) Request Attention Polyclinic");
            System.out.println("Write one of the options: ");
            answer2 = valid.nextInt();

            switch (answer2) {

                case 1:
                    try {
                        file.createNewFile();
                        FileWriter write = new FileWriter(file, true);
                        PrintWriter line = new PrintWriter(write);

                        System.out.print("Enter your name: ");
                        name = input.nextLine();
                        System.out.print("Enter your id in format whitouth L: ");
                        id = input.nextInt();
                        System.out.print("Enter your career: ");
                        career = input.nextLine();
                        input.next();
                        System.out.println(" ");
                        System.out.println("Your data has been saved correctly!!");
                        System.out.println("Your request has to be read by the director of your career");
                        System.out.println("  BE PATTIENT ;) ");

                        String dataToSave = (name + "," + id + "," + career + ",");
                        Data.save("StudentData.csv", dataToSave);
                        System.out.println(" ");
                        line.println(name + "," + id + "," + career + ",");
                        line.close();
                        write.close();
                    }catch(IOException e) {
                        System.out.println("Enter any character to continue");
                    }
                    break;
                    
                    case 2:
                        
                        break;

                    default:
                        System.out.println("Only numbers between  1 - 2");
                        System.out.println(" ");
            }

        }
        
        if (answer1 == 'N') {
            System.out.println("You cannot access this benefit!!");
            System.out.println(" ");
        }
    }
}
