package com.company;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        int radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius:");
        radius = input.nextInt();
        System.out.println("Diameter is " + diameter(radius));
        System.out.printf("\nCircumference is %.2f",circumference(radius));
        System.out.printf("\nArea is %.2f",area(radius));

    }

    public static int diameter(int r) {
        return 2 * r;
    }

    public static double circumference(int r){
        return 2*Math.PI*r;
    }

    public static double area(int r){
        return Math.PI*Math.sqrt(r);
    }
}
