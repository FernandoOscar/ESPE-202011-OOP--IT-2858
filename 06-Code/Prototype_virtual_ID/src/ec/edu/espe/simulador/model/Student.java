package ec.edu.espe.simulador.model;

import ec.edu.espe.filemanager.utils.Data;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    
    public void requestId(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Id: ");
        setId(scan.nextLine());
        System.out.print("Enter your name: ");
        setName(scan.nextLine());
        System.out.print("Enter your age: ");
        setAge(scan.nextInt());
        scan.nextLine();
        System.out.print("Enter your email: ");
        setEmail(scan.nextLine());
        System.out.print("Enter your address: ");
        setAddress(scan.nextLine());
        System.out.print("Enter your phone: ");
        setPhone(scan.nextInt());
        scan.nextLine();
        System.out.print("Enter your career: ");
        setCareer(scan.nextLine());
    }
    
    
    public void requestId(String fileName, String data){
        try {
            Data.save(fileName, data);
        } catch (IOException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
