package SabanaPayroll;

import java.util.ArrayList;
import java.util.UUID;

public class Department {

    public UUID id;
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public boolean addEmployee() {
        return false;
    }

    public double calculateDepartmentSalaries() {
        return 1;
    }
}
