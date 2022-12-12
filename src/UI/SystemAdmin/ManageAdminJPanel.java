/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdmin;

import model.EcoSystem;
import model.Role.AdminRole;
import model.UserAccount.UserAccount;
import model.UserAdmin.AdminDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.UserAdmin.Admin;

/**
 *
 * @author dhruv
 */
public class ManageAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAdminJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    EcoSystem ecoSystem;
    
    public ManageAdminJPanel(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        populateTable();
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
        btnBack = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdmin = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnConfirmUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblAddress = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblTitle.setText("Manage Admin");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        btnBack.setBackground(new java.awt.Color(0, 153, 153));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName.setText("Name :");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 180, -1));

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsername.setText("Username :");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 180, -1));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPassword.setText("Password :");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 180, -1));

        btnSave.setBackground(new java.awt.Color(0, 153, 153));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, 30));

        tblAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Username", "Password", "Address"
            }
        ));
        jScrollPane1.setViewportView(tblAdmin);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 583, 150));

        btnUpdate.setBackground(new java.awt.Color(0, 153, 153));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, 30));

        btnConfirmUpdate.setBackground(new java.awt.Color(0, 153, 153));
        btnConfirmUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConfirmUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmUpdate.setText("Confirm Update");
        btnConfirmUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmUpdateActionPerformed(evt);
            }
        });
        add(btnConfirmUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, -1, 30));

        btnDelete.setBackground(new java.awt.Color(0, 153, 153));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, -1, 30));

        lblAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAddress.setText("Address :");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 30));

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane2.setViewportView(txtAddress);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 210, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String uname = txtUsername.getText();
        String password = txtPassword.getText();
        String address = txtAddress.getText();
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
            UserAccount acc = ecoSystem.getUserAccountDirectory().addUserAccount(name, uname, password, address,null, new AdminRole());
            AdminDirectory admdir = ecoSystem.getAdminDirectory();

            Admin admin = null;

            if (ecoSystem.getAdminDirectory()==null)
            {
                admin = new Admin(name, uname,address);
                admdir.getAdmins().add(admin);
            }
            else {
                admin = ecoSystem.getAdminDirectory().createAdmin(name, uname,address);
                System.out.println("name :::" + admin.getUserName());
            }
            JOptionPane.showMessageDialog(null, "Admin is added!");
        }
        
        populateTable();
        txtName.setText("");                
        txtUsername.setText("");
        txtPassword.setText("");
        txtAddress.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectRow = tblAdmin.getSelectedRow();

        if(selectRow>=0){
            String username= (String) tblAdmin.getValueAt(selectRow, 1);
            String pwd= (String) tblAdmin.getValueAt(selectRow, 2);
            userAccount=ecoSystem.getUserAccountDirectory().authenticateUser(username, pwd);

            txtName.setText(userAccount.getFullName()+"");
            txtUsername.setText(userAccount.getUserName()+"");
            txtPassword.setText(userAccount.getPassword()+"");
            txtAddress.setText(userAccount.getAddress() + "");
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
        String uname=txtUsername.getText();
        String password=txtPassword.getText();
        String address = txtAddress.getText();
        try {
            if(name==null || name.isEmpty()){
                throw new NullPointerException(" Name field is Empty");

            }else if(name.length()<5 || Pattern.matches("^[A-Za-z]+$", name)==false){
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
    
            ecoSystem.getUserAccountDirectory().updateUserAccount(userAccount,name,uname,password,address, null);
            ecoSystem.getAdminDirectory().updateAdmin(name, uname, address);
            populateTable();
            JOptionPane.showMessageDialog(null, "Admin details are updated!");
            btnSave.setEnabled(true);
            btnDelete.setEnabled(true);
            btnUpdate.setEnabled(true);
            btnConfirmUpdate.setEnabled(false);
            txtName.setText("");
            txtUsername.setText("");
            txtPassword.setText("");
        
    }//GEN-LAST:event_btnConfirmUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAdmin.getSelectedRow();
        if (selectedRow >= 0) {
            String name = (String) tblAdmin.getValueAt(selectedRow, 0);
            String uname = (String) tblAdmin.getValueAt(selectedRow, 1);
            String password = (String) tblAdmin.getValueAt(selectedRow, 2);
            int selectionButton = JOptionPane.YES_NO_OPTION;
            String warningMessage = "Are you sure you want to delete the user - " + name.toUpperCase() + " ?";
            int selectionResult = JOptionPane.showConfirmDialog(null, warningMessage, "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                UserAccount user = ecoSystem.getUserAccountDirectory().authenticateUser(uname, password);
                ecoSystem.getUserAccountDirectory().deleteUserAccount(user);
                ecoSystem.getAdminDirectory().deleteAdmin(uname);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
        JOptionPane.showMessageDialog(null, "Admin details are deleted!");
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTable tblAdmin;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
    private void populateTable() {
        
    DefaultTableModel model = (DefaultTableModel) tblAdmin.getModel();
        JTableHeader th = tblAdmin.getTableHeader();
        th.setFont(new Font("Serif", Font.BOLD, 15));
        model.setRowCount(0);
        for (UserAccount user : ecoSystem.getUserAccountDirectory().getUserAccountList()) {
            if ("model.Role.AdminRole".equals(user.getRole().getClass().getName())) {               
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
