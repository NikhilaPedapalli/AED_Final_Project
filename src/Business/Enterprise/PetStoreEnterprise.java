/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author pinky
 */
public class PetStoreEnterprise extends Enterprise {
    
    public PetStoreEnterprise(String name){
        super(name,Enterprise.EnterpriseType.PetStore);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}