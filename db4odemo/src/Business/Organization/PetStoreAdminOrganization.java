/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.Role;
import Business.Role.petStoreAdmin;
import Business.Role.petStoreEmployee;
import Business.Role.petStoreAdmin;
import Business.Role.shelterAdmin;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class PetStoreAdminOrganization extends Organization{

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
