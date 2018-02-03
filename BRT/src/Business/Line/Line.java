/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Line;

import Business.Employee.Employee;

/**
 *
 * @author Jianing Wang
 */
public class Line extends Employee {
    
    private String lineID;

    public String getLineID() {
        return lineID;
    }

    public void setLineID(String lineID) {
        this.lineID = lineID;
    }

    @Override
    public String toString(){
        return this.getName();
    }
    
}
