/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.controller;

/**
 *
 * @author BryanPC
 */
public class VirtualCardController {
    
    public boolean giveWay(int dataID) {
        boolean permission;
        if (dataID != 9) {
            permission = true;
        } else {
            permission = false;
        }
        return permission;
    }
    
    public void showIdentification() {
        int random;
        int codeID[] = new int[8];
        for (int i = 0; i < 8; i++) {
            random = (int) (Math.random() * 9);
            codeID[i] = random;
            System.out.print(codeID[i]);
        }  
    }
    
}
