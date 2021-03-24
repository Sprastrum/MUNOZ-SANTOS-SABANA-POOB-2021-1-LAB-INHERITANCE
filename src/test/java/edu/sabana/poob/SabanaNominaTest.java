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

    @BeforeAll
    public static void setUp() {
        I = new Department("INGENIERIA");
        V = new Department("VENTAS");
        F = new Department("FINANZAS");
        e1h = new EmployeeForHours("Juan", "Perez", F, 10);
        e2h = new EmployeeForHours("Jorge", "Gómez", V, 15.9);
        e3h = new EmployeeForHours("Laura", "Beltran", I, 0);
    }

    @Test
    public void shouldCalculateSalaryForHours(){
        assertEquals(400, e1h.calculateSalary());
        assertEquals(636, Math.round(e2h.calculateSalary()));
        assertEquals(0, e3h.calculateSalary());
    }
}
