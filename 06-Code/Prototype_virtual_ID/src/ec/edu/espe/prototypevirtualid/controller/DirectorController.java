
package ec.edu.espe.prototypevirtualid.controller;

import com.mongodb.DBObject;
import ec.edu.espe.datamanager.controller.Persistance;
import ec.edu.espe.datamanager.utils.MongoOperation;
import ec.edu.espe.datamanager.utils.NSQLDBManager;
import ec.edu.espe.prototypevirtualid.model.Administrator;

/**
 * @author BryanPC
 */
public class DirectorController extends Administrator {

    @Override
    public void addDatabase(DBObject object) {
        NSQLDBManager persistance = new MongoOperation();
        MongoOperation.create(object);
    }

    @Override
    public void createId() {
        VirtualCardController id = new VirtualCardController();
        id.createIdentification();

    }

    @Override
    public void removeStudent(String dataToDelete) {
        Persistance action = new MongoOperation();
        action.delete("Name", dataToDelete);
    }

    @Override
    public boolean validUser(String user, String password) {
        Login log = Login.getInstance();
        log.validate(user , password);    
        
        if (log.validate(user, password)== true){
            return true;
        }
        else{
            return false;
        }
    }
    
     public boolean approveMotion(char answer) {
        if (answer == 'Y' || answer == 'y') {
            return true;
        } else if (answer == 'N' || answer == 'n') {
            return false;
        }
        return false;

    }
    
}
