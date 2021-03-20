package edu.sabana.poob;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    private static Triangle t;
    private static Triangle tIsosceles;
    private static Triangle tRight;
    private static Triangle tColor;
    private static Triangle tEquilateral;
    private static Triangle tColor_Equilateral;

    @BeforeAll
    public static void setUp() {
        t = new Triangle();
        tColor = new Triangle("Red");
        tIsosceles = new Triangle(5.0, 5.0, 2.0);
        tEquilateral = new Triangle(2.0, 2.0, 2.0);
        tRight = new Triangle(3.0, 4.0, 5.0);
        tColor_Equilateral = new Triangle("red", 2.0, 2.0, 2.0);
    }

    @Test
    @DisplayName("GIVEN different triangles WHEN asking for the area THEN return the value")
    public void givenTrianglesThenReturnItsArea() {


    }

}
