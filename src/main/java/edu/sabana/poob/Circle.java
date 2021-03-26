package edu.sabana.poob;

/**
 * Represents a circle of radius r. Class inherited by Shape
 */
public class Circle extends Shape {

    public static final double PI = Math.PI;
    private double radius;

    /**
     *  Constructor without parameters that specifies radius=1
     */
    public Circle() {
        this.radius = 1.0;
    }

    /**
     *  Constructor for specifying the radius
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor for specifying the radius and color
     * @param color
     * @param radius
     */

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*PI*radius;
    }

    /**
     *
     * returns the class name, the color and the radius.
     */
    @Override
    public String toString() {
        return String.format("This is a %s with color %s and radius %s"
                , this.getClass().getSimpleName()
                , getColor() == null ? "NONE" : getColor()
                , isDecimal(radius) ? Double.toString(radius) : new java.text.DecimalFormat("#").format(radius));
    }

    public double getDiameter() {
        return 2*radius;
    }
}
