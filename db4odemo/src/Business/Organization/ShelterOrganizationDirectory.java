/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;


public class ShelterOrganizationDirectory {
    
    private ArrayList<ShelterOrganization> organizationList;

    public ShelterOrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<ShelterOrganization> getOrganizationList() {
        return organizationList;
    }
    public void deleteShelterOrgInfo(Organization v)
    {
        organizationList.remove(v);
    }
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Shelter.getValue())){
            organization = new ShelterOrganization();
            organizationList.add((ShelterOrganization) organization);
        }
        return organization;
    }
}