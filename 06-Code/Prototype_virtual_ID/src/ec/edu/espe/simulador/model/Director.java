package ec.edu.espe.simulador.model;

import java.io.IOException;
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
        System.out.println("Are you a career Director?");
        System.out.print("Yes(Y) or No(N): ");
        char answer1 = ans1.next().charAt(0);
        ans1.nextLine();

        if (answer1 == 'Y' || answer1 == 'y') {

            System.out.println("Give me your name: ");
            name = ans1.nextLine();
            System.out.print("What career are you director of?: ");
            career = ans1.nextLine();
            System.out.print("Enter your password: ");
            password = ans1.nextInt();
            ans1.nextLine();
            
            if (password == 1234) {

                try {
                    System.out.println("1) Add Student");
                    System.out.println("2) Exit");
                    int option = ans1.nextInt();

                    switch (option) {

                        case 1:
                            Student student = new Student();
                            student.requestId();

                            break;

                        case 2:
                            System.out.println("Thanks");

                            break;
                    }

                } catch (IOException ex) {

                }

            }
            else{
                System.out.println("Password Incorrect");
            }

            if (answer1 == 'N' || answer1 == 'n') {
                System.out.println("Only career directors can use this field!!");
                System.out.println(" ");

            }
        }

    }

    public void approveMotion() {

        Scanner input = new Scanner(System.in);

        System.out.print("Are you a student of the Universidad de las Fuerzas Armadas: ");
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
