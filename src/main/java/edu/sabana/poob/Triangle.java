package edu.sabana.poob;

/**
 * Represents a triangle. Class inherited by Shape
 */
public class Triangle extends Shape{
    private double side1 =1.0;
    private double side2 =1.0;
    private double side3 =1.0;

    /**
     * Constructor without parameters that specifies sides = 1.
     */
    public Triangle () {
    }
    /**
     * Constructor for specifying the color
     * @param color
     */
    public Triangle (String color) {
        super(color);
    }

    /**
     * Constructor for specifying the sides.
     * @param side1
     * @param side2
     * @param side3
     */
    public Triangle (double side1, double side2, double side3) {
        if (theTriangleIsValid(side1,side2,side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    /**
     * Constructor for specifying the sides and color
     * @param color
     * @param side1
     * @param side2
     * @param side3
     */
    public Triangle (String color,double side1, double side2, double side3){
        super(color);
        if (theTriangleIsValid(side1,side2,side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    /**
     * Verifies if the given triangle is relevant by giving the sides
     */
    private boolean theTriangleIsValid(double a, double b, double c) {
        if((a+b)>c && (a+c)>b && (b+c)>a) {
            return true;
        }else {
            return false;
        }
    }

    /**
     * Verifies if the given triangle is isosceles
     */
    public boolean isIsosceles() {
        boolean result = false;
        if (side1 == side2 && side1 != side3 || side1 != side2 && side3 == side1 || side3 == side2 && side3 != side1) {
            result = true;
        }
        return result;
    }

    /**
     * verifies if the given triangle is equilateral
     */
    public boolean isEquilateral(){
        if (side1==side2 && side2==side3) {
            return true;
        }
        return false;
    }

    @Override
    public double getArea(){
        double s = (side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    @Override
    public double getPerimeter(){
        return side1+side2+side3;
    }

    /**
     * returns the type of triangle, the class name, the color and the sides.
     */
    @Override
    public String toString(){
        String result = "Scalene";
        if (this.isIsosceles()){
            result = "Isosceles";
        }
        if (this.isEquilateral()) {
            result = "Equilateral";
        }
        return String.format("This is an %s %s with color %s that has sides equivalent to %s, %s, %s"
                , result
                , this.getClass().getSimpleName()
                , super.getColor() == null ? "NONE" : super.getColor()
                ,side1
                ,side2
                ,side3);
    }

}
