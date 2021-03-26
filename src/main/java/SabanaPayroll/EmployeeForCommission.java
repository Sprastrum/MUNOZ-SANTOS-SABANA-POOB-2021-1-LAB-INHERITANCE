package SabanaPayroll;

/**
 * Represents and employee that is payed for commission. Class inherited by Employee.
 */
public class EmployeeForCommission extends Employee{

    public static final double COMMISSION_VALUE = 40;
    private int sales;

    /**
     * Constructor for specifying name, lastname, department and number of sales
     */
    public EmployeeForCommission(String name, String lastname, Department department, int sales) {
        super(name, lastname, department);
        this.sales = sales;
    }

    /**
     * Calculates the final salary of this type of employee.
     * @return Salary
     */
    @Override
    public double calculateSalary() {
        return Math.round(COMMISSION_VALUE*sales*10.0)/10.0;
    }

    public double getSalary() {
        return calculateSalary();
    }

    /**
     * returns the name, lastname, department, calculated salary and the payment method.
     */
    public String toString() {
        return super.toString();
    }
}
