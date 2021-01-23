package ec.edu.espe.simulador.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author MAJOF_Developers
 */
public class Student {

    private String id;
    private String name;
    private int age;
    private String email;
    private String address;
    private int phone;
    private String career;

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", address=" + address + ", phone=" + phone + ", career=" + career + '}';
    }

    public Student(String id, String name, int age, String email, String address, int phone, String career) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.career = career;
    }

    public Student() {

    }

    public void menu() throws IOException {

        Scanner sn = new Scanner(System.in);
        System.out.println("1) Request Id");
        System.out.println("2) Request Attention at Polyclinic");
        System.out.println("3) Exit");
        int option = sn.nextInt();
        System.out.println("   ");
        System.out.println("   ");
        
        switch(option){
            
            case 1:
                requestId();
                break;
                
            case 2:
                requestAttention();                
                break;
                
            case 3:
                System.out.println(" ");
                break;
        }

    }

    public void requestId() throws IOException {

        Scanner input = new Scanner(System.in);
        File file = new File("StudentData.csv");
        System.out.print("Are you a student of the Universidad de las Fuerzas Armadas: ");
        System.out.println(" ");
        System.out.print("Yes(Y) or No(N): ");
        char answer1 = input.next().charAt(0);
        input.nextLine();

        if (answer1 == 'Y' || answer1 == 'y') {
            try {

                file.createNewFile();
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);

                System.out.print("Ingrese el id: ");
                id = input.nextLine();
                System.out.print("Ingrese el nombre: ");
                name = input.nextLine();
                System.out.print("Ingrese la edad: ");
                age = input.nextInt();
                input.nextLine();
                System.out.print("Ingrese el correo: ");
                email = input.nextLine();
                System.out.print("Ingrese la direccion: ");
                address = input.nextLine();
                System.out.print("Ingrese el numero telefonico: ");
                phone = input.nextInt();
                input.nextLine();
                System.out.print("Ingrese la carrera: ");
                career = input.nextLine();
                System.out.println("===========================================================");
                System.out.println("Your data has been saved correctly!!");
                System.out.println("Your request has to be read by the director of your career");
                System.out.println("  BE PATTIENT ;) ");
                System.out.println("===========================================================");

                System.out.println(" ");
                line.println(id + "," + name + "," + age + "," + email + "," + address + ","
                        + phone + "," + career);
                line.close();
                write.close();

            } catch (IOException e) {
                System.out.println("Enter any character to continue");
            }

        }

        if (answer1 == 'N' || answer1 == 'n') {
            System.out.println("You cannot access this benefit!!");
            System.out.println(" ");
        }
    }

    public void requestAttention() throws IOException {
        Polyclinic poly = new Polyclinic();
        poly.attendeStudent();
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * @return the career
     */
    public String getCareer() {
        return career;
    }

    /**
     * @param career the career to set
     */
    public void setCareer(String career) {
        this.career = career;
    }

}
