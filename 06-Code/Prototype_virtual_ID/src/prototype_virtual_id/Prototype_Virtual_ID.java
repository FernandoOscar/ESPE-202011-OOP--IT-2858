package prototype_virtual_id;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.simulador.model.ClinicHistory;
import ec.edu.espe.simulador.model.Director;
import ec.edu.espe.simulador.model.Doctor;
import ec.edu.espe.simulador.model.MedicalCheck;
import ec.edu.espe.simulador.model.QR;
import ec.edu.espe.simulador.model.Student;
import ec.edu.espe.simulador.model.VirtualCard;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Prototype_Virtual_ID {

    public static void main(String[] args) throws IOException {

        System.out.println("\t================================");
        System.out.println("\tWelcome to the Virtual ID System");
        System.out.println("\t================================");

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
                        menu();
                        System.out.println("\n");
                        break;

                    case 2:
                        Director direc = new Director();
                        Scanner input = new Scanner(System.in);
                        System.out.print("The solicitor are a student of the Universidad de las Fuerzas Armadas: \n");
                        System.out.print("Yes(Y) or No(N): ");
                        char answer = input.next().charAt(0);
                        input.nextLine();
                        direc.approveMotion(answer);

                        if (direc.approveMotion(answer) == false) {
                            System.out.println("You are not a Student\n");

                        } else {
                            enterDataStudent();
                        }
                        break;

                    case 3:
                        menuAdmin();
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

    private static void menuAdmin() throws IOException {
        Scanner valid = new Scanner(System.in);
        int answer2;
        System.out.println("\n\t1) Add to Database");
        System.out.println("\t2) Create ID");
        System.out.println("\t3) Exit");
        answer2 = valid.nextInt();

        switch (answer2) {

            case 1:
                System.out.println("The data to be entered now will be stored in the "
                        + "database, please be careful.");
                enterDataStudent();
                System.out.println("CONGRATULATIONS, NOW YOU CAN ACCESS THE "
                        + "SERVICES AND BENEFITS OFFERED BY THE UNIVERSITY!!");
                break;

            case 2:
                System.out.println("verb");
                QR qr = new QR();
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

    public static void doctorData() {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to add a new doctor to the polyclinic?");
        System.out.println("Yes(Y) or No(N): ");
        char answer1 = input.next().charAt(0);
        input.nextLine();

        if (answer1 == 'Y' || answer1 == 'y') {
            try {
                System.out.println("Please enter your data");
                System.out.print("Enter your name: ");
                String name = input.nextLine();
                System.out.print("Enter your area: ");
                String area = input.nextLine();
                System.out.print("Enter your schedule: ");
                String schedule = input.nextLine();
                Doctor doc = new Doctor(name, area, schedule);
                Gson gson = new Gson();
                String saveData = gson.toJson(doc);

                for (int i = 0; i < 1; i++) {
                    Data.save("DoctorData.json", saveData);
                }

            } catch (IOException ex) {
                Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (answer1 == 'N' || answer1 == 'n') {
            System.out.println("Ok!");
            System.out.println(" ");
        }
    }

    public static void attendeStudent() throws IOException {

        Scanner ans = new Scanner(System.in);
        Doctor doc = new Doctor();
        System.out.println("\n");
        System.out.println("========================");
        System.out.println("WELCOME AT POLYCLINIC");
        System.out.println("=======================");
        System.out.println("1) Add new Doctor");
        System.out.println("2) Attend Student");
        System.out.println("3) Exit");
        int option = ans.nextInt();

        switch (option) {

            case 1:
                doctorData();
                attendeStudent();
                break;

            case 2:
                ans = new Scanner(System.in);
                int option2 = 0;
                System.out.println("Please go to the area you want to be served");
                System.out.println("");
                System.out.println("What are should it be understood?");
                System.out.println("\t1. General Medicine");
                System.out.println("\t2. Odontology");
                System.out.println("\t3. Clinical Laboratory");
                System.out.println(" ");
                option2 = ans.nextInt();

                switch (option2) {
                    case 1:
                        ans.nextLine();
                        System.out.println("What is your Name: ");
                        String name = ans.nextLine();
                        System.out.println("What is the reason for your visit?");
                        String reason = ans.nextLine();
                        System.out.println("\nPrescribe a medicine for the patient!");
                        System.out.println("---Available Medicines");
                        System.out.println("======================");
                        System.out.println("Paracetamol \nOmeprazole \nSimvastatina \nAspirin");
                        String medicinePrescribe = ans.nextLine();
                        
                        ClinicHistory clinic = new ClinicHistory(name, reason, medicinePrescribe);

                        Gson gson = new Gson();
                        String saveData = gson.toJson(clinic);

                        for (int i = 0; i < 1; i++) {
                            doc.addHistory("ClinicHistory.json", saveData);
                        }
                        break;

                    case 2:
                        System.out.println("----------Doctors available for Odontology");
                        ans.nextLine();
                        System.out.println("What is the reason for your visit?");
                        String treatment = ans.nextLine();

                        System.out.println("Did you have an infection?");
                        String infection = ans.nextLine();

                        System.out.println("Available Treatments");
                        System.out.println("======================");
                        System.out.println("Root canals \nExtraction \nOrthodontics \nProphylaxis");
                        System.out.println(" ");

                        System.out.println("The treatment that the patient had is: " + treatment
                                + "   Infeccion: " + infection);

                        String treat = ("The treatment that the patient had is: " + treatment
                                + "   Infection: " + infection);
                        doc.addHistory("ClinicHistory.csv", treat);

                        break;

                    case 3:
                        System.out.println(" ");
                        System.out.println("----------Doctors available for General medicine");
                        ans.nextLine();
                        System.out.println("Available Samples");
                        System.out.println("Hemogram \nUroanalysis \nSARS-CoV-2 COVID19 \nCoproanalysis");
                        System.out.println("======================");
                        System.out.println(" ");
                        break;

                    default:
                        System.out.println("Only numbers between  1 - 3");
                        System.out.println(" ");
                }
                break;

            case 3:
                System.out.println("Thanks for coming");
                break;

        }

    }

    public static void menu() throws IOException {

        Scanner sn = new Scanner(System.in);
        System.out.println("\t1. Request Id");
        System.out.println("\t2. Request Attention at Polyclinic");
        System.out.println("\t3. Exit");
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

                    System.out.println("\nFor what day do you need the appointment?");
                    System.out.println("Enter date in format dd/mm/yyyy: ");
                    String date = as.nextLine();
                    System.out.println("What time do you need the appointment?");
                    System.out.println("Enter time in format hh:mm: ");
                    String time = as.nextLine();
                    MedicalCheck check = new MedicalCheck(date, time);
                    String appo = ("\nAppointment scheduled for " + date + " at " + time + " hours");
                    System.out.println(appo);
                    System.out.println("=====================================\n");
                    Gson gson1 = new Gson();
                    String saveData1 = gson1.toJson(check);
                    for (int i = 0; i < 1; i++) {
                        check.addAppoinment("MedicalCheck.json", saveData1);
                    }

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
        Scanner input = new Scanner(System.in);
        VirtualCard card = new VirtualCard();
        boolean permission;
        String id;
        do {
            System.out.print("Enter your ID (Form LXXXXXXXX) : ");
            id = input.nextLine();
            int size = id.length();
            permission = card.giveWay(size);
        }while(permission);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("Enter your email: ");
        String email = input.nextLine();
        System.out.print("Enter your address: ");
        String address = input.nextLine();
        System.out.print("Enter your phone: ");
        int phone = input.nextInt();
        input.nextLine();
        System.out.print("Enter your career: ");
        String career = input.nextLine();
        System.out.println("===========================================================");
        System.out.println("Your request has been successfully saved!!");
        System.out.println("This request has to be read and added to the database by the "
                + "administrator");
        System.out.println("  BE PATTIENT ;) ");
        System.out.println("===========================================================");

        Student student = new Student(id, name, age, email, address, phone, career);

        Gson gson = new Gson();
        String saveData = gson.toJson(student);

        for (int i = 0; i < 1; i++) {
            student.requestId("Requests.json", saveData);
        }
    }
}
