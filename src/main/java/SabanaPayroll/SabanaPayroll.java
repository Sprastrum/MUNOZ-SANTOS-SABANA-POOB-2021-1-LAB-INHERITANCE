package SabanaPayroll;

import java.util.ArrayList;
import java.util.UUID;

/**
 * System of payroll.
 */
public class SabanaPayroll {

    private ArrayList<Department> departments = new ArrayList<>();

    /**
     * Adds and specified department if it isn´t already added.
     * @return if it was added
     */
    public boolean addDepartment(Department d) {
        boolean result = true;

        for(Department a : departments) {
            if(d.getId() == a.getId()) {
                result = false;
                return result;
            }
        }
        departments.add(d);
        return result;
    }

    /**
     * Looks for the salary of an specified employee by its ID
     * @return the salary of the employee
     */
    public double calculateEmployeeSalary(UUID employeeId) {
        for(Department d: departments) {
            for(Employee e: d.getEmployees()) {
                if (e.getId() == employeeId) {
                    return e.calculateSalary();
                }
            }
        }
        return 0.0;
    }

    /**
     * Looks for the total salaries of an specific department by giving its ID
     * @return total salaries of the department
     */
    public double calculateDepartmentSalaries(UUID departmentId) {
        for(Department d: departments) {
            if (d.getId() == departmentId){
                return d.calculateDepartmentSalaries();
            }
        }
        return 0.0;
    }

    /**
     * calculate the total salaries of the entire university
     * @return total salaries
     */
    public double calculateUniversitySalaries() {
        double result = 0;
        for(Department d: departments) {
            result += d.calculateDepartmentSalaries();
        }
        return result;
    }

    /**
     * prints all the employees name, lastname, department, calculated salary and payment method.
     */
    public void printPayroll() {
        System.out.println("-------SabanaPayroll--------");
        for(Department d: departments){
            for(Employee e: d.getEmployees()){
                System.out.print(e.toString()+"\n");
            }

        }
        System.out.println("-----------");
    }
}
