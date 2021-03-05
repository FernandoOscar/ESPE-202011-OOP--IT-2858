package ec.edu.espe.prototypevirtualid.model;

import ec.edu.espe.filemanager.utils.Data;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author group2
 */
public class Area {
      
    private String location;
    private boolean availability;
    private String area;
    File file = new File("medicines"); 
    
    public void showAvailable(File fileName, String record){
        Data.find(file, record);
    }
    
    
    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the availability
     */
    public boolean isAvailability() {
        return availability;
    }

    /**
     * @param availability the availability to set
     */
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

  

}
    
    

