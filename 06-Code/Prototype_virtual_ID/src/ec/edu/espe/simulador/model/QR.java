/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

/**
 *
 * @author JOHNY
 */
public class QR {

    private int id;
    private boolean security;


    public void showIdentification() {
        int random;
        int codeID[] = new int[8];
        for (int i = 0; i < 8; i++) {
            random = (int) (Math.random() * 9);
            codeID[i] = random;
            System.out.print(codeID[i]);
        }  
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the security
     */
    public boolean isSecurity() {
        return security;
    }

    /**
     * @param security the security to set
     */
    public void setSecurity(boolean security) {
        this.security = security;
    }

    

}
