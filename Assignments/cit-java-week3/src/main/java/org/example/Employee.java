package org.example;

public class Employee {
    protected String employeeid;
    protected String fullName;
    protected String department;

    public Employee(String employeeid, String fullName, String department) {
        this.employeeid = employeeid;
        this.fullName = fullName;
        this.department = department;
    }

    public void clockIn() {
        System.out.println(fullName + " clocked in.");
    }

    public void clockOut() {
        System.out.println(fullName + " clocked out.");
    }

    public double calculatePay() {
        return 0;
    }
}
