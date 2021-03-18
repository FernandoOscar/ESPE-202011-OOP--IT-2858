/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import ec.edu.espe.prototypevirtualid.model.Person;

/**
 *
 * @author BryanPC
 */
public class StudentController extends Person{

    BasicDBObject document = new BasicDBObject();
    

    public DBObject request(String name, String id, String career, String address, int age, String email, String gender) {

        document.put("Name", name);
        document.put("ID", id);
        document.put("Career", career);
        document.put("email", email);
        document.put("Address", address);
        document.put("Age", age);
        document.put("Gender", gender);

        return document;
    }


}
