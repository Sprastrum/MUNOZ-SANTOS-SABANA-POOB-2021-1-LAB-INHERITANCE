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

    @Override
    public String toString() {
        return "NONE";
    }
}
