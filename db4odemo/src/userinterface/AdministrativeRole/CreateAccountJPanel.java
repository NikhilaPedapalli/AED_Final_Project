/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Employee.Employee;
import Business.Organization.PetHospitalOrganization;
import Business.Organization.PetHospitalOrganizationDirectory;
import Business.Organization.PetStoreOrganization;
import Business.Organization.PetStoreOrganizationDirectory;
import Business.Organization.ShelterOrganization;
import Business.Organization.ShelterOrganizationDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 25836
 */
public class CreateAccountJPanel extends javax.swing.JPanel {

    private PetHospitalOrganizationDirectory petHospitalOrganizationDir;
    private PetStoreOrganizationDirectory petStoreOrganizationDir;
    private ShelterOrganizationDirectory shelterOrganizationDir;
    private JPanel userProcessContainer;
    private Employee employee;

    CreateAccountJPanel(JPanel userProcessContainer, PetHospitalOrganizationDirectory organizationDir, Employee employee) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.petHospitalOrganizationDir = organizationDir;
        this.employee = employee;
        
        populateEmployeeNameJComboBox();
        populateOrganizationJComboBox();
        populateRoleJComboBox();
    }
    CreateAccountJPanel(JPanel userProcessContainer, PetStoreOrganizationDirectory organizationDir, Employee employee) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.petStoreOrganizationDir = organizationDir;
        this.employee = employee;
        
        populateEmployeeNameJComboBox();
        populateOrganizationJComboBox();
        populateRoleJComboBox();
    }
    CreateAccountJPanel(JPanel userProcessContainer, ShelterOrganizationDirectory organizationDir, Employee employee) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.shelterOrganizationDir = organizationDir;
        this.employee = employee;
        
        populateEmployeeNameJComboBox();
        populateOrganizationJComboBox();
        populateRoleJComboBox();
    }


    private void populateEmployeeNameJComboBox(){
        EmployeeNameJComboBox.removeAllItems();
        EmployeeNameJComboBox.addItem(employee.getName());
        
    }
    private void populateOrganizationJComboBox(){
        OrganizationJComboBox.removeAllItems();
        if(petHospitalOrganizationDir != null){
            for (PetHospitalOrganization organization : petHospitalOrganizationDir.getOrganizationList()){
                for(Employee e : organization.getEmployeeDirectory().getEmployeeList()){
                    if(e.getName().equals(employee.getName()))
                        OrganizationJComboBox.addItem(organization);
                }
            }
        }
        else if(petStoreOrganizationDir != null){
            for (PetStoreOrganization organization : petStoreOrganizationDir.getOrganizationList()){
                for(Employee e : organization.getEmployeeDirectory().getEmployeeList()){
                    if(e.getName().equals(employee.getName()))
                        OrganizationJComboBox.addItem(organization);
                }
            }
        }
        else if(shelterOrganizationDir != null){
            for (ShelterOrganization organization : shelterOrganizationDir.getOrganizationList()){
                for(Employee e : organization.getEmployeeDirectory().getEmployeeList()){
                    if(e.getName().equals(employee.getName()))
                        OrganizationJComboBox.addItem(organization);
                }
            }
        }
    }
    private void populateRoleJComboBox(){
        RoleJComboBox.removeAllItems();
        if(petHospitalOrganizationDir != null){
            for (PetHospitalOrganization organization : petHospitalOrganizationDir.getOrganizationList()){
                for(Employee e : organization.getEmployeeDirectory().getEmployeeList()){
                    if(e.getName().equals(employee.getName())){
                        for(Role role:organization.getSupportedRole())
                            RoleJComboBox.addItem(role);
                    }
                }
            }
        }
        else if(petStoreOrganizationDir != null){
            for (PetStoreOrganization organization : petStoreOrganizationDir.getOrganizationList()){
                for(Employee e : organization.getEmployeeDirectory().getEmployeeList()){
                    if(e.getName().equals(employee.getName())){
                        for(Role role:organization.getSupportedRole())
                            RoleJComboBox.addItem(role);
                    }
                }
            }
        }
        else if(shelterOrganizationDir != null){
            for (ShelterOrganization organization : shelterOrganizationDir.getOrganizationList()){
                for(Employee e : organization.getEmployeeDirectory().getEmployeeList()){
                    if(e.getName().equals(employee.getName())){
                        for(Role role:organization.getSupportedRole())
                            RoleJComboBox.addItem(role);
                    }
                }
            }
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        backjButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        createUserJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        RoleJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        passwordJTextField = new javax.swing.JTextField();
        OrganizationJComboBox = new javax.swing.JComboBox();
        EmployeeNameJComboBox = new javax.swing.JComboBox();

        jLabel3.setText("Employee name");

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Organization");

        createUserJButton.setText("Create");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Role");

        jLabel1.setText("User Name");

        RoleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        RoleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleJComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        OrganizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        OrganizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrganizationJComboBoxActionPerformed(evt);
            }
        });

        EmployeeNameJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        EmployeeNameJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeNameJComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EmployeeNameJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(OrganizationJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RoleJComboBox, 0, 254, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(passwordJTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                        .addComponent(nameJTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(createUserJButton))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(backjButton1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(EmployeeNameJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(OrganizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(RoleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createUserJButton)
                .addContainerGap(156, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
        String userName = nameJTextField.getText();
        String password = passwordJTextField.getText();
        if(petHospitalOrganizationDir != null){
            PetHospitalOrganization organization = (PetHospitalOrganization) OrganizationJComboBox.getSelectedItem();
            Role role = (Role) RoleJComboBox.getSelectedItem();
            organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
            JOptionPane.showMessageDialog(null, "You've create an account for hospital organization doctor.");
        }
        else if(petStoreOrganizationDir != null){
            PetStoreOrganization organization = (PetStoreOrganization) OrganizationJComboBox.getSelectedItem();
            Role role = (Role) RoleJComboBox.getSelectedItem();
            organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
            JOptionPane.showMessageDialog(null, "You've create an account for pet store organization employee.");
        }
        else if(shelterOrganizationDir != null){
            ShelterOrganization organization = (ShelterOrganization) OrganizationJComboBox.getSelectedItem();
            Role role = (Role) RoleJComboBox.getSelectedItem();
            organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
            JOptionPane.showMessageDialog(null, "You've create an account for shelter organization employee.");
        }
    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void EmployeeNameJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeNameJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeNameJComboBoxActionPerformed

    private void OrganizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrganizationJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrganizationJComboBoxActionPerformed

    private void RoleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoleJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoleJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox EmployeeNameJComboBox;
    private javax.swing.JComboBox OrganizationJComboBox;
    private javax.swing.JComboBox RoleJComboBox;
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField passwordJTextField;
    // End of variables declaration//GEN-END:variables
}
