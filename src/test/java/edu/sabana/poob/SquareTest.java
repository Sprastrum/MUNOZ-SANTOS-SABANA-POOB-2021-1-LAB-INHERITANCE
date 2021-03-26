package edu.sabana.poob;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    private static Square s1;
    private static Square s2;
    private static Square s3;
    private static Square s4;

    @BeforeAll
    public static void setUp() {
        s1 = new Square();
        s2 = new Square("red");
        s3 = new Square("red", 5.5);
        s4 = new Square(29);
    }

    @Test
    public void shouldCalculateDiagonal() {
        assertEquals(1, (int) Math.round(s1.getDiagonal()));
        assertEquals(1, (int) Math.round(s2.getDiagonal()));
        assertEquals(8, (int) Math.round(s3.getDiagonal()));
        assertEquals(41, (int) Math.round(s4.getDiagonal()));
    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(1, (int) s1.getArea());
        assertEquals(1, (int) s2.getArea());
        assertEquals(30, (int) s3.getArea());
        assertEquals(841, (int) s4.getArea());
    }

    @Test
    public void shouldCalculatePerimeter() {
        assertEquals(4, (int) s1.getPerimeter());
        assertEquals(4, (int) s2.getPerimeter());
        assertEquals(22, (int) s3.getPerimeter());
        assertEquals(116, (int) s4.getPerimeter());
    }

    @Test
    public void shouldPrintSquare() {
        assertEquals("This is a Square with color NONE, width 1 and length 1", s1.toString());
        assertEquals("This is a Square with color red, width 1 and length 1", s2.toString());
        assertEquals("This is a Square with color red, width 5.5 and length 5.5", s3.toString());
        assertEquals("This is a Square with color NONE, width 29 and length 29", s4.toString());
    }
}
