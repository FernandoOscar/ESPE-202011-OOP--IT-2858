package ec.edu.espe.prototypevirtualid.view;

import ec.edu.espe.conection.utils.MongoOperation;
import ec.edu.espe.prototypevirtualid.controller.VirtualCardController;
import ec.edu.espe.prototypevirtualid.model.Diagnosis;
import ec.edu.espe.prototypevirtualid.model.Director;
import ec.edu.espe.prototypevirtualid.model.Doctor;
import ec.edu.espe.prototypevirtualid.model.MedicalCheck;
import ec.edu.espe.prototypevirtualid.model.Student;
import ec.edu.espe.prototypevirtualid.model.VirtualCard;
import java.util.InputMismatchException;
import java.util.Scanner;

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
                    Scanner scan = new Scanner(System.in);
                    System.out.print("Enter the day medical appointment: ");
                    medicalCheck.setTime(scan.nextLine());
                    System.out.print("Enter the time medical appointment: ");
                    medicalCheck.setDate(scan.nextLine());
                    MongoOperation.DatabaseConection("Medical Appoinment");
                    MongoOperation.createAppoinment(medicalCheck.getTime(), medicalCheck.getDate());
                }
                
                if (elect == 'N' || elect == 'n') {
                    menuPolyclinic();
                }
                
                break;

            case 3:
                System.out.println(" ");
                break;
        }

    }

    public static void menuPolyclinic() {

        Scanner ans = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("========================");
        System.out.println("WELCOME AT POLYCLINIC");
        System.out.println("=======================");
        System.out.println("1) Attend Student");
        System.out.println("2) Add Doctor");
        System.out.println("2) Exit");
        int option = ans.nextInt();

        switch (option) {

            case 1:
                Diagnosis diagnosis = new Diagnosis();
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter name patient: ");
                diagnosis.setPatientName(scan.nextLine());
                System.out.print("Enter your symptom: ");
                diagnosis.setSymptom(scan.nextLine());
                System.out.print("Enter the needs medicine: ");
                diagnosis.setMedicine(scan.nextLine());
                MongoOperation.DatabaseConection("Diagnosis");
                MongoOperation.createDiagnosis(diagnosis.getPatientName(), diagnosis.getSymptom(), diagnosis.getMedicine());
                break;

            case 2:
                Doctor doctor = new Doctor();
                Scanner addD = new Scanner(System.in);
                System.out.print("Enter your name Doctor: ");
                doctor.setNameDoctor(addD.nextLine());
                System.out.print("Enter your working hour: ");
                doctor.setWorkingHour(addD.nextLine());
                System.out.print("Enter your specialty: ");
                doctor.setSpecialty(addD.nextLine());
                MongoOperation.DatabaseConection("Doctor");
                MongoOperation.createDoctor(doctor.getNameDoctor(), doctor.getWorkingHour(), doctor.getSpecialty());
                break;

            case 3:
                System.out.println("Thanks for coming");
                break;

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
                    MongoOperation.DatabaseConection("Name");
                    MongoOperation.read();
                    break;

                case 3:
                    Scanner data = new Scanner(System.in);
                    System.out.println("Enter data will be Deleted");
                    String dataDelete = data.nextLine();
                    MongoOperation.DatabaseConection("Name");
                    MongoOperation.delete(dataDelete);
                    break;

                case 4:
                    System.out.println("verb");
                    VirtualCardController qr = new VirtualCardController();
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

    private static void enterDataStudent() {

        Student student = new Student();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Id: ");
        student.setId(scan.nextLine());
        System.out.print("Enter your name: ");
        student.setName(scan.nextLine());
        System.out.print("Enter your age: ");
        student.setAge(scan.nextInt());
        scan.nextLine();
        System.out.print("Enter your email: ");
        student.setEmail(scan.nextLine());
        System.out.print("Enter your address: ");
        student.setAddress(scan.nextLine());
        System.out.print("Enter your career: ");
        student.setCareer(scan.nextLine());
        System.out.print("Enter your gender: ");
        student.setGender(scan.nextLine());
        MongoOperation.DatabaseConection("Name");
        MongoOperation.createRequest(student.getName(), student.getId(), student.getCareer(), student.getEmail(), student.getAddress(), student.getAge(), student.getGender());
        System.out.println("===============================================");
        System.out.println("Your request has been successfully saved!!");
        System.out.println("CONGRATULATIONS, NOW YOU CAN ACCESS THE "
                + "SERVICES AND BENEFITS OFFERED BY THE UNIVERSITY!!");
        System.out.println("===============================================");
    }
}
