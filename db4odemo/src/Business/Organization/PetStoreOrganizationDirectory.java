/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;


public class PetStoreOrganizationDirectory {
    
    private ArrayList<PetStoreOrganization> organizationList;

    public PetStoreOrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<PetStoreOrganization> getOrganizationList() {
        return organizationList;
    }
    public void deletePetStoreOrgInfo(Organization v)
    {
        organizationList.remove(v);
    }
    
    public Organization createOrganization(Type type){
        PetStoreOrganization organization = null;
        if (type.getValue().equals(Type.PetStore.getValue())){
            organization = new PetStoreOrganization();
            organizationList.add((PetStoreOrganization) organization);
        }
        return organization;
    }
}