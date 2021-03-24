package SabanaPayroll;

import java.util.UUID;

public class EmployeeForCommission extends Employee{

    public static final double COMMISSION_VALUE = 40;
    private double salary;
    private int sales;

    public EmployeeForCommission(UUID id, String name, String lastname, Department department, int sales) {
        super(id, name, lastname, department);
        this.sales = sales;
        salary = calculateSalary();
    }

    @Override
    public double calculateSalary() {
        return COMMISSION_VALUE*sales;
    }
}
