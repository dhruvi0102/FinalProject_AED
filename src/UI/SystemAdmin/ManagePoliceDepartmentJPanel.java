/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdmin;

import model.EcoSystem;
import model.PoliceDepartment.PoliceDepartment;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.PoliceDepartment.PoliceDepartmentDirectory;
import model.Role.PoliceDepartmentAdmin;
/**
 *
 * @author dhruv
 */
public class ManagePoliceDepartmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePoliceDepartmentJPanel
     */
    
    JPanel userProcessContainer;
    UserAccount userAccount;
    EcoSystem ecoSystem;

    public ManagePoliceDepartmentJPanel(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        populateEntityTable();
    
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
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbluname = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblAvailability = new javax.swing.JLabel();
        chbStatus = new javax.swing.JCheckBox();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPoliceDepartment = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnConfirmUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("Add new Police Department");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 240, -1));

        lblName.setText("Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 67, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 240, -1));

        lbluname.setText("Username");
        add(lbluname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 72, 20));

        txtUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnameActionPerformed(evt);
            }
        });
        add(txtUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 240, -1));

        lblPassword.setText("Password");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 81, -1));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 240, -1));

        lblAddress.setText("Address");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 81, 19));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 238, 48));

        lblAvailability.setText("Availability");
        add(lblAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        chbStatus.setText("Yes");
        add(chbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 90, 30));

        tblPoliceDepartment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Department Name", "Username", "Password", "Address"
            }
        ));
        jScrollPane1.setViewportView(tblPoliceDepartment);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 700, 130));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 110, -1));

        btnConfirmUpdate.setText("Confirm Update");
        btnConfirmUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmUpdateActionPerformed(evt);
            }
        });
        add(btnConfirmUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, -1, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String uname = txtUname.getText();
        String password = txtPassword.getText();
        String address = txtAddress.getText();
        Boolean status = chbStatus.isSelected();
        
        try {
            if(name==null || name.isEmpty()){
                throw new NullPointerException(" Name field is Empty");

            }else if(name.length()<5 || Pattern.matches("^[A-Za-z ]*$", name)==false){
                throw new Exception("Please enter valid  Name");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, " Name is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "  Name is invalid");

            return;
        }

        try {
            if(uname==null || uname.isEmpty()){
                throw new NullPointerException("User Name field is Empty");

            }else if(uname.length()<5){
                throw new Exception("Please enter valid User Name");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "User Name is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, " User Name is invalid");

            return;
        }

        try {

            if(password==null || password.isEmpty()){
                throw new NullPointerException("Pwd field is Empty");
            }else if(Pattern.matches("^(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{5,30}$", password)==false){
                throw new Exception("Invalid Password");
            }

        }  catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Password is Empty");

            return;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password is of invalid pattern");

            return;
        }
        if (ecoSystem.getUserAccountDirectory().IsUsernameUnique(uname)==false) {
            JOptionPane.showMessageDialog(null,"  User Name already exists ");
            }else{
                UserAccount acc = ecoSystem.getUserAccountDirectory().addUserAccount(name, uname, password,address,status, new PoliceDepartmentAdmin());
                PoliceDepartmentDirectory policedeptdir = ecoSystem.getPoliceDeptDirectory();

                PoliceDepartment policeDept = null;

                if (ecoSystem.getPoliceDeptDirectory()==null)
                    {
                    policeDept = new PoliceDepartment(name, uname, address, status);
                    policedeptdir.getPoliceDepartment().add(policeDept);
                    }
                else {
                    policeDept = ecoSystem.getPoliceDeptDirectory().createPoliceDeptartment(name, uname, address, status);
                }
            }
        JOptionPane.showMessageDialog(null, "Police Department is added!");
        populateEntityTable();
        txtName.setText("");                
        txtUname.setText("");
        txtPassword.setText("");
        txtAddress.setText("");
        chbStatus.setSelected(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPoliceDepartment.getSelectedRow();
        if (selectedRow >= 0) {
            String name = (String) tblPoliceDepartment.getValueAt(selectedRow, 0);
            String uname = (String) tblPoliceDepartment.getValueAt(selectedRow, 1);
            String password = (String) tblPoliceDepartment.getValueAt(selectedRow, 2);
            int selectionButton = JOptionPane.YES_NO_OPTION;
            String warningMessage = "Are you sure you want to delete the user" + name.toUpperCase() + " ?";
            int selectionResult = JOptionPane.showConfirmDialog(null, warningMessage, "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                UserAccount user = ecoSystem.getUserAccountDirectory().authenticateUser(uname, password);
                ecoSystem.getUserAccountDirectory().deleteUserAccount(user);
                ecoSystem.getPoliceDeptDirectory().deleteDeptartment(uname);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
        JOptionPane.showMessageDialog(null, "Department is deleted!");
        populateEntityTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectRow = tblPoliceDepartment.getSelectedRow();

        if(selectRow>=0){
            String username= (String) tblPoliceDepartment.getValueAt(selectRow, 1);
            String pwd= (String) tblPoliceDepartment.getValueAt(selectRow, 2);
            userAccount=ecoSystem.getUserAccountDirectory().authenticateUser(username, pwd);

            txtName.setText(userAccount.getFullName()+"");
            txtUname.setText(userAccount.getUserName()+"");
            txtPassword.setText(userAccount.getPassword()+"");
            txtAddress.setText(userAccount.getAddress()+"");
            chbStatus.setSelected(true);

        }
        else {
            JOptionPane.showMessageDialog(null,"Please select a row");
        }
        
        btnSave.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnConfirmUpdate.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnConfirmUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmUpdateActionPerformed
        // TODO add your handling code here:

        String name = txtName.getText();
        String uname=txtUname.getText();
        String password=txtPassword.getText();
        String address = txtAddress.getText();
        Boolean status = chbStatus.isSelected();
        try {
            if(name==null || name.isEmpty()){
                throw new NullPointerException(" Name field is Empty");

            }else if(name.length()<5 || Pattern.matches("^[A-Za-z ]*$", name)==false){
                throw new Exception("Please enter valid  Name");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, " Name is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "  Name is invalid");

            return;
        }

        try {
            if(uname==null || uname.isEmpty()){
                throw new NullPointerException("User Name field is Empty");

            }else if(uname.length()<5){
                throw new Exception("Please enter valid User Name");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "User Name is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, " User Name is invalid");

            return;
        }

        try {

            if(password==null || password.isEmpty()){
                throw new NullPointerException("Pwd field is Empty");
            }else if(Pattern.matches("^(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{5,30}$", password)==false){
                throw new Exception("Invalid Password");
            }

        }  catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Password is Empty");

            return;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password is of invalid pattern");

            return;
        }

            ecoSystem.getUserAccountDirectory().updateUserAccount(userAccount,name,uname,password,address,status);
            ecoSystem.getPoliceDeptDirectory().updatePoliceDepartment(name,uname,address,status);
            JOptionPane.showMessageDialog(null, "User Changes are updated!");
            populateEntityTable();
            btnSave.setEnabled(true);
            btnDelete.setEnabled(true);
            btnUpdate.setEnabled(true);
            btnConfirmUpdate.setEnabled(false);
            txtName.setText("");
            txtUname.setText("");
            txtPassword.setText("");
            txtAddress.setText("");
            chbStatus.setSelected(false);
    }//GEN-LAST:event_btnConfirmUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirmUpdate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chbStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lbluname;
    private javax.swing.JTable tblPoliceDepartment;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables

    private void populateEntityTable() {
        
  DefaultTableModel model = (DefaultTableModel) tblPoliceDepartment.getModel();
        JTableHeader th = tblPoliceDepartment.getTableHeader();
        th.setFont(new Font("Serif", Font.BOLD, 15));
        model.setRowCount(0);	
        for (UserAccount user : ecoSystem.getUserAccountDirectory().getUserAccountList()) {
            if ("model.Role.PoliceDepartmentAdmin".equals(user.getRole().getClass().getName())) {
                
                Object[] row = new Object[4];

                row[0] = user.getFullName();
                row[1] = user.getUserName();
                row[2] = user.getPassword();
                row[3] = user.getAddress();

                model.addRow(row);
            }
        }
    }
}
