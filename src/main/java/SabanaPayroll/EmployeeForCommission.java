package SabanaPayroll;

import java.util.UUID;

public class EmployeeForCommission extends Employee{

    public static final double COMMISSION_VALUE = 40;
    private int sales;

    public EmployeeForCommission(String name, String lastname, Department department, int sales) {
        super(name, lastname, department);
        this.sales = sales;
    }

    @Override
    public double calculateSalary() {
        return COMMISSION_VALUE*sales;
    }

    public String toString() {
        return super.toString();
    }
}
