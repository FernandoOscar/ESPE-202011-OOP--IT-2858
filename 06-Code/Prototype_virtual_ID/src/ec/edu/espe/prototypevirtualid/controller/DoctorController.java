/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

/**
 *
 * @author BryanPC
 */
public class DoctorController {
    
    BasicDBObject document = new BasicDBObject();

    public DBObject addDoctor(String name, String working, String specialty) {
                
        document.put("Name", name);
        document.put("Working Hour", working);
        document.put("Specialty", specialty);
        return null;
    }

}
