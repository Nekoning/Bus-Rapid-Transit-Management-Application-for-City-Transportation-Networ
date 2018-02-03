/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.LineRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jianing Wang
 */
public class LineOrganization extends Organization {
    
    public LineOrganization(){
        super(Type.Line.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LineRole());
        return roles;
    }
    
}
