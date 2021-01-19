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


public void giveWay(){
    Scanner dateID = new Scanner(System.in);
    System.out.println("Ingrese su ID: ");
    id = dateID.nextInt();
    
}
    
}
