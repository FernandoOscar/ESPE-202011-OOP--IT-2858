/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

import java.util.Scanner;

/**
 *
 * @author JOHNY
 */
public class Polyclinic {
    private int virtualid;
    private boolean qrcode;
    
    
    public static void attention(){
        Scanner sn2 = new Scanner(System.in);
        int option2;
        System.out.println("\n-----In what area should it be understood?---");
        System.out.println("(1) General Medice");
        System.out.println("(2) Odontology");
        System.out.println("(3) Clinical Laboratory");
        System.out.println("(4) Physiotherapy");
        option2 = sn2.nextInt();
    }
    

    public Polyclinic() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Polyclinic{" + "virtualid=" + virtualid + ", qrcode=" + qrcode + '}';
    }

    
    public Polyclinic(int virtualid, boolean qrcode) {
        this.virtualid = virtualid;
        this.qrcode = qrcode;
    }
    
    void attendStudent(Student student){
        
    }
    boolean verifydentification(QR qr){
        return true;
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
    
}
