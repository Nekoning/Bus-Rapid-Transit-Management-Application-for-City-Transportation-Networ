/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.BRTSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BusOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.BusRole.BusWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Jianing Wang
 */
public class BusRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, BRTSystem business) {
        return new BusWorkAreaJPanel(userProcessContainer, userAccount, (BusOrganization) organization, enterprise);
    }
    
}
