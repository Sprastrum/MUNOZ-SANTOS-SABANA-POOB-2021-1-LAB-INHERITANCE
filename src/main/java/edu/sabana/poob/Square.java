package edu.sabana.poob;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Represents a square. Class inherited by Shape
 */
public class Square extends Rectangle {

    private double side;
    /**
     * Constructor without parameters that specifies side = 1.
     */
    public Square() {
        super();
        side = 1;
    }

    /**
     * Constructor for specifying the color
     * @param color
     */
    public Square(String color) {
        super(color);
        side = 1;
    }
    /**
     * Constructor for specifying the side
     * @param side
     */
    public Square(double side) {
        super(side, side);
        this.side = side;
    }
    /**
     * Constructor for specifying the side and color
     * @param color
     * @param side
     */
    public Square(String color, double side) {
        super(color, side, side);
        this.side = side;
    }

    public double getDiagonal() {
        return super.getDiagonal();
    }

    public double getArea() {
        return super.getArea();
    }

    public double getPerimeter() {
        return super.getPerimeter();
    }

    /**
     * returns the class name, the color, the width and length
     */
    public String toString() {
        return super.toString();
    }
}
