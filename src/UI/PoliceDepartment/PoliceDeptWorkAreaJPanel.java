/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PoliceDepartment;

import model.EcoSystem;
import model.PoliceDepartment.PoliceDepartment;
import model.Requests.Request;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import static java.lang.System.exit;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dhruv
 */
public class PoliceDeptWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PoliceDeptWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    EcoSystem ecoSystem;
    
    public PoliceDeptWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem) {
        initComponents();
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        populteTable();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblWelcome = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPoliceDept = new javax.swing.JTable();
        btnContinue = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        lblWelcome.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        lblWelcome.setText("Welcome to Police Department");

        lblText.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblText.setText("Requests assigned :");

        tblPoliceDept.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        tblPoliceDept.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Location", "Area", "Type of Emergency", "Comments", "Date", "Hospital", "Assigned FD", "Assigned PD", "Shelter", "Status", "Request IDl"
            }
        ));
        jScrollPane1.setViewportView(tblPoliceDept);

        btnContinue.setBackground(new java.awt.Color(0, 153, 153));
        btnContinue.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnContinue.setForeground(new java.awt.Color(255, 255, 255));
        btnContinue.setText("Continue");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblText, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblWelcome)
                .addGap(18, 18, 18)
                .addComponent(lblText, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        // TODO add your handling code here:
        int selectRow = tblPoliceDept.getSelectedRow();
        String DivisionName = "";
        String area = "";
        String status = "";
        String reqId = "";

        if (selectRow >= 0) {
            DivisionName = (String) tblPoliceDept.getValueAt(selectRow, 0);
            area = (String) tblPoliceDept.getValueAt(selectRow, 2);
            status = (String) tblPoliceDept.getValueAt(selectRow, 10);
            reqId =  (String) tblPoliceDept.getValueAt(selectRow, 11);

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        if ( tblPoliceDept.getValueAt(selectRow, 10).equals("Completed")){
            JOptionPane.showMessageDialog(null, "Please select an active request to continue");         
        }else{
            PoliceDeptAdmin pda = new PoliceDeptAdmin(userProcessContainer, account, ecoSystem, DivisionName, area, status, reqId);
            userProcessContainer.add("Manage ManagePDA", pda);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnContinueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTable tblPoliceDept;
    // End of variables declaration//GEN-END:variables

    private void populteTable() {
        DefaultTableModel model = (DefaultTableModel) tblPoliceDept.getModel();
        model.setRowCount(0);
        for ( PoliceDepartment pd : ecoSystem.getPoliceDeptDirectory().getPoliceDepartment()) {
            if (pd.getUserName().equals(account.getUserName())) {
                for (Request req : pd.getRequests()) {
                   
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
            else {
                System.out.println("pd req fail here");
            }

        }
    }
 
}

