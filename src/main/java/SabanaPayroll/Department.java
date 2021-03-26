package SabanaPayroll;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Represents a department in a business context.
 */
public class Department {

    public UUID id;
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    /**
     * Constructor for specifying the department name with an unique ID
     * @param name
     */
    public Department(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    /**
     * Adds a given employee taking into account that it isn´t already in the list and that doesn´t belong to another department
     * @param employee
     * @return if it was added or not
     */
    public boolean addEmployee(Employee employee) {
        for(Employee a : employees) {
            if(employee.getId() == a.getId()) {
                return false;
            } else if (a.getDepartment().getId()!= this.id){
                return false;
            }
        }
        employees.add(employee);
        return true;
    }

    /**
     * calculates the total salaries of the department.
     * @return total salaries
     */
    public double calculateDepartmentSalaries() {
        double salaries = 0;
        int i = 0;

        for (i = 0; i < employees.size(); i++) {
            salaries += employees.get(i).calculateSalary();
        }

        return salaries;
    }
}
