/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.controller;

import ec.edu.espe.filemanager.utils.Data;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author BryanPC
 */
public class DiagnosisController {

    public void saveClinicHistory(String fileName, String record) throws IOException {
        Data.save("fileName", record);

    }

}
