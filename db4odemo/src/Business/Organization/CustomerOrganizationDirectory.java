/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class CustomerOrganizationDirectory {
    
    private ArrayList<CustomerOrganization> organizationList;

    public CustomerOrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<CustomerOrganization> getOrganizationList() {
        return organizationList;
    }
    public void deleteCustomerOrgInfo(Organization v)
    {
        organizationList.remove(v);
    }
    
    public Organization createOrganization(Type type){
        CustomerOrganization organization = null;
        if (type.getValue().equals(Type.Customer.getValue())){
            organization = new CustomerOrganization();
            organizationList.add((CustomerOrganization) organization);
        }
        return organization;
    }
}