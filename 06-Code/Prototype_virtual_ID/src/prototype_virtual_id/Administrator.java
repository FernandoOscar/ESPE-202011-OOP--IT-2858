package prototype_virtual_id;

import ec.edu.espe.simulador.model.Director;
import ec.edu.espe.simulador.model.Student;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Administrator {

    public static void main(String[] args) throws IOException {

        System.out.println("================================");
        System.out.println("Welcome to the Virtual ID System");
        System.out.println("================================");

        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;

        while (!exit) {

            try {

                System.out.println("1) Login as Student");
                System.out.println("2) Login as Director");
                System.out.println("3) Exit");
                System.out.println("Write one of the options: ");
                option = sn.nextInt();
                System.out.println("   ");
                System.out.println("   ");

                switch (option) {

                    case 1:
                        Student obj1 = new Student();
                        obj1.enterData();
                        System.out.println(" ");
                        System.out.println(" ");
                        break;

                    case 2:
                        Director obj2 = new Director();
                        obj2.security();
                        System.out.println(" ");
                        System.out.println(" ");
                        break;
                    
                    case 3:
                        System.out.println("Thanks!!!");
                        exit = true;
                        System.out.println(" ");
                        System.out.println(" ");

                        break;

                    default:
                        System.out.println("Only numbers between  1 - 3");
                        System.out.println(" ");

                }
            } catch (InputMismatchException e) {
                System.out.println("You must insert a number!!");
                System.out.println(" ");
                sn.next();
            }
        }
    }
}
