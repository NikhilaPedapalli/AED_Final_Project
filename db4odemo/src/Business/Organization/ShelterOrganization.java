/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.shelterEmployee;
import java.util.ArrayList;


public class ShelterOrganization extends Organization{

    public ShelterOrganization() {
        super(Organization.Type.Shelter.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        for (Role.RoleType type : Role.RoleType.values()){
            if (type.getValue().equals(Role.RoleType.ShelterEmployee.getValue()))
                roles.add(new shelterEmployee());
        }
     return roles;
    }
     
}