/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class VirtualCard {
    private String department;
    private int id;
    private String name;


public boolean giveWay() {
        return true;
    }

    public void showIdentification(InformationStudent date) {
        int x;
        x = date.getId().length();
        if (x != 7) {
            System.out.println("Unidentified ID");
        } else {
            //return true;
        }
        //return true;
    }
    
}
