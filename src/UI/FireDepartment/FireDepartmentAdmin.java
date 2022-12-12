/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.FireDepartment;

import model.EcoSystem;
import model.FireDepartment.FactoryFireDispatchUnit;
import model.FireDepartment.FactoryFireDispatchUnitDirectory;
import model.FireDepartment.HousingFireDispatchUnit;
import model.FireDepartment.HousingFireDispatchUnitDirectory;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author siddh
 */
public class FireDepartmentAdmin extends javax.swing.JPanel {

    /**
     * Creates new form FireDepartmentAdmin
     */
    private JPanel userProcessContainer;

    private UserAccount account;
   
    EcoSystem system;
    public FireDepartmentAdmin(JPanel userProcessContainer, UserAccount account,EcoSystem system, String DivisionName, String area, String status, String reqID) {
        initComponents();
        this.account=account;
        this.userProcessContainer = userProcessContainer;
        this.system=system;
        lblRequestDisplay.setText(reqID);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblFactoryFire = new javax.swing.JLabel();
        lblHouseEmergency = new javax.swing.JLabel();
        btnProceed = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblHouseUn = new javax.swing.JLabel();
        lblFactoryUn = new javax.swing.JLabel();
        txtHouseUN = new javax.swing.JTextField();
        txtFactoryUN = new javax.swing.JTextField();
        btnAddFf = new javax.swing.JButton();
        btnHf = new javax.swing.JButton();
        lblRequestDisplay = new javax.swing.JLabel();
        lblRequestN = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fire Services");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 250, 40));

        lblFactoryFire.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblFactoryFire.setText("Factory Fire Emergency");
        add(lblFactoryFire, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lblHouseEmergency.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblHouseEmergency.setText("House Fire Emergency");
        add(lblHouseEmergency, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        btnProceed.setBackground(new java.awt.Color(0, 153, 153));
        btnProceed.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnProceed.setForeground(new java.awt.Color(255, 255, 255));
        btnProceed.setText("Proceed");
        btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedActionPerformed(evt);
            }
        });
        add(btnProceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 90, 30));

        btnBack.setBackground(new java.awt.Color(0, 153, 153));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, 30));

        lblHouseUn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblHouseUn.setText("Unit Number:");
        add(lblHouseUn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        lblFactoryUn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblFactoryUn.setText("Unit Number:");
        add(lblFactoryUn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));
        add(txtHouseUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 210, -1));
        add(txtFactoryUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 210, -1));

        btnAddFf.setBackground(new java.awt.Color(0, 153, 153));
        btnAddFf.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAddFf.setForeground(new java.awt.Color(255, 255, 255));
        btnAddFf.setText("Add Unit");
        btnAddFf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFfActionPerformed(evt);
            }
        });
        add(btnAddFf, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, 30));

        btnHf.setBackground(new java.awt.Color(0, 153, 153));
        btnHf.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnHf.setForeground(new java.awt.Color(255, 255, 255));
        btnHf.setText("Add Unit");
        btnHf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHfActionPerformed(evt);
            }
        });
        add(btnHf, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, 30));

        lblRequestDisplay.setText("jLabel9");
        add(lblRequestDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        lblRequestN.setText("Request No.");
        add(lblRequestN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed
        // TODO add your handling code here:
        
        ManageDispatchUnits manageDispatchUnits=new ManageDispatchUnits(userProcessContainer,account, system, lblRequestDisplay.getText());
        userProcessContainer.add("Manage DispatchUnits",manageDispatchUnits);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProceedActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component c = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddFfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFfActionPerformed
        // TODO add your handling code here:
            String factoryFireUnit = txtFactoryUN.getText();
            FactoryFireDispatchUnitDirectory FactoryFireDispatchUnitDirectory = system.getFactoryFireDispatchUnitDirectory();
            FactoryFireDispatchUnit industrialFireDispatch = null;
            if(system.getFactoryFireDispatchUnitDirectory() == null) {
                industrialFireDispatch = new FactoryFireDispatchUnit(factoryFireUnit);
                FactoryFireDispatchUnitDirectory.getFactoryFireDispatchUnits().add(industrialFireDispatch);
                
                JOptionPane.showMessageDialog(null, "Factory Fire Unit added!");
            }else {
                industrialFireDispatch = system.getFactoryFireDispatchUnitDirectory().createIndustrialFireDispatchUnit(factoryFireUnit);
                JOptionPane.showMessageDialog(null, "Factory Fire Unit added!");
            }
    }//GEN-LAST:event_btnAddFfActionPerformed

    private void btnHfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHfActionPerformed
        // TODO add your handling code here:
        String houseFireUnit = txtHouseUN.getText();
            HousingFireDispatchUnitDirectory residentialFireDispatchUnitDirectory = system.getFireDispatchUnitDirectory();
            HousingFireDispatchUnit residentialFireDispatch = null;
            if(system.getFireDispatchUnitDirectory() == null) {
                residentialFireDispatch = new HousingFireDispatchUnit(houseFireUnit);
                residentialFireDispatchUnitDirectory.getHousingFireDispatchUnits().add(residentialFireDispatch);
                
              JOptionPane.showMessageDialog(null, "House Fire Unit added!");

            }else {
                residentialFireDispatch = system.getFireDispatchUnitDirectory().createResidentialFireDispatchUnit(houseFireUnit);
                 JOptionPane.showMessageDialog(null, "House Fire Unit added!");
            }
    }//GEN-LAST:event_btnHfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFf;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHf;
    private javax.swing.JButton btnProceed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFactoryFire;
    private javax.swing.JLabel lblFactoryUn;
    private javax.swing.JLabel lblHouseEmergency;
    private javax.swing.JLabel lblHouseUn;
    private javax.swing.JLabel lblRequestDisplay;
    private javax.swing.JLabel lblRequestN;
    private javax.swing.JTextField txtFactoryUN;
    private javax.swing.JTextField txtHouseUN;
    // End of variables declaration//GEN-END:variables
}
