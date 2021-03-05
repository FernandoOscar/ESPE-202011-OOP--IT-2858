package ec.edu.espe.prototypevirtualid.model;

import ec.edu.espe.prototypevirtualid.controller.Login;
import ec.edu.espe.verify.security;
import java.util.Scanner;

public class Doctor extends Person {

    private String specialty;
    private String workingHour;
    private String nameDoctor;
    public Doctor() {

    }

    @Override
    public boolean validUser(String user, String password) {
        Login log = new Login();
        log.validate(user , password);        
        
        if (log.validate(user, password)== true){
            return true;
        }
        else{
            return false;
        }
    }

    public void addDoctor() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name Doctor: ");
        setNameDoctor(scan.nextLine());
        System.out.print("Enter your working hour: ");
        setWorkingHour(scan.nextLine());
        System.out.print("Enter your specialty: ");
        setSpecialty(scan.nextLine());

    }

    public Doctor(String specialty, String workingHour, String nameDoctor) {
        this.specialty = specialty;
        this.workingHour = workingHour;
        this.nameDoctor = nameDoctor;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * @return the nameDoctor
     */
    public String getNameDoctor() {
        return nameDoctor;
    }

    /**
     * @param nameDoctor the nameDoctor to set
     */
    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    /**
     * @return the workingHour
     */
    public String getWorkingHour() {
        return workingHour;
    }

    /**
     * @param workingHour the workingHour to set
     */
    public void setWorkingHour(String workingHour) {
        this.workingHour = workingHour;
    }

}
