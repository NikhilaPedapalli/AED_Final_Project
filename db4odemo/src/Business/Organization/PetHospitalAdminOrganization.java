/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.Role;
import Business.Role.petHospitalAdmin;
import Business.Role.petHospitalEmployee;
import Business.Role.petStoreAdmin;
import Business.Role.shelterAdmin;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class PetHospitalAdminOrganization extends Organization{

    public PetHospitalAdminOrganization() {
        super(Organization.Type.PetHospitalAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        for (Role.RoleType type : Role.RoleType.values()){
            if (type.getValue().equals(Role.RoleType.PetHospitalAdmin.getValue()))
                roles.add(new petHospitalAdmin());
        }
     return roles;
    }
     
}
