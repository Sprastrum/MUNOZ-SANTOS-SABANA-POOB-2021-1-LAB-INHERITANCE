package edu.sabana.poob;
import SabanaPayroll.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SabanaNominaTest {

    private static Department F;
    private static Department V;
    private static Department I;
    private static EmployeeForHours e1h;
    private static EmployeeForHours e2h;
    private static EmployeeForHours e3h;
    private static EmployeeForSalary s1,s2,s3;

    @BeforeAll
    public static void setUp() {
        I = new Department("ENGINEERING");
        V = new Department("SALES");
        F = new Department("FINANCE");
        e1h = new EmployeeForHours("Juan", "Perez", F, 10);
        e2h = new EmployeeForHours("Jorge", "Gómez", V, 15.9);
        e3h = new EmployeeForHours("Laura", "Beltran", I, 0);
        s1 = new EmployeeForSalary("Pedro", "Perez", I, 10000.1);
        s2 = new EmployeeForSalary("Camilo", "Muñoz", I, 5000.6);
        s3 = new EmployeeForSalary("David", "Colmenares", I, 24600.2);
    }


    @Test
    public void givenSalaryEmployeesThenShouldAssignCorrectlyTheGivenSalary() {
        assertEquals(9200.1,s1.getSalary());
        assertEquals(4600.6,s2.getSalary());
        assertEquals(22632.2,s3.getSalary());
    }

    @Test
    public void shouldCalculateOnlySalaryForHours() {
        assertEquals(400,  e1h.getSalary());
        assertEquals(636, e2h.getSalary());
        assertEquals(0,  e3h.getSalary());
    }


    @Test
    public void shouldPrintInformationAboutEmployee() {
        assertEquals("Juan Perez, department FINANCE, salary $400.0, pay for hours", e1h.toString());
        assertEquals("Pedro Perez, department ENGINEERING, salary $9200.1, pay for salary", s1.toString());
    }
}
