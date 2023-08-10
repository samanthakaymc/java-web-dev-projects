package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = input.nextDouble();
        double result = Circle.getArea(radius);
        //double pi = 3.14;
        //double result = (pi * radius * radius);
        System.out.println(result);
    }
}
