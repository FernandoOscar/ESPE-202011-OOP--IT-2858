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
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import ec.edu.espe.simulador.model.Student;

/**
 *
 * @author User
 */
public class ConectionDataBase {
    
    
    Student user = createUser();
    DBObject doc = createDBObject(user);
    BasicDBObject document = new BasicDBObject();

    MongoClient mongoC;
    MongoClientURI mongoCUri;
    DB BaseData;
    DBCollection collections;

    public ConectionDataBase() {
        mongoCUri = new MongoClientURI("mongodb+srv://Admin1:admin1234@cluster0.ctg8x.mongodb.net/PrototypeVirtualID?retryWrites=true&w=majority");
        mongoC = new MongoClient(mongoCUri);
        BaseData = mongoC.getDB("PrototypeVirtualID");
        collections = BaseData.getCollection("Name");
    }
    
    private static Student createUser() {
        Student u = new Student();
        u.setId("L00354835");
        u.setName("Bryan");
        u.setCareer("TI");
        return u;
    }
    
    private static DBObject createDBObject(Student user) {
        BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();

        docBuilder.append("_id", user.getId());
        docBuilder.append("name", user.getName());
        docBuilder.append("role", user.getCareer());
        return docBuilder.get();
    }
    
    public boolean create(String action){
            document.put("Name", action);
            collections.insert(document);
            return true;
        }
    
}
