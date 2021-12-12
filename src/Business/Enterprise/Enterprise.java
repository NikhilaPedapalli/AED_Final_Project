/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.PetHospitalOrganizationDirectory;
import Business.Organization.PetStoreOrganizationDirectory;
import Business.Organization.ShelterOrganizationDirectory;

/**
 *
 * @author pinky
 */
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