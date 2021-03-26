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

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public boolean addEmployee(Employee e) {
        boolean result = true;

        for(Employee a : employees) {
            if(e.getId() == a.getId()) {
                result = false;
                break;
            } else if (a.getDepartment().getId()!= this.id){
                  result = false;
                    break;
            }
        }

        return result ? employees.add(e) : false;
    }

    public double calculateDepartmentSalaries() {
        double salaries = 0;
        int i = 0;

        for (i = 0; i < employees.size(); i++) {
            salaries += employees.get(i).calculateSalary();
        }

        return salaries;
    }
}
