/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.petStoreEmployee;
import java.util.ArrayList;
/**
 *
 * @author pinky
 */
public class PetStoreOrganization {
    
    public PetStoreOrganization() {
        super(Organization.Type.PetStore.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        for (Role.RoleType type : Role.RoleType.values()){
            if (type.getValue().equals(Role.RoleType.PetStoreEmployee.getValue()))
                roles.add(new petStoreEmployee());
        }
     return roles;
    }
     
}