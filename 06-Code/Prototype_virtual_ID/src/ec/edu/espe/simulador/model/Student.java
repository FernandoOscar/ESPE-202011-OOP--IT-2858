package ec.edu.espe.simulador.model;

import ec.edu.espe.prototypevirtualid.controller.Login;
import ec.edu.espe.verify.security;
import java.util.Scanner;

public class Student extends Person {

    private String career;

    public Student() {
    }

    public Student(String career) {
        this.career = career;
    }

    public Student(String career, String name, String email, String address, int age, String id, String gender) {
        super(name, email, address, age, id, gender);
        this.career = career;
    }

    @Override
    public boolean validUser(String user, String password) {
        Login log = new Login();
        log.validate(user, password);

        if (user.equals(user) && password.equals(password)) {
            System.out.println("Welcome Again " + user);
            return true;
        } else {
            return false;
        }
    }

    public void requestId() {
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
        System.out.print("Enter your career: ");
        setCareer(scan.nextLine());
        System.out.print("Enter your gender: ");
        setGender(scan.nextLine());

    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

}
