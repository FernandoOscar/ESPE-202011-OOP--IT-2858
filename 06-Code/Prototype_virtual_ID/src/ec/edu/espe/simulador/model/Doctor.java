package ec.edu.espe.simulador.model;

import ec.edu.espe.prototypevirtualid.controller.Login;
import ec.edu.espe.verify.security;
import java.util.Scanner;

public class Doctor extends Person {

    private String specialty;
    private String schedule;

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

    public void addHistory() {

    }

    public void removeHistory() {

    }

    public Doctor(String specialty, String schedule) {
        this.specialty = specialty;
        this.schedule = schedule;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

}
