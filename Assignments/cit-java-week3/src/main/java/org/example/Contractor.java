package org.example;

public class Contractor extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Contractor(String employeeId, String fullName, String department, double hourlyRate, int hoursWorked) {
        super(employeeId, fullName, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public void logHours(int hours) {
        this.hoursWorked += hours;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
