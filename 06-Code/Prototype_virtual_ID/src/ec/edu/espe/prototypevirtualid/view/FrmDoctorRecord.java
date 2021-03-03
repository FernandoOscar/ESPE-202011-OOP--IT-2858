/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.prototypevirtualid.view;

import ec.edu.espe.prototypevirtualid.controller.ConectionDataBase;
import javax.swing.JOptionPane;

/**
 *
 * @author FRANCISCO
 */
public class FrmDoctorRecord extends javax.swing.JFrame {

    /**
     * Creates new form FrmDoctorRecord
     */
    public FrmDoctorRecord() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNameDoctor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtWorkingHour = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbSpeciality = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnExitAddDoctor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Name Doctor");

        txtNameDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameDoctorActionPerformed(evt);
            }
        });

        jLabel3.setText("Working Hour");

        jLabel4.setText("Speciality");

        cmbSpeciality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Odontology", "Clinical Laboratory", "General Medicine", "Physiotherapy" }));
        cmbSpeciality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSpecialityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNameDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(cmbSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWorkingHour))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNameDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtWorkingHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setText("Add Doctor");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnExitAddDoctor.setText("Exit");
        btnExitAddDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitAddDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExitAddDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnExitAddDoctor))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        System.out.println("Name Doctor -> " + txtNameDoctor.getText());
        System.out.println("Working Hour -> " + txtWorkingHour.getText());
        System.out.println("Speciality -> " + cmbSpeciality.getSelectedItem());
        try{
        
        String dataToSave = "The next Data will be save \n"
                + txtNameDoctor.getText() + "\n"
                + txtWorkingHour.getText() + "\n"               
                + cmbSpeciality.getSelectedItem() + "\n";

        String NameDoctor = txtNameDoctor.getText();
        String WorkingHour = txtWorkingHour.getText();               
        String Speciality = cmbSpeciality.getName();

        int selection = JOptionPane.showConfirmDialog(null, dataToSave, "Students Saving", JOptionPane.YES_NO_CANCEL_OPTION);

        if (selection == 0) {
            
            
            JOptionPane.showMessageDialog(null, "Information was saved", txtNameDoctor.getText() + "Saved", JOptionPane.INFORMATION_MESSAGE);
            emptyFields();
            ConectionDataBase cloud = new ConectionDataBase();

            System.out.println("===========================================================");
            System.out.println("Your request has been successfully saved!!");
            System.out.println("===========================================================");
            cloud.ConectionDataBase("Doctor");

            cloud.create(NameDoctor, WorkingHour, Speciality);
            FrmGeneralMenu frmGeneral = new FrmGeneralMenu();
            this.setVisible(false);
            frmGeneral.setVisible(true);
            

        } else if (selection == 1) {
            JOptionPane.showMessageDialog(null, "Information was not saved", txtNameDoctor.getText() + "Not saved", JOptionPane.ERROR_MESSAGE);
            emptyFields();
        } else {
            JOptionPane.showMessageDialog(null, "Action was canceled", txtNameDoctor.getText() + "Canceled", JOptionPane.WARNING_MESSAGE);
        }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "No data has been entered, please try again", txtNameDoctor.getText() + "ERROR", JOptionPane.WARNING_MESSAGE);
            }

    }                                           

    public void emptyFields() {
        txtNameDoctor.setText("");
        txtWorkingHour.setText("");       
        cmbSpeciality.setSelectedItem("");
    
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmbSpecialityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSpecialityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSpecialityActionPerformed

    private void txtNameDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameDoctorActionPerformed

    private void btnExitAddDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitAddDoctorActionPerformed
        FrmGeneralMenu frmGeneral = new FrmGeneralMenu();
        this.setVisible(false);
        frmGeneral.setVisible(true);
    }//GEN-LAST:event_btnExitAddDoctorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmDoctorRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDoctorRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDoctorRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDoctorRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDoctorRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExitAddDoctor;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbSpeciality;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtNameDoctor;
    private javax.swing.JTextField txtWorkingHour;
    // End of variables declaration//GEN-END:variables
}
