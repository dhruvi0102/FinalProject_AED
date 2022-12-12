/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PoliceDepartment;

import model.EcoSystem;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author dhruv
 */
public class PoliceDeptAdmin extends javax.swing.JPanel {
    
        private JPanel userProcessContainer;
        private UserAccount account;
        EcoSystem ecoSystem;

    /**
     * Creates new form PDAdmin
     */

    public PoliceDeptAdmin(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem, String DivisionName, String area, String status, String reqId) {
        
        initComponents();
        this.account=account;
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem=ecoSystem;
        lblReqID.setText(reqId);
       
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
        lblCUManage = new javax.swing.JLabel();
        btnManage = new javax.swing.JButton();
        lblToAdd = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        lblReqID = new javax.swing.JLabel();
        lblToAdd1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setForeground(new java.awt.Color(119, 10, 40));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, 110, 30));

        lblCUManage.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblCUManage.setText("Click for the assigning control unit :");
        add(lblCUManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        btnManage.setBackground(new java.awt.Color(0, 153, 153));
        btnManage.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnManage.setForeground(new java.awt.Color(255, 255, 255));
        btnManage.setText("Manage");
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });
        add(btnManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 90, 30));

        lblToAdd.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        lblToAdd.setText("Police Department Panel");
        add(lblToAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 420, 40));

        btnAdd.setBackground(new java.awt.Color(0, 153, 153));
        btnAdd.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 90, 30));
        add(lblReqID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 41, 135, 27));

        lblToAdd1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblToAdd1.setText("Click to Add New Control Unit :");
        add(lblToAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component c = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
        // TODO add your handling code here:
        AssignControlUnitJPanel manageCriticalCrime=new AssignControlUnitJPanel(userProcessContainer,account, ecoSystem, lblReqID.getText());
        userProcessContainer.add("Manage CriticalCrimeUnit",manageCriticalCrime);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
         AddControlUnitJPanel addPDDiv =new AddControlUnitJPanel(userProcessContainer,account, ecoSystem, lblReqID.getText());
        userProcessContainer.add("Manage TrafficDiv",addPDDiv);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnManage;
    private javax.swing.JLabel lblCUManage;
    private javax.swing.JLabel lblReqID;
    private javax.swing.JLabel lblToAdd;
    private javax.swing.JLabel lblToAdd1;
    // End of variables declaration//GEN-END:variables
}
