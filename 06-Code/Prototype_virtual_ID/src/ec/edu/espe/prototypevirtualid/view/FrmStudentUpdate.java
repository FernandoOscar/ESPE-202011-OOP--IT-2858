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
 * @author LENOVO
 */
public class FrmStudentUpdate extends javax.swing.JFrame {

    /**
     * Creates new form FrmStudentUpdate
     */
    public FrmStudentUpdate() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtOldName = new javax.swing.JTextField();
        txtOldID = new javax.swing.JTextField();
        txtOldEmail = new javax.swing.JTextField();
        txtOldAddress = new javax.swing.JTextField();
        txtOldCareer = new javax.swing.JTextField();
        txtOldAge = new javax.swing.JTextField();
        cmbOldGender = new javax.swing.JComboBox<>();
        txtNewName = new javax.swing.JTextField();
        txtNewID = new javax.swing.JTextField();
        txtNewEmail = new javax.swing.JTextField();
        txtNewAddress = new javax.swing.JTextField();
        txtNewCareer = new javax.swing.JTextField();
        txtNewAge = new javax.swing.JTextField();
        cmbNewGender = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        bntUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update data");

        jLabel2.setText("Name:");

        jLabel3.setText("Name:");

        jLabel4.setText("ID:");

        jLabel5.setText("ID:");

        jLabel6.setText("Email:");

        jLabel7.setText("Email:");

        jLabel8.setText("Address:");

        jLabel9.setText("Address:");

        jLabel10.setText("Career:");

        jLabel11.setText("Career:");

        jLabel12.setText("Age:");

        jLabel13.setText("Age:");

        jLabel14.setText("Gender:");

        jLabel15.setText("Gender:");

        txtOldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOldNameActionPerformed(evt);
            }
        });

        cmbOldGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        txtNewName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewNameActionPerformed(evt);
            }
        });

        txtNewAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewAddressActionPerformed(evt);
            }
        });

        cmbNewGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbOldGender, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtOldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtOldCareer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtOldAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(txtOldEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtOldID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtOldName, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNewID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNewAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                        .addComponent(txtNewEmail, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(txtNewCareer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewAge, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbNewGender, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewName, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtOldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtOldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txtOldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtOldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(txtOldCareer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewCareer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(txtOldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(cmbOldGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbNewGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        bntUpdate.setText("Update");
        bntUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntUpdate)
                .addGap(106, 106, 106))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bntUpdate)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel1.setText("UPDATE STUDENT DATA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(396, 396, 396)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNewNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewNameActionPerformed

    private void txtNewAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewAddressActionPerformed

    private void txtOldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOldNameActionPerformed

    private void bntUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntUpdateActionPerformed
        try{
        
        String dataToSave = "The next Data will be save \n"
                + txtNewCareer.getText() + "\n"
                + txtNewName.getText() + "\n"
                + txtNewEmail.getText() + "\n"
                + txtNewAddress.getText() + "\n"
                + Integer.parseInt(txtNewAge.getText()) + "\n"
                + txtNewID.getText() + "\n"
                + cmbNewGender.getSelectedIndex() + "\n";
       
        String oldName = txtOldName.getText();
        String oldCareer = txtOldCareer.getText();
        String oldEmail = txtOldEmail.getText();
        String oldAddress = txtOldAddress.getText();
        int oldAge = txtOldName.getHeight();
        String oldId = txtOldID.getText();
        String oldGender = cmbOldGender.getName();

        String newName = txtNewName.getText();
        String newCareer = txtNewCareer.getText();
        String newEmail = txtNewEmail.getText();
        String newAddress = txtNewAddress.getText();
        int newAge = txtNewAge.getHeight();
        String newId = txtNewID.getText();
        String newGender = cmbNewGender.getName();

        int selection = JOptionPane.showConfirmDialog(null, dataToSave, "Students Saving", JOptionPane.YES_NO_CANCEL_OPTION);

        if (selection == 0) {
            
            
            JOptionPane.showMessageDialog(null, "Information was saved", txtNewName.getText() + txtNewCareer.getText() + txtNewEmail.getText() +
                    txtNewAddress.getText() + txtNewAge.getHeight() + txtNewID.getText()+ cmbNewGender.getName() + "Saved", JOptionPane.INFORMATION_MESSAGE);
            emptyFields();
            ConectionDataBase cloud = new ConectionDataBase();

            System.out.println("===========================================================");
            System.out.println("Your request has been successfully saved!!");
            System.out.println("===========================================================");
            cloud.ConectionDataBase();

            cloud.update(oldName, newName, oldId, newId , oldCareer, newCareer, oldEmail, newEmail,
                         oldAddress, newAddress, oldAge, newAge, oldGender, newGender);
            FrmGeneralMenu frmGeneral = new FrmGeneralMenu();
            this.setVisible(false);
            frmGeneral.setVisible(true);
            

        } else if (selection == 1) {
            JOptionPane.showMessageDialog(null, "Information was not saved", txtNewName.getText() + "Not saved", JOptionPane.ERROR_MESSAGE);
            emptyFields();
        } else {
            JOptionPane.showMessageDialog(null, "Action was canceled", txtNewName.getText() + "Canceled", JOptionPane.WARNING_MESSAGE);
        }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "No data has been entered, please try again", txtNewName.getText() + "ERROR", JOptionPane.WARNING_MESSAGE);
            }

    }//GEN-LAST:event_bntUpdateActionPerformed

    public void emptyFields() {
        txtOldName.setText("");
        txtOldID.setText("");
        txtOldEmail.setText("");
        txtOldAddress.setText("");
        txtOldAge.setText("");
        txtOldCareer.setText("");
        cmbOldGender.setSelectedItem("");
        
        txtNewName.setText("");
        txtNewID.setText("");
        txtNewEmail.setText("");
        txtNewAddress.setText("");
        txtNewAge.setText("");
        txtNewCareer.setText("");
        cmbNewGender.setSelectedItem("");
    }
    
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
            java.util.logging.Logger.getLogger(FrmStudentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmStudentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmStudentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmStudentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmStudentUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntUpdate;
    private javax.swing.JComboBox<String> cmbNewGender;
    private javax.swing.JComboBox<String> cmbOldGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtNewAddress;
    private javax.swing.JTextField txtNewAge;
    private javax.swing.JTextField txtNewCareer;
    private javax.swing.JTextField txtNewEmail;
    private javax.swing.JTextField txtNewID;
    private javax.swing.JTextField txtNewName;
    private javax.swing.JTextField txtOldAddress;
    private javax.swing.JTextField txtOldAge;
    private javax.swing.JTextField txtOldCareer;
    private javax.swing.JTextField txtOldEmail;
    private javax.swing.JTextField txtOldID;
    private javax.swing.JTextField txtOldName;
    // End of variables declaration//GEN-END:variables
}
