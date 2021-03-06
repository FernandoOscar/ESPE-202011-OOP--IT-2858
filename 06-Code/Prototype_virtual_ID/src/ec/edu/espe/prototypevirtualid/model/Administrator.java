/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.model;

import com.mongodb.DBObject;

public abstract class Administrator extends Person {

    private String deparment;

    public abstract void addDatabase(DBObject object);

    public abstract void createId();

    public abstract void removeStudent(String dataToDelete);

    public abstract boolean validUser(String user, String password);

    public Administrator(String deparment) {
        this.deparment = deparment;
    }

    public Administrator() {
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }

}
