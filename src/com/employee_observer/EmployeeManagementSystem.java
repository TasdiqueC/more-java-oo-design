package com.employee_observer;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by TasdiqueC on 7/30/17.
 */
public class EmployeeManagementSystem implements ISubject {
    List<IObserver> iObserverList;
    EmployeeDAO employeeDAO = new EmployeeDAO();

    public EmployeeManagementSystem () {

        /************ DOING TOO MUCH ************/
        iObserverList = new ArrayList<IObserver>();
        HRDepartment hrDepartment = new HRDepartment();
        PayrollDepartment payrollDepartment = new PayrollDepartment();
        iObserverList.add(hrDepartment);
        iObserverList.add(payrollDepartment);
        // should make an ObserverDAO where all of this happens
        /***************************************/

        employeeDAO.generateEmployees();
    }


    public void hireNewEmployee(Employee employee) {
        employeeDAO.addEmployees(employee);
        System.out.println("New hire: " + employee.toString());
        registerObserver(employee);
    }

    public void modifyEmployeeName(int employeeID, String name) {
        boolean checker = false;
        String oldName = "";
        for (Employee employee : employeeDAO.employees) {
            if (employee.employeeID == employeeID) {
                oldName = employee.getName();
                employee.setName(name);
                checker = true;
            }
        }
        if (!checker) {
            System.out.println("ID not found, cannot modify user...");
        }
        else {
            System.out.println("Employee with ID " + employeeID + " changed from " + oldName + " to " + name + ".");
        }
    }

    @Override
    public void registerObserver(Employee employee) {
        for (IObserver iObserver : iObserverList) {
            if (iObserver.name == employee.getDepartment()) {
                notifyObserver(iObserver);
            }
        }
    }

    @Override
    public void notifyObserver(IObserver iObserver) {
        iObserver.observe();
    }
}
