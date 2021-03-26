package SabanaPayroll;

import java.util.ArrayList;
import java.util.UUID;

public class SabanaPayroll {

    private UUID employeeid;
    private String name;
    private ArrayList<Department> departments = new ArrayList<>();

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

    public double calculateDepartmentSalaries(UUID departmentId) {
        for(Department d: departments) {
            if (d.getId() == departmentId){
                return d.calculateDepartmentSalaries();
            }
        }
        return 0.0;
    }

    public double calculateUniversitySalaries() {
        double result = 0;
        for(Department d: departments) {
            result += d.calculateDepartmentSalaries();
        }
        return result;
    }

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
