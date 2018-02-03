/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Bus.Bus;
import Business.Role.BusRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jianing Wang
 */
public class BusOrganization extends Organization {
    
    public BusOrganization() {
        super(Type.Bus.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new BusRole());
        return roles;
    }
    
}
