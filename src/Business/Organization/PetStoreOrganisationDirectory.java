/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author pinky
 */
public class PetStoreOrganisationDirectory {    
    
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