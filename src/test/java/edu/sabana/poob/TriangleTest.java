package edu.sabana.poob;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    private static Triangle t;
    private static Triangle tIsosceles;
    private static Triangle tGeneric;
    private static Triangle tColor;
    private static Triangle tEquilateral;
    private static Triangle tColor_Equilateral;

    @BeforeAll
    public static void setUp() {
        t = new Triangle();
        tColor = new Triangle("Red");
        tIsosceles = new Triangle(5.0, 5.0, 2.0);
        tEquilateral = new Triangle(2.0, 2.0, 2.0);
        tGeneric = new Triangle(3.0, 4.0, 5.0);
        tColor_Equilateral = new Triangle("red", 2.0, 2.0, 2.0);
    }

    @Test
    @DisplayName("GIVEN different triangles WHEN asking for the area THEN return the value")
    public void givenTrianglesThenReturnItsArea() {


    }


    @Test
    @DisplayName("GIVEN different triangles WHEN asking if it is equilateral THEN return true or false")
    public void GivenTrianglesThenReturnIfItsEquilateral() {
        Assertions.assertFalse(tColor.isEquilateral());
        Assertions.assertTrue(tEquilateral.isEquilateral());
        Assertions.assertFalse(tIsosceles.isEquilateral());
        Assertions.assertFalse(tGeneric.isEquilateral());
        Assertions.assertTrue(t.isEquilateral());
    }

    @Test
    @DisplayName("GIVEN different triangles WHEN asking if it is isosceles THEN return true or false")
    public void GivenTrianglesThenReturnIfItsIsosceles() {
        Assertions.assertFalse(tColor.isIsosceles());
        Assertions.assertFalse(tEquilateral.isIsosceles());
        Assertions.assertTrue(tIsosceles.isIsosceles());
        Assertions.assertFalse(tGeneric.isIsosceles());
        Assertions.assertFalse(t.isIsosceles());
        Assertions.assertFalse(tColor_Equilateral.isIsosceles());
    }

}
