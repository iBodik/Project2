package org.ProjectJavaOOPs;

public interface Shape {
    double calculateArea();
    double calculatePerimeter();
}
class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return radius*Math.PI*2;
    }
}
class Square implements Shape{
    private double side;
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 2*side;
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;
    }
}
