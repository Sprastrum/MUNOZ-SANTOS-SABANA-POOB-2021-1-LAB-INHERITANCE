package edu.sabana.poob;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
        assertEquals(0.4330127018922193,t.getArea());
        assertEquals(0.4330127018922193,tColor.getArea());
        assertEquals(4.898979485566356,tIsosceles.getArea());
        assertEquals(1.7320508075688772,tEquilateral.getArea());
        assertEquals(6,tGeneric.getArea());
        assertEquals(1.7320508075688772,tColor_Equilateral.getArea());

    }

    @Test
    @DisplayName("GIVEN different triangles WHEN asking for the perimeter THEN return the correct value")
    public void givenTrianglesThenReturnItsPerimeter() {
        assertEquals(3,t.getPerimeter());
        assertEquals(3,tColor.getPerimeter());
        assertEquals(12,tIsosceles.getPerimeter());
        assertEquals(6,tEquilateral.getPerimeter());
        assertEquals(12,tGeneric.getPerimeter());
        assertEquals(6,tColor_Equilateral.getPerimeter());
    }

    @Test
    @DisplayName("GIVEN different triangles WHEN asking for toString THEN print ")
    public void givenTrianglesThenPrint() {
        assertEquals("This is an Equilateral Triangle with color NONE that has sides equivalent to 1.0, 1.0, 1.0",t.toString());
        assertEquals("This is an Equilateral Triangle with color red that has sides equivalent to 2.0, 2.0, 2.0",tColor_Equilateral.toString());
        assertEquals("This is an Isosceles Triangle with color NONE that has sides equivalent to 5.0, 5.0, 2.0",tIsosceles.toString());
        assertEquals("This is an Scalene Triangle with color NONE that has sides equivalent to 3.0, 4.0, 5.0",tGeneric.toString());

    }
    @Test
    @DisplayName("GIVEN different triangles WHEN asking if it is equilateral THEN return true or false")
    public void GivenTrianglesThenReturnIfItsEquilateral() {

        Assertions.assertTrue(tColor.isEquilateral());
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
