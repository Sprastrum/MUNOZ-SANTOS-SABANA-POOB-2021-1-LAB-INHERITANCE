package edu.sabana.poob;

import SabanaPayroll.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SabanaNominaTest {

    private static SabanaPayroll sabanaPayRoll;
    private static Department F;
    private static Department V;
    private static Department I;
    private static EmployeeForHours e1h;
    private static EmployeeForHours e2h;
    private static EmployeeForHours e3h;
    private static EmployeeForSalary s1,s2,s3;
    private static EmployeeForCommission c1,c2,c3;

    @BeforeAll
    public static void setUp() {
        sabanaPayRoll = new SabanaPayroll();
        I = new Department("ENGINEERING");
        V = new Department("SALES");
        F = new Department("FINANCES");
        e1h = new EmployeeForHours("Juan", "Perez", F, 10);
        e2h = new EmployeeForHours("Jorge", "Gomez", V, 15.9);
        e3h = new EmployeeForHours("Laura", "Beltran", I, 0);
        s1 = new EmployeeForSalary("Pedro", "Perez", F, 10000.1);
        s2 = new EmployeeForSalary("Camilo", "Munoz", V, 5000.6);
        s3 = new EmployeeForSalary("David", "Colmenares", I, 24600.2);
        c1 = new EmployeeForCommission("David","Guarnizo",F,100);
        c2 = new EmployeeForCommission("Diana","Sanchez",V,200);
        c3 = new EmployeeForCommission("Erika","Rojas",I,0);
        F.addEmployee(e1h);
        F.addEmployee(s1);
        F.addEmployee(c1);
        V.addEmployee(e2h);
        V.addEmployee(s2);
        V.addEmployee(c2);
        I.addEmployee(e3h);
        I.addEmployee(s3);
        I.addEmployee(c3);
        sabanaPayRoll.addDepartment(F);
        sabanaPayRoll.addDepartment(V);
        sabanaPayRoll.addDepartment(I);
    }

    @Test
    public void shouldCalculateOnlySalary() {
        assertEquals(9200.1,s1.getSalary());
        assertEquals(4600.6,s2.getSalary());
        assertEquals(22632.2,s3.getSalary());
    }
    @Test
    public void shouldGetCorrectlyTheSalaryDiscounts(){
        assertEquals(368.004,s1.getHealthDiscount());
        assertEquals(184.02400000000003,s2.getPensionDiscount());
        assertEquals(905.288,s3.getHealthDiscount());
    }

    @Test
    public void shouldCalculateOnlySalaryForHours() {
        assertEquals(400,  e1h.getSalary());
        assertEquals(636, e2h.getSalary());
        assertEquals(0,  e3h.getSalary());
    }

    @Test
    public void shouldCalculateOnlySalaryForCommission() {
        assertEquals(4000.0,  c1.getSalary());
        assertEquals(8000.0, c2.getSalary());
        assertEquals(0.0,  c3.getSalary());
    }

    @Test
    public void shouldPrintInformationAboutEmployees() {
        assertEquals("Juan Perez, department FINANCES, salary $400.0, pay for hours", e1h.toString());
        assertEquals("David Colmenares, department ENGINEERING, salary $22632.2, pay for salary", s3.toString());
    }

    @Test
    public void shouldCalculateDepartmentSalaries() {
        assertEquals(13600.1, F.calculateDepartmentSalaries());
        assertEquals(13236.6, V.calculateDepartmentSalaries());
        assertEquals(22632.2, I.calculateDepartmentSalaries());
    }

    @Test
    public void shouldCalculateEmployeeSalarieGivenItsId() {
        assertEquals(e1h.getSalary(),sabanaPayRoll.calculateEmployeeSalary(e1h.getId()));
        assertEquals(s2.getSalary(),sabanaPayRoll.calculateEmployeeSalary(s2.getId()));
        assertEquals(c3.getSalary(),sabanaPayRoll.calculateEmployeeSalary(c3.getId()));
    }

    @Test
    public void shouldCalculateDepartmentSalariesGivenItsId() {
        assertEquals(F.calculateDepartmentSalaries(),sabanaPayRoll.calculateDepartmentSalaries(F.getId()));
        assertEquals(V.calculateDepartmentSalaries(),sabanaPayRoll.calculateDepartmentSalaries(V.getId()));
        assertEquals(I.calculateDepartmentSalaries(),sabanaPayRoll.calculateDepartmentSalaries(I.getId()));
    }

    @Test
    public void shouldCalculateUniversitySalaries() {
        double result = F.calculateDepartmentSalaries()+V.calculateDepartmentSalaries()+ I.calculateDepartmentSalaries();
        assertEquals(result,sabanaPayRoll.calculateUniversitySalaries());
    }

    @Test
    public void shouldPrintAllTheEmployees() {
        sabanaPayRoll.printPayroll();
    }




}
