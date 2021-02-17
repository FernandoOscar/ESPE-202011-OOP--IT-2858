/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Group4
 */
public class Polyclinic {

    private int virtualid;
    private boolean qrcode;
    private Scanner vr = new Scanner(System.in);
    private String treatment;
    private String infection;
    private ArrayList<GeneralMedicine> gMedicines;
    private ArrayList<Odontology> Odont;

    public Polyclinic(int virtualid, boolean qrcode, String treatment, String infection, ArrayList<GeneralMedicine> gMedicines, ArrayList<Odontology> Odont) {
        this.virtualid = virtualid;
        this.qrcode = qrcode;
        this.treatment = treatment;
        this.infection = infection;
        this.gMedicines = gMedicines;
        this.Odont = Odont;
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
     * @return the vr
     */
    public Scanner getVr() {
        return vr;
    }

    /**
     * @param vr the vr to set
     */
    public void setVr(Scanner vr) {
        this.vr = vr;
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
