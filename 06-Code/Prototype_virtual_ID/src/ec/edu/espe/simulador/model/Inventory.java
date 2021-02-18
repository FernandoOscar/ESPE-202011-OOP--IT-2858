package ec.edu.espe.simulador.model;

import ec.edu.espe.filemanager.utils.Data;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author group2
 */
public class Inventory {
    
    
    private String location;
    private boolean availability;
    private String area;
    
    
    
    
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
    
    

