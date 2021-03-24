package SabanaPayrollTest;

import SabanaPayroll.Department;
import SabanaPayroll.Employee;
import org.junit.jupiter.api.BeforeAll;

public class SabanaNominaTest {

    private static Department F = new Department("FINANZAS");
    private static Department V = new Department("VENTAS");
    private static Department I = new Department("INGENIERÍA");
    private static Employee e1, e2, e3;

    @BeforeAll
    public static void setUp() {
        e1 = new Employee("Santiago", "Santos", I);
        e2 = new Employee("Cristian", "Santos", F);
        e3 = new Employee("Cristian", "Santos", V);
    }


}
