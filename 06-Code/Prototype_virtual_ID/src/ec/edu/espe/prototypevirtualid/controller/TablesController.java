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
import ec.edu.espe.conection.utils.MongoOperation;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BryanPC
 */
public class TablesController {

    public DefaultTableModel tableStudent() {
        MongoOperation.ConectionDataBase("Name");
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
    
    
    
    
}
