package SabanaPayroll;

public class EmployeeForSalary extends Employee {

    private static final double HEALTH_BENEFIT = 0.04;
    private static final double PENSION_BENEFIT= 0.04;
    private double baseSalary;
    private double salary;

    public EmployeeForSalary(String name, String lastname, Department department, double salary) {
        super(name,lastname,department);
        this.baseSalary = salary;
        this.salary=calculateSalary();

    }

    public double calculateSalary() {
        return Math.round((baseSalary-(baseSalary*HEALTH_BENEFIT)-(baseSalary*PENSION_BENEFIT))*10.0)/10.0;
    }

    public double getSalary() {
        return salary;
    }

    public double getHealthDiscount(){
        return this.salary*HEALTH_BENEFIT;
    }
    public double getPensionDiscount(){
        return this.salary*PENSION_BENEFIT;
    }
}
