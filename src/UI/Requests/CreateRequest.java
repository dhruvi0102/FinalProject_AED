/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Requests;

import model.Areas.Area;
import model.EcoSystem;
import model.Requests.Request;
import java.awt.CardLayout;
import java.awt.Component;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author siddh
 */
public class CreateRequest extends javax.swing.JPanel {

    /**
     * Creates new form CreateRequest
     */
    private EcoSystem ecoSystem;
    private JPanel userProcessContainer;

    List<String> a = new ArrayList<>();

    public CreateRequest(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        currentTime();
        listServices.setSelectionMode(
        ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        cmbStatus.addItem("Active");
        cmbStatus.addItem("Assigned");
        cmbStatus.addItem("Completed");
        cmbStatus.setSelectedIndex(0);
//        statusDD.setEnabled(false);

        getAreas();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHead = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtEmergency = new javax.swing.JLabel();
        entityTypeOfEmergency = new javax.swing.JLabel();
        btnGetUnits = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listServices = new javax.swing.JList<>();
        txtSelectedService = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComments = new javax.swing.JTextArea();
        lblComments = new javax.swing.JLabel();
        lblTimeStamp = new javax.swing.JLabel();
        entityAreaField = new javax.swing.JComboBox<>();
        lblArea = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        cmbStatus = new javax.swing.JComboBox<>();
        lblStatus = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHead.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblHead.setText("Create Request");
        add(lblHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 31, 140, -1));

        lblName.setText("Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 277, -1));

        lblEmail.setText("Email");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 40, -1));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 277, -1));

        txtEmergency.setText("Type of Emergency");
        add(txtEmergency, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));
        add(entityTypeOfEmergency, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 277, 17));

        btnGetUnits.setBackground(new java.awt.Color(102, 255, 102));
        btnGetUnits.setText("Get Units");
        btnGetUnits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetUnitsActionPerformed(evt);
            }
        });
        add(btnGetUnits, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 277, 38));

        listServices.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Request Healthcare Services", "Request Police Services", "Request Fire Services", "Request Shelter Services" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listServices.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listServicesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listServices);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 277, 80));

        txtSelectedService.setText("Selected Service");
        add(txtSelectedService, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        txtComments.setColumns(20);
        txtComments.setRows(5);
        jScrollPane2.setViewportView(txtComments);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 277, -1));

        lblComments.setText("comments");
        add(lblComments, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        lblTimeStamp.setText("jLabel8");
        add(lblTimeStamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        add(entityAreaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 277, -1));

        lblArea.setText("Area");
        add(lblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        btnBack.setText(" Back ");
        btnBack.setActionCommand(" Back ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 16, -1, -1));

        cmbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatusActionPerformed(evt);
            }
        });
        add(cmbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 277, -1));

        lblStatus.setText("Status");
        add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetUnitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetUnitsActionPerformed
        String entityName = txtName.getText();
        String entityLocation = txtEmail.getText();
        String entityArea = entityAreaField.getSelectedItem().toString();
        String typeOfEmergency = entityTypeOfEmergency.getText();
        String comments = txtComments.getText();
        String dateTimeStamp = lblTimeStamp.getText();
        String status = cmbStatus.getSelectedItem().toString();
        Units unitsPanel = new Units(userProcessContainer, ecoSystem, entityName, entityLocation, entityArea, typeOfEmergency, comments, dateTimeStamp, status);

        userProcessContainer.add("manageDelJPanel", unitsPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnGetUnitsActionPerformed

    private void listServicesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listServicesValueChanged
  // TODO add your handling code here:
    }//GEN-LAST:event_listServicesValueChanged

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
          // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGetUnits;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JComboBox<String> entityAreaField;
    private javax.swing.JLabel entityTypeOfEmergency;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblComments;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTimeStamp;
    private javax.swing.JList<String> listServices;
    private javax.swing.JTextArea txtComments;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtEmergency;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel txtSelectedService;
    // End of variables declaration//GEN-END:variables

}
