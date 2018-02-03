/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.BRTSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Jianing Wang
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Line("Line"),
        Bus("Bus"),
        Finance("Finance"),
        Regulation("Regulation"),
        Platform("Platform");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount userAccount, 
            Organization organization, 
            Enterprise enterprise, 
            BRTSystem system);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
