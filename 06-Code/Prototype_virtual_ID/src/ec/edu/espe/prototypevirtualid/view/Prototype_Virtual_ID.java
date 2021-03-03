package ec.edu.espe.prototypevirtualid.view;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.prototypevirtualid.controller.ConectionDataBase;
import ec.edu.espe.prototypevirtualid.controller.Login;
import ec.edu.espe.simulador.model.Diagnosis;
import ec.edu.espe.simulador.model.Director;
import ec.edu.espe.simulador.model.Doctor;
import ec.edu.espe.simulador.model.MedicalCheck;
import ec.edu.espe.simulador.model.Student;
import ec.edu.espe.simulador.model.VirtualCard;
import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.ParseException;

public class Prototype_Virtual_ID {

    public static void main(String[] args) {

        System.out.println("\t================================");
        System.out.println("\tWelcome to the Virtual ID System");
        System.out.println("\t================================");

        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;

        while (!exit) {

            try {

                System.out.println("1) Login as Student");
                System.out.println("2) Login as Administrator");
                System.out.println("3) Exit");
                System.out.println("Write one of the options: ");
                option = sn.nextInt();

                switch (option) {

                    case 1:
                        menu();
                        System.out.println("\n");
                        break;

                    case 2:
                        menuAdmin();
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

    private static void menuAdmin() {
        Scanner valid = new Scanner(System.in);
        int answer2;

        Director direc = new Director();
        System.out.println("User: ");
        String user = valid.nextLine();
        System.out.println("Password: ");
        String password = valid.nextLine();
        direc.validUser(user, password);

        if (direc.validUser(user, password) == false) {
            System.out.println("You are not a Director");
        } else if (direc.validUser(user, password) == true) {

            System.out.println("\n\t1) Add to Database");
            System.out.println("\t2) Read Database");
            System.out.println("\t3) Delete Data");
            System.out.println("\t4) Create ID");
            System.out.println("\t5) Exit");
            answer2 = valid.nextInt();
            switch (answer2) {

                case 1:
                    System.out.println("The data to be entered now will be stored in the "
                            + "database, please be careful.");
                    enterDataStudent();
                    break;

                case 2:
                    ConectionDataBase cloud = new ConectionDataBase();
                    cloud.ConectionDataBase("Name");
                    cloud.read();
                    break;

                case 3:
                    ConectionDataBase delete = new ConectionDataBase();
                    Scanner data = new Scanner(System.in);
                    System.out.println("Enter data will be Deleted");
                    String dataDelete = data.nextLine();
                    delete.ConectionDataBase("Name");
                    delete.delete(dataDelete);

                    break;

                case 4:
                    System.out.println("verb");
                    VirtualCard qr = new VirtualCard();
                    System.out.println("\n");
                    System.out.print("Su ID es -> ");
                    qr.showIdentification();
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("Only numbers between  1 - 2");
                    System.out.println(" ");
            }
        }
    }

    public static void attendeStudent() {

        Scanner ans = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("========================");
        System.out.println("WELCOME AT POLYCLINIC");
        System.out.println("=======================");
        System.out.println("1) Attend Student");
        System.out.println("2) Add Doctor");
        System.out.println("2) Exit");
        int option = ans.nextInt();
        ConectionDataBase cloud = new ConectionDataBase();

        switch (option) {

            case 1:
                Diagnosis diagnosis = new Diagnosis();
                diagnosis.addHistory();
                cloud.ConectionDataBase("Diagnosis");
                cloud.create(diagnosis.getPatientName(), diagnosis.getSymptom(), diagnosis.getMedicine());
                break;

            case 2:
                Doctor doctor = new Doctor();
                doctor.addDoctor();
                cloud.ConectionDataBase("Doctor");
                cloud.create(doctor.getNameDoctor(), doctor.getWorkingHour(), doctor.getSpecialty());
                break;

            case 3:
                System.out.println("Thanks for coming");
                break;

        }

    }

    public static void menu() {

        Scanner sn = new Scanner(System.in);
        System.out.println("\t1. Request Id");
        System.out.println("\t2. Request Attention at Polyclinic");
        System.out.println("\t4. Exit");
        int option = sn.nextInt();
        switch (option) {

            case 1:
                enterDataStudent();
                break;

            case 2:
                Scanner as = new Scanner(System.in);
                System.out.println("\t\tDo you want to make an appointment? (A)");
                System.out.println("\t\tDo you need immediate attention? (N)");
                System.out.println("\t\tAppoinment(A) or Now(N)");
                char elect = as.next().charAt(0);
                as.nextLine();

                if (elect == 'A' || elect == 'a') {
                    MedicalCheck medicalCheck = new MedicalCheck();
                    medicalCheck.addAppoinment();
                    ConectionDataBase cloud = new ConectionDataBase();
                    cloud.ConectionDataBase("Medical Appoinment");
                    cloud.create(medicalCheck.getTime(), medicalCheck.getDate());
                }
                if (elect == 'N' || elect == 'n') {
                    attendeStudent();
                }
                break;
                

            case 3:
                System.out.println(" ");
                break;
        }

    }

    private static void enterDataStudent() {

        ConectionDataBase cloud = new ConectionDataBase();
        Student student = new Student();
        student.requestId();
        cloud.ConectionDataBase("Name");
        cloud.create(student.getName(), student.getId(), student.getCareer(), student.getEmail(), student.getAddress(), student.getAge(), student.getGender());
        System.out.println("===========================================================");
        System.out.println("Your request has been successfully saved!!");
        System.out.println("CONGRATULATIONS, NOW YOU CAN ACCESS THE "
                + "SERVICES AND BENEFITS OFFERED BY THE UNIVERSITY!!");
        System.out.println("===========================================================");

    }

}
