package com.employee_observer;

import java.util.Date;

/**
 * Created by TasdiqueC on 7/30/17.
 */
public class App {
    public static void main(String[] args){
        IObserver payroll = new PayrollDepartment();
        IObserver hrSystem = new HRDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        Employee bob = new Employee("Bob", new Date(), 35000, true, "PAYROLL");
        ems.hireNewEmployee(bob);

        ems.modifyEmployeeName(6, "Imtiaz");
    }
}
