/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdmin;

import model.EcoSystem;
import model.FireDepartment.FireDepartment;
import model.FireDepartment.FireDepartmentDirectory;
import model.Role.FireDepartmentAdmin;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.util.Properties;
import javax.mail.Session;
import javax.mail.PasswordAuthentication;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author siddh
 */
public class ManageFireDept extends javax.swing.JPanel {

    /**
     * Creates new form ManageFireDept
     */ 
    JPanel userProcessContainer;
    UserAccount userAccount;
    EcoSystem ecoSystem;
    public ManageFireDept(JPanel userProcessContainer, EcoSystem ecoSystem) {
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

        lblName = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        lbluname = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFireEnterprise = new javax.swing.JTable();
        btnDel = new javax.swing.JButton();
        lbl_fireDept = new javax.swing.JLabel();
        lblAvailability = new javax.swing.JLabel();
        chbStatus = new javax.swing.JCheckBox();
        btnUpdate = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        Backbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setText("Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 39, -1));
        add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 230, -1));

        lbluname.setText("Username");
        add(lbluname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        add(txtUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 230, -1));

        lblPass.setText("Password");
        add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 230, -1));

        lblAddress.setText("Address");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 230, 50));

        btnSubmit.setText("Create");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        tblFireEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Station Name", "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(tblFireEnterprise);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 690, 112));

        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, -1, -1));

        lbl_fireDept.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_fireDept.setText("Fire Department");
        add(lbl_fireDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 220, 30));

        lblAvailability.setText("Availability");
        add(lblAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        chbStatus.setText("Yes");
        chbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbStatusActionPerformed(evt);
            }
        });
        add(chbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, -1, -1));

        btnConfirm.setText("Confirm Update");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, -1, -1));

        Backbtn.setText("Back");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });
        add(Backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 100, -1));

        jLabel7.setText("Please add Fire Unit details to add to list of Enterprises:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        jLabel1.setText("  ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        String fullName = txtFullName.getText();
        String userName = txtUname.getText();
        String password = txtPassword.getText();
        String location = txtLocation.getText();
        Boolean availability = chbStatus.isSelected();
        System.out.print("chbStatus"+chbStatus.isSelected());
        
        try {
            if(fullName==null || fullName.isEmpty()){
                throw new NullPointerException(" Name field is Empty");

            }else if(fullName.length()<5 || Pattern.matches("^[A-Za-z]+$", fullName)==false){
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
            if(userName==null || userName.isEmpty()){
                throw new NullPointerException("User Name field is Empty");

            }else if(userName.length()<5){
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
                throw new NullPointerException("Password field is Empty");
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

        System.out.println("weuhfuwef" + availability);
        String FromEmail = "emergencysystemaed@gmail.com";
        String FromEmailPassword = "jrxe svst jqjn nraj";
        String Subjects = "welcome to the team";
        
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        properties.put("mail.smtp.starttls.required", "true");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
        
        Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(FromEmail, FromEmailPassword);
            }
        });
        
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(FromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(userName));
            message.setSubject(Subjects);
            message.setText("welcome");
            Transport.send(message);
        }catch(Exception ex){
            System.out.println(""+ex);
        }
    

       UserAccount acc = ecoSystem.getUserAccountDirectory().addUserAccount(fullName, userName, password,location,availability, new FireDepartmentAdmin());
       //UserAccount acc = ecoSystem.getUserAccountDirectory().createUserAccount(fullName, userName, password, null, new PDAdmin());
        FireDepartmentDirectory firedeptdir = ecoSystem.getFireDepartmentDirectory();

        FireDepartment fireDept = null;

        if (ecoSystem.getFireDepartmentDirectory()==null)
        {
            fireDept = new FireDepartment(fullName, userName, location, availability);
            firedeptdir.getfireSquad().add(fireDept);
        }
        else {
            fireDept = ecoSystem.getFireDepartmentDirectory().createfireSquad(fullName, userName, location, availability);
            System.out.println("name" + fireDept.getEmail());
        }

        populateTable();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFireEnterprise.getSelectedRow();
        if (selectedRow >= 0) {
            String name = (String) tblFireEnterprise.getValueAt(selectedRow, 0);
            String uname = (String) tblFireEnterprise.getValueAt(selectedRow, 1);
            String password = (String) tblFireEnterprise.getValueAt(selectedRow, 2);
            int selectionButton = JOptionPane.YES_NO_OPTION;
            String warningMessage = "Are you sure you want to delete the user [FireDept] - " + name.toUpperCase() + " ?";
            int selectionResult = JOptionPane.showConfirmDialog(null, warningMessage, "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                UserAccount user = ecoSystem.getUserAccountDirectory().authenticateUser(uname, password);
                ecoSystem.getUserAccountDirectory().deleteUserAccount(user);
                ecoSystem.getFireDepartmentDirectory().deleteDepartment(uname);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
        populateTable();
    }//GEN-LAST:event_btnDelActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void chbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbStatusActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectRow = tblFireEnterprise.getSelectedRow();

        if(selectRow>=0){
            String username= (String) tblFireEnterprise.getValueAt(selectRow, 1);
            String pwd= (String) tblFireEnterprise.getValueAt(selectRow, 2);
            userAccount=ecoSystem.getUserAccountDirectory().authenticateUser(username, pwd);

            txtFullName.setText(userAccount.getName()+"");
            txtUname.setText(userAccount.getUsername()+"");
            txtPassword.setText(userAccount.getPassword()+"");
            // system.getUserAccountDirectory().deleteUserAccount(user);

        }
        else {
            JOptionPane.showMessageDialog(null,"Please select a row");
        }
        btnSubmit.setEnabled(false);
        btnDel.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnConfirm.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:

        String name = txtFullName.getText();
        String uname=txtUname.getText();
        String password=txtPassword.getText();

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

        if (ecoSystem.getUserAccountDirectory().checkIfUsernameIsUnique(uname)==false) {
            JOptionPane.showMessageDialog(null,"  User Name already exists ");
        }else{

            ecoSystem.getUserAccountDirectory().updateUserAccount(userAccount,name,uname,password);
            populateTable();
            btnSubmit.setEnabled(true);
            btnDel.setEnabled(true);
            btnUpdate.setEnabled(true);
            btnConfirm.setEnabled(false);
            txtFullName.setText("");
            txtUname.setText("");
            txtPassword.setText("");
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbtn;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lbl_fireDept;
    private javax.swing.JLabel lbluname;
    private javax.swing.JTable tblFireEnterprise;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
      DefaultTableModel model = (DefaultTableModel) tblFireEnterprise.getModel();
        //JTableHeader th = tblFireEnterprise.getTableHeader();
        model.setRowCount(0);
	System.out.println("ecoSystemecoSystem" + ecoSystem + ecoSystem.getUserAccountDirectory().getUserAccountList());
        for (UserAccount user : ecoSystem.getUserAccountDirectory().getUserAccountList()) {
            if ("Business.Role.FDAdminRole".equals(user.getRole().getClass().getName())) {
                
                Object[] row = new Object[3];

                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();

                model.addRow(row);

            }
        }

    }
}
