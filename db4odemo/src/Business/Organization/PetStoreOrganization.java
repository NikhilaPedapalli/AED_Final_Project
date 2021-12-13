/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.Role.RoleType;
import Business.Role.petStoreEmployee;
import java.util.ArrayList;


public class PetStoreOrganization extends Organization{

    public PetStoreOrganization() {
        super(Organization.Type.PetStore.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        for (RoleType type : Role.RoleType.values()){
            if (type.getValue().equals(RoleType.Doctor.getValue()))
                roles.add(new petStoreEmployee());
        }
     return roles;
    }
}