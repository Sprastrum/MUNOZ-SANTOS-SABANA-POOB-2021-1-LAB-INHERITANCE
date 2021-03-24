package SabanaPayroll;

public class EmployeeForSalary extends Employee {

    private final double HEALTH_BENEFIT = 0.04;
    private final double PENSION_BENEFIT= 0.04;

    public EmployeeForSalary(String name, String lastname, Department department, Double salary) {
        super(name,lastname,department);

    }
}
