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
public class Inventory {
    String location;
    boolean availability;
    String area;
    
    boolean updateData(){
        return true;
    }
    boolean checkAvailable(){
        return true;
    }
    void referToArea(){
        
    }
    
}
