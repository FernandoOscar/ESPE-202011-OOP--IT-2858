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
