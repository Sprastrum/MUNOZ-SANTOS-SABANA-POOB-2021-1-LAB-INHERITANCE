package SabanaPayroll;

import java.util.UUID;

public class Employee {

    public UUID id;
    private String name, lastname;
    private Department department;

    public Employee(){
    }

    public Employee(String name, String lastname, Department department) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.lastname = lastname;
        this.department = department;
    }

    public double calculateSalary() {
        return 0;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%s %s, department %s, salary $%s, pay for %s",
                this.name, this.lastname, this.department.getName(),
                Double.toString(calculateSalary()),
                this.getClass().getSimpleName().equals("EmployeeForHours") ? "hours" : this.getClass().getSimpleName().equals("EmployeeForSalary") ? "salary" : "commissions");
    }
}
