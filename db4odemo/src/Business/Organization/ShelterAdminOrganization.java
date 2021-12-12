/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.Role;
import Business.Role.petHospitalAdmin;
import Business.Role.shelterAdmin;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class ShelterAdminOrganization extends Organization{

    public ShelterAdminOrganization() {
        super(Type.ShelterAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        for (Role.RoleType type : Role.RoleType.values()){
            if (type.getValue().equals(Role.RoleType.ShelterAdmin.getValue()))
                roles.add(new shelterAdmin());
        }
     return roles;
    }
     
}
