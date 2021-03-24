package SabanaPayroll;

public class EmployeeForSalary extends Employee {

    private static final double HEALTH_BENEFIT = 0.04;
    private static final double PENSION_BENEFIT= 0.04;
    private double salary;

    public EmployeeForSalary(String name, String lastname, Department department, double salary) {
        super(name,lastname,department);
        this.salary=calculateSalary(salary);

    }

    public double calculateSalary(Double salary) {
        return salary-(salary*HEALTH_BENEFIT)-(salary*PENSION_BENEFIT);
    }

    public double getHealthDiscount(){
        return this.salary*HEALTH_BENEFIT;
    }
    public double getPensionDiscount(){
        return this.salary*PENSION_BENEFIT;
    }
}
