package edu.sabana.poob;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Square extends Rectangle {

    private double side;

    public Square() {
        super();
        side = 1;
    }

    public Square(String color) {
        super(color);
        side = 1;
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

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

    public String toString() {
        return super.toString();
    }
}
