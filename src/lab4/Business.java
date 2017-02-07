/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author mitchell
 */
public class Business {
    private HrDepartment hr;
    
    public  Business() {
        hr = new HrDepartment();
    }
    
    public void hireEmployee(String firstName, String lastName, String ssn) {
        hr.hireEmployee(firstName, lastName, ssn);
        hr.outputReport(ssn);
    }

    public HrDepartment getHr() {
        return hr;
    }

    public void setHr(HrDepartment hr) {
        this.hr = hr;
    }

    
    
    
}
