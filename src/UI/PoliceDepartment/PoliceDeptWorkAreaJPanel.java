/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PoliceDepartment;

import model.EcoSystem;
import model.PoliceDepartment.PoliceDepartment;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import static java.lang.System.exit;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Requests.Request;

/**
 *
 * @author aishw
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

        jPanel1 = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblText = new javax.swing.JLabel();
        btnContinue = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPoliceDept = new javax.swing.JTable();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblWelcome.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        lblWelcome.setText("Welcome to Police Department");
        jPanel1.add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 360, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 84, 30));

        lblText.setText("Below are the requests assigned to your department:");
        jPanel1.add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 570, 21));

        btnContinue.setText("Continue");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });
        jPanel1.add(btnContinue, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 90, 30));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 1070, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1273, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 764, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component c = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

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

        PoliceDeptAdmin pda = new PoliceDeptAdmin(userProcessContainer, account, ecoSystem, DivisionName, area, status, reqId);
        userProcessContainer.add("Manage ManagePDA", pda);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnContinueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnContinue;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTable tblPoliceDept;
    // End of variables declaration//GEN-END:variables

    private void populteTable() {
        DefaultTableModel model = (DefaultTableModel) tblPoliceDept.getModel();
        model.setRowCount(0);
        for ( PoliceDepartment pd : ecoSystem.getPoliceDeptDirectory().getPoliceDepartment()) {
            if (pd.getUserName().equals(account.getUsername())) {
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

