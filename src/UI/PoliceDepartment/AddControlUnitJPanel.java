/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PoliceDepartment;

import model.EcoSystem;
import model.PoliceDepartment.ControlUnitDirectory;
import model.PoliceDepartment.ControlUnit;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author aishw
 */
public class AddControlUnitJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddControlUnitJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    EcoSystem ecoSystem;
    String reqID = "";

    public AddControlUnitJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem, String reqID) {
        initComponents();
        this.account=account;
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem=ecoSystem;
        reqID = reqID;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblCUNum = new javax.swing.JLabel();
        txtCUNum = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 110, 30));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 40, -1, -1));

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        lblTitle.setText("Add New Control Unit");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 270, -1));

        lblCUNum.setText("Control Unit Number :");
        add(lblCUNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 20));
        add(txtCUNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 160, -1));

        btnAdd.setText("Create");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component c = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
     String cuNum = txtCUNum.getText();    
     ControlUnitDirectory controlunitDir = ecoSystem.getControlUnitDirectory();
     ControlUnit controlUnit = null;
     if (ecoSystem.getControlUnitDirectory() == null){
         controlUnit = new ControlUnit(cuNum);
         controlunitDir.getCcunits().add(controlUnit);
    } else {
         controlUnit = ecoSystem.getControlUnitDirectory().createCCUDirectory(cuNum);
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCUNum;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCUNum;
    // End of variables declaration//GEN-END:variables

}