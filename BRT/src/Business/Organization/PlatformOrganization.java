/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PlatformRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jianing Wang
 */
public class PlatformOrganization extends Organization {

    public PlatformOrganization() {
        super(Type.Platform.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PlatformRole());
        return roles;
    }

}
