/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.WriteResult;
import ec.edu.espe.simulador.model.Student;

/**
 *
 * @author User
 */
public class ConectionDataBase {

    private BasicDBObject document = new BasicDBObject();

    private MongoClient mongoC;
    private MongoClientURI mongoCUri;
    private DB BaseData;
    private DBCollection collections;

    public void ConectionDataBase() {
        mongoCUri = new MongoClientURI("mongodb+srv://Admin1:admin1234@cluster0.ctg8x.mongodb.net/PrototypeVirtualID?retryWrites=true&w=majority");
        mongoC = new MongoClient(mongoCUri);
        BaseData = mongoC.getDB("PrototypeVirtualID");
        collections = BaseData.getCollection("Name");
    }

    public boolean create(String name, String id, String career, String email, String address, int age, String gender) {
        document.put("Name", name);
        document.put("ID", id);
        document.put("Career", career);
        document.put("email", email);
        document.put("Address", address);
        document.put("Age", age);
        document.put("Gender", gender);
        collections.insert(document);
        return true;
    }

    public boolean update(String oldName, String newName, String oldId, String newId, String oldCareer, String newCareer, String oldEmail, String newEmail,
            String oldAddress, String newAddress, int oldAge, int newAge, String oldGender, String newGender) {
        BasicDBObject fileNew = new BasicDBObject();
        document.put("Name", oldName);
        fileNew.put("Name", newName);
        collections.findAndModify(document, fileNew);
        document.put("ID", oldId);
        fileNew.put("ID", newId);
        collections.findAndModify(document, fileNew);
        document.put("Career", oldCareer);
        fileNew.put("Career", newCareer);
        collections.findAndModify(document, fileNew);
        document.put("email", oldEmail);
        fileNew.put("email", newEmail);
        collections.findAndModify(document, fileNew);
        document.put("Address", oldAddress);
        fileNew.put("Address", newAddress);
        collections.findAndModify(document, fileNew);
        document.put("Age", oldAge);
        fileNew.put("Age", newAge);
        collections.findAndModify(document, fileNew);
        document.put("Gender", oldGender);
        fileNew.put("Gender", newId);
        collections.findAndModify(document, fileNew);
        collections.insert(document);
        return true;
    }

    public boolean delete(String name, String id, String career, String email, String address, int age, String gender) {
        document.put("Name", name);
        document.put("ID", id);
        document.put("Career", career);
        document.put("email", email);
        document.put("Address", address);
        document.put("Age", age);
        document.put("Gender", gender);
        collections.remove(document);
        return true;
    }

    public void read() {
        DBCursor cursor = collections.find();
            while(cursor.hasNext()){
                System.out.println(cursor.next());
            }
    }

}
