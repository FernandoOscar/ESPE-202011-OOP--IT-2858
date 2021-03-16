package ec.edu.espe.prototypevirtualid.model;


import ec.edu.espe.prototypevirtualid.controller.Login;


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

        if (log.validate(user, password) == true) {
            return true;
        } else {
            return false;
        }
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }


}
