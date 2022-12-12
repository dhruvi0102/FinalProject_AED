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
import java.awt.Color;
import java.awt.Component;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Requests.RequestDirectory;
import model.UserAccount.UserAccount;

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
    private UserAccount userAccount;
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
        btnGetUnits.setVisible(true);
        btnCreate.setVisible(false);

        getAreas();

    }

     public CreateRequest(JPanel userProcessContainer,UserAccount account, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = account;
        currentTime();
        listServices.setSelectionMode(
                ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        cmbStatus.addItem("Active");
        cmbStatus.addItem("Assigned");
        cmbStatus.addItem("Completed");
        cmbStatus.setSelectedIndex(0);
        btnBack.setVisible(false);
        btnGetUnits.setVisible(false);
        btnCreate.setVisible(true);
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
        txtLocation = new javax.swing.JTextField();
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
        txtEmail = new javax.swing.JTextField();
        lblEmail1 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHead.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        lblHead.setText("Create Request");
        add(lblHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 230, -1));

        lblName.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblName.setText("Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 277, -1));

        lblEmail.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblEmail.setText("Location");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 80, -1));

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 277, -1));

        txtEmergency.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtEmergency.setText("Type of Services");
        add(txtEmergency, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));
        add(entityTypeOfEmergency, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 277, 17));

        btnGetUnits.setBackground(new java.awt.Color(0, 153, 153));
        btnGetUnits.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnGetUnits.setForeground(new java.awt.Color(255, 255, 255));
        btnGetUnits.setText("Get Units");
        btnGetUnits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetUnitsActionPerformed(evt);
            }
        });
        add(btnGetUnits, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 277, 38));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 277, 80));

        txtSelectedService.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtSelectedService.setText("Selected Service");
        add(txtSelectedService, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 370, 120, -1));

        txtComments.setColumns(20);
        txtComments.setRows(5);
        jScrollPane2.setViewportView(txtComments);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 277, -1));

        lblComments.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblComments.setText("comments");
        add(lblComments, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 410, 80, -1));

        lblTimeStamp.setText("jLabel8");
        add(lblTimeStamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        add(entityAreaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 277, -1));

        lblArea.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblArea.setText("Area");
        add(lblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 230, 40, -1));

        btnBack.setBackground(new java.awt.Color(0, 153, 153));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText(" Back ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 17, -1, 30));

        cmbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatusActionPerformed(evt);
            }
        });
        add(cmbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 277, -1));

        lblStatus.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblStatus.setText("Status");
        add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 540, 50, -1));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 277, -1));

        lblEmail1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblEmail1.setText("Email");
        add(lblEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 40, -1));

        btnCreate.setBackground(new java.awt.Color(0, 153, 153));
        btnCreate.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 620, 277, 38));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetUnitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetUnitsActionPerformed
        String entityName = txtName.getText();
        String email = txtEmail.getText();
        String entityLocation = txtLocation.getText();
        String entityArea = entityAreaField.getSelectedItem().toString();
        String typeOfEmergency = listServices.getSelectedValue();
        String comments = txtComments.getText();
        String dateTimeStamp = lblTimeStamp.getText();
        String status = cmbStatus.getSelectedItem().toString();
        try {
            if(entityName==null || entityName.isEmpty()){
                throw new NullPointerException(" Name field is Empty");

            }else if(Pattern.matches("^[A-Za-z ]*$", entityName)==false){
                throw new Exception("Please enter valid  Name with only characters");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, " Name is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "  Name is invalid");

            return;
        }
        try {
            if(email==null || email.isEmpty()){
                throw new NullPointerException(" Email field is Empty");

            }else if(Pattern.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{3,4}$", email)==false){
                throw new Exception("Please enter valid  Email");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, " Email is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, " Email is invalid");

            return;
        }
        try {
            if(entityLocation==null || entityLocation.isEmpty()){
                throw new NullPointerException(" Location field is Empty");

            }else if(Pattern.matches("^[A-Za-z0-9 ]*$", entityLocation)==false){
                throw new Exception("Please enter valid  Location");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, " Person Location is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "  Person Location is invalid");

            return;
        }
        String FromEmail = "homeandbeyound@gmail.com";
        String FromEmailPassword = "umba qlmn cfnq entb";
        String Subjects = "Request Created";
        
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
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.setSubject(Subjects);
            message.setText("An Request is created on behalf of you by Admin" 
                            + "\n Details are as below: " 
                            + "\nLocation:"+entityLocation
                            + "\n Type of Emergency: " + typeOfEmergency 
                            + "\n Comments to your case: " + comments 
                            + "\n\n If this is not you then contact +1 (635)241-8765 or email to homeandbeyound@gmail.com");
            Transport.send(message);
        }catch(Exception ex){
            System.out.println(""+ex);
        }
        
       UnitsJpanel unitsPanel = new UnitsJpanel(userProcessContainer, ecoSystem, entityName, entityLocation, entityArea, typeOfEmergency, comments, dateTimeStamp, status);
        userProcessContainer.add("manageDelJPanel", unitsPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnGetUnitsActionPerformed

    private void listServicesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listServicesValueChanged
  // TODO add your handling code here:
        String selectedEnterprises = "";
        List<String> SelectedFruits = listServices.getSelectedValuesList();

        for (String Fruit : SelectedFruits) {
            selectedEnterprises = selectedEnterprises + Fruit;
            a.add(selectedEnterprises);
        }

        Set<String> uniqueArr = new HashSet<String>(a);
        String x = "";
        for (String y : uniqueArr) {
            x = x + y + ",";
            entityTypeOfEmergency.setText(x);
        }

    }//GEN-LAST:event_listServicesValueChanged

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
          // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStatusActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
       
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String userName = "";
        String email = txtEmail.getText();
        String personName = txtName.getText();
        String personLocation = txtLocation.getText();
        String area = lblArea.getText();
        String typeOfEmergency = txtEmergency.getText();
        String comments = lblComments.getText();
        String date = lblTimeStamp.getText();
        String selectedHospital = "Not Assigned";
        String selectedFireDept = "Not Assigned";
        String selectedPoliceDept = "Not Assigned";
        String selectedShelter = "Not Assigned";
        String status = (String) cmbStatus.getSelectedItem();
        
        
        try {
            if(personName==null || personName.isEmpty()){
                throw new NullPointerException(" Name field is Empty");

            }else if(Pattern.matches("^[A-Za-z ]*$", personName)==false){
                throw new Exception("Please enter valid  Name with only characters");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, " Name is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "  Name is invalid");

            return;
        }
        try {
            if(personLocation==null || personLocation.isEmpty()){
                throw new NullPointerException(" Location field is Empty");

            }else if(Pattern.matches("^[A-Za-z0-9 ]*$", personLocation)==false){
                throw new Exception("Please enter valid  Location");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, " Person Location is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "  Person Location is invalid");

            return;
        }
        try {
            if(email==null || email.isEmpty()){
                throw new NullPointerException(" Email field is Empty");

            }else if(Pattern.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{3,4}$", email)==false){
                throw new Exception("Please enter valid  Email");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, " Email is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, " Email is invalid");

            return;
        }
        
        String FromEmail = "homeandbeyound@gmail.com";
        String FromEmailPassword = "umba qlmn cfnq entb";
        String Subjects = "Request Created";
        
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
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.setSubject(Subjects);
            message.setText("An Request is created on behalf of you by "+ userAccount  
                            + "\n Details are as below: " + "\nLocation:"+personLocation
                            + "\n Type of Emergency: " + typeOfEmergency 
                            + "\n Comments to your case: " + comments 
                            + "\n\n If this is not you then contact +1 (635)241-8765 or email to homeandbeyound@gmail.com");
            Transport.send(message);
        }catch(Exception ex){
            System.out.println(""+ex);
        }
        
        RequestDirectory reqDir = ecoSystem.getRequestDirectory();
        Request req = null;
        if (ecoSystem.getRequestDirectory() == null) {
            req = new Request(personName, personLocation, area, typeOfEmergency, comments, date, selectedHospital, selectedFireDept, selectedPoliceDept, selectedShelter, status);
            reqDir.getRequests().add(req);
        } else {
            req = ecoSystem.getRequestDirectory().createRequest(personName, personLocation, area, typeOfEmergency, comments, date, selectedHospital, selectedFireDept, selectedPoliceDept, selectedShelter, status);
        }
        JOptionPane.showMessageDialog(null, "  Request is created");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        String pattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(txtEmail.getText());
        if (!match.matches()) {
            //lblPWeightErr.setText("Incorrect weight format");
            txtEmail.setBackground(Color.red);
        } else {
            txtEmail.setBackground(Color.white);
        }
    }//GEN-LAST:event_txtEmailKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnGetUnits;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JComboBox<String> entityAreaField;
    private javax.swing.JLabel entityTypeOfEmergency;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblComments;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTimeStamp;
    private javax.swing.JList<String> listServices;
    private javax.swing.JTextArea txtComments;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtEmergency;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel txtSelectedService;
    // End of variables declaration//GEN-END:variables
private void currentTime() {
        Date date = new Date();
        long time = date.getTime();
        Timestamp ts = new Timestamp(time);
        String s = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(ts);
        lblTimeStamp.setText(s.toString());
    }
    private void getAreas() {
        for (Area a : ecoSystem.getAreaDirectory().getAreasList()) {
            entityAreaField.addItem(a.getAreaName() + " " + a.getAreaZipCode());
        }
    }
}
