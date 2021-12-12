 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.PetHospitalOrganizationDirectory;
import Business.Organization.PetStoreOrganizationDirectory;
import Business.Organization.ShelterOrganizationDirectory;


public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    OrganizationDirectory organizationDirectory;
    PetHospitalOrganizationDirectory petHospitalOrganizationDirectory;
    PetStoreOrganizationDirectory petStoreOrganizationDirectory;
    ShelterOrganizationDirectory ShelterOrganizationDirectory;

    public PetHospitalOrganizationDirectory getPetHospitalOrganizationDirectory() {
        
        return petHospitalOrganizationDirectory;
        
    }
     public PetStoreOrganizationDirectory getPetStoreOrganizationDirectory() {
        
        return petStoreOrganizationDirectory;
        
    }
    public ShelterOrganizationDirectory getShelterOrganizationDirectory() {
        
        return ShelterOrganizationDirectory;
        
    }
    
    public OrganizationDirectory getOrganizationDirectory() {
        
        return organizationDirectory;
        
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        PetStore("PetStore"),
        Shelter("Shelter");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
        petHospitalOrganizationDirectory = new PetHospitalOrganizationDirectory();
        petStoreOrganizationDirectory = new PetStoreOrganizationDirectory();
        ShelterOrganizationDirectory = new ShelterOrganizationDirectory();
    }
}
