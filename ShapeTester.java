package org.ProjectJavaOOPs;

public class ShapeTester {
    public static void main(String[] args) {
        Circle c = new Circle(8.6);
        System.out.println(c.calculateArea());
        System.out.println(c.calculatePerimeter());

        System.out.println("**************************");

        Square s = new Square(5.4);
        System.out.println(s.calculateArea());
        System.out.println(s.calculatePerimeter());

    }
}