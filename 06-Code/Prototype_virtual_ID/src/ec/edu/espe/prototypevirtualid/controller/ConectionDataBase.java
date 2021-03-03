/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

/**
 *
 * @author User
 */
public class ConectionDataBase {

    BasicDBObject document = new BasicDBObject();

    MongoClient mongoC;
    MongoClientURI mongoCUri;
    DB BaseData;
    DBCollection collection;
    
    DBCollection collections;

    public void ConectionDataBase(String collection) {
        mongoCUri = new MongoClientURI("mongodb+srv://Admin1:admin1234@cluster0.ctg8x.mongodb.net/PrototypeVirtualID?retryWrites=true&w=majority");
        mongoC = new MongoClient(mongoCUri);
        BaseData = mongoC.getDB("PrototypeVirtualID");
        collections = BaseData.getCollection(collection);
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

    public boolean delete(String name) {
        document.put("Name", name);
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
