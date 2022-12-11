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
import java.awt.Component;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author shreyansipatel
 */
public class HospitalRequestManagementJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem system;

    public HospitalRequestManagementJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populteHospitals();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        lblTableTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAssignedRequests = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        lblTitle.setText("Welcome to Hospital");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 236, -1));

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, -1));

        lblTableTitle.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblTableTitle.setText("List of requests assigned to your Hospital :");
        add(lblTableTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        tblAssignedRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Location", "Area", "Type of Emergency", "Comments", "Date", "Hospital", "Assigned FD", "Assigned PD", "Shelter", "Status", "RequestID"
            }
        ));
        jScrollPane1.setViewportView(tblAssignedRequests);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 1340, 140));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        int selectRow = tblAssignedRequests.getSelectedRow();
        String patientName = "";
        String area = "";
        String status = "";
        String reqID = "";

        if (selectRow >= 0) {
            patientName = (String) tblAssignedRequests.getValueAt(selectRow, 0);
            area = (String) tblAssignedRequests.getValueAt(selectRow, 2); 
            status = (String) tblAssignedRequests.getValueAt(selectRow, 10);
            reqID = (String) tblAssignedRequests.getValueAt(selectRow, 11);
           
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row! ");
            return;
        }
            
        
        if(status.equalsIgnoreCase("Completed")) {
            JOptionPane.showMessageDialog(null, "This request has already been processed. Please Select Another Request.");
            return;
        } else {
            HospitalAdminJPanel hospAdmin = new HospitalAdminJPanel(userProcessContainer, account, system, patientName, area, status, reqID);
            userProcessContainer.add("Manage ManageHospital", hospAdmin);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
       
    }//GEN-LAST:event_btnNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTableTitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblAssignedRequests;
    // End of variables declaration//GEN-END:variables

    private void populteHospitals() {
        System.out.println(system.getHospitalDirectory().getHospitalDirectoryList() + "pppppp");
        DefaultTableModel model = (DefaultTableModel) tblAssignedRequests.getModel();
        model.setRowCount(0);
        for (Hospital custom : system.getHospitalDirectory().getHospitalDirectoryList()) {
            System.out.println("cuttt " + custom.getUserName() + "sjsjsj " + account.getUsername() );
            if (custom.getUserName().equals(account.getUsername())) {
                for (Request req : custom.getRequests()) {
                    Object[] row = new Object[12];

                    row[0] = req.getPersonName();
                    row[1] = req.getPersonLocation();
                    row[2] = req.getArea();
                    row[3] = req.getTypeOfEmergency();
                    row[4] = req.getComments();
                    row[5] = req.getDate();
                    row[6] = req.getSelectedHospital();
                    row[7] = req.getSelectedFireDept();
                    row[8] = req.getSelectedPoliceDept();
                    row[9] = req.getSelectedShelter();
                    row[10] = req.getStatus();
                    row[11] = req.getRequestId();

                    model.addRow(row);
                }

            }

        }
    }
}
