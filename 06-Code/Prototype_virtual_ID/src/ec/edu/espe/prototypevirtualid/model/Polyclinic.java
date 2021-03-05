/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.model;

import ec.edu.espe.filemanager.utils.Data;
import java.io.File;


/**
 *
 * @author Group4
 */
public class Polyclinic {

    private int virtualid;
    private boolean qrcode;
    private String treatment;
    private String infection;

    public Polyclinic(int virtualid, boolean qrcode, String treatment, String infection) {
        this.virtualid = virtualid;
        this.qrcode = qrcode;
        this.treatment = treatment;
        this.infection = infection;
    }
    
    public void showMedicaments(File fileName, String record){
        Data.find(fileName, treatment);
    }

    
    /**
     * @return the virtualid
     */
    public int getVirtualid() {
        return virtualid;
    }

    /**
     * @param virtualid the virtualid to set
     */
    public void setVirtualid(int virtualid) {
        this.virtualid = virtualid;
    }

    /**
     * @return the qrcode
     */
    public boolean isQrcode() {
        return qrcode;
    }

    /**
     * @param qrcode the qrcode to set
     */
    public void setQrcode(boolean qrcode) {
        this.qrcode = qrcode;
    }

    /**
     * @return the treatment
     */
    public String getTreatment() {
        return treatment;
    }

    /**
     * @param treatment the treatment to set
     */
    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    /**
     * @return the infection
     */
    public String getInfection() {
        return infection;
    }

    /**
     * @param infection the infection to set
     */
    public void setInfection(String infection) {
        this.infection = infection;
    }


}
