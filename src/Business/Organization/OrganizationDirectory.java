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
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    public void deleteOrgInfo(Organization v)
    {
        organizationList.remove(v);
    }
    
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.ShelterAdmin.getValue())){
            organization = new ShelterAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PetHospitalAdmin.getValue())){
            organization = new PetHospitalAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PetStoreAdmin.getValue())){
            organization = new PetStoreAdminOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.PetHospital.getValue())){
            organization = new PetHospitalOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.PetStore.getValue())){
            organization = new PetStoreOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Shelter.getValue())){
            organization = new ShelterOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}