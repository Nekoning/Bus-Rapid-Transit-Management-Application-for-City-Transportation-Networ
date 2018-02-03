/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;

/**
 *
 * @author Jianing Wang
 */
public class DispatchBusWorkRequest extends WorkRequest {
    
    private Employee Platform;
    private String testResult;

    public Employee getPlatform() {
        return Platform;
    }

    public void setPlatform(Employee Platform) {
        this.Platform = Platform;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
}
