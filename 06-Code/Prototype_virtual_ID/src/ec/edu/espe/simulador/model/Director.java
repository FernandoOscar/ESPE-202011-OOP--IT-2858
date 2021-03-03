package ec.edu.espe.simulador.model;

import ec.edu.espe.prototypevirtualid.controller.Login;

public class Director extends Administrator {

    private String career;

    public Director() {
    }

    public Director(String career, String deparment) {
        super(deparment);
        this.career = career;
    }
    
    @Override
    public boolean validUser(String user, String password) {       
        Login log = new Login();
        log.validate(user , password);        
        
        if (user.equals(user) && password.equals(password)) {
            System.out.println("Welcome Again " + user);
            return true;
        } else {
            return false;
        }
        
    }

    public Director(String career) {
        this.career = career;
    }

    public boolean approveMotion(char answer) {
        if (answer == 'Y' || answer == 'y') {
            return true;
        } else if (answer == 'N' || answer == 'n') {
            return false;
        }
        return false;

    }

    @Override
    public void addDatabase() {
    }

    @Override
    public void createId() {

    }

    @Override
    public void removeStudent() {
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    

}
