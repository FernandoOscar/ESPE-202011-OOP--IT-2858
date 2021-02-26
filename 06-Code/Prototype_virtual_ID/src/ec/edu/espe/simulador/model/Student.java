package ec.edu.espe.simulador.model;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import ec.edu.espe.verify.security;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Student extends Person {

    private String career;

    public Student(String career, String name, String email, String address, int age, String id) {
        super(name, email, address, age, id);
        this.career = career;
    }

    public Student() {
//        try {
//            DB BaseData;
//            DBCollection collection;
//            BasicDBObject document = new BasicDBObject();
//            
//            Mongo mongo = new Mongo("localhost", 27017);
//            BaseData = mongo.getDB("Virtual_Id");
//            collection = BaseData.getCollection("Name");
//        } catch (UnknownHostException ex) {
//            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }

    public void requestId() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Id: ");
        setId(scan.nextLine());
        System.out.print("Enter your name: ");
        setName(scan.nextLine());
        System.out.print("Enter your age: ");
        setAge(scan.nextInt());
        scan.nextLine();
        System.out.print("Enter your email: ");
        setEmail(scan.nextLine());
        System.out.print("Enter your address: ");
        setAddress(scan.nextLine());
        System.out.print("Enter your career: ");
        setCareer(scan.nextLine());
    }

    @Override
    public boolean validId() {
        Scanner valid = new Scanner(System.in);
        System.out.println("Enter your number of cedula: ");
        String id = valid.nextLine();
        return security.validId(id);
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    
}
