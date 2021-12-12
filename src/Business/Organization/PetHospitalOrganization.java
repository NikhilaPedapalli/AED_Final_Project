/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.Role.RoleType;
import Business.Role.petHospitalEmployee;
import java.util.ArrayList;
import javax.management.relation.Role;
/**
 *
 * @author pinky
 */
public class PetHospitalOrganization {

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

}
