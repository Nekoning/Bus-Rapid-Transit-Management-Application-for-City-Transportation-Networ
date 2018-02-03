/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Jianing Wang
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Bus.getValue())){
            organization = new BusOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Line.getValue())){
            organization = new LineOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Finance.getValue())){
            organization = new FinanceOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Platform.getValue())){
            organization = new PlatformOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Regulation.getValue())){
            organization = new RegulationOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
}
