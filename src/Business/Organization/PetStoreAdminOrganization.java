/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.Role;
import Business.Role.petStoreAdmin;
import Business.Role.shelterAdmin;
import java.util.ArrayList;

/**
 *
 * @author pinky
 */
public class PetStoreAdminOrganization {

    public PetStoreAdminOrganization() {
        super(Organization.Type.PetStoreAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        for (Role.RoleType type : Role.RoleType.values()){
            if (type.getValue().equals(Role.RoleType.PetStoreAdmin.getValue()))
                roles.add(new petStoreAdmin());
        }
     return roles;
    }
     
}