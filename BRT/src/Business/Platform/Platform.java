/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Platform;

import Business.Employee.Employee;

/**
 *
 * @author Jianing Wang
 */
public class Platform extends Employee {
    
    private int platformID;
    private int volumn;

//    public String getPlatformName() {
//        return platformName;
//    }
//
//    public void setPlatformName(String platformName) {
//        this.platformName = platformName;
//    }

    public int getPlatformID() {
        return platformID;
    }

    public void setPlatformID(int platformID) {
        this.platformID = platformID;
    }

    public int getVolumn() {
        return volumn;
    }

    public void setVolumn(int volumn) {
        this.volumn = volumn;
    }

    @Override
    public String toString(){
        return this.getName();
    }
    
}
