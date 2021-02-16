package ec.edu.espe.simulador.model;

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
    private ClinicalLaboratory ClinicalLaboratory;
    private GeneralMedicine GeneralMedicine;
    private Odontology Odontology;
    private ArrayList<ClinicalLaboratory> cLaboratory = new ArrayList();
    private ArrayList<GeneralMedicine> gMedicines = new ArrayList();
    private ArrayList<Odontology> Odont = new ArrayList();
    
    

    /**
     * @return the gMedicines
     */
    public ArrayList<GeneralMedicine> getgMedicines() {
        return gMedicines;
    }

    /**
     * @param gMedicines the gMedicines to set
     */
    public void setgMedicines(ArrayList<GeneralMedicine> gMedicines) {
        this.gMedicines = gMedicines;
    }

    /**
     * @return the Odontology
     */
    public Odontology getOdontology() {
        return Odontology;
    }

    /**
     * @param Odontology the Odontology to set
     */
    public void setOdontology(Odontology Odontology) {
        this.Odontology = Odontology;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
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

    /**
     * @return the ClinicalLaboratory
     */
    public ClinicalLaboratory getClinicalLaboratory() {
        return ClinicalLaboratory;
    }

    /**
     * @param ClinicalLaboratory the ClinicalLaboratory to set
     */
    public void setClinicalLaboratory(ClinicalLaboratory ClinicalLaboratory) {
        this.ClinicalLaboratory = ClinicalLaboratory;
    }

    /**
     * @return the GeneralMedicine
     */
    public GeneralMedicine getGeneralMedicine() {
        return GeneralMedicine;
    }

    /**
     * @param GeneralMedicine the GeneralMedicine to set
     */
    public void setGeneralMedicine(GeneralMedicine GeneralMedicine) {
        this.GeneralMedicine = GeneralMedicine;
    }

    /**
     * @return the cLaboratory
     */
    public ArrayList<ClinicalLaboratory> getcLaboratory() {
        return cLaboratory;
    }

    /**
     * @param cLaboratory the cLaboratory to set
     */
    public void setcLaboratory(ArrayList<ClinicalLaboratory> cLaboratory) {
        this.cLaboratory = cLaboratory;
    }

    /**
     * @return the Odont
     */
    public ArrayList<Odontology> getOdont() {
        return Odont;
    }

    /**
     * @param Odont the Odont to set
     */
    public void setOdont(ArrayList<Odontology> Odont) {
        this.Odont = Odont;
    }
    
    
   

}
    
    

