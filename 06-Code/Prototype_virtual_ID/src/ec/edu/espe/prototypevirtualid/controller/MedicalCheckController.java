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
 * @author LENOVO
 */
public class MedicalCheckController {
    
    BasicDBObject document = new BasicDBObject();
    
    public DBObject addAppinment(String name, String id, String dateAppoinment, String timeAppoinment) {
        document.put("Name", name);
        document.put("ID", id);
        document.put("Date", dateAppoinment);
        document.put("Time", timeAppoinment);
        
        return document;
    }
}
