package edu.sabana.poob;

public class Triangle extends Shape{
    private double side1 =1.0;
    private double side2 =1.0;
    private double side3 =1.0;

    public Triangle () {
    }
    public Triangle (String color) {
        super(color);
    }

    public Triangle (double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle (String color,double side1, double side2, double side3){
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public boolean isIsosceles() {
        boolean result = false;
        if (side1 == side2 && side1 != side3 || side1 != side2 && side3 != side1 || side3 == side2 && side3 != side1) {
            result = true;
        }
        return result;
    }

    public boolean isEquilateral(){
        if (side1==side2 && side2==side3) {
            return true;
        }
        return false;
    }



}
