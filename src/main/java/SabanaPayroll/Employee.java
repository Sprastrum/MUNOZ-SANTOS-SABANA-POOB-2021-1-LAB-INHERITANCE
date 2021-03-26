package SabanaPayroll;

import java.util.UUID;

/**
 * Represents an employee
 */
public class Employee {

    public UUID id;
    private String name, lastname;
    private Department department;

    /**
     * Constructor for specifying name, lastname and department of the employee
     */
    public Employee(String name, String lastname, Department department) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.lastname = lastname;
        this.department = department;
    }

    /**
     * Base method for calculating the salary
     * @return
     */
    public double calculateSalary() {
        return 0;
    }

    public UUID getId() {
        return id;
    }

    public Department getDepartment() {
        return department;
    }

    /**
     * returns the name, lastname, department, calculated salary and the payment method.
     */
    @Override
    public String toString() {
        return String.format("%s %s, department %s, salary $%s, pay for %s",
                this.name, this.lastname, this.department.getName(),
                Double.toString(calculateSalary()),
                this.getClass().getSimpleName().equals("EmployeeForHours") ? "hours" : this.getClass().getSimpleName().equals("EmployeeForSalary") ? "salary" : "commissions");
    }
}
