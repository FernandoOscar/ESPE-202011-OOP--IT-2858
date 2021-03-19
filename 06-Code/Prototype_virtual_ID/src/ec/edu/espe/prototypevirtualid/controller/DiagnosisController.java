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
public class DiagnosisController {

    BasicDBObject document = new BasicDBObject();

    public DBObject addDiagnosis(String patient, String sympton, String medicine) {
        document.put("Patient Name", patient);
        document.put("Symptom", sympton);
        document.put("Medicine", medicine);

        return document;
    }

}
