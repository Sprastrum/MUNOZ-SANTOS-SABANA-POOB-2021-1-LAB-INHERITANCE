package SabanaPayroll;

import java.util.UUID;

public class EmployeeForHours extends Employee{

    public static final double HOUR_VALUE = 40;
    private double hours;

    public EmployeeForHours(String name, String lastname, Department department, double hours) {
        super(name, lastname, department);
        this.hours = hours;
    }

    @Override
    public double calculateSalary() {
        return Math.round(this.hours*HOUR_VALUE*10.0)/10.0;
    }

    public String toString() {
        return super.toString();
    }
    public Double getSalary() {
        return calculateSalary();
    }
}
