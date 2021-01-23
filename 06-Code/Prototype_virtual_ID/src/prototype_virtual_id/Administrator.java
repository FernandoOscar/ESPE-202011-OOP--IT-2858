package prototype_virtual_id;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.simulador.model.Director;
import ec.edu.espe.simulador.model.Student;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Administrator {

    public static void main(String[] args) throws IOException {

        

        System.out.println("                    ================================");
        System.out.println("                    Welcome to the Virtual ID System");
        System.out.println("                    ================================");

        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;

        while (!exit) {

            try {

                System.out.println("1) Login as Student");
                System.out.println("2) Login as Director");
                System.out.println("3) Login as Administrator");
                System.out.println("4) Exit");
                System.out.println("Write one of the options: ");
                option = sn.nextInt();
                
                switch (option) {

                    case 1:
                        Student student = new Student();
                        student.menu();
                        System.out.println("\n");
                        break;

                    case 2:
                        Director director = new Director();
                        director.addStudent();
                        System.out.println(" ");
                        System.out.println(" ");
                        break;

                    case 3:
                        addDatabase();
                        System.out.println(" ");
                        System.out.println(" ");
                        break;

                    case 4:
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

    public static void addDatabase() throws IOException {
        Scanner valid = new Scanner(System.in);
        int answer2;
        System.out.println("\n\t1) Add to Database");
        System.out.println("\t2) Create ID");
        System.out.println("\t3) Exit");
        answer2 = valid.nextInt();

        switch (answer2) {

            case 1:
                Scanner ans2 = new Scanner(System.in);
                File file1 = new File("DataBase.json");
                File file = new File("Requests.csv");
                FileWriter write = new FileWriter(file1, true);
                PrintWriter line = new PrintWriter(write);
                System.out.println("======================");
                System.out.println("Search Student Request");
                System.out.println("======================");
                Scanner keyboard = new Scanner(System.in);
                System.out.print("Write the request to search in the file: ");
                String data = keyboard.nextLine();
                System.out.println("============================================================================");
                Data.find(file, data);
                System.out.println("============================================================================");
                System.out.println("The data to be entered now will be stored in the "
                        + "database, please be careful.");
                System.out.print("Enter the applicant's id: ");
                String id = ans2.nextLine();
                System.out.print("Enter the applicant's name: ");
                String name = ans2.nextLine();
                System.out.print("Enter the applicant's age: ");
                int age = ans2.nextInt();
                ans2.nextLine();
                System.out.print("Enter the applicant's email: ");
                String email = ans2.nextLine();
                System.out.print("Enter the applicant's address: ");
                String address = ans2.nextLine();
                System.out.print("Enter the applicant's phone: ");
                int phone = ans2.nextInt();
                ans2.nextLine();
                System.out.print("Enter the applicant's career: ");
                String career = ans2.nextLine();

                Student student = new Student(id, name, age, email, address, phone, career);

                Gson gson = new Gson();
                String saveData = gson.toJson(student);

                for (int i = 0; i < 1; i++) {
                    line.write(saveData);
                    line.write("\n");
                }

                System.out.println("CONGRATULATIONS, NOW YOU CAN ACCESS THE "
                        + "SERVICES AND BENEFITS OFFERED BY THE UNIVERSITY!!");

                line.close();
                write.close();
                break;

            case 2:
                createId();

                break;

            default:
                System.out.println("Only numbers between  1 - 2");
                System.out.println(" ");
        }
    }

    public static void createId() {
        int random;
        int codeID[] = new int[8];
        for (int i = 0; i < 8; i++) {
            random = (int) (Math.random() * 9);
            codeID[i] = random;
        }
        System.out.println("\n");
        System.out.print("Su ID es -> ");

        for (int i = 0; i < 8; i++) {
            System.out.print(codeID[i]);
        }
        System.out.println("\n");

    }

    public static void removeStudent() {

    }

}
