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
public class PetHospitalOrganizationDirectory {
    
    private ArrayList<PetHospitalOrganization> organizationList;

    public PetHospitalOrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<PetHospitalOrganization> getOrganizationList() {
        return organizationList;
    }
    public void deletePetHospitalOrgInfo(Organization v)
    {
        organizationList.remove(v);
    }
    
    public Organization createOrganization(Type type){
        PetHospitalOrganization organization = null;
        if (type.getValue().equals(Type.PetHospital.getValue())){
            organization = new PetHospitalOrganization();
            organizationList.add((PetHospitalOrganization) organization);
        }
        return organization;
    }
}