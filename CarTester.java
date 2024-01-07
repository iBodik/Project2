package org.ProjectJavaOOPs;

public class CarTester {
    public static void main(String[] args) {

        Truck t = new Truck(75000,"Black",1500);
        System.out.println(t.calculateSalePrice());

        System.out.println("***********************");

        Sedan s = new Sedan(50000,"White",24);
        System.out.println(s.calculateSalePrice());

    }
}
