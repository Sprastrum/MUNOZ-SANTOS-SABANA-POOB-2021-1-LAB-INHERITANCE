package edu.sabana.poob;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(width, 2)+Math.pow(length, 2));
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return (2*width)+(2*length);
    }

    @Override
    public String toString() {
        return String.format("This is a %s with color %s, width %s and length %s"
                , this.getClass().getSimpleName()
                , getColor() == null ? "NONE" : getColor()
                , isDecimal(width) ? Double.toString(width) : new java.text.DecimalFormat("#").format(width),
                isDecimal(length) ? Double.toString(length) : new java.text.DecimalFormat("#").format(length));
    }
}
