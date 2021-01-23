package ec.edu.espe.simulador.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Developers
 */
public class Director {

    String career;
    String name;
    String faculty;
    int password = 1234;
    String id;

    public void addStudent() {

        Scanner ans1 = new Scanner(System.in);
        System.out.println("\n ");
        System.out.println("Are you a career Director?");
        System.out.print("Yes(Y) or No(N): ");
        char answer1 = ans1.next().charAt(0);
        ans1.nextLine();

        if (answer1 == 'Y' || answer1 == 'y') {

            System.out.println("Give me your name: ");
            name = ans1.nextLine();
            System.out.print("What career are you director of?: ");
            faculty = ans1.nextLine();
            System.out.print("Enter your password: ");
            password = ans1.nextInt();
            ans1.nextLine();

            if (password == 1234) {

                try {
                    System.out.println(" ");
                    System.out.println("\t1) Add Student");
                    System.out.println("\t2) Exit");
                    int option = ans1.nextInt();

                    switch (option) {

                        case 1:
                            File file = new File("Requests.csv");
                            Scanner input = new Scanner(System.in);
                            file.createNewFile();
                            FileWriter write = new FileWriter(file, true);
                            PrintWriter line = new PrintWriter(write);

                            System.out.print("Enter the student's id: ");
                            String id = input.nextLine();
                            System.out.print("Enter the student's name: ");
                            String name = input.nextLine();
                            System.out.print("Enter the student's age: ");
                            int age = input.nextInt();
                            input.nextLine();
                            System.out.print("Enter the student's email: ");
                            String email = input.nextLine();
                            System.out.print("Enter the student's address: ");
                            String address = input.nextLine();
                            System.out.print("Enter the student's phone: ");
                            int phone = input.nextInt();
                            input.nextLine();
                            System.out.print("Enter the student's career: ");
                            career = input.nextLine();
                            System.out.println("===========================================================");
                            System.out.println("Your request has been successfully saved!!");
                            System.out.println("This request has to be read and added to the database by the "
                                    + "administrator");
                            System.out.println("  BE PATTIENT ;) ");
                            System.out.println("===========================================================");

                            System.out.println(" ");
                            String saveData = (id + "," + name + "," + age + "," + email + "," + address + ","
                                    + phone + "," + career);
                            line.print(saveData);
                            line.close();
                            write.close();

                            break;

                        case 2:
                            System.out.println("Thanks");

                            break;
                    }

                } catch (IOException ex) {

                }

            } else {
                System.out.println("Password Incorrect!!!");
            }
        }
            if (answer1 == 'N' || answer1 == 'n') {
                System.out.println("Only career directors can use this field!!");
                System.out.println(" ");

            }
        }



    public void approveMotion() {

        Scanner input = new Scanner(System.in);

        System.out.print("\tAre you a student of the Universidad de las Fuerzas Armadas: ");
        System.out.println(" ");
        System.out.print("Yes(Y) or No(N): ");
        char answer1 = input.next().charAt(0);
        input.nextLine();

        if (answer1 == 'Y' || answer1 == 'y') {
            System.out.println("You can acces to benefit");
        }

        if (answer1 == 'N' || answer1 == 'n') {
            System.out.println("Only students can acces");
        }

    }

}

