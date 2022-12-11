/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.HospitalDepartment;

import model.EcoSystem;
import model.Hospital.Hospital;
import model.Requests.Request;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shreyansipatel
 */
public class GeneralCaseManagementJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem system;

    public GeneralCaseManagementJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, String patientName, String area, String status, String reqID, String docName, String npiNum, String ambNum) {
        initComponents();

        this.account = account;
        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateGeneralTable(patientName, area, status, reqID, docName, npiNum, ambNum);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGeneralWardPanel = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblPatientStatus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGeneralWard = new javax.swing.JTable();
        btnAdmitPatient = new javax.swing.JButton();
        lblEMTTechName = new javax.swing.JLabel();
        lblDisplayEMTTechName = new javax.swing.JLabel();
        lblAmbulanceNum = new javax.swing.JLabel();
        lblDisplayAmbNum = new javax.swing.JLabel();
        lblNPINum = new javax.swing.JLabel();
        lblDisplayNPINum = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGeneralWardPanel.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        lblGeneralWardPanel.setText("General Ward");
        add(lblGeneralWardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 110, 30));

        lblPatientStatus.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblPatientStatus.setText("Patient Status:");
        add(lblPatientStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        tblGeneralWard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient Name", "Area", "Status", "Request ID"
            }
        ));
        jScrollPane1.setViewportView(tblGeneralWard);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 660, 160));

        btnAdmitPatient.setText("Admit Patient");
        btnAdmitPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmitPatientActionPerformed(evt);
            }
        });
        add(btnAdmitPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, -1, -1));

        lblEMTTechName.setText("EMT Technician Name:");
        add(lblEMTTechName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        lblDisplayEMTTechName.setText("jLabel13");
        add(lblDisplayEMTTechName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        lblAmbulanceNum.setText("Ambulance number:");
        add(lblAmbulanceNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        lblDisplayAmbNum.setText("jLabel14");
        add(lblDisplayAmbNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        lblNPINum.setText("NPI Number:");
        add(lblNPINum, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        lblDisplayNPINum.setText("jLabel15");
        add(lblDisplayNPINum, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component c = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAdmitPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmitPatientActionPerformed
        int selectRow = tblGeneralWard.getSelectedRow();
        String reqID = null;
        if (selectRow >= 0) {
            reqID = (String) tblGeneralWard.getValueAt(selectRow, 3);

            // system.getUserAccountDirectory().deleteUserAccount(user);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }

        for (Request j : system.getRequestDirectory().getRequests()) {
            if (j.getRequestId() == reqID) {
                j.setStatus("Completed");
            }
        }

    }//GEN-LAST:event_btnAdmitPatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmitPatient;
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAmbulanceNum;
    private javax.swing.JLabel lblDisplayAmbNum;
    private javax.swing.JLabel lblDisplayEMTTechName;
    private javax.swing.JLabel lblDisplayNPINum;
    private javax.swing.JLabel lblEMTTechName;
    private javax.swing.JLabel lblGeneralWardPanel;
    private javax.swing.JLabel lblNPINum;
    private javax.swing.JLabel lblPatientStatus;
    private javax.swing.JTable tblGeneralWard;
    // End of variables declaration//GEN-END:variables

    private void populateGeneralTable(String patientName, String area, String status, String reqID, String docName, String npiNum, String ambNum) {
        DefaultTableModel model = (DefaultTableModel) tblGeneralWard.getModel();
        model.setRowCount(0);
        String entityDesc = "EMT: " + docName + "\n NPI: " + npiNum + " \n AMB: " + ambNum;

        System.out.println("enetetetet" + entityDesc);
        lblDisplayEMTTechName.setText(docName);
        lblDisplayAmbNum.setText(ambNum);
        lblDisplayNPINum.setText(npiNum);
        for (Hospital custom : system.getHospitalDirectory().getHospitalDirectoryList()) {
            if (custom.getUserName().equals(account.getUsername())) {
                for (Request req : custom.getRequests()) {

                    if (req.getRequestId() == reqID) {

                        req.setEntityDesc(entityDesc);
                        Object[] row = new Object[11];
                        row[0] = req.getPersonName();
                        row[1] = req.getArea();
                        row[2] = req.getStatus();
                        row[3] = req.getRequestId();
                        model.addRow(row);
                    }
                }

            }
        }
    }
}
