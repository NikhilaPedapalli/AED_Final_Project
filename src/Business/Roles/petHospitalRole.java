/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PetHospitalOrganization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.PetHospitalEmployee.PetHospitalEmployeeWorkAreaJPanel;

/**
 *
 * @author pinky
 */
public class petHospitalEmployee extends Role{
    
  @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PetHospitalEmployeeWorkAreaJPanel(userProcessContainer, account, business);
    }
}