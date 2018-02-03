/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.BRTSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.RegulationOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.RegulationRole.RegulationWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Jianing Wang
 */
public class RegulationRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, BRTSystem system) {
        return new RegulationWorkAreaJPanel(userProcessContainer, userAccount, (RegulationOrganization) organization, system);
    }
    
}
