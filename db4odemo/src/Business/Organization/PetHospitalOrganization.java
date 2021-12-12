/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.Role.RoleType;
import Business.Role.petHospitalEmployee;
import java.util.ArrayList;


public class PetHospitalOrganization extends Organization{

    public PetHospitalOrganization() {
        super(Organization.Type.PetHospital.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        for (RoleType type : Role.RoleType.values()){
            if (type.getValue().equals(RoleType.Doctor.getValue()))
                roles.add(new petHospitalEmployee());
        }
     return roles;
    }
}