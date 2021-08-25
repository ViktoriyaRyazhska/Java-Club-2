package javaClub.team3;

import java.io.IOException;
import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

//https://www.codewars.com/kata/5702e2f380b8c86df3000003/train/java/612347535c2a1f000ead4158
//Finish this kata with the unit tests as your only help!
//Task:
//Implement:
//Calculator.getTotalArea()
//Define the different shapes: `Square`, `Rectangle`, `Circle` and `Triangle`

public class Task50 extends Task{

    @Override
    void execute() {
        List<Shape> shapeList = new ArrayList<>();
        int userChoice = 0;
        try {
            System.out.println("Please select a primitive to calculate an area (0 for exit).\n"+
                    "Press 1 for Triangle, 2 for Square, 3 for Rectangle, 4 for Circle:");
            userChoice = Integer.parseInt(bufferedReader.readLine());
            switch (userChoice){
                case 0:
                    return;
                case 1:
                    int triangleBase=0;
                    int triangleHeight=0;
                    System.out.println("Please enter triangle base: ");
                    triangleBase = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Please enter triangle height: ");
                    triangleHeight = Integer.parseInt(bufferedReader.readLine());
                    if (triangleBase <= 0 || triangleHeight <= 0){
                        System.err.println("Wrong input!");
                        return;
                    } else{
                        Triangle t = new Triangle(triangleBase, triangleHeight);
                        System.out.println("The area of triangle is: " + t.getTotalArea());
                    }
                    break;
                case 2:
                    int squareSide=0;
                    System.out.println("Please enter square side: ");
                    squareSide = Integer.parseInt(bufferedReader.readLine());
                    if (squareSide <= 0 ){
                        System.err.println("Wrong input!");
                        return;
                    } else{
                        Square sq = new Square(squareSide);
                        System.out.println("The area of a square is: " + sq.getTotalArea());
                    }
                    break;
                case 3:
                    int rectHeight;
                    int rectWidth;
                    System.out.println("Please enter rectangle height: ");
                    rectHeight = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Please enter rectangle width: ");
                    rectWidth = Integer.parseInt(bufferedReader.readLine());
                    if (rectHeight <= 0 || rectWidth <=0){
                        System.err.println("Wrong input!");
                        return;
                    } else{
                        Rectangle rect = new Rectangle(rectHeight, rectWidth);
                        System.out.println("Rectangle area is: " +rect.getTotalArea());
                    }
                    break;
                case 4:
                    int radius;
                    System.out.println("Please enter a radius of a circle: ");
                    radius = Integer.parseInt(bufferedReader.readLine());
                    if (radius <= 0){
                        System.err.println("Wrong input!");
                        return;
                    } else{
                        Circle c = new Circle(radius);
                        System.out.println("Circle area is: " +c.getTotalArea());
                    }
                    break;
                default:
                    System.err.println("Wrong input!");
                    return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.err.println("Not a number!");
        }
    }

    public double getTotalArea(Shape... shapes) {
        double result = 0;
        result = Arrays.stream(shapes).mapToDouble(Shape::getTotalArea).sum();
        BigDecimal bd = new BigDecimal(Double.toString(result));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}

abstract interface Shape {
    public abstract double getTotalArea();
}

class Triangle implements Shape {

    double triangleBase;
    double triangleHeight;

    public Triangle(double triangleBase, double triangleHeight) {
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
    }

    public double getTotalArea() {
        return triangleBase * triangleHeight / 2;
    }
}

class Square implements Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public double getTotalArea() {
        return side * side;
    }
}

class Rectangle implements Shape {
    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getTotalArea() {
        return height * width;
    }
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getTotalArea() {
        return radius * radius * Math.PI;
    }
}
