package edu.sabana.poob;

public class Circle extends Shape {
    public static final double PI = Math.PI;
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

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
