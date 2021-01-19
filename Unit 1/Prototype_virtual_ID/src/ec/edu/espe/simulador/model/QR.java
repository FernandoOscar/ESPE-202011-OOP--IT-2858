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
 * @author JOHNY
 */
public class QR {
    private int id;
    private boolean security;

    public void security() {
        Scanner dateID = new Scanner(System.in);
        ArrayList VirtualCard = new ArrayList();
        System.out.println("Ingrese su ID: ");
        id = dateID.nextInt();
        VirtualCard.add(id);
        
        
    }
}
