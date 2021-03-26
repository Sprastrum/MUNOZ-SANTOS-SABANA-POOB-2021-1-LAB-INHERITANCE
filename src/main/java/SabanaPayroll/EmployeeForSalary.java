package SabanaPayroll;
/**
 * Represents and employee that is payed by salary. Class inherited by Employee.
 */
public class EmployeeForSalary extends Employee {

    private static final double HEALTH_BENEFIT = 0.04;
    private static final double PENSION_BENEFIT= 0.04;
    private double baseSalary;
    private double salary;

    /**
     * Constructor for specifying name, lastname, department and initial salary.
     */
    public EmployeeForSalary(String name, String lastname, Department department, double salary) {
        super(name,lastname,department);
        this.baseSalary = salary;
        this.salary=calculateSalary();

    }

    /**
     * Calculates the final salary of this type of employee.
     * @return Salary
     */
    public double calculateSalary() {
        return Math.round((baseSalary-(baseSalary*HEALTH_BENEFIT)-(baseSalary*PENSION_BENEFIT))*10.0)/10.0;
    }

    public double getSalary() {
        return salary;
    }

    /**
     * Calculates the discount of health with respect to the calculated salary
     * @return value of discount
     */
    public double getHealthDiscount(){
        return this.salary*HEALTH_BENEFIT;
    }
    /**
     * Calculates the discount of pension with respect to the calculated salary
     * @return value of discount
     */
    public double getPensionDiscount(){
        return this.salary*PENSION_BENEFIT;
    }

    /**
     * returns the name, lastname, department, calculated salary and the payment method.
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
