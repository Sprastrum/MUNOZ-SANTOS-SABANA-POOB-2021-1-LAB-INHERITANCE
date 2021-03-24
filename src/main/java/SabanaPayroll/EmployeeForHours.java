package SabanaPayroll;

import java.util.UUID;

public class EmployeeForHours extends Employee{

    public static final double HOUR_VALUE = 40;
    private double hours;
    private double salary;

    public EmployeeForHours(UUID id, String name, String lastname, Department department, double hours) {
        super(name, lastname, department);
        this.hours = hours;
        salary = calculateSalary();
    }

    @Override
    public double calculateSalary() {
        return hours*HOUR_VALUE;
    }

    public String toString() {
        return super.toString();
    }
}
