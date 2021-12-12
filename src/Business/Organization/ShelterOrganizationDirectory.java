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