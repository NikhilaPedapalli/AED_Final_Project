/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role.RoleType;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author pinky
 */

public abstract class Role {
    
    public enum RoleType{
        PetStoreEmployee("PetStoreEmployee"),
        Doctor("Doctor"),
        ShelterEmployee("Lab ShelterEmployee"),
        PetStoreAdmin("PetStoreAdmin"),
        PetHospitalAdmin("PetHospitalAdmin"),
        ShelterAdmin("ShelterAdmin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}