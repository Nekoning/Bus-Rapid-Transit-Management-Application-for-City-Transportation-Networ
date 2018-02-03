/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.RegulationRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jianing Wang
 */
public class RegulationOrganization extends Organization {

    public RegulationOrganization(){
        super(Type.Regulation.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RegulationRole());
        return roles;
    }
    
}
