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
 * @author FRANCISCO
 */
public class ClinicHistoryController {
    
    BasicDBObject document = new BasicDBObject();
    

    public DBObject request(String name, String id, String health, String allergies) {

        document.put("Name", name);
        document.put("ID", id);
        document.put("Health Insurance", health);
        document.put("Allergies", allergies);
     
        return document;
    }
}
