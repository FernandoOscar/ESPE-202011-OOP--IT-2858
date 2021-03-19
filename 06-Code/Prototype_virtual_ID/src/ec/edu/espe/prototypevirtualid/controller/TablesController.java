/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.controller;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import ec.edu.espe.datamanager.utils.MongoOperation;
import ec.edu.espe.datamanager.utils.NSQLDBManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BryanPC
 */
public class TablesController {

    public DefaultTableModel tableStudent() {
        
        NSQLDBManager mongo = new MongoOperation();
        mongo.DatabaseConection("Name");
        DB BaseData = MongoOperation.getMongoC().getDB("PrototypeVirtualID");
        DBCollection collections = BaseData.getCollection("Name");
        DBCursor cursor = collections.find();

        String[] columnNames = {"Name", "ID", "Career",
            "email", "Address", "Age", "Gender"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            String name = (String) obj.get("Name");
            String id = (String) obj.get("ID");
            String career = (String) obj.get("Career");
            String email = (String) obj.get("email");
            String Address = (String) obj.get("Address");
            String age = (String) obj.get("Age").toString();
            String gender = (String) obj.get("Gender");
            model.addRow(new Object[]{name, id, career, email, Address, age, gender});
        }
        return model;
    }
    
    
    public DefaultTableModel tableAppoinment() {
        
        NSQLDBManager mongo = new MongoOperation();
        mongo.DatabaseConection("Medical Appoinment");
        DB BaseData = MongoOperation.getMongoC().getDB("PrototypeVirtualID");
        DBCollection collections = BaseData.getCollection("Medical Appoinment");
        DBCursor cursor = collections.find();

        String[] columnNames = {"Name", "ID", "Date", "Time"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            String name = (String) obj.get("Name");
            String id = (String) obj.get("ID");
            String date = (String) obj.get("Date");
            String time = (String) obj.get("Time");
            model.addRow(new Object[]{name, id, date, time});
        }
        return model;
    }
    
    
    public DefaultTableModel tableHistoryClinic() {
        
        NSQLDBManager mongo = new MongoOperation();
        mongo.DatabaseConection("ClinicHistory");
        DB BaseData = MongoOperation.getMongoC().getDB("PrototypeVirtualID");
        DBCollection collections = BaseData.getCollection("ClinicHistory");
        DBCursor cursor = collections.find();

        String[] columnNames = {"Name", "ID", "healthInsurance", "allergies"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            String name = (String) obj.get("Name");
            String id = (String) obj.get("ID");
            String health = (String) obj.get("Health Insurance");
            String allergies = (String) obj.get("Allergies");
            model.addRow(new Object[]{name, id, health, allergies});
        }
        return model;
    }
    
    
    public DefaultTableModel tableDiagnosis() {
        
        NSQLDBManager mongo = new MongoOperation();
        mongo.DatabaseConection("Diagnosis");
        DB BaseData = MongoOperation.getMongoC().getDB("PrototypeVirtualID");
        DBCollection collections = BaseData.getCollection("Diagnosis");
        DBCursor cursor = collections.find();

        String[] columnNames = {"Patient Name ", "Symptom", "Medicine"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            String name = (String) obj.get("Patient Name");
            String sym = (String) obj.get("Symptom");
            String medi = (String) obj.get("Medicine");
            model.addRow(new Object[]{name, sym, medi});
        }
        return model;
    }
    
    public DefaultTableModel tableMedicalCheck() {
        
        NSQLDBManager mongo = new MongoOperation();
        mongo.DatabaseConection("Medical Appoinment");
        DB BaseData = MongoOperation.getMongoC().getDB("PrototypeVirtualID");
        DBCollection collections = BaseData.getCollection("Medical Appoinment");
        DBCursor cursor = collections.find();

        String[] columnNames = {"Name", "ID", "Date",
            "Time"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            String name = (String) obj.get("Name");
            String id = (String) obj.get("ID");
            String date = (String) obj.get("Time");
            String  time = (String) obj.get("Date");
            model.addRow(new Object[]{name, id, time, date});
        }
        return model;
    }
    
    
    
}
