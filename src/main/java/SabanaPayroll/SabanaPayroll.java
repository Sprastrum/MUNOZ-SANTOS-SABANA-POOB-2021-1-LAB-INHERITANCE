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

    public double calculateEmployeeSalary(UUID employeeid) {
        return 1.0;
    }

    public double calculateDepartmentSalaries(UUID departmentId) {
        return 0;
    }

    public double calculateUniversitySalaries() {
        return 0;
    }

    public void printPayroll() {

    }
}
