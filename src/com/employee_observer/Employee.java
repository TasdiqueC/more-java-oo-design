package com.employee_observer;
import java.util.Date;

/**
 * Created by TasdiqueC on 7/30/17.
 */
public class Employee {
    private String name;
    private Date hireDate;
    private int salary;
    public int employeeID;
    private boolean working;
    private String department;

    private static int COUNTER;

    public Employee(String name, Date hireDate, int salary, boolean working, String department) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        this.working = working;
        this.department = department;

        employeeID = ++COUNTER;
    }

    public String getName () {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", employeeID=" + employeeID +
                ", working=" + working +
                ", department='" + department + '\'' +
                '}';
    }
}
