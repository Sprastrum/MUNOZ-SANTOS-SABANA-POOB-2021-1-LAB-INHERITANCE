package SabanaPayroll;

import java.util.UUID;

public class Department {

    public UUID id;
    private String name;

    public Department(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public double calculateDepartmentSalaries() {

    }
}
