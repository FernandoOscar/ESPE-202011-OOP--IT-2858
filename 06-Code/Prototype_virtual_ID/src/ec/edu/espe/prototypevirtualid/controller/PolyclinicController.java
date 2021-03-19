/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.controller;

import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.prototypevirtualid.model.Polyclinic;
import java.io.File;

/**
 *
 * @author BryanPC
 */
public class PolyclinicController {
    
    public void showMedicaments(File fileName, String record){
        Polyclinic pol = new Polyclinic();
        Data.find(fileName, record);
    }
    
}
