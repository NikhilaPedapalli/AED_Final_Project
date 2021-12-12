/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.Role.RoleType;
import java.util.ArrayList;


public class CustomerOrganization extends Organization{

    public CustomerOrganization() {
        super(Organization.Type.Customer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        for (RoleType type : Role.RoleType.values()){
            if (type.getValue().equals(RoleType.Customer.getValue()))
                roles.add(new NewCustomer() {});
        }
     return roles;
    }

    private static class NewCustomer extends Role {

        public NewCustomer() {
        }
    }
}