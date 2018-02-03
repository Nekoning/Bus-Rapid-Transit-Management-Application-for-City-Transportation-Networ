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
public class PurchaseTestWorkRequest extends WorkRequest{
    
    private Employee Bus;
    private String testResult;
    private String notice;

    public Employee getBus() {
        return Bus;
    }

    public void setBus(Employee Bus) {
        this.Bus = Bus;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }
    
}
