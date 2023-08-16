// Shape superclass
package array;

import java.util.Arrays;

class Shape {
    private int numSides;
    private String color;

    public Shape(int numSides, String color) {
        this.numSides = numSides;
        this.color = color;
    }

    public int getNumSides() {
        return numSides;
    }

    public String getColor() {
        return color;
    }
}

// Triangle subclass
class Triangle extends Shape {
    private double[] sideLengths;

    public Triangle(double[] sideLengths, String color) {
        super(3, color);
        this.sideLengths = sideLengths;
    }

    public double[] getSideLengths() {
        return sideLengths;
    }
}

// Square subclass
class Square extends Shape {
    private double sideLength;

    public Square(double sideLength, String color) {
        super(4, color);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color) {
        super(0, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

// Main program
public class ArrayShape {
    public static void main(String[] args) {
        // Create a triangle
        double[] triangleSideLengths = {3.0, 4.0, 5.0};
        Triangle triangle = new Triangle(triangleSideLengths, "Red");

        // Create a square
        double squareSideLength = 4.0;
        Square square = new Square(squareSideLength, "Blue");

        // Create a circle
        double circleRadius = 2.5;
        Circle circle = new Circle(circleRadius, "Green");

        // Display the details of the triangle
        System.out.println("Triangle:");
        System.out.println("Number of sides: " + triangle.getNumSides());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Side lengths: " + Arrays.toString(triangle.getSideLengths()));

        // Display the details of the square
        System.out.println("\nSquare:");
        System.out.println("Number of sides: " + square.getNumSides());
        System.out.println("Color: " + square.getColor());
        System.out.println("Side length: " + square.getSideLength());

        // Display the details of the circle
        System.out.println("\nCircle:");
        System.out.println("Number of sides: " + circle.getNumSides());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Radius: " + circle.getRadius());
    }
}
