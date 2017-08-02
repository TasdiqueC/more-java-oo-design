package com.employee_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TasdiqueC on 7/30/17.
 */
public class EmployeeDAO {
    Employee emp1 = new Employee("Mike", null, 5000, true, "HR");
    Employee emp2 = new Employee("Steve", null, 4500, true, "PAYROLL");
    Employee emp3 = new Employee("John", null, 7000, true, "PAYROLL");
    Employee emp4 = new Employee("Pat", null, 6000, true, "HR");
    Employee emp5 = new Employee("Joe", null, 8000, true, "PAYROLL");

    List<Employee> employees;

    public List<Employee> generateEmployees() {
        employees = new ArrayList<Employee>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        return employees;
    }

    public void addEmployees(Employee employee) {
        employees.add(employee);
    }
}
