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
        double a = 2*PI*radius;

        return a;
    }

    @Override
    public String toString() {
        return String.format("This is a %s with color %s and radius %s"
                , this.getClass().getSimpleName()
                , getColor() == null ? "NONE" : getColor()
                , isDecimal() == true ? Double.toString(radius) : new java.text.DecimalFormat("#").format(radius));
    }

    public boolean isDecimal() {
        return radius%2 == 0 || radius == 1 ? false : true;
    }

    //new java.text.DecimalFormat("#.#").format(radius)

    public double getDiameter() {
        return 2*radius;
    }
}
