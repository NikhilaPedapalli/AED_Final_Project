/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.PetHospitalEmployee.PetHospitalEmployeeWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class petHospitalEmployee extends Role{
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PetHospitalEmployeeWorkAreaJPanel(userProcessContainer, account, business);
    }

    
    
}